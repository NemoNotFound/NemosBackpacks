package com.nemonotfound.nemos.backpacks.client;

import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;
import static com.nemonotfound.nemos.backpacks.client.BackpackCategories.NEMOS_BACKPACKS_KEYBINDING;

public class BackpackKeyMappings {

    public static KeyMapping SWAP_BACKPACK = registerKeyMapping(new KeyMapping(
            String.format("%s.key.swapBackpack", MOD_ID),
            GLFW.GLFW_KEY_B,
            NEMOS_BACKPACKS_KEYBINDING
    ));
    public static KeyMapping INTERACT_BACKPACK = registerKeyMapping(new KeyMapping(
            String.format("%s.key.interactBackpack", MOD_ID),
            GLFW.GLFW_KEY_I,
            NEMOS_BACKPACKS_KEYBINDING
    ));

    public static void init() {}

    private static KeyMapping registerKeyMapping(KeyMapping keyMapping) {
        return KeyMappingHelper.registerKeyMapping(keyMapping);
    }
}
