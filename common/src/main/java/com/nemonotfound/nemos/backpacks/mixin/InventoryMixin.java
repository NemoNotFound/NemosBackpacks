package com.nemonotfound.nemos.backpacks.mixin;

import com.nemonotfound.nemos.backpacks.world.item.BackpackItem;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.ItemStackWithSlot;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.nemonotfound.nemos.backpacks.Constants.BACKPACK_SLOT;

@Mixin(Inventory.class)
public class InventoryMixin {

    @Shadow @Final public Player player;
    @Unique
    private ItemStack nemosBackpacks$backpackItemStack = ItemStack.EMPTY;

    @Inject(method = "setItem", at = @At("TAIL"))
    private void setBackpackItem(int index, ItemStack stack, CallbackInfo ci) {
        if (index == BACKPACK_SLOT && (stack.getItem() instanceof BackpackItem || stack.isEmpty())) {
            nemosBackpacks$backpackItemStack = stack;
        }
    }

    @Inject(method = "save", at = @At("TAIL"))
    private void saveBackpack(ValueOutput.TypedOutputList<ItemStackWithSlot> output, CallbackInfo ci) {
        if (!nemosBackpacks$backpackItemStack.isEmpty()) {
            output.add(new ItemStackWithSlot(BACKPACK_SLOT, nemosBackpacks$backpackItemStack));
        }
    }

    @Inject(method = "load", at = @At("TAIL"))
    private void loadBackpack(ValueInput.TypedInputList<ItemStackWithSlot> input, CallbackInfo ci) {
        this.nemosBackpacks$backpackItemStack = ItemStack.EMPTY;

        var optionalBackpackItem = input.stream()
                .filter(itemStackWithSlot -> itemStackWithSlot.slot() == BACKPACK_SLOT)
                .findFirst();

        optionalBackpackItem.ifPresent(itemStackWithSlot -> nemosBackpacks$backpackItemStack = itemStackWithSlot.stack());
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
}
