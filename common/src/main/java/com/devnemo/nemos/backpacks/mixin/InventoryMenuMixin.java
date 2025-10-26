package com.devnemo.nemos.backpacks.mixin;

import com.devnemo.nemos.backpacks.world.item.BackpackItem;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.devnemo.nemos.backpacks.Constants.MOD_ID;
import static com.devnemo.nemos.backpacks.Constants.SLOT_BACKPACK;

@Mixin(InventoryMenu.class)
public abstract class InventoryMenuMixin extends AbstractContainerMenu {

    @Unique
    private static final ResourceLocation EMPTY_SLOT_BACKPACK = ResourceLocation.fromNamespaceAndPath(MOD_ID, "container/slot/backpack");

    protected InventoryMenuMixin(@Nullable MenuType<?> menuType, int containerId) {
        super(menuType, containerId);
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    private void addBackpackSlot(Inventory playerInventory, boolean active, Player owner, CallbackInfo ci) {
        this.addSlot(new Slot(playerInventory, SLOT_BACKPACK, 77, 26) {
            public boolean mayPlace(@NotNull ItemStack stack) {
                return stack.getItem() instanceof BackpackItem;
            }

            public ResourceLocation getNoItemIcon() {
                return EMPTY_SLOT_BACKPACK;
            }
        });
    }

    @Inject(method = "quickMoveStack", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;getEquipmentSlotForItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/EquipmentSlot;", shift = At.Shift.AFTER), cancellable = true)
    private void quickMoveBackpack(Player player, int index, CallbackInfoReturnable<ItemStack> cir, @Local(ordinal = 1) ItemStack itemStack, @Local(ordinal = 0) ItemStack copyOfItemStack) {
        if (index != SLOT_BACKPACK && itemStack.getItem() instanceof BackpackItem) {
            if (this.moveItemStackTo(itemStack, SLOT_BACKPACK, SLOT_BACKPACK + 1, false)) {
                cir.setReturnValue(copyOfItemStack);
            }
        }
    }
}
