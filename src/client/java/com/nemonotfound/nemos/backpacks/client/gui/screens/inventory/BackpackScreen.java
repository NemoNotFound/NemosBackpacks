package com.nemonotfound.nemos.backpacks.client.gui.screens.inventory;

import com.nemonotfound.nemos.backpacks.world.inventory.BackpackMenu;
import com.nemonotfound.nemos.backpacks.world.item.BackpackMaterial;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.DyeColor;
import org.jetbrains.annotations.NotNull;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;
import static com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings.INTERACT_BACKPACK;

public class BackpackScreen extends AbstractContainerScreen<@NotNull BackpackMenu> {

    private final Identifier backpackBackground;
    private final Identifier backpackOverlay;
    private final int containerRows;

    public BackpackScreen(BackpackMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title, 176, 114 + menu.getRowCount() * 18);
        this.containerRows = menu.getRowCount();
        this.inventoryLabelY = this.imageHeight - 94;
        backpackOverlay = getOverlayTextureLocation(menu.getBackpackMaterial());
        backpackBackground = getBackgroundTextureLocation(menu.getDyeColor());
    }

    @Override
    public void extractRenderState(@NotNull GuiGraphicsExtractor guiGraphicsExtractor, int mouseX, int mouseY, float a) {
        super.extractRenderState(guiGraphicsExtractor, mouseX, mouseY, a);
        super.extractTooltip(guiGraphicsExtractor, mouseX, mouseY);
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor guiGraphicsExtractor,final int mouseX, final int mouseY, final float a) {
        int leftPos = (this.width - this.imageWidth) / 2;
        int topPos = (this.height - this.imageHeight) / 2;

        guiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED, backpackBackground, leftPos, topPos, 0.0F, 0.0F, this.imageWidth, this.containerRows * 18 + 17, 256, 256);
        guiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED, backpackBackground, leftPos, topPos + this.containerRows * 18 + 17, 0.0F, 126.0F, this.imageWidth, 96, 256, 256);
        guiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED, backpackOverlay, leftPos, topPos, 0.0F, 0.0F, this.imageWidth, this.containerRows * 18 + 17, 256, 256);
        guiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED, backpackOverlay, leftPos, topPos + this.containerRows * 18 + 17, 0.0F, 126.0F, this.imageWidth, 96, 256, 256);
    }

    @Override
    public boolean keyPressed(@NotNull KeyEvent event) {
        if (INTERACT_BACKPACK.matches(event)) {
            this.onClose();

            return true;
        }

        return super.keyPressed(event);
    }

    @Override
    public boolean mouseClicked(@NotNull MouseButtonEvent event, boolean isDoubleClick) {
        if (INTERACT_BACKPACK.matchesMouse(event)) {
            this.onClose();

            return true;
        }

        return super.mouseClicked(event, isDoubleClick);
    }

    private static Identifier getBackgroundTextureLocation(DyeColor dyeColor) {
        var dyeColorString = "default";

        if (dyeColor != null) {
            dyeColorString = dyeColor.getName();
        }

        return Identifier.fromNamespaceAndPath(MOD_ID, String.format("textures/gui/container/backpack/background/%s_backpack_background.png", dyeColorString));
    }

    private static Identifier getOverlayTextureLocation(BackpackMaterial backpackMaterial) {
        return Identifier.fromNamespaceAndPath(MOD_ID, String.format("textures/gui/container/backpack/overlay/%s_backpack_overlay.png", backpackMaterial.getName()));
    }
}
