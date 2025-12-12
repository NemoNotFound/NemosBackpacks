package com.nemonotfound.nemos.backpacks.mixin;

import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.nemonotfound.nemos.backpacks.Constants.BACKPACK_SLOT;

@Mixin(Gui.class)
public abstract class GuiMixin {

    @Shadow @Nullable protected abstract Player getCameraPlayer();

    @Shadow @Final private Minecraft minecraft;

    @Inject(method = "renderHotbarAndDecorations", at = @At("HEAD"))
    private void renderCarriedBackpack(GuiGraphics guiGraphics, DeltaTracker deltaTracker, CallbackInfo ci) {
        var player = this.getCameraPlayer();

        if (player == null || !this.minecraft.gameMode.canHurtPlayer()) {
            return;
        }

        var backpackItemStack = player.getInventory().getItem(BACKPACK_SLOT);

        if (backpackItemStack.isEmpty()) {
            return;
        }

        var backpackLocation = BuiltInRegistries.ITEM.getKey(backpackItemStack.getItem());
        var textureLocation = Identifier.fromNamespaceAndPath(backpackLocation.getNamespace(), "hud/backpack/" + backpackLocation.getPath());
        var x = guiGraphics.guiWidth() / 2 - 5;
        var y = guiGraphics.guiHeight() - 49;

        guiGraphics.blitSprite(RenderPipelines.GUI_TEXTURED, textureLocation, x, y, 9, 9);
    }
}
