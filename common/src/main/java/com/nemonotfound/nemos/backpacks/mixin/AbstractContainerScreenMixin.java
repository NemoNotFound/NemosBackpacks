package com.nemonotfound.nemos.backpacks.mixin;

import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.nemonotfound.nemos.backpacks.Constants.BACKPACK_SLOT;
import static com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings.SWAP_BACKPACK;

@Mixin(AbstractContainerScreen.class)
public abstract class AbstractContainerScreenMixin {

    @Shadow @Nullable protected Slot hoveredSlot;

    @Shadow @Final protected AbstractContainerMenu menu;

    @Shadow protected abstract void slotClicked(Slot slot, int slotId, int mouseButton, ClickType type);

    @Inject(method = "checkHotbarMouseClicked", at = @At("HEAD"))
    private void handleBackpackSwapMouseClicked(MouseButtonEvent event, CallbackInfo ci) {
        if (this.hoveredSlot == null || !this.menu.getCarried().isEmpty()) {
            return;
        }

        if (SWAP_BACKPACK.get().matchesMouse(event)) {
            this.slotClicked(this.hoveredSlot, this.hoveredSlot.index, BACKPACK_SLOT, ClickType.SWAP);
        }
    }

    @Inject(method = "keyPressed", at = @At("HEAD"))
    private void handleBackpackSwapKeyPRessed(KeyEvent event, CallbackInfoReturnable<Boolean> cir) {
        if (this.hoveredSlot == null || !this.menu.getCarried().isEmpty()) {
            return;
        }

        if (SWAP_BACKPACK.get().matches(event)) {
            this.slotClicked(this.hoveredSlot, this.hoveredSlot.index, BACKPACK_SLOT, ClickType.SWAP);
        }
    }
}
