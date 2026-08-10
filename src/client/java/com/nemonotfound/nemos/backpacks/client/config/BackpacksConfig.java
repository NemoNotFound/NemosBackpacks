package com.nemonotfound.nemos.backpacks.client.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nemonotfound.nemos.backpacks.NemosBackpacks;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class BackpacksConfig {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve("nemos_backpacks.json");
    private static BackpacksConfig instance = new BackpacksConfig();

    public boolean showBackpackHudIcon = true;

    private BackpacksConfig() {}

    public static BackpacksConfig get() {
        return instance;
    }

    public static void load() {
        if (!Files.exists(CONFIG_PATH)) {
            save();

            return;
        }

        try (var reader = Files.newBufferedReader(CONFIG_PATH)) {
            var loaded = GSON.fromJson(reader, BackpacksConfig.class);
            instance = loaded != null ? loaded : new BackpacksConfig();
        } catch (IOException | RuntimeException exception) {
            NemosBackpacks.LOGGER.error("Could not load backpack config", exception);
            instance = new BackpacksConfig();
        }
    }

    public static void save() {
        try {
            Files.createDirectories(CONFIG_PATH.getParent());

            try (var writer = Files.newBufferedWriter(CONFIG_PATH)) {
                GSON.toJson(instance, writer);
            }
        } catch (IOException exception) {
            NemosBackpacks.LOGGER.error("Could not save backpack config", exception);
        }
    }

}
