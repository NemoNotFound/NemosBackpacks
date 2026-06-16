package com.nemonotfound.nemos.backpacks.datagen;

import com.nemonotfound.nemos.backpacks.references.BackpackItemIds;
import com.nemonotfound.nemos.backpacks.tags.BackpackItemTags;
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
        this.tag(BackpackItemTags.BACKPACKS)
                .addTag(BackpackItemTags.DEFAULT_BACKPACKS)
                .addTag(BackpackItemTags.COPPER_BACKPACKS)
                .addTag(BackpackItemTags.IRON_BACKPACKS)
                .addTag(BackpackItemTags.GOLDEN_BACKPACKS)
                .addTag(BackpackItemTags.DIAMOND_BACKPACKS)
                .addTag(BackpackItemTags.NETHERITE_BACKPACKS);

        this.tag(BackpackItemTags.DEFAULT_BACKPACKS)
                .add(BackpackItemIds.BACKPACK)
                .addAll(BackpackItemIds.DYED_BACKPACK.asList());

        this.tag(BackpackItemTags.COPPER_BACKPACKS)
                .add(BackpackItemIds.COPPER_BACKPACK)
                .addAll(BackpackItemIds.DYED_COPPER_BACKPACK.asList());

        this.tag(BackpackItemTags.IRON_BACKPACKS)
                .add(BackpackItemIds.IRON_BACKPACK)
                .addAll(BackpackItemIds.DYED_IRON_BACKPACK.asList());

        this.tag(BackpackItemTags.GOLDEN_BACKPACKS)
                .add(BackpackItemIds.GOLDEN_BACKPACK)
                .addAll(BackpackItemIds.DYED_GOLDEN_BACKPACK.asList());

        this.tag(BackpackItemTags.DIAMOND_BACKPACKS)
                .add(BackpackItemIds.DIAMOND_BACKPACK)
                .addAll(BackpackItemIds.DYED_DIAMOND_BACKPACK.asList());

        this.tag(BackpackItemTags.NETHERITE_BACKPACKS)
                .add(BackpackItemIds.NETHERITE_BACKPACK)
                .addAll(BackpackItemIds.DYED_NETHERITE_BACKPACK.asList());
    }
}
