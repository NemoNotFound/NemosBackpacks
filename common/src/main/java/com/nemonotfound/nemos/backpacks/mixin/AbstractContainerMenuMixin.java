package com.nemonotfound.nemos.backpacks.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.nemonotfound.nemos.backpacks.world.item.BackpackItem;
import net.minecraft.core.NonNullList;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.nemonotfound.nemos.backpacks.Constants.BACKPACK_SLOT;

@Mixin(AbstractContainerMenu.class)
public abstract class AbstractContainerMenuMixin {

    @Shadow
    @Final
    public NonNullList<Slot> slots;

    @Inject(method = "doClick", at = @At("TAIL"))
    private void handleBackpackSwap(int slotId, int button, ClickType clickType, Player player, CallbackInfo ci, @Local Inventory inventory) {
        if (clickType == ClickType.SWAP && button == BACKPACK_SLOT) {
            ItemStack backpackItemStack = inventory.getItem(button);
            Slot slot = this.slots.get(slotId);
            ItemStack slotItemStack = slot.getItem();

            if (backpackItemStack.isEmpty() && slotItemStack.isEmpty()) {
                return;
            }

            if (backpackItemStack.isEmpty()) {
                nemosBackpacks$handleItemToBackpackSlot(button, player, inventory, slot, slotItemStack);
            } else if (slotItemStack.isEmpty()) {
                nemosBackpacks$handleBackpackToInventory(button, inventory, slot, backpackItemStack);
            } else if (slot.mayPickup(player) && slot.mayPlace(backpackItemStack)) {
                nemosBackpacks$handleBackpackSwap(button, player, inventory, slot, backpackItemStack, slotItemStack);
            }
        }
    }

    @Unique
    private void nemosBackpacks$handleItemToBackpackSlot(int button, Player player, Inventory inventory, Slot slot, ItemStack slotItemStack) {
        if (!slot.mayPickup(player) || !(slotItemStack.getItem() instanceof BackpackItem)) {
            return;
        }

        inventory.setItem(button, slotItemStack);
        slot.setByPlayer(ItemStack.EMPTY);
        slot.onTake(player, slotItemStack);
    }

    @Unique
    private static void nemosBackpacks$handleBackpackToInventory(int button, Inventory inventory, Slot slot, ItemStack backpackItemStack) {
        if (!slot.mayPlace(backpackItemStack)) {
            return;
        }

        var maxStackSize = slot.getMaxStackSize(backpackItemStack);

        if (backpackItemStack.getCount() > maxStackSize) {
            slot.setByPlayer(backpackItemStack.split(maxStackSize));
        } else {
            inventory.setItem(button, ItemStack.EMPTY);
            slot.setByPlayer(backpackItemStack);
        }
    }

    @Unique
    private void nemosBackpacks$handleBackpackSwap(int button, Player player, Inventory inventory, Slot slot, ItemStack backpackItemStack, ItemStack slotItemStack) {
        if (!(slotItemStack.getItem() instanceof BackpackItem)) {
            return;
        }

        var maxStackSize = slot.getMaxStackSize(backpackItemStack);

        if (backpackItemStack.getCount() > maxStackSize) {
            slot.setByPlayer(backpackItemStack.split(maxStackSize));
            slot.onTake(player, slotItemStack);

            if (!inventory.add(slotItemStack)) {
                player.drop(slotItemStack, true);
            }
        } else {
            inventory.setItem(button, slotItemStack);
            slot.setByPlayer(backpackItemStack);
            slot.onTake(player, slotItemStack);
        }
    }
}
