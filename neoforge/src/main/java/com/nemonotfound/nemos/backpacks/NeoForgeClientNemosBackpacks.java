package com.nemonotfound.nemos.backpacks;


import com.nemonotfound.nemos.backpacks.client.gui.screens.inventory.BackpackScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

import static com.nemonotfound.nemos.backpacks.world.inventory.BackpackMenuTypes.*;

@Mod(value = Constants.MOD_ID, dist = Dist.CLIENT)
public class NeoForgeClientNemosBackpacks {

    public NeoForgeClientNemosBackpacks(IEventBus eventBus) {
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
    }
}