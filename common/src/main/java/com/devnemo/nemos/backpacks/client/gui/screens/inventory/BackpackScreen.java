package com.devnemo.nemos.backpacks.client.gui.screens.inventory;

import com.devnemo.nemos.backpacks.world.inventory.BackpackMenu;
import com.devnemo.nemos.backpacks.world.item.BackpackMaterial;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.devnemo.nemos.backpacks.Constants.MOD_ID;

public class BackpackScreen extends AbstractContainerScreen<BackpackMenu> {

    private static final Map<BackpackMaterial, ResourceLocation> overlayTextureMap = new HashMap<>();
    private final ResourceLocation backpackBackground = ResourceLocation.withDefaultNamespace("textures/gui/container/generic_54.png");
    private final ResourceLocation backpackOverlay;
    private final int containerRows;

    public BackpackScreen(BackpackMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        this.containerRows = menu.getRowCount();
        this.imageHeight = 114 + this.containerRows * 18;
        this.inventoryLabelY = this.imageHeight - 94;
        backpackOverlay = overlayTextureMap.get(menu.getBackpackMaterial());
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
        overlayTextureMap.put(BackpackMaterial.STRING, getTextureLocation("default_backpack_overlay"));
        overlayTextureMap.put(BackpackMaterial.COPPER, getTextureLocation("copper_backpack_overlay"));
        overlayTextureMap.put(BackpackMaterial.IRON, getTextureLocation("iron_backpack_overlay"));
        overlayTextureMap.put(BackpackMaterial.GOLD, getTextureLocation("golden_backpack_overlay"));
        overlayTextureMap.put(BackpackMaterial.DIAMOND, getTextureLocation("diamond_backpack_overlay"));
        overlayTextureMap.put(BackpackMaterial.NETHERITE, getTextureLocation("netherite_backpack_overlay"));
    }

    private static ResourceLocation getTextureLocation(String textureFileName) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, String.format("textures/gui/container/backpacks/overlays/%s.png", textureFileName));
    }
}
