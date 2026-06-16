package com.nemonotfound.nemos.backpacks.datagen.lang;

import com.nemonotfound.nemos.backpacks.world.item.BackpackItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

public class UkranianLanguageProvider extends FabricLanguageProvider {

    public UkranianLanguageProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "uk_ua", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(BackpackItems.BACKPACK, "Рюкзак");
        translationBuilder.add(BackpackItems.COPPER_BACKPACK, "Мідний рюкзак");
        translationBuilder.add(BackpackItems.IRON_BACKPACK, "Залізний рюкзак");
        translationBuilder.add(BackpackItems.GOLDEN_BACKPACK, "Золотий рюкзак");
        translationBuilder.add(BackpackItems.DIAMOND_BACKPACK, "Діамантовий рюкзак");
        translationBuilder.add(BackpackItems.NETHERITE_BACKPACK, "Незеритовий рюкзак");

        // WHITE
        translationBuilder.add(BackpackItems.DYED_BACKPACK.white(), "Білий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.white(), "Білий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.white(), "Білий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.white(), "Білий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.white(), "Білий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.white(), "Білий незеритовий рюкзак");

        // LIGHT_GRAY
        translationBuilder.add(BackpackItems.DYED_BACKPACK.lightGray(), "Світло-сірий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.lightGray(), "Світло-сірий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.lightGray(), "Світло-сірий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.lightGray(), "Світло-сірий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.lightGray(), "Світло-сірий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.lightGray(), "Світло-сірий незеритовий рюкзак");

        // GRAY
        translationBuilder.add(BackpackItems.DYED_BACKPACK.gray(), "Сірий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.gray(), "Сірий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.gray(), "Сірий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.gray(), "Сірий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.gray(), "Сірий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.gray(), "Сірий незеритовий рюкзак");

        // BLACK
        translationBuilder.add(BackpackItems.DYED_BACKPACK.black(), "Чорний рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.black(), "Чорний мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.black(), "Чорний залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.black(), "Чорний золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.black(), "Чорний діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.black(), "Чорний незеритовий рюкзак");

        // BROWN
        translationBuilder.add(BackpackItems.DYED_BACKPACK.brown(), "Коричневий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.brown(), "Коричневий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.brown(), "Коричневий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.brown(), "Коричневий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.brown(), "Коричневий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.brown(), "Коричневий незеритовий рюкзак");

        // RED
        translationBuilder.add(BackpackItems.DYED_BACKPACK.red(), "Червоний рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.red(), "Червоний мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.red(), "Червоний залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.red(), "Червоний золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.red(), "Червоний діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.red(), "Червоний незеритовий рюкзак");

        // ORANGE
        translationBuilder.add(BackpackItems.DYED_BACKPACK.orange(), "Помаранчевий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.orange(), "Помаранчевий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.orange(), "Помаранчевий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.orange(), "Помаранчевий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.orange(), "Помаранчевий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.orange(), "Помаранчевий незеритовий рюкзак");

        // YELLOW
        translationBuilder.add(BackpackItems.DYED_BACKPACK.yellow(), "Жовтий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.yellow(), "Жовтий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.yellow(), "Жовтий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.yellow(), "Жовтий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.yellow(), "Жовтий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.yellow(), "Жовтий незеритовий рюкзак");


        // LIME
        translationBuilder.add(BackpackItems.DYED_BACKPACK.lime(), "Лаймовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.lime(), "Лаймовий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.lime(), "Лаймовий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.lime(), "Лаймовий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.lime(), "Лаймовий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.lime(), "Лаймовий незеритовий рюкзак");

        // GREEN
        translationBuilder.add(BackpackItems.DYED_BACKPACK.green(), "Зелений рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.green(), "Зелений мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.green(), "Зелений залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.green(), "Зелений золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.green(), "Зелений діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.green(), "Зелений незеритовий рюкзак");

        // CYAN
        translationBuilder.add(BackpackItems.DYED_BACKPACK.cyan(), "Бірюзовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.cyan(), "Бірюзовий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.cyan(), "Бірюзовий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.cyan(), "Бірюзовий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.cyan(), "Бірюзовий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.cyan(), "Бірюзовий незеритовий рюкзак");

        // LIGHT_BLUE
        translationBuilder.add(BackpackItems.DYED_BACKPACK.lightBlue(), "Блакитний рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.lightBlue(), "Блакитний мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.lightBlue(), "Блакитний залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.lightBlue(), "Блакитний золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.lightBlue(), "Блакитний діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.lightBlue(), "Блакитний незеритовий рюкзак");

        // BLUE
        translationBuilder.add(BackpackItems.DYED_BACKPACK.blue(), "Синій рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.blue(), "Синій мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.blue(), "Синій залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.blue(), "Синій золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.blue(), "Синій діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.blue(), "Синій незеритовий рюкзак");

        // PURPLE
        translationBuilder.add(BackpackItems.DYED_BACKPACK.purple(), "Фіолетовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.purple(), "Фіолетовий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.purple(), "Фіолетовий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.purple(), "Фіолетовий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.purple(), "Фіолетовий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.purple(), "Фіолетовий незеритовий рюкзак");


        // MAGENTA
        translationBuilder.add(BackpackItems.DYED_BACKPACK.magenta(), "Пурпуровий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.magenta(), "Пурпуровий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.magenta(), "Пурпуровий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.magenta(), "Пурпуровий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.magenta(), "Пурпуровий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.magenta(), "Пурпуровий незеритовий рюкзак");

        // PINK
        translationBuilder.add(BackpackItems.DYED_BACKPACK.pink(), "Рожевий рюкзак");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.pink(), "Рожевий мідний рюкзак");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.pink(), "Рожевий залізний рюкзак");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.pink(), "Рожевий золотий рюкзак");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.pink(), "Рожевий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.pink(), "Рожевий незеритовий рюкзак");

        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Backpacks");
        translationBuilder.add(MOD_ID + ".container.backpack", "Рюкзак");
        translationBuilder.add("key.category." + MOD_ID + "." + MOD_ID, "Nemo's Backpacks");
        translationBuilder.add(MOD_ID + ".key.swapBackpack", "Змінити рюкзаки в слоті рюкзака");
        translationBuilder.add(MOD_ID + ".key.interactBackpack", "Відкрити / закрити рюкзак");
    }
}
