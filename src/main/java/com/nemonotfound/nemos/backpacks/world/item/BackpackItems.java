    package com.nemonotfound.nemos.backpacks.world.item;

    import com.nemonotfound.nemos.backpacks.references.BackpackItemIds;
    import net.minecraft.core.Registry;
    import net.minecraft.core.component.DataComponents;
    import net.minecraft.core.registries.BuiltInRegistries;
    import net.minecraft.core.registries.Registries;
    import net.minecraft.resources.Identifier;
    import net.minecraft.resources.ResourceKey;
    import net.minecraft.world.item.BlockItem;
    import net.minecraft.world.item.DyeColor;
    import net.minecraft.world.item.Item;
    import net.minecraft.world.item.component.ItemContainerContents;
    import net.minecraft.world.level.block.ColorCollection;

    import java.util.function.Function;

    import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

    public class BackpackItems {

        public static final Item BACKPACK = registerBackpackItem("backpack", BackpackMaterial.STRING);
        public static final Item COPPER_BACKPACK = registerBackpackItem("copper_backpack", BackpackMaterial.COPPER);
        public static final Item IRON_BACKPACK = registerBackpackItem("iron_backpack", BackpackMaterial.IRON);
        public static final Item GOLDEN_BACKPACK = registerBackpackItem("golden_backpack", BackpackMaterial.GOLD);
        public static final Item DIAMOND_BACKPACK = registerBackpackItem("diamond_backpack", BackpackMaterial.DIAMOND);
        public static final Item NETHERITE_BACKPACK = registerBackpackItem("netherite_backpack", BackpackMaterial.NETHERITE);

        public static final ColorCollection<Item> DYED_BACKPACK = ColorCollection.registerItems(BackpackItemIds.DYED_BACKPACK, (resourceKey, dyeColor) -> registerBackpackItem(resourceKey, BackpackMaterial.STRING, dyeColor));
        public static final ColorCollection<Item> DYED_COPPER_BACKPACK = ColorCollection.registerItems(BackpackItemIds.DYED_COPPER_BACKPACK, (resourceKey, dyeColor) -> registerBackpackItem(resourceKey, BackpackMaterial.COPPER, dyeColor));
        public static final ColorCollection<Item> DYED_IRON_BACKPACK = ColorCollection.registerItems(BackpackItemIds.DYED_IRON_BACKPACK, (resourceKey, dyeColor) -> registerBackpackItem(resourceKey, BackpackMaterial.IRON, dyeColor));
        public static final ColorCollection<Item> DYED_GOLDEN_BACKPACK = ColorCollection.registerItems(BackpackItemIds.DYED_GOLDEN_BACKPACK, (resourceKey, dyeColor) -> registerBackpackItem(resourceKey, BackpackMaterial.GOLD, dyeColor));
        public static final ColorCollection<Item> DYED_DIAMOND_BACKPACK = ColorCollection.registerItems(BackpackItemIds.DYED_DIAMOND_BACKPACK, (resourceKey, dyeColor) -> registerBackpackItem(resourceKey, BackpackMaterial.DIAMOND, dyeColor));
        public static final ColorCollection<Item> DYED_NETHERITE_BACKPACK = ColorCollection.registerItems(BackpackItemIds.DYED_NETHERITE_BACKPACK, (resourceKey, dyeColor) -> registerBackpackItem(resourceKey, BackpackMaterial.NETHERITE, dyeColor));

        public static void init() {}

        private static Item registerBackpackItem(String id, BackpackMaterial backpackMaterial) {
            return registerItem(id, (properties) -> new BackpackItem(properties, backpackMaterial, null), createBackpackProperties());
        }

        private static Item registerBackpackItem(ResourceKey<Item> resourceKey, BackpackMaterial backpackMaterial, DyeColor dyeColor) {
            return registerItem(resourceKey, (properties) -> new BackpackItem(properties, backpackMaterial, dyeColor), createBackpackProperties());
        }

        private static Item.Properties createBackpackProperties() {
            return new Item.Properties()
                    .stacksTo(1)
                    .component(DataComponents.CONTAINER, ItemContainerContents.EMPTY);
        }

        private static Item registerItem(String path, Function<Item.Properties, Item> function, Item.Properties properties) {
            var resourceKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, path));

            return registerItem(resourceKey, function, properties);
        }

        private static Item registerItem(final ResourceKey<Item> key, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
            Item item = itemFactory.apply(properties.setId(key));
            if (item instanceof BlockItem blockItem) {
                blockItem.registerBlocks(Item.BY_BLOCK, item);
            }

            return Registry.register(BuiltInRegistries.ITEM, key, item);
        }
    }
