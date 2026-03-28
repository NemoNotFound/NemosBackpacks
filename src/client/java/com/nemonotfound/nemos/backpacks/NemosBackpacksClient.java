package com.nemonotfound.nemos.backpacks;

import com.nemonotfound.nemos.backpacks.client.BackpackCategories;
import com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings;
import com.nemonotfound.nemos.backpacks.client.gui.screens.BackpackMenuScreens;
import com.nemonotfound.nemos.backpacks.network.protocol.game.BackpackClientPacketsRegistry;
import net.fabricmc.api.ClientModInitializer;

public class NemosBackpacksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BackpackMenuScreens.init();
        BackpackCategories.init();
        BackpackKeyMappings.init();
        BackpackClientPacketsRegistry.init();
    }
}
