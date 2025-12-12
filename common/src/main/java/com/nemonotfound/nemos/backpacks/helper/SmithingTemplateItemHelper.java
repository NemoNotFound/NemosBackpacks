package com.nemonotfound.nemos.backpacks.helper;

import net.minecraft.ChatFormatting;
import net.minecraft.util.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

public class SmithingTemplateItemHelper {

    private static final Identifier EMPTY_SLOT_BACKPACK = Identifier.fromNamespaceAndPath(MOD_ID, "container/slot/backpack");
    private static final Identifier EMPTY_SLOT_INGOT = Identifier.withDefaultNamespace("container/slot/ingot");
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final Component COPPER_UPGRADE_APPLIES_TO = Component.translatable(
                    Util.makeDescriptionId(
                            "item",
                            Identifier("smithing_template.copper_upgrade.applies_to")
                    )
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component COPPER_UPGRADE_INGREDIENTS = Component.translatable(
                    Util.makeDescriptionId(
                            "item",
                            Identifier("smithing_template.copper_upgrade.ingredients")
                    )
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component COPPER_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId(
                    "item",
                    Identifier("smithing_template.copper_upgrade.base_slot_description")
            )
    );
    private static final Component COPPER_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId(
                    "item", 
                    Identifier("smithing_template.copper_upgrade.additions_slot_description")
            )
    );
    private static final Component IRON_UPGRADE_APPLIES_TO = Component.translatable(
                    Util.makeDescriptionId(
                            "item",
                            Identifier("smithing_template.iron_upgrade.applies_to")
                    )
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component IRON_UPGRADE_INGREDIENTS = Component.translatable(
                    Util.makeDescriptionId(
                            "item",
                            Identifier("smithing_template.iron_upgrade.ingredients")
                    )
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component IRON_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId(
                    "item",
                    Identifier("smithing_template.iron_upgrade.base_slot_description")
            )
    );
    private static final Component IRON_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId(
                    "item",
                    Identifier("smithing_template.iron_upgrade.additions_slot_description")
            )
    );
    private static final Component GOLD_UPGRADE_APPLIES_TO = Component.translatable(
                    Util.makeDescriptionId(
                            "item",
                            Identifier("smithing_template.gold_upgrade.applies_to")
                    )
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component GOLD_UPGRADE_INGREDIENTS = Component.translatable(
                    Util.makeDescriptionId(
                            "item",
                            Identifier("smithing_template.gold_upgrade.ingredients")
                    )
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component GOLD_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId(
                    "item",
                    Identifier("smithing_template.gold_upgrade.base_slot_description")
            )
    );
    private static final Component GOLD_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId(
                    "item",
                    Identifier("smithing_template.gold_upgrade.additions_slot_description")
            )
    );
    private static final Component DIAMOND_UPGRADE_APPLIES_TO = Component.translatable(
                    Util.makeDescriptionId(
                            "item",
                            Identifier("smithing_template.diamond_upgrade.applies_to")
                    )
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component DIAMOND_UPGRADE_INGREDIENTS = Component.translatable(
                    Util.makeDescriptionId(
                            "item",
                            Identifier("smithing_template.diamond_upgrade.ingredients")
                    )
            )
            .withStyle(DESCRIPTION_FORMAT);
    private static final Component DIAMOND_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId(
                    "item",
                    Identifier("smithing_template.diamond_upgrade.base_slot_description")
            )
    );
    private static final Component DIAMOND_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(
            Util.makeDescriptionId(
                    "item",
                    Identifier("smithing_template.diamond_upgrade.additions_slot_description")
            )
    );

    public static SmithingTemplateItem createCopperUpgradeTemplate(Item.Properties properties) {
        return new SmithingTemplateItem(COPPER_UPGRADE_APPLIES_TO, COPPER_UPGRADE_INGREDIENTS, COPPER_UPGRADE_BASE_SLOT_DESCRIPTION, COPPER_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createUpgradeIconList(), createUpgradeMaterialList(), properties);
    }

    public static SmithingTemplateItem createIronUpgradeTemplate(Item.Properties properties) {
        return new SmithingTemplateItem(IRON_UPGRADE_APPLIES_TO, IRON_UPGRADE_INGREDIENTS, IRON_UPGRADE_BASE_SLOT_DESCRIPTION, IRON_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createUpgradeIconList(), createUpgradeMaterialList(), properties);
    }

    public static SmithingTemplateItem createGoldUpgradeTemplate(Item.Properties properties) {
        return new SmithingTemplateItem(GOLD_UPGRADE_APPLIES_TO, GOLD_UPGRADE_INGREDIENTS, GOLD_UPGRADE_BASE_SLOT_DESCRIPTION, GOLD_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createUpgradeIconList(), createUpgradeMaterialList(), properties);
    }

    public static SmithingTemplateItem createDiamondUpgradeTemplate(Item.Properties properties) {
        return new SmithingTemplateItem(DIAMOND_UPGRADE_APPLIES_TO, DIAMOND_UPGRADE_INGREDIENTS, DIAMOND_UPGRADE_BASE_SLOT_DESCRIPTION, DIAMOND_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createUpgradeIconList(), createUpgradeMaterialList(), properties);
    }

    private static Identifier Identifier(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    private static List<Identifier> createUpgradeIconList() {
        return List.of(EMPTY_SLOT_BACKPACK);
    }

    private static List<Identifier> createUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }
}
