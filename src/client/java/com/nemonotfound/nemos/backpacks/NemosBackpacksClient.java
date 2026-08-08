package com.nemonotfound.nemos.backpacks;

import com.nemonotfound.nemos.backpacks.client.BackpackCategories;
import com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings;
import com.nemonotfound.nemos.backpacks.client.gui.screens.BackpackMenuScreens;
import com.nemonotfound.nemos.backpacks.client.model.BackpackModel;
import com.nemonotfound.nemos.backpacks.client.renderer.BackpackRenderLayer;
import com.nemonotfound.nemos.backpacks.network.protocol.game.BackpackClientPacketsRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityRenderLayerRegistrationCallback;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.renderer.entity.player.AvatarRenderer;

public class NemosBackpacksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModelLayerRegistry.registerModelLayer(BackpackModel.LAYER_LOCATION, BackpackModel::createBodyLayer);
        LivingEntityRenderLayerRegistrationCallback.EVENT.register((_, renderer, registrationHelper, context) -> {
            if (renderer instanceof AvatarRenderer<?> avatarRenderer) {
                registrationHelper.register(new BackpackRenderLayer(
                        avatarRenderer,
                        new BackpackModel(context.bakeLayer(BackpackModel.LAYER_LOCATION))
                ));
            }
        });
        BackpackMenuScreens.init();
        BackpackCategories.init();
        BackpackKeyMappings.init();
        BackpackClientPacketsRegistry.init();
    }
}
