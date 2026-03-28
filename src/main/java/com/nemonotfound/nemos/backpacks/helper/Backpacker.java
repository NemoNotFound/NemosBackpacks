package com.nemonotfound.nemos.backpacks.helper;

import net.minecraft.world.item.ItemStack;

public interface Backpacker {

    default ItemStack nemosBackpacks$getLastOpenedBackpack() {
        return ItemStack.EMPTY;
    }
    default void nemosBackpacks$setLastOpenedBackpack(ItemStack itemStack) {}
}
