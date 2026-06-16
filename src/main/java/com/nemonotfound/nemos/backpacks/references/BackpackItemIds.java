package com.nemonotfound.nemos.backpacks.references;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.ColorCollection;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

public class BackpackItemIds {

    public static final ResourceKey<Item> BACKPACK = create("backpack");
    public static final ResourceKey<Item> COPPER_BACKPACK = create("copper_backpack");
    public static final ResourceKey<Item> IRON_BACKPACK = create("iron_backpack");
    public static final ResourceKey<Item> GOLDEN_BACKPACK = create("golden_backpack");
    public static final ResourceKey<Item> DIAMOND_BACKPACK = create("diamond_backpack");
    public static final ResourceKey<Item> NETHERITE_BACKPACK = create("netherite_backpack");

    public static final ColorCollection<ResourceKey<Item>> DYED_BACKPACK = createSimpleColored("backpack");
    public static final ColorCollection<ResourceKey<Item>> DYED_COPPER_BACKPACK = createSimpleColored("copper_backpack");
    public static final ColorCollection<ResourceKey<Item>> DYED_IRON_BACKPACK = createSimpleColored("iron_backpack");
    public static final ColorCollection<ResourceKey<Item>> DYED_GOLDEN_BACKPACK = createSimpleColored("golden_backpack");
    public static final ColorCollection<ResourceKey<Item>> DYED_DIAMOND_BACKPACK = createSimpleColored("diamond_backpack");
    public static final ColorCollection<ResourceKey<Item>> DYED_NETHERITE_BACKPACK = createSimpleColored("netherite_backpack");

    private static ResourceKey<Item> create(final String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
    }

    private static ColorCollection<ResourceKey<Item>> createSimpleColored(final String baseName) {
        return ColorCollection.prefixWithColor(ColorCollection.create(baseName)).map(BackpackItemIds::create);
    }
}
