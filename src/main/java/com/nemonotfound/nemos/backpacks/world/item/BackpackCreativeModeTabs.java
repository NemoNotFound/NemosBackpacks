package com.nemonotfound.nemos.backpacks.world.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;
import static com.nemonotfound.nemos.backpacks.world.item.BackpackItems.*;

public class BackpackCreativeModeTabs {

    public static void init() {
        var creativeModeTab = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                .title(Component.translatable("itemGroup." + MOD_ID))
                .icon(() -> new ItemStack(GOLDEN_BACKPACK))
                .displayItems((_, output) -> {
                    output.accept(BACKPACK);
                    output.accept(COPPER_BACKPACK);
                    output.accept(IRON_BACKPACK);
                    output.accept(GOLDEN_BACKPACK);
                    output.accept(DIAMOND_BACKPACK);
                    output.accept(NETHERITE_BACKPACK);
                    output.accept(WHITE_BACKPACK);
                    output.accept(WHITE_COPPER_BACKPACK);
                    output.accept(WHITE_IRON_BACKPACK);
                    output.accept(WHITE_GOLDEN_BACKPACK);
                    output.accept(WHITE_DIAMOND_BACKPACK);
                    output.accept(WHITE_NETHERITE_BACKPACK);
                    output.accept(LIGHT_GRAY_BACKPACK);
                    output.accept(LIGHT_GRAY_COPPER_BACKPACK);
                    output.accept(LIGHT_GRAY_IRON_BACKPACK);
                    output.accept(LIGHT_GRAY_GOLDEN_BACKPACK);
                    output.accept(LIGHT_GRAY_DIAMOND_BACKPACK);
                    output.accept(LIGHT_GRAY_NETHERITE_BACKPACK);
                    output.accept(GRAY_BACKPACK);
                    output.accept(GRAY_COPPER_BACKPACK);
                    output.accept(GRAY_IRON_BACKPACK);
                    output.accept(GRAY_GOLDEN_BACKPACK);
                    output.accept(GRAY_DIAMOND_BACKPACK);
                    output.accept(GRAY_NETHERITE_BACKPACK);
                    output.accept(BLACK_BACKPACK);
                    output.accept(BLACK_COPPER_BACKPACK);
                    output.accept(BLACK_IRON_BACKPACK);
                    output.accept(BLACK_GOLDEN_BACKPACK);
                    output.accept(BLACK_DIAMOND_BACKPACK);
                    output.accept(BLACK_NETHERITE_BACKPACK);
                    output.accept(BROWN_BACKPACK);
                    output.accept(BROWN_COPPER_BACKPACK);
                    output.accept(BROWN_IRON_BACKPACK);
                    output.accept(BROWN_GOLDEN_BACKPACK);
                    output.accept(BROWN_DIAMOND_BACKPACK);
                    output.accept(BROWN_NETHERITE_BACKPACK);
                    output.accept(RED_BACKPACK);
                    output.accept(RED_COPPER_BACKPACK);
                    output.accept(RED_IRON_BACKPACK);
                    output.accept(RED_GOLDEN_BACKPACK);
                    output.accept(RED_DIAMOND_BACKPACK);
                    output.accept(RED_NETHERITE_BACKPACK);
                    output.accept(ORANGE_BACKPACK);
                    output.accept(ORANGE_COPPER_BACKPACK);
                    output.accept(ORANGE_IRON_BACKPACK);
                    output.accept(ORANGE_GOLDEN_BACKPACK);
                    output.accept(ORANGE_DIAMOND_BACKPACK);
                    output.accept(ORANGE_NETHERITE_BACKPACK);
                    output.accept(YELLOW_BACKPACK);
                    output.accept(YELLOW_COPPER_BACKPACK);
                    output.accept(YELLOW_IRON_BACKPACK);
                    output.accept(YELLOW_GOLDEN_BACKPACK);
                    output.accept(YELLOW_DIAMOND_BACKPACK);
                    output.accept(YELLOW_NETHERITE_BACKPACK);
                    output.accept(LIME_BACKPACK);
                    output.accept(LIME_COPPER_BACKPACK);
                    output.accept(LIME_IRON_BACKPACK);
                    output.accept(LIME_GOLDEN_BACKPACK);
                    output.accept(LIME_DIAMOND_BACKPACK);
                    output.accept(LIME_NETHERITE_BACKPACK);
                    output.accept(GREEN_BACKPACK);
                    output.accept(GREEN_COPPER_BACKPACK);
                    output.accept(GREEN_IRON_BACKPACK);
                    output.accept(GREEN_GOLDEN_BACKPACK);
                    output.accept(GREEN_DIAMOND_BACKPACK);
                    output.accept(GREEN_NETHERITE_BACKPACK);
                    output.accept(CYAN_BACKPACK);
                    output.accept(CYAN_COPPER_BACKPACK);
                    output.accept(CYAN_IRON_BACKPACK);
                    output.accept(CYAN_GOLDEN_BACKPACK);
                    output.accept(CYAN_DIAMOND_BACKPACK);
                    output.accept(CYAN_NETHERITE_BACKPACK);
                    output.accept(LIGHT_BLUE_BACKPACK);
                    output.accept(LIGHT_BLUE_COPPER_BACKPACK);
                    output.accept(LIGHT_BLUE_IRON_BACKPACK);
                    output.accept(LIGHT_BLUE_GOLDEN_BACKPACK);
                    output.accept(LIGHT_BLUE_DIAMOND_BACKPACK);
                    output.accept(LIGHT_BLUE_NETHERITE_BACKPACK);
                    output.accept(BLUE_BACKPACK);
                    output.accept(BLUE_COPPER_BACKPACK);
                    output.accept(BLUE_IRON_BACKPACK);
                    output.accept(BLUE_GOLDEN_BACKPACK);
                    output.accept(BLUE_DIAMOND_BACKPACK);
                    output.accept(BLUE_NETHERITE_BACKPACK);
                    output.accept(PURPLE_BACKPACK);
                    output.accept(PURPLE_COPPER_BACKPACK);
                    output.accept(PURPLE_IRON_BACKPACK);
                    output.accept(PURPLE_GOLDEN_BACKPACK);
                    output.accept(PURPLE_DIAMOND_BACKPACK);
                    output.accept(PURPLE_NETHERITE_BACKPACK);
                    output.accept(MAGENTA_BACKPACK);
                    output.accept(MAGENTA_COPPER_BACKPACK);
                    output.accept(MAGENTA_IRON_BACKPACK);
                    output.accept(MAGENTA_GOLDEN_BACKPACK);
                    output.accept(MAGENTA_DIAMOND_BACKPACK);
                    output.accept(MAGENTA_NETHERITE_BACKPACK);
                    output.accept(PINK_BACKPACK);
                    output.accept(PINK_COPPER_BACKPACK);
                    output.accept(PINK_IRON_BACKPACK);
                    output.accept(PINK_GOLDEN_BACKPACK);
                    output.accept(PINK_DIAMOND_BACKPACK);
                    output.accept(PINK_NETHERITE_BACKPACK);
                })
                .build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, MOD_ID), creativeModeTab);
    }
}
