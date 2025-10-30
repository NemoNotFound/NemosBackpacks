package com.nemonotfound.nemos.backpacks.client;

import com.nemonotfound.nemos.backpacks.platform.Services;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

import java.util.function.Supplier;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

public class BackpackKeyMappings {

    private static final String CATEGORY = String.format("key.category.%s.%s", MOD_ID, MOD_ID);

    public static Supplier<KeyMapping> SWAP_BACKPACK = registerKeyMapping(new KeyMapping(
            String.format("%s.key.swapBackpack", MOD_ID),
            GLFW.GLFW_KEY_B,
            CATEGORY
    ));
    public static Supplier<KeyMapping> INTERACT_BACKPACK = registerKeyMapping(new KeyMapping(
            String.format("%s.key.interactBackpack", MOD_ID),
            GLFW.GLFW_KEY_I,
            CATEGORY
    ));

    public static void init() {}

    private static Supplier<KeyMapping> registerKeyMapping(KeyMapping keyMapping) {
        return Services.REGISTRY_HELPER.registerKeyMapping(keyMapping);
    }
}
