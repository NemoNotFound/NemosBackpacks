package com.nemonotfound.nemos.backpacks.client.config;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.api.controller.BooleanControllerBuilder;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

final class YaclConfigScreen {

    private YaclConfigScreen() {}

    static Screen create(Screen parent) {
        var config = BackpacksConfig.get();

        return YetAnotherConfigLib.createBuilder()
                .title(Component.translatable(MOD_ID + ".config.title"))
                .category(ConfigCategory.createBuilder()
                        .name(Component.translatable(MOD_ID + ".config.category.general"))
                        .option(Option.<Boolean>createBuilder()
                                .name(Component.translatable(MOD_ID + ".config.show_hud_icon"))
                                .description(OptionDescription.of(Component.translatable(MOD_ID + ".config.show_hud_icon.description")))
                                .binding(true, () -> config.showBackpackHudIcon, value -> config.showBackpackHudIcon = value)
                                .controller(BooleanControllerBuilder::create)
                                .build())
                        .build())
                .save(BackpacksConfig::save)
                .build()
                .generateScreen(parent);
    }
}
