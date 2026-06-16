package com.nemonotfound.nemos.backpacks.datagen;

import com.nemonotfound.nemos.backpacks.world.item.BackpackItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import org.jspecify.annotations.NonNull;

public class BackpackModelProvider extends FabricModelProvider {

    public BackpackModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(BackpackItems.BACKPACK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.COPPER_BACKPACK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.IRON_BACKPACK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.GOLDEN_BACKPACK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DIAMOND_BACKPACK, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.NETHERITE_BACKPACK, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.white(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.white(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.white(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.white(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.white(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.white(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.lightGray(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.lightGray(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.lightGray(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.lightGray(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.lightGray(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.lightGray(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.gray(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.gray(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.gray(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.gray(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.gray(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.gray(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.black(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.black(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.black(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.black(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.black(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.black(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.brown(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.brown(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.brown(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.brown(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.brown(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.brown(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.red(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.red(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.red(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.red(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.red(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.red(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.orange(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.orange(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.orange(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.orange(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.orange(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.orange(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.yellow(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.yellow(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.yellow(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.yellow(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.yellow(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.yellow(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.lime(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.lime(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.lime(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.lime(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.lime(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.lime(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.green(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.green(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.green(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.green(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.green(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.green(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.cyan(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.cyan(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.cyan(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.cyan(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.cyan(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.cyan(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.lightBlue(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.lightBlue(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.lightBlue(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.lightBlue(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.lightBlue(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.lightBlue(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.blue(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.blue(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.blue(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.blue(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.blue(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.blue(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.purple(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.purple(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.purple(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.purple(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.purple(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.purple(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.magenta(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.magenta(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.magenta(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.magenta(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.magenta(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.magenta(), ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(BackpackItems.DYED_BACKPACK.pink(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_COPPER_BACKPACK.pink(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_IRON_BACKPACK.pink(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_GOLDEN_BACKPACK.pink(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_DIAMOND_BACKPACK.pink(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(BackpackItems.DYED_NETHERITE_BACKPACK.pink(), ModelTemplates.FLAT_ITEM);
    }
}
