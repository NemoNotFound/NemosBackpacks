package com.nemonotfound.nemos.backpacks.client;

import com.nemonotfound.nemos.backpacks.platform.Services;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

import java.util.function.Supplier;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;
import static com.nemonotfound.nemos.backpacks.client.BackpackCategories.NEMOS_BACKPACKS_KEYBINDING;

public class BackpackKeyMappings {

    public static Supplier<KeyMapping> SWAP_BACKPACK = registerKeyMapping(new KeyMapping(
            String.format("%s.key.swapBackpack", MOD_ID),
            GLFW.GLFW_KEY_B,
            NEMOS_BACKPACKS_KEYBINDING
    ));
    public static Supplier<KeyMapping> INTERACT_BACKPACK = registerKeyMapping(new KeyMapping(
            String.format("%s.key.interactBackpack", MOD_ID),
            GLFW.GLFW_KEY_I,
            NEMOS_BACKPACKS_KEYBINDING
    ));

    public static void init() {}

    private static Supplier<KeyMapping> registerKeyMapping(KeyMapping keyMapping) {
        return Services.REGISTRY_HELPER.registerKeyMapping(keyMapping);
    }
}
