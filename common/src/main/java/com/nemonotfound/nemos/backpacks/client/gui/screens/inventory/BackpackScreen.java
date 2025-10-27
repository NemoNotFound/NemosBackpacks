package com.nemonotfound.nemos.backpacks.client.gui.screens.inventory;

import com.nemonotfound.nemos.backpacks.world.inventory.BackpackMenu;
import com.nemonotfound.nemos.backpacks.world.item.BackpackMaterial;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.DyeColor;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

public class BackpackScreen extends AbstractContainerScreen<BackpackMenu> {

    private static final Map<DyeColor, ResourceLocation> backgroundTextureMap = new HashMap<>();
    private static final Map<BackpackMaterial, ResourceLocation> overlayTextureMap = new HashMap<>();
    private final ResourceLocation backpackBackground;
    private final ResourceLocation backpackOverlay;
    private final int containerRows;

    public BackpackScreen(BackpackMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        this.containerRows = menu.getRowCount();
        this.imageHeight = 114 + this.containerRows * 18;
        this.inventoryLabelY = this.imageHeight - 94;
        backpackOverlay = overlayTextureMap.get(menu.getBackpackMaterial());
        backpackBackground = backgroundTextureMap.get(menu.getDyeColor());
    }

    @Override
    public void render(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        super.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
        int leftPos = (this.width - this.imageWidth) / 2;
        int topPos = (this.height - this.imageHeight) / 2;

        guiGraphics.blit(RenderPipelines.GUI_TEXTURED, backpackBackground, leftPos, topPos, 0.0F, 0.0F, this.imageWidth, this.containerRows * 18 + 17, 256, 256);
        guiGraphics.blit(RenderPipelines.GUI_TEXTURED, backpackBackground, leftPos, topPos + this.containerRows * 18 + 17, 0.0F, 126.0F, this.imageWidth, 96, 256, 256);
        guiGraphics.blit(RenderPipelines.GUI_TEXTURED, backpackOverlay, leftPos, topPos, 0.0F, 0.0F, this.imageWidth, this.containerRows * 18 + 17, 256, 256);
        guiGraphics.blit(RenderPipelines.GUI_TEXTURED, backpackOverlay, leftPos, topPos + this.containerRows * 18 + 17, 0.0F, 126.0F, this.imageWidth, 96, 256, 256);
    }

    static {
        overlayTextureMap.put(BackpackMaterial.STRING, getOverlayTextureLocation("default_backpack_overlay"));
        overlayTextureMap.put(BackpackMaterial.COPPER, getOverlayTextureLocation("copper_backpack_overlay"));
        overlayTextureMap.put(BackpackMaterial.IRON, getOverlayTextureLocation("iron_backpack_overlay"));
        overlayTextureMap.put(BackpackMaterial.GOLD, getOverlayTextureLocation("golden_backpack_overlay"));
        overlayTextureMap.put(BackpackMaterial.DIAMOND, getOverlayTextureLocation("diamond_backpack_overlay"));
        overlayTextureMap.put(BackpackMaterial.NETHERITE, getOverlayTextureLocation("netherite_backpack_overlay"));

        backgroundTextureMap.put(null, getBackgroundTextureLocation("default_backpack_background"));
        backgroundTextureMap.put(DyeColor.WHITE, getBackgroundTextureLocation("white_backpack_background"));
        backgroundTextureMap.put(DyeColor.LIGHT_GRAY, getBackgroundTextureLocation("light_gray_backpack_background"));
        backgroundTextureMap.put(DyeColor.GRAY, getBackgroundTextureLocation("gray_backpack_background"));
        backgroundTextureMap.put(DyeColor.BLACK, getBackgroundTextureLocation("black_backpack_background"));
        backgroundTextureMap.put(DyeColor.BROWN, getBackgroundTextureLocation("brown_backpack_background"));
        backgroundTextureMap.put(DyeColor.RED, getBackgroundTextureLocation("red_backpack_background"));
        backgroundTextureMap.put(DyeColor.ORANGE, getBackgroundTextureLocation("orange_backpack_background"));
        backgroundTextureMap.put(DyeColor.YELLOW, getBackgroundTextureLocation("yellow_backpack_background"));
        backgroundTextureMap.put(DyeColor.LIME, getBackgroundTextureLocation("lime_backpack_background"));
        backgroundTextureMap.put(DyeColor.GREEN, getBackgroundTextureLocation("green_backpack_background"));
        backgroundTextureMap.put(DyeColor.CYAN, getBackgroundTextureLocation("cyan_backpack_background"));
        backgroundTextureMap.put(DyeColor.LIGHT_BLUE, getBackgroundTextureLocation("light_blue_backpack_background"));
        backgroundTextureMap.put(DyeColor.BLUE, getBackgroundTextureLocation("blue_backpack_background"));
        backgroundTextureMap.put(DyeColor.PURPLE, getBackgroundTextureLocation("purple_backpack_background"));
        backgroundTextureMap.put(DyeColor.MAGENTA, getBackgroundTextureLocation("magenta_backpack_background"));
        backgroundTextureMap.put(DyeColor.PINK, getBackgroundTextureLocation("pink_backpack_background"));
    }

    private static ResourceLocation getBackgroundTextureLocation(String textureFileName) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, String.format("textures/gui/container/backpack/background/%s.png", textureFileName));
    }

    private static ResourceLocation getOverlayTextureLocation(String textureFileName) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, String.format("textures/gui/container/backpack/overlay/%s.png", textureFileName));
    }
}
