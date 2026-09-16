package com.nemonotfound.nemos.backpacks.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.nemonotfound.nemos.backpacks.client.model.BackpackModel;
import com.nemonotfound.nemos.backpacks.helper.BackpackGetter;
import com.nemonotfound.nemos.backpacks.tags.BackpackItemTags;
import com.nemonotfound.nemos.backpacks.world.item.BackpackItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class BackpackRenderLayer extends RenderLayer<@NotNull AvatarRenderState, @NotNull PlayerModel> {

    private final BackpackModel model;

    public BackpackRenderLayer(RenderLayerParent<@NotNull AvatarRenderState, @NotNull PlayerModel> parent, BackpackModel model) {
        super(parent);
        this.model = model;
    }

    @Override
    public void submit(@NotNull PoseStack poseStack, @NotNull SubmitNodeCollector submitNodeCollector, int light,
                       AvatarRenderState renderState, float yRot, float xRot) {
        var level = Minecraft.getInstance().level;

        if (level == null || !(level.getEntity(renderState.id) instanceof Player player)) {
            return;
        }

        ItemStack backpack = ((BackpackGetter) player.getInventory()).nemosBackpacks$getBackpack();

        if (!backpack.is(BackpackItemTags.BACKPACKS)) {
            return;
        }

        var backpackItem = (BackpackItem) backpack.getItem();
        var namespace = BuiltInRegistries.ITEM.getKey(backpackItem).getNamespace();
        var dyeColor = backpackItem.getDyeColor();
        var colorName = dyeColor == null ? "default" : dyeColor.getName();

        Identifier baseColorTexture = Identifier.fromNamespaceAndPath(
                namespace,
                "textures/overlay/backpack/base/" + colorName + ".png"
        );
        Identifier materialOverlayTexture = Identifier.fromNamespaceAndPath(
                namespace,
                "textures/overlay/backpack/material/" + backpackItem.getBackpackMaterial().getName() + ".png"
        );

        //TODO: Add once textures are added
        //submitModel(poseStack, submitNodeCollector, light, renderState, baseColorTexture);
        //submitModel(poseStack, submitNodeCollector, light, renderState, materialOverlayTexture);
    }

    private void submitModel(PoseStack poseStack, SubmitNodeCollector submitNodeCollector, int light,
                             AvatarRenderState renderState, Identifier texture) {
        submitNodeCollector.submitModel(
                model,
                renderState,
                poseStack,
                texture,
                light,
                OverlayTexture.NO_OVERLAY,
                renderState.outlineColor
        );
    }
}
