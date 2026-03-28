package com.nemonotfound.nemos.backpacks.datagen;

import com.nemonotfound.nemos.backpacks.datagen.lang.EnglishLanguageProvider;
import com.nemonotfound.nemos.backpacks.datagen.lang.UkranianLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(BackpackModelProvider::new);
        pack.addProvider(EnglishLanguageProvider::new);
        pack.addProvider(UkranianLanguageProvider::new);
        pack.addProvider(BackpackRecipeProvider::new);
        pack.addProvider(BackpackItemTagProvider::new);
    }
}
