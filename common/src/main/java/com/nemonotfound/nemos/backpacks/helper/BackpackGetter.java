package com.nemonotfound.nemos.backpacks.helper;

import net.minecraft.world.item.ItemStack;

public interface BackpackGetter {

    default ItemStack nemosBackpacks$getBackpack() {
        return ItemStack.EMPTY;
    }
}
