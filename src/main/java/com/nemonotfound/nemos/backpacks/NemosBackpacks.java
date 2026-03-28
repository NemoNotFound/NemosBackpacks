package com.nemonotfound.nemos.backpacks;

import com.nemonotfound.nemos.backpacks.core.component.BackpacksDataComponents;
import com.nemonotfound.nemos.backpacks.network.protocol.game.BackpackPacketsRegistry;
import com.nemonotfound.nemos.backpacks.world.inventory.BackpackMenuTypes;
import com.nemonotfound.nemos.backpacks.world.item.BackpackCreativeModeTabs;
import com.nemonotfound.nemos.backpacks.world.item.BackpackItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosBackpacks implements ModInitializer {

	public static final int BACKPACK_SLOT = 46;
	public static final String MOD_ID = "nemos_backpacks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Don't you already have enough to carry on your shoulders?");

		BackpacksDataComponents.init();
		BackpackItems.init();
		BackpackCreativeModeTabs.init();
		BackpackMenuTypes.init();
		BackpackPacketsRegistry.init();
	}
}