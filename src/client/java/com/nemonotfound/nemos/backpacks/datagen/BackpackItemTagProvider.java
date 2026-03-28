package com.nemonotfound.nemos.backpacks.datagen;

import com.nemonotfound.nemos.backpacks.tags.BackpackItemTags;
import com.nemonotfound.nemos.backpacks.world.item.BackpackItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class BackpackItemTagProvider extends FabricTagsProvider.ItemTagsProvider {

    public BackpackItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {
        valueLookupBuilder(BackpackItemTags.BACKPACKS)
                .forceAddTag(BackpackItemTags.DEFAULT_BACKPACKS)
                .forceAddTag(BackpackItemTags.COPPER_BACKPACKS)
                .forceAddTag(BackpackItemTags.IRON_BACKPACKS)
                .forceAddTag(BackpackItemTags.GOLDEN_BACKPACKS)
                .forceAddTag(BackpackItemTags.DIAMOND_BACKPACKS)
                .forceAddTag(BackpackItemTags.NETHERITE_BACKPACKS);

        valueLookupBuilder(BackpackItemTags.DEFAULT_BACKPACKS)
                .add(BackpackItems.BACKPACK)
                .add(BackpackItems.WHITE_BACKPACK)
                .add(BackpackItems.LIGHT_GRAY_BACKPACK)
                .add(BackpackItems.GRAY_BACKPACK)
                .add(BackpackItems.BLACK_BACKPACK)
                .add(BackpackItems.BROWN_BACKPACK)
                .add(BackpackItems.RED_BACKPACK)
                .add(BackpackItems.ORANGE_BACKPACK)
                .add(BackpackItems.YELLOW_BACKPACK)
                .add(BackpackItems.LIME_BACKPACK)
                .add(BackpackItems.GREEN_BACKPACK)
                .add(BackpackItems.CYAN_BACKPACK)
                .add(BackpackItems.LIGHT_BLUE_BACKPACK)
                .add(BackpackItems.BLUE_BACKPACK)
                .add(BackpackItems.PURPLE_BACKPACK)
                .add(BackpackItems.MAGENTA_BACKPACK)
                .add(BackpackItems.PINK_BACKPACK);

        valueLookupBuilder(BackpackItemTags.COPPER_BACKPACKS)
                .add(BackpackItems.COPPER_BACKPACK)
                .add(BackpackItems.WHITE_COPPER_BACKPACK)
                .add(BackpackItems.LIGHT_GRAY_COPPER_BACKPACK)
                .add(BackpackItems.GRAY_COPPER_BACKPACK)
                .add(BackpackItems.BLACK_COPPER_BACKPACK)
                .add(BackpackItems.BROWN_COPPER_BACKPACK)
                .add(BackpackItems.RED_COPPER_BACKPACK)
                .add(BackpackItems.ORANGE_COPPER_BACKPACK)
                .add(BackpackItems.YELLOW_COPPER_BACKPACK)
                .add(BackpackItems.LIME_COPPER_BACKPACK)
                .add(BackpackItems.GREEN_COPPER_BACKPACK)
                .add(BackpackItems.CYAN_COPPER_BACKPACK)
                .add(BackpackItems.LIGHT_BLUE_COPPER_BACKPACK)
                .add(BackpackItems.BLUE_COPPER_BACKPACK)
                .add(BackpackItems.PURPLE_COPPER_BACKPACK)
                .add(BackpackItems.MAGENTA_COPPER_BACKPACK)
                .add(BackpackItems.PINK_COPPER_BACKPACK);

        valueLookupBuilder(BackpackItemTags.IRON_BACKPACKS)
                .add(BackpackItems.IRON_BACKPACK)
                .add(BackpackItems.WHITE_IRON_BACKPACK)
                .add(BackpackItems.LIGHT_GRAY_IRON_BACKPACK)
                .add(BackpackItems.GRAY_IRON_BACKPACK)
                .add(BackpackItems.BLACK_IRON_BACKPACK)
                .add(BackpackItems.BROWN_IRON_BACKPACK)
                .add(BackpackItems.RED_IRON_BACKPACK)
                .add(BackpackItems.ORANGE_IRON_BACKPACK)
                .add(BackpackItems.YELLOW_IRON_BACKPACK)
                .add(BackpackItems.LIME_IRON_BACKPACK)
                .add(BackpackItems.GREEN_IRON_BACKPACK)
                .add(BackpackItems.CYAN_IRON_BACKPACK)
                .add(BackpackItems.LIGHT_BLUE_IRON_BACKPACK)
                .add(BackpackItems.BLUE_IRON_BACKPACK)
                .add(BackpackItems.PURPLE_IRON_BACKPACK)
                .add(BackpackItems.MAGENTA_IRON_BACKPACK)
                .add(BackpackItems.PINK_IRON_BACKPACK);

        valueLookupBuilder(BackpackItemTags.GOLDEN_BACKPACKS)
                .add(BackpackItems.GOLDEN_BACKPACK)
                .add(BackpackItems.WHITE_GOLDEN_BACKPACK)
                .add(BackpackItems.LIGHT_GRAY_GOLDEN_BACKPACK)
                .add(BackpackItems.GRAY_GOLDEN_BACKPACK)
                .add(BackpackItems.BLACK_GOLDEN_BACKPACK)
                .add(BackpackItems.BROWN_GOLDEN_BACKPACK)
                .add(BackpackItems.RED_GOLDEN_BACKPACK)
                .add(BackpackItems.ORANGE_GOLDEN_BACKPACK)
                .add(BackpackItems.YELLOW_GOLDEN_BACKPACK)
                .add(BackpackItems.LIME_GOLDEN_BACKPACK)
                .add(BackpackItems.GREEN_GOLDEN_BACKPACK)
                .add(BackpackItems.CYAN_GOLDEN_BACKPACK)
                .add(BackpackItems.LIGHT_BLUE_GOLDEN_BACKPACK)
                .add(BackpackItems.BLUE_GOLDEN_BACKPACK)
                .add(BackpackItems.PURPLE_GOLDEN_BACKPACK)
                .add(BackpackItems.MAGENTA_GOLDEN_BACKPACK)
                .add(BackpackItems.PINK_GOLDEN_BACKPACK);

        valueLookupBuilder(BackpackItemTags.DIAMOND_BACKPACKS)
                .add(BackpackItems.DIAMOND_BACKPACK)
                .add(BackpackItems.WHITE_DIAMOND_BACKPACK)
                .add(BackpackItems.LIGHT_GRAY_DIAMOND_BACKPACK)
                .add(BackpackItems.GRAY_DIAMOND_BACKPACK)
                .add(BackpackItems.BLACK_DIAMOND_BACKPACK)
                .add(BackpackItems.BROWN_DIAMOND_BACKPACK)
                .add(BackpackItems.RED_DIAMOND_BACKPACK)
                .add(BackpackItems.ORANGE_DIAMOND_BACKPACK)
                .add(BackpackItems.YELLOW_DIAMOND_BACKPACK)
                .add(BackpackItems.LIME_DIAMOND_BACKPACK)
                .add(BackpackItems.GREEN_DIAMOND_BACKPACK)
                .add(BackpackItems.CYAN_DIAMOND_BACKPACK)
                .add(BackpackItems.LIGHT_BLUE_DIAMOND_BACKPACK)
                .add(BackpackItems.BLUE_DIAMOND_BACKPACK)
                .add(BackpackItems.PURPLE_DIAMOND_BACKPACK)
                .add(BackpackItems.MAGENTA_DIAMOND_BACKPACK)
                .add(BackpackItems.PINK_DIAMOND_BACKPACK);

        valueLookupBuilder(BackpackItemTags.NETHERITE_BACKPACKS)
                .add(BackpackItems.NETHERITE_BACKPACK)
                .add(BackpackItems.WHITE_NETHERITE_BACKPACK)
                .add(BackpackItems.LIGHT_GRAY_NETHERITE_BACKPACK)
                .add(BackpackItems.GRAY_NETHERITE_BACKPACK)
                .add(BackpackItems.BLACK_NETHERITE_BACKPACK)
                .add(BackpackItems.BROWN_NETHERITE_BACKPACK)
                .add(BackpackItems.RED_NETHERITE_BACKPACK)
                .add(BackpackItems.ORANGE_NETHERITE_BACKPACK)
                .add(BackpackItems.YELLOW_NETHERITE_BACKPACK)
                .add(BackpackItems.LIME_NETHERITE_BACKPACK)
                .add(BackpackItems.GREEN_NETHERITE_BACKPACK)
                .add(BackpackItems.CYAN_NETHERITE_BACKPACK)
                .add(BackpackItems.LIGHT_BLUE_NETHERITE_BACKPACK)
                .add(BackpackItems.BLUE_NETHERITE_BACKPACK)
                .add(BackpackItems.PURPLE_NETHERITE_BACKPACK)
                .add(BackpackItems.MAGENTA_NETHERITE_BACKPACK)
                .add(BackpackItems.PINK_NETHERITE_BACKPACK);
    }
}
