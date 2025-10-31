package com.nemonotfound.nemos.backpacks;

import com.nemonotfound.nemos.backpacks.client.BackpackCategories;
import com.nemonotfound.nemos.backpacks.client.BackpackKeyMappings;
import com.nemonotfound.nemos.backpacks.client.gui.screens.BackpackMenuScreens;

public class ClientCommon {

    public static void init() {
        BackpackMenuScreens.init();
        BackpackCategories.init();
        BackpackKeyMappings.init();
    }
}