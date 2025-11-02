package com.nemonotfound.nemos.backpacks;


import com.nemonotfound.nemos.backpacks.client.gui.screens.inventory.BackpackScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

import static com.nemonotfound.nemos.backpacks.world.inventory.BackpackMenuTypes.*;
import static com.nemonotfound.nemos.backpacks.world.inventory.BackpackMenuTypes.DIAMOND_WHITE_BACKPACK;

@Mod(value = Constants.MOD_ID, dist = Dist.CLIENT)
public class NeoForgeClientNemosBackpacks {

    public NeoForgeClientNemosBackpacks(IEventBus eventBus) {
        ClientCommon.init();
        eventBus.addListener(this::registerScreen);
    }

    @SubscribeEvent
    public void registerScreen(RegisterMenuScreensEvent event) {
        event.register(DEFAULT_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_WHITE_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_WHITE_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_WHITE_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_WHITE_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_WHITE_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_WHITE_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_LIGHT_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_LIGHT_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_LIGHT_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_LIGHT_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_LIGHT_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_LIGHT_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_GRAY_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_BLACK_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_BLACK_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_BLACK_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_BLACK_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_BLACK_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_BLACK_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_BROWN_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_BROWN_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_BROWN_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_BROWN_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_BROWN_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_BROWN_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_RED_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_RED_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_RED_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_RED_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_RED_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_RED_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_ORANGE_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_ORANGE_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_ORANGE_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_ORANGE_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_ORANGE_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_ORANGE_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_YELLOW_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_YELLOW_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_YELLOW_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_YELLOW_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_YELLOW_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_YELLOW_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_LIME_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_LIME_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_LIME_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_LIME_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_LIME_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_LIME_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_GREEN_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_GREEN_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_GREEN_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_GREEN_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_GREEN_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_GREEN_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_CYAN_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_CYAN_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_CYAN_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_CYAN_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_CYAN_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_CYAN_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_LIGHT_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_LIGHT_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_LIGHT_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_LIGHT_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_LIGHT_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_LIGHT_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_BLUE_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_PURPLE_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_PURPLE_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_PURPLE_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_PURPLE_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_PURPLE_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_PURPLE_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_MAGENTA_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_MAGENTA_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_MAGENTA_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_MAGENTA_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_MAGENTA_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_MAGENTA_BACKPACK.get(), BackpackScreen::new);
        event.register(DEFAULT_PINK_BACKPACK.get(), BackpackScreen::new);
        event.register(COPPER_PINK_BACKPACK.get(), BackpackScreen::new);
        event.register(IRON_PINK_BACKPACK.get(), BackpackScreen::new);
        event.register(GOLDEN_PINK_BACKPACK.get(), BackpackScreen::new);
        event.register(DIAMOND_PINK_BACKPACK.get(), BackpackScreen::new);
        event.register(NETHERITE_PINK_BACKPACK.get(), BackpackScreen::new);
    }
}