package com.nemonotfound.nemos.backpacks.datagen;

import com.nemonotfound.nemos.backpacks.world.item.BackpackItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(BackpackItems.BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.WHITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.WHITE_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.WHITE_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.WHITE_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.WHITE_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.WHITE_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_GRAY_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_GRAY_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_GRAY_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_GRAY_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_GRAY_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_GRAY_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GRAY_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GRAY_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GRAY_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GRAY_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GRAY_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GRAY_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLACK_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLACK_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLACK_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLACK_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLACK_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLACK_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BROWN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BROWN_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BROWN_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BROWN_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BROWN_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BROWN_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.RED_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.RED_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.RED_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.RED_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.RED_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.RED_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.ORANGE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.ORANGE_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.ORANGE_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.ORANGE_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.ORANGE_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.ORANGE_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.YELLOW_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.YELLOW_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.YELLOW_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.YELLOW_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.YELLOW_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.YELLOW_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIME_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIME_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIME_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIME_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIME_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIME_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GREEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GREEN_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GREEN_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GREEN_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GREEN_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GREEN_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.CYAN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.CYAN_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.CYAN_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.CYAN_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.CYAN_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.CYAN_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_BLUE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_BLUE_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_BLUE_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_BLUE_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_BLUE_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.LIGHT_BLUE_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLUE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLUE_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLUE_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLUE_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLUE_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.BLUE_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PURPLE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PURPLE_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PURPLE_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PURPLE_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PURPLE_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PURPLE_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.MAGENTA_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.MAGENTA_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.MAGENTA_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.MAGENTA_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.MAGENTA_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.MAGENTA_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PINK_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PINK_COPPER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PINK_IRON_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PINK_GOLDEN_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PINK_DIAMOND_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.PINK_NETHERITE_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.COPPER_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.IRON_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GOLD_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);
    }
}
