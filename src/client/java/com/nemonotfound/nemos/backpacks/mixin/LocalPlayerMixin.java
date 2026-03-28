package com.nemonotfound.nemos.backpacks.mixin;

import com.nemonotfound.nemos.backpacks.helper.Backpacker;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(LocalPlayer.class)
public class LocalPlayerMixin implements Backpacker {

    @Unique
    private ItemStack nemosBackpacks$lastOpenedBackpack = ItemStack.EMPTY;

    @Override
    public ItemStack nemosBackpacks$getLastOpenedBackpack() {
        return nemosBackpacks$lastOpenedBackpack;
    }

    @Override
    public void nemosBackpacks$setLastOpenedBackpack(ItemStack itemStack) {
        nemosBackpacks$lastOpenedBackpack = itemStack;
    }
}
