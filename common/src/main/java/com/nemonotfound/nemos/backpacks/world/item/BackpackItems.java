    package com.nemonotfound.nemos.backpacks.world.item;

    import com.nemonotfound.nemos.backpacks.helper.SmithingTemplateItemHelper;
    import com.nemonotfound.nemos.backpacks.platform.Services;
    import net.minecraft.core.component.DataComponents;
    import net.minecraft.world.item.DyeColor;
    import net.minecraft.world.item.Item;
    import net.minecraft.world.item.Rarity;
    import net.minecraft.world.item.component.ItemContainerContents;

    import java.util.function.Function;
    import java.util.function.Supplier;

    public class BackpackItems {

        public static final Supplier<Item> BACKPACK = registerBackpackItem("backpack", BackpackMaterial.STRING, null);
        public static final Supplier<Item> COPPER_BACKPACK = registerBackpackItem("copper_backpack", BackpackMaterial.COPPER, null);
        public static final Supplier<Item> IRON_BACKPACK = registerBackpackItem("iron_backpack", BackpackMaterial.IRON, null);
        public static final Supplier<Item> GOLDEN_BACKPACK = registerBackpackItem("golden_backpack", BackpackMaterial.GOLD, null);
        public static final Supplier<Item> DIAMOND_BACKPACK = registerBackpackItem("diamond_backpack", BackpackMaterial.DIAMOND, null);
        public static final Supplier<Item> NETHERITE_BACKPACK = registerBackpackItem("netherite_backpack", BackpackMaterial.NETHERITE, null);
        public static final Supplier<Item> WHITE_BACKPACK = registerBackpackItem("white_backpack", BackpackMaterial.STRING, DyeColor.WHITE);
        public static final Supplier<Item> WHITE_COPPER_BACKPACK = registerBackpackItem("white_copper_backpack", BackpackMaterial.COPPER, DyeColor.WHITE);
        public static final Supplier<Item> WHITE_IRON_BACKPACK = registerBackpackItem("white_iron_backpack", BackpackMaterial.IRON, DyeColor.WHITE);
        public static final Supplier<Item> WHITE_GOLDEN_BACKPACK = registerBackpackItem("white_golden_backpack", BackpackMaterial.GOLD, DyeColor.WHITE);
        public static final Supplier<Item> WHITE_DIAMOND_BACKPACK = registerBackpackItem("white_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.WHITE);
        public static final Supplier<Item> WHITE_NETHERITE_BACKPACK = registerBackpackItem("white_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.WHITE);
        public static final Supplier<Item> LIGHT_GRAY_BACKPACK = registerBackpackItem("light_gray_backpack", BackpackMaterial.STRING, DyeColor.LIGHT_GRAY);
        public static final Supplier<Item> LIGHT_GRAY_COPPER_BACKPACK = registerBackpackItem("light_gray_copper_backpack", BackpackMaterial.COPPER, DyeColor.LIGHT_GRAY);
        public static final Supplier<Item> LIGHT_GRAY_IRON_BACKPACK = registerBackpackItem("light_gray_iron_backpack", BackpackMaterial.IRON, DyeColor.LIGHT_GRAY);
        public static final Supplier<Item> LIGHT_GRAY_GOLDEN_BACKPACK = registerBackpackItem("light_gray_golden_backpack", BackpackMaterial.GOLD, DyeColor.LIGHT_GRAY);
        public static final Supplier<Item> LIGHT_GRAY_DIAMOND_BACKPACK = registerBackpackItem("light_gray_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.LIGHT_GRAY);
        public static final Supplier<Item> LIGHT_GRAY_NETHERITE_BACKPACK = registerBackpackItem("light_gray_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.LIGHT_GRAY);
        public static final Supplier<Item> GRAY_BACKPACK = registerBackpackItem("gray_backpack", BackpackMaterial.STRING, DyeColor.GRAY);
        public static final Supplier<Item> GRAY_COPPER_BACKPACK = registerBackpackItem("gray_copper_backpack", BackpackMaterial.COPPER, DyeColor.GRAY);
        public static final Supplier<Item> GRAY_IRON_BACKPACK = registerBackpackItem("gray_iron_backpack", BackpackMaterial.IRON, DyeColor.GRAY);
        public static final Supplier<Item> GRAY_GOLDEN_BACKPACK = registerBackpackItem("gray_golden_backpack", BackpackMaterial.GOLD, DyeColor.GRAY);
        public static final Supplier<Item> GRAY_DIAMOND_BACKPACK = registerBackpackItem("gray_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.GRAY);
        public static final Supplier<Item> GRAY_NETHERITE_BACKPACK = registerBackpackItem("gray_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.GRAY);
        public static final Supplier<Item> BLACK_BACKPACK = registerBackpackItem("black_backpack", BackpackMaterial.STRING, DyeColor.BLACK);
        public static final Supplier<Item> BLACK_COPPER_BACKPACK = registerBackpackItem("black_copper_backpack", BackpackMaterial.COPPER, DyeColor.BLACK);
        public static final Supplier<Item> BLACK_IRON_BACKPACK = registerBackpackItem("black_iron_backpack", BackpackMaterial.IRON, DyeColor.BLACK);
        public static final Supplier<Item> BLACK_GOLDEN_BACKPACK = registerBackpackItem("black_golden_backpack", BackpackMaterial.GOLD, DyeColor.BLACK);
        public static final Supplier<Item> BLACK_DIAMOND_BACKPACK = registerBackpackItem("black_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.BLACK);
        public static final Supplier<Item> BLACK_NETHERITE_BACKPACK = registerBackpackItem("black_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.BLACK);
        public static final Supplier<Item> BROWN_BACKPACK = registerBackpackItem("brown_backpack", BackpackMaterial.STRING, DyeColor.BROWN);
        public static final Supplier<Item> BROWN_COPPER_BACKPACK = registerBackpackItem("brown_copper_backpack", BackpackMaterial.COPPER, DyeColor.BROWN);
        public static final Supplier<Item> BROWN_IRON_BACKPACK = registerBackpackItem("brown_iron_backpack", BackpackMaterial.IRON, DyeColor.BROWN);
        public static final Supplier<Item> BROWN_GOLDEN_BACKPACK = registerBackpackItem("brown_golden_backpack", BackpackMaterial.GOLD, DyeColor.BROWN);
        public static final Supplier<Item> BROWN_DIAMOND_BACKPACK = registerBackpackItem("brown_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.BROWN);
        public static final Supplier<Item> BROWN_NETHERITE_BACKPACK = registerBackpackItem("brown_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.BROWN);
        public static final Supplier<Item> RED_BACKPACK = registerBackpackItem("red_backpack", BackpackMaterial.STRING, DyeColor.RED);
        public static final Supplier<Item> RED_COPPER_BACKPACK = registerBackpackItem("red_copper_backpack", BackpackMaterial.COPPER, DyeColor.RED);
        public static final Supplier<Item> RED_IRON_BACKPACK = registerBackpackItem("red_iron_backpack", BackpackMaterial.IRON, DyeColor.RED);
        public static final Supplier<Item> RED_GOLDEN_BACKPACK = registerBackpackItem("red_golden_backpack", BackpackMaterial.GOLD, DyeColor.RED);
        public static final Supplier<Item> RED_DIAMOND_BACKPACK = registerBackpackItem("red_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.RED);
        public static final Supplier<Item> RED_NETHERITE_BACKPACK = registerBackpackItem("red_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.RED);
        public static final Supplier<Item> ORANGE_BACKPACK = registerBackpackItem("orange_backpack", BackpackMaterial.STRING, DyeColor.ORANGE);
        public static final Supplier<Item> ORANGE_COPPER_BACKPACK = registerBackpackItem("orange_copper_backpack", BackpackMaterial.COPPER, DyeColor.ORANGE);
        public static final Supplier<Item> ORANGE_IRON_BACKPACK = registerBackpackItem("orange_iron_backpack", BackpackMaterial.IRON, DyeColor.ORANGE);
        public static final Supplier<Item> ORANGE_GOLDEN_BACKPACK = registerBackpackItem("orange_golden_backpack", BackpackMaterial.GOLD, DyeColor.ORANGE);
        public static final Supplier<Item> ORANGE_DIAMOND_BACKPACK = registerBackpackItem("orange_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.ORANGE);
        public static final Supplier<Item> ORANGE_NETHERITE_BACKPACK = registerBackpackItem("orange_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.ORANGE);
        public static final Supplier<Item> YELLOW_BACKPACK = registerBackpackItem("yellow_backpack", BackpackMaterial.STRING, DyeColor.YELLOW);
        public static final Supplier<Item> YELLOW_COPPER_BACKPACK = registerBackpackItem("yellow_copper_backpack", BackpackMaterial.COPPER, DyeColor.YELLOW);
        public static final Supplier<Item> YELLOW_IRON_BACKPACK = registerBackpackItem("yellow_iron_backpack", BackpackMaterial.IRON, DyeColor.YELLOW);
        public static final Supplier<Item> YELLOW_GOLDEN_BACKPACK = registerBackpackItem("yellow_golden_backpack", BackpackMaterial.GOLD, DyeColor.YELLOW);
        public static final Supplier<Item> YELLOW_DIAMOND_BACKPACK = registerBackpackItem("yellow_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.YELLOW);
        public static final Supplier<Item> YELLOW_NETHERITE_BACKPACK = registerBackpackItem("yellow_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.YELLOW);
        public static final Supplier<Item> LIME_BACKPACK = registerBackpackItem("lime_backpack", BackpackMaterial.STRING, DyeColor.LIME);
        public static final Supplier<Item> LIME_COPPER_BACKPACK = registerBackpackItem("lime_copper_backpack", BackpackMaterial.COPPER, DyeColor.LIME);
        public static final Supplier<Item> LIME_IRON_BACKPACK = registerBackpackItem("lime_iron_backpack", BackpackMaterial.IRON, DyeColor.LIME);
        public static final Supplier<Item> LIME_GOLDEN_BACKPACK = registerBackpackItem("lime_golden_backpack", BackpackMaterial.GOLD, DyeColor.LIME);
        public static final Supplier<Item> LIME_DIAMOND_BACKPACK = registerBackpackItem("lime_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.LIME);
        public static final Supplier<Item> LIME_NETHERITE_BACKPACK = registerBackpackItem("lime_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.LIME);
        public static final Supplier<Item> GREEN_BACKPACK = registerBackpackItem("green_backpack", BackpackMaterial.STRING, DyeColor.GREEN);
        public static final Supplier<Item> GREEN_COPPER_BACKPACK = registerBackpackItem("green_copper_backpack", BackpackMaterial.COPPER, DyeColor.GREEN);
        public static final Supplier<Item> GREEN_IRON_BACKPACK = registerBackpackItem("green_iron_backpack", BackpackMaterial.IRON, DyeColor.GREEN);
        public static final Supplier<Item> GREEN_GOLDEN_BACKPACK = registerBackpackItem("green_golden_backpack", BackpackMaterial.GOLD, DyeColor.GREEN);
        public static final Supplier<Item> GREEN_DIAMOND_BACKPACK = registerBackpackItem("green_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.GREEN);
        public static final Supplier<Item> GREEN_NETHERITE_BACKPACK = registerBackpackItem("green_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.GREEN);
        public static final Supplier<Item> CYAN_BACKPACK = registerBackpackItem("cyan_backpack", BackpackMaterial.STRING, DyeColor.CYAN);
        public static final Supplier<Item> CYAN_COPPER_BACKPACK = registerBackpackItem("cyan_copper_backpack", BackpackMaterial.COPPER, DyeColor.CYAN);
        public static final Supplier<Item> CYAN_IRON_BACKPACK = registerBackpackItem("cyan_iron_backpack", BackpackMaterial.IRON, DyeColor.CYAN);
        public static final Supplier<Item> CYAN_GOLDEN_BACKPACK = registerBackpackItem("cyan_golden_backpack", BackpackMaterial.GOLD, DyeColor.CYAN);
        public static final Supplier<Item> CYAN_DIAMOND_BACKPACK = registerBackpackItem("cyan_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.CYAN);
        public static final Supplier<Item> CYAN_NETHERITE_BACKPACK = registerBackpackItem("cyan_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.CYAN);
        public static final Supplier<Item> LIGHT_BLUE_BACKPACK = registerBackpackItem("light_blue_backpack", BackpackMaterial.STRING, DyeColor.LIGHT_BLUE);
        public static final Supplier<Item> LIGHT_BLUE_COPPER_BACKPACK = registerBackpackItem("light_blue_copper_backpack", BackpackMaterial.COPPER, DyeColor.LIGHT_BLUE);
        public static final Supplier<Item> LIGHT_BLUE_IRON_BACKPACK = registerBackpackItem("light_blue_iron_backpack", BackpackMaterial.IRON, DyeColor.LIGHT_BLUE);
        public static final Supplier<Item> LIGHT_BLUE_GOLDEN_BACKPACK = registerBackpackItem("light_blue_golden_backpack", BackpackMaterial.GOLD, DyeColor.LIGHT_BLUE);
        public static final Supplier<Item> LIGHT_BLUE_DIAMOND_BACKPACK = registerBackpackItem("light_blue_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.LIGHT_BLUE);
        public static final Supplier<Item> LIGHT_BLUE_NETHERITE_BACKPACK = registerBackpackItem("light_blue_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.LIGHT_BLUE);
        public static final Supplier<Item> BLUE_BACKPACK = registerBackpackItem("blue_backpack", BackpackMaterial.STRING, DyeColor.BLUE);
        public static final Supplier<Item> BLUE_COPPER_BACKPACK = registerBackpackItem("blue_copper_backpack", BackpackMaterial.COPPER, DyeColor.BLUE);
        public static final Supplier<Item> BLUE_IRON_BACKPACK = registerBackpackItem("blue_iron_backpack", BackpackMaterial.IRON, DyeColor.BLUE);
        public static final Supplier<Item> BLUE_GOLDEN_BACKPACK = registerBackpackItem("blue_golden_backpack", BackpackMaterial.GOLD, DyeColor.BLUE);
        public static final Supplier<Item> BLUE_DIAMOND_BACKPACK = registerBackpackItem("blue_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.BLUE);
        public static final Supplier<Item> BLUE_NETHERITE_BACKPACK = registerBackpackItem("blue_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.BLUE);
        public static final Supplier<Item> PURPLE_BACKPACK = registerBackpackItem("purple_backpack", BackpackMaterial.STRING, DyeColor.PURPLE);
        public static final Supplier<Item> PURPLE_COPPER_BACKPACK = registerBackpackItem("purple_copper_backpack", BackpackMaterial.COPPER, DyeColor.PURPLE);
        public static final Supplier<Item> PURPLE_IRON_BACKPACK = registerBackpackItem("purple_iron_backpack", BackpackMaterial.IRON, DyeColor.PURPLE);
        public static final Supplier<Item> PURPLE_GOLDEN_BACKPACK = registerBackpackItem("purple_golden_backpack", BackpackMaterial.GOLD, DyeColor.PURPLE);
        public static final Supplier<Item> PURPLE_DIAMOND_BACKPACK = registerBackpackItem("purple_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.PURPLE);
        public static final Supplier<Item> PURPLE_NETHERITE_BACKPACK = registerBackpackItem("purple_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.PURPLE);
        public static final Supplier<Item> MAGENTA_BACKPACK = registerBackpackItem("magenta_backpack", BackpackMaterial.STRING, DyeColor.MAGENTA);
        public static final Supplier<Item> MAGENTA_COPPER_BACKPACK = registerBackpackItem("magenta_copper_backpack", BackpackMaterial.COPPER, DyeColor.MAGENTA);
        public static final Supplier<Item> MAGENTA_IRON_BACKPACK = registerBackpackItem("magenta_iron_backpack", BackpackMaterial.IRON, DyeColor.MAGENTA);
        public static final Supplier<Item> MAGENTA_GOLDEN_BACKPACK = registerBackpackItem("magenta_golden_backpack", BackpackMaterial.GOLD, DyeColor.MAGENTA);
        public static final Supplier<Item> MAGENTA_DIAMOND_BACKPACK = registerBackpackItem("magenta_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.MAGENTA);
        public static final Supplier<Item> MAGENTA_NETHERITE_BACKPACK = registerBackpackItem("magenta_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.MAGENTA);
        public static final Supplier<Item> PINK_BACKPACK = registerBackpackItem("pink_backpack", BackpackMaterial.STRING, DyeColor.PINK);
        public static final Supplier<Item> PINK_COPPER_BACKPACK = registerBackpackItem("pink_copper_backpack", BackpackMaterial.COPPER, DyeColor.PINK);
        public static final Supplier<Item> PINK_IRON_BACKPACK = registerBackpackItem("pink_iron_backpack", BackpackMaterial.IRON, DyeColor.PINK);
        public static final Supplier<Item> PINK_GOLDEN_BACKPACK = registerBackpackItem("pink_golden_backpack", BackpackMaterial.GOLD, DyeColor.PINK);
        public static final Supplier<Item> PINK_DIAMOND_BACKPACK = registerBackpackItem("pink_diamond_backpack", BackpackMaterial.DIAMOND, DyeColor.PINK);
        public static final Supplier<Item> PINK_NETHERITE_BACKPACK = registerBackpackItem("pink_netherite_backpack", BackpackMaterial.NETHERITE, DyeColor.PINK);
        public static final Supplier<Item> COPPER_UPGRADE_SMITHING_TEMPLATE = registerItem(
                "copper_upgrade_smithing_template",
                SmithingTemplateItemHelper::createCopperUpgradeTemplate,
                new Item.Properties()
                        .rarity(Rarity.UNCOMMON)
        );
        public static final Supplier<Item> IRON_UPGRADE_SMITHING_TEMPLATE = registerItem(
                "iron_upgrade_smithing_template",
                SmithingTemplateItemHelper::createIronUpgradeTemplate,
                new Item.Properties()
                        .rarity(Rarity.UNCOMMON)
        );
        public static final Supplier<Item> GOLD_UPGRADE_SMITHING_TEMPLATE = registerItem(
                "gold_upgrade_smithing_template",
                SmithingTemplateItemHelper::createGoldUpgradeTemplate,
                new Item.Properties()
                        .rarity(Rarity.UNCOMMON)
        );
        public static final Supplier<Item> DIAMOND_UPGRADE_SMITHING_TEMPLATE = registerItem(
                "diamond_upgrade_smithing_template",
                SmithingTemplateItemHelper::createDiamondUpgradeTemplate,
                new Item.Properties()
                        .rarity(Rarity.UNCOMMON)
        );

        public static void init() {}

        private static Supplier<Item> registerBackpackItem(String id, BackpackMaterial backpackMaterial, DyeColor dyeColor) {
            return registerItem(id, (properties) -> new BackpackItem(properties, backpackMaterial, dyeColor), createBackpackProperties());
        }

        private static Item.Properties createBackpackProperties() {
            return new Item.Properties()
                    .stacksTo(1)
                    .component(DataComponents.CONTAINER, ItemContainerContents.EMPTY);
        }

        private static Supplier<Item> registerItem(String id, Function<Item.Properties, Item> itemFunction, Item.Properties properties) {
            return Services.REGISTRY_HELPER.registerItem(id, itemFunction, properties);
        }
    }
