package com.nemonotfound.nemos.backpacks;

import com.nemonotfound.nemos.backpacks.event.LootTableEventHandler;
import net.fabricmc.api.ModInitializer;

public class FabricNemosBackpacks implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Common.init();
        LootTableEventHandler.handleLootTableEvent();
    }
}
