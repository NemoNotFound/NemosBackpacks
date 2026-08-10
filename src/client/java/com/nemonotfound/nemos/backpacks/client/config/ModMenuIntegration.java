package com.nemonotfound.nemos.backpacks.client.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.fabricmc.loader.api.FabricLoader;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.YACL_MOD_ID;

public final class ModMenuIntegration implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        if (FabricLoader.getInstance().isModLoaded(YACL_MOD_ID)) {
            return YaclConfigScreen::create;
        }

        return ModMenuApi.super.getModConfigScreenFactory();
    }
}
