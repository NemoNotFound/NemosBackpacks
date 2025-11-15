package com.nemonotfound.nemos.backpacks;

import com.nemonotfound.nemos.backpacks.core.component.BackpacksDataComponents;
import com.nemonotfound.nemos.backpacks.network.protocol.game.BackpackPackets;
import com.nemonotfound.nemos.backpacks.world.inventory.BackpackMenuTypes;
import com.nemonotfound.nemos.backpacks.world.item.BackpackCreativeModeTabs;
import com.nemonotfound.nemos.backpacks.world.item.BackpackItems;

public class Common {

    public static void init() {
        Constants.LOG.info("Thank you for using Nemo's Backpack");

        BackpacksDataComponents.init();
        BackpackItems.init();
        BackpackCreativeModeTabs.init();
        BackpackMenuTypes.init();
        BackpackPackets.init();
    }
}