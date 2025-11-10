package com.nemonotfound.nemos.backpacks.mixin;

import com.nemonotfound.nemos.backpacks.helper.BackpackGetter;
import com.nemonotfound.nemos.backpacks.world.item.BackpackItem;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

import static com.nemonotfound.nemos.backpacks.Constants.BACKPACK_SLOT;

@Mixin(Inventory.class)
public abstract class InventoryMixin implements BackpackGetter {

    @Shadow @Final public Player player;

    @Shadow public abstract void setItem(int slot, ItemStack stack);

    @Unique
    private ItemStack nemosBackpacks$backpackItemStack = ItemStack.EMPTY;

    @Inject(method = "setItem", at = @At("TAIL"))
    private void setBackpackItem(int index, ItemStack stack, CallbackInfo ci) {
        if (index == BACKPACK_SLOT && (stack.getItem() instanceof BackpackItem || stack.isEmpty())) {
            nemosBackpacks$backpackItemStack = stack;
        }
    }

    @Inject(method = "save", at = @At("TAIL"))
    private void saveBackpack(ListTag listTag, CallbackInfoReturnable<ListTag> cir) {
        if (!nemosBackpacks$backpackItemStack.isEmpty()) {
            var compoundtag = new CompoundTag();
            compoundtag.putByte("Slot", (byte) BACKPACK_SLOT);

            listTag.add(nemosBackpacks$backpackItemStack.save(this.player.registryAccess(), compoundtag));
        }
    }

    @Inject(method = "load", at = @At("TAIL"))
    private void loadBackpack(ListTag listTag, CallbackInfo ci) {
        this.nemosBackpacks$backpackItemStack = ItemStack.EMPTY;

        var backpackCompoundTag = listTag.stream()
                .map(Tag::asCompound)
                .flatMap(Optional::stream)
                .filter(compoundTag -> (compoundTag.getByteOr("Slot", (byte)0) & 255) == BACKPACK_SLOT)
                .findFirst()
                .orElse( new CompoundTag());

        var backpackItemstack = ItemStack.parse(this.player.registryAccess(), backpackCompoundTag).orElse(ItemStack.EMPTY);

        if (backpackItemstack.isEmpty()) {
            return;
        }

        nemosBackpacks$backpackItemStack = backpackItemstack;
    }

    @ModifyReturnValue(method = "getItem", at = @At("RETURN"))
    private ItemStack getBackpackItem(ItemStack original, @Local(argsOnly = true) int index) {
        if (original.isEmpty() && index == BACKPACK_SLOT) {
            return nemosBackpacks$backpackItemStack;
        }

        return original;
    }

    @ModifyReturnValue(method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", at = @At("RETURN"))
    private ItemStack removeBackpackItem(ItemStack original, @Local(ordinal = 0, argsOnly = true) int index, @Local(ordinal = 1, argsOnly = true) int count) {
        if (original.isEmpty() && index == BACKPACK_SLOT) {
            if (!nemosBackpacks$backpackItemStack.isEmpty()) {
                return nemosBackpacks$backpackItemStack.split(count);
            }
        }

        return original;
    }

    @Inject(method = "removeItem(Lnet/minecraft/world/item/ItemStack;)V", at = @At("RETURN"))
    private void removeBackpackItem(ItemStack stack, CallbackInfo ci) {
        if (stack == nemosBackpacks$backpackItemStack) {
            nemosBackpacks$backpackItemStack = ItemStack.EMPTY;
        }
    }

    @ModifyReturnValue(method = "removeItemNoUpdate", at = @At("RETURN"))
    private ItemStack removeBackpackNoUpdate(ItemStack original, @Local(argsOnly = true) int index) {
        if (original.isEmpty() && index == BACKPACK_SLOT) {
            return nemosBackpacks$backpackItemStack = ItemStack.EMPTY;
        }

        return original;
    }

    @ModifyReturnValue(method = "getContainerSize", at = @At("RETURN"))
    private int getContainerSize(int original) {
        return original + 1;
    }

    @ModifyReturnValue(method = "isEmpty", at = @At("RETURN"))
    private boolean isEmpty(boolean original) {
        if (original) {
            return nemosBackpacks$backpackItemStack == ItemStack.EMPTY;
        }

        return false;
    }

    @Inject(method = "dropAll", at = @At("TAIL"))
    private void dropBackpackItem(CallbackInfo ci) {
        if (!nemosBackpacks$backpackItemStack.isEmpty()) {
            player.drop(nemosBackpacks$backpackItemStack, true, false);
            nemosBackpacks$backpackItemStack = ItemStack.EMPTY;
        }
    }

    @Inject(method = "replaceWith", at = @At("HEAD"))
    private void keepBackpack(Inventory playerInventory, CallbackInfo ci) {
        setItem(BACKPACK_SLOT, ((BackpackGetter) playerInventory).nemosBackpacks$getBackpack());
    }

    @Override
    public ItemStack nemosBackpacks$getBackpack() {
        return nemosBackpacks$backpackItemStack;
    }
}
