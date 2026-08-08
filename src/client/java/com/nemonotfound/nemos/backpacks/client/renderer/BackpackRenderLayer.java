package com.nemonotfound.nemos.backpacks.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.nemonotfound.nemos.backpacks.client.model.BackpackModel;
import com.nemonotfound.nemos.backpacks.helper.BackpackGetter;
import com.nemonotfound.nemos.backpacks.tags.BackpackItemTags;
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

        Identifier itemId = BuiltInRegistries.ITEM.getKey(backpack.getItem());
        Identifier texture = Identifier.fromNamespaceAndPath(itemId.getNamespace(), "textures/overlay/" + itemId.getPath() + ".png");

        submitNodeCollector.submitModel(
                model,
                renderState,
                poseStack,
                texture,
                light,
                OverlayTexture.NO_OVERLAY,
                renderState.outlineColor,
                null
        );
    }
}
