package com.nemonotfound.nemos.backpacks.datagen.lang;

import com.nemonotfound.nemos.backpacks.world.item.BackpackItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(BackpackItems.BACKPACK.get(), "Backpack");
        translationBuilder.add(BackpackItems.COPPER_BACKPACK.get(), "Copper Backpack");
        translationBuilder.add(BackpackItems.IRON_BACKPACK.get(), "Iron Backpack");
        translationBuilder.add(BackpackItems.GOLDEN_BACKPACK.get(), "Golden Backpack");
        translationBuilder.add(BackpackItems.DIAMOND_BACKPACK.get(), "Diamond Backpack");
        translationBuilder.add(BackpackItems.NETHERITE_BACKPACK.get(), "Netherite Backpack");
        translationBuilder.add(BackpackItems.WHITE_BACKPACK.get(), "White Backpack");
        translationBuilder.add(BackpackItems.WHITE_COPPER_BACKPACK.get(), "White Copper Backpack");
        translationBuilder.add(BackpackItems.WHITE_IRON_BACKPACK.get(), "White Iron Backpack");
        translationBuilder.add(BackpackItems.WHITE_GOLDEN_BACKPACK.get(), "White Golden Backpack");
        translationBuilder.add(BackpackItems.WHITE_DIAMOND_BACKPACK.get(), "White Diamond Backpack");
        translationBuilder.add(BackpackItems.WHITE_NETHERITE_BACKPACK.get(), "White Netherite Backpack");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_BACKPACK.get(), "Light Gray Backpack");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_COPPER_BACKPACK.get(), "Light Gray Copper Backpack");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_IRON_BACKPACK.get(), "Light Gray Iron Backpack");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_GOLDEN_BACKPACK.get(), "Light Gray Golden Backpack");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_DIAMOND_BACKPACK.get(), "Light Gray Diamond Backpack");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_NETHERITE_BACKPACK.get(), "Light Gray Netherite Backpack");
        translationBuilder.add(BackpackItems.GRAY_BACKPACK.get(), "Gray Backpack");
        translationBuilder.add(BackpackItems.GRAY_COPPER_BACKPACK.get(), "Gray Copper Backpack");
        translationBuilder.add(BackpackItems.GRAY_IRON_BACKPACK.get(), "Gray Iron Backpack");
        translationBuilder.add(BackpackItems.GRAY_GOLDEN_BACKPACK.get(), "Gray Golden Backpack");
        translationBuilder.add(BackpackItems.GRAY_DIAMOND_BACKPACK.get(), "Gray Diamond Backpack");
        translationBuilder.add(BackpackItems.GRAY_NETHERITE_BACKPACK.get(), "Gray Netherite Backpack");
        translationBuilder.add(BackpackItems.BLACK_BACKPACK.get(), "Black Backpack");
        translationBuilder.add(BackpackItems.BLACK_COPPER_BACKPACK.get(), "Black Copper Backpack");
        translationBuilder.add(BackpackItems.BLACK_IRON_BACKPACK.get(), "Black Iron Backpack");
        translationBuilder.add(BackpackItems.BLACK_GOLDEN_BACKPACK.get(), "Black Golden Backpack");
        translationBuilder.add(BackpackItems.BLACK_DIAMOND_BACKPACK.get(), "Black Diamond Backpack");
        translationBuilder.add(BackpackItems.BLACK_NETHERITE_BACKPACK.get(), "Black Netherite Backpack");
        translationBuilder.add(BackpackItems.BROWN_BACKPACK.get(), "Brown Backpack");
        translationBuilder.add(BackpackItems.BROWN_COPPER_BACKPACK.get(), "Brown Copper Backpack");
        translationBuilder.add(BackpackItems.BROWN_IRON_BACKPACK.get(), "Brown Iron Backpack");
        translationBuilder.add(BackpackItems.BROWN_GOLDEN_BACKPACK.get(), "Brown Golden Backpack");
        translationBuilder.add(BackpackItems.BROWN_DIAMOND_BACKPACK.get(), "Brown Diamond Backpack");
        translationBuilder.add(BackpackItems.BROWN_NETHERITE_BACKPACK.get(), "Brown Netherite Backpack");
        translationBuilder.add(BackpackItems.RED_BACKPACK.get(), "Red Backpack");
        translationBuilder.add(BackpackItems.RED_COPPER_BACKPACK.get(), "Red Copper Backpack");
        translationBuilder.add(BackpackItems.RED_IRON_BACKPACK.get(), "Red Iron Backpack");
        translationBuilder.add(BackpackItems.RED_GOLDEN_BACKPACK.get(), "Red Golden Backpack");
        translationBuilder.add(BackpackItems.RED_DIAMOND_BACKPACK.get(), "Red Diamond Backpack");
        translationBuilder.add(BackpackItems.RED_NETHERITE_BACKPACK.get(), "Red Netherite Backpack");
        translationBuilder.add(BackpackItems.ORANGE_BACKPACK.get(), "Orange Backpack");
        translationBuilder.add(BackpackItems.ORANGE_COPPER_BACKPACK.get(), "Orange Copper Backpack");
        translationBuilder.add(BackpackItems.ORANGE_IRON_BACKPACK.get(), "Orange Iron Backpack");
        translationBuilder.add(BackpackItems.ORANGE_GOLDEN_BACKPACK.get(), "Orange Golden Backpack");
        translationBuilder.add(BackpackItems.ORANGE_DIAMOND_BACKPACK.get(), "Orange Diamond Backpack");
        translationBuilder.add(BackpackItems.ORANGE_NETHERITE_BACKPACK.get(), "Orange Netherite Backpack");
        translationBuilder.add(BackpackItems.YELLOW_BACKPACK.get(), "Yellow Backpack");
        translationBuilder.add(BackpackItems.YELLOW_COPPER_BACKPACK.get(), "Yellow Copper Backpack");
        translationBuilder.add(BackpackItems.YELLOW_IRON_BACKPACK.get(), "Yellow Iron Backpack");
        translationBuilder.add(BackpackItems.YELLOW_GOLDEN_BACKPACK.get(), "Yellow Golden Backpack");
        translationBuilder.add(BackpackItems.YELLOW_DIAMOND_BACKPACK.get(), "Yellow Diamond Backpack");
        translationBuilder.add(BackpackItems.YELLOW_NETHERITE_BACKPACK.get(), "Yellow Netherite Backpack");
        translationBuilder.add(BackpackItems.LIME_BACKPACK.get(), "Lime Backpack");
        translationBuilder.add(BackpackItems.LIME_COPPER_BACKPACK.get(), "Lime Copper Backpack");
        translationBuilder.add(BackpackItems.LIME_IRON_BACKPACK.get(), "Lime Iron Backpack");
        translationBuilder.add(BackpackItems.LIME_GOLDEN_BACKPACK.get(), "Lime Golden Backpack");
        translationBuilder.add(BackpackItems.LIME_DIAMOND_BACKPACK.get(), "Lime Diamond Backpack");
        translationBuilder.add(BackpackItems.LIME_NETHERITE_BACKPACK.get(), "Lime Netherite Backpack");
        translationBuilder.add(BackpackItems.GREEN_BACKPACK.get(), "Green Backpack");
        translationBuilder.add(BackpackItems.GREEN_COPPER_BACKPACK.get(), "Green Copper Backpack");
        translationBuilder.add(BackpackItems.GREEN_IRON_BACKPACK.get(), "Green Iron Backpack");
        translationBuilder.add(BackpackItems.GREEN_GOLDEN_BACKPACK.get(), "Green Golden Backpack");
        translationBuilder.add(BackpackItems.GREEN_DIAMOND_BACKPACK.get(), "Green Diamond Backpack");
        translationBuilder.add(BackpackItems.GREEN_NETHERITE_BACKPACK.get(), "Green Netherite Backpack");
        translationBuilder.add(BackpackItems.CYAN_BACKPACK.get(), "Cyan Backpack");
        translationBuilder.add(BackpackItems.CYAN_COPPER_BACKPACK.get(), "Cyan Copper Backpack");
        translationBuilder.add(BackpackItems.CYAN_IRON_BACKPACK.get(), "Cyan Iron Backpack");
        translationBuilder.add(BackpackItems.CYAN_GOLDEN_BACKPACK.get(), "Cyan Golden Backpack");
        translationBuilder.add(BackpackItems.CYAN_DIAMOND_BACKPACK.get(), "Cyan Diamond Backpack");
        translationBuilder.add(BackpackItems.CYAN_NETHERITE_BACKPACK.get(), "Cyan Netherite Backpack");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_BACKPACK.get(), "Light Blue Backpack");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_COPPER_BACKPACK.get(), "Light_Blue Copper Backpack");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_IRON_BACKPACK.get(), "Light Blue Iron Backpack");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_GOLDEN_BACKPACK.get(), "Light Blue Golden Backpack");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_DIAMOND_BACKPACK.get(), "Light Blue Diamond Backpack");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_NETHERITE_BACKPACK.get(), "Light Blue Netherite Backpack");
        translationBuilder.add(BackpackItems.BLUE_BACKPACK.get(), "Blue Backpack");
        translationBuilder.add(BackpackItems.BLUE_COPPER_BACKPACK.get(), "Blue Copper Backpack");
        translationBuilder.add(BackpackItems.BLUE_IRON_BACKPACK.get(), "Blue Iron Backpack");
        translationBuilder.add(BackpackItems.BLUE_GOLDEN_BACKPACK.get(), "Blue Golden Backpack");
        translationBuilder.add(BackpackItems.BLUE_DIAMOND_BACKPACK.get(), "Blue Diamond Backpack");
        translationBuilder.add(BackpackItems.BLUE_NETHERITE_BACKPACK.get(), "Blue Netherite Backpack");
        translationBuilder.add(BackpackItems.PURPLE_BACKPACK.get(), "Purple Backpack");
        translationBuilder.add(BackpackItems.PURPLE_COPPER_BACKPACK.get(), "Purple Copper Backpack");
        translationBuilder.add(BackpackItems.PURPLE_IRON_BACKPACK.get(), "Purple Iron Backpack");
        translationBuilder.add(BackpackItems.PURPLE_GOLDEN_BACKPACK.get(), "Purple Golden Backpack");
        translationBuilder.add(BackpackItems.PURPLE_DIAMOND_BACKPACK.get(), "Purple Diamond Backpack");
        translationBuilder.add(BackpackItems.PURPLE_NETHERITE_BACKPACK.get(), "Purple Netherite Backpack");
        translationBuilder.add(BackpackItems.MAGENTA_BACKPACK.get(), "Magenta Backpack");
        translationBuilder.add(BackpackItems.MAGENTA_COPPER_BACKPACK.get(), "Magenta Copper Backpack");
        translationBuilder.add(BackpackItems.MAGENTA_IRON_BACKPACK.get(), "Magenta Iron Backpack");
        translationBuilder.add(BackpackItems.MAGENTA_GOLDEN_BACKPACK.get(), "Magenta Golden Backpack");
        translationBuilder.add(BackpackItems.MAGENTA_DIAMOND_BACKPACK.get(), "Magenta Diamond Backpack");
        translationBuilder.add(BackpackItems.MAGENTA_NETHERITE_BACKPACK.get(), "Magenta Netherite Backpack");
        translationBuilder.add(BackpackItems.PINK_BACKPACK.get(), "Pink Backpack");
        translationBuilder.add(BackpackItems.PINK_COPPER_BACKPACK.get(), "Pink Copper Backpack");
        translationBuilder.add(BackpackItems.PINK_IRON_BACKPACK.get(), "Pink Iron Backpack");
        translationBuilder.add(BackpackItems.PINK_GOLDEN_BACKPACK.get(), "Pink Golden Backpack");
        translationBuilder.add(BackpackItems.PINK_DIAMOND_BACKPACK.get(), "Pink Diamond Backpack");
        translationBuilder.add(BackpackItems.PINK_NETHERITE_BACKPACK.get(), "Pink Netherite Backpack");
        translationBuilder.add(BackpackItems.COPPER_UPGRADE_SMITHING_TEMPLATE.get(), "Copper Upgrade");
        translationBuilder.add("item.nemos_backpacks.smithing_template.copper_upgrade.applies_to", "Default Backpack");
        translationBuilder.add("item.nemos_backpacks.smithing_template.copper_upgrade.additions_slot_description", "Add Copper Ingot");
        translationBuilder.add("item.nemos_backpacks.smithing_template.copper_upgrade.base_slot_description", "Add Default Backpack");
        translationBuilder.add("item.nemos_backpacks.smithing_template.copper_upgrade.ingredients", "Copper Ingot");
        translationBuilder.add(BackpackItems.IRON_UPGRADE_SMITHING_TEMPLATE.get(), "Iron Upgrade");
        translationBuilder.add("item.nemos_backpacks.smithing_template.iron_upgrade.applies_to", "Copper Backpack");
        translationBuilder.add("item.nemos_backpacks.smithing_template.iron_upgrade.additions_slot_description", "Add Iron Ingot");
        translationBuilder.add("item.nemos_backpacks.smithing_template.iron_upgrade.base_slot_description", "Add Default Backpack");
        translationBuilder.add("item.nemos_backpacks.smithing_template.iron_upgrade.ingredients", "Iron Ingot");
        translationBuilder.add(BackpackItems.GOLD_UPGRADE_SMITHING_TEMPLATE.get(), "Gold Upgrade");
        translationBuilder.add("item.nemos_backpacks.smithing_template.gold_upgrade.applies_to", "Iron Backpack");
        translationBuilder.add("item.nemos_backpacks.smithing_template.gold_upgrade.additions_slot_description", "Add Gold Ingot");
        translationBuilder.add("item.nemos_backpacks.smithing_template.gold_upgrade.base_slot_description", "Add Default Backpack");
        translationBuilder.add("item.nemos_backpacks.smithing_template.gold_upgrade.ingredients", "Gold Ingot");
        translationBuilder.add(BackpackItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "Diamond Upgrade");
        translationBuilder.add("item.nemos_backpacks.smithing_template.diamond_upgrade.applies_to", "Gold Backpack");
        translationBuilder.add("item.nemos_backpacks.smithing_template.diamond_upgrade.additions_slot_description", "Add Diamond Ingot");
        translationBuilder.add("item.nemos_backpacks.smithing_template.diamond_upgrade.base_slot_description", "Add Default Backpack");
        translationBuilder.add("item.nemos_backpacks.smithing_template.diamond_upgrade.ingredients", "Diamond Ingot");

        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Backpacks");
        translationBuilder.add(MOD_ID + ".container.backpack", "Backpack");
    }
}
