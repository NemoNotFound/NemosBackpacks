package com.nemonotfound.nemos.backpacks.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.world.item.CreativeModeTab;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.nemonotfound.nemos.backpacks.Constants.BACKPACK_SLOT;

@Mixin(CreativeModeInventoryScreen.class)
public class CreativeModeInventoryScreenMixin {

    @Inject(method = "selectTab", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/inventory/CreativeModeInventoryScreen$SlotWrapper;<init>(Lnet/minecraft/world/inventory/Slot;III)V", shift = At.Shift.BY, by = -2))
    private void updateBackpackSlotPosition(CreativeModeTab tab, CallbackInfo ci, @Local(ordinal = 0) int slot, @Local(ordinal = 1) LocalIntRef localXRef, @Local(ordinal = 2) LocalIntRef localYRef) {
        if (slot == BACKPACK_SLOT) {
            localXRef.set(9);
            localYRef.set(20);
        }
    }
}
