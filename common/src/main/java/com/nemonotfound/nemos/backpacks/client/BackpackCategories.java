package com.nemonotfound.nemos.backpacks.client;

import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

public class BackpackCategories {

    public static final KeyMapping.Category NEMOS_BACKPACKS_KEYBINDING = registerCategory();

    public static void init() {}

    private static KeyMapping.Category registerCategory() {
        return KeyMapping.Category.register(Identifier.fromNamespaceAndPath(MOD_ID, MOD_ID));
    }
}
