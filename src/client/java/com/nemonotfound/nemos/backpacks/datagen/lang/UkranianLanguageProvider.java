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
        translationBuilder.add(BackpackItems.WHITE_BACKPACK, "Білий рюкзак");
        translationBuilder.add(BackpackItems.WHITE_COPPER_BACKPACK, "Білий мідний рюкзак");
        translationBuilder.add(BackpackItems.WHITE_IRON_BACKPACK, "Білий залізний рюкзак");
        translationBuilder.add(BackpackItems.WHITE_GOLDEN_BACKPACK, "Білий золотий рюкзак");
        translationBuilder.add(BackpackItems.WHITE_DIAMOND_BACKPACK, "Білий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.WHITE_NETHERITE_BACKPACK, "Білий незеритовий рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_BACKPACK, "Світло-сірий рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_COPPER_BACKPACK, "Світло-сірий мідний рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_IRON_BACKPACK, "Світло-сірий залізний рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_GOLDEN_BACKPACK, "Світло-сірий золотий рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_DIAMOND_BACKPACK, "Світло-сірий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_GRAY_NETHERITE_BACKPACK, "Світло-сірий незеритовий рюкзак");
        translationBuilder.add(BackpackItems.GRAY_BACKPACK, "Сірий рюкзак");
        translationBuilder.add(BackpackItems.GRAY_COPPER_BACKPACK, "Сірий мідний рюкзак");
        translationBuilder.add(BackpackItems.GRAY_IRON_BACKPACK, "Сірий залізний рюкзак");
        translationBuilder.add(BackpackItems.GRAY_GOLDEN_BACKPACK, "Сірий золотий рюкзак");
        translationBuilder.add(BackpackItems.GRAY_DIAMOND_BACKPACK, "Сірий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.GRAY_NETHERITE_BACKPACK, "Сірий незеритовий рюкзак");
        translationBuilder.add(BackpackItems.BLACK_BACKPACK, "Чорний рюкзак");
        translationBuilder.add(BackpackItems.BLACK_COPPER_BACKPACK, "Чорний мідний рюкзак");
        translationBuilder.add(BackpackItems.BLACK_IRON_BACKPACK, "Чорний залізний рюкзак");
        translationBuilder.add(BackpackItems.BLACK_GOLDEN_BACKPACK, "Чорний золотий рюкзак");
        translationBuilder.add(BackpackItems.BLACK_DIAMOND_BACKPACK, "Чорний діамантовий рюкзак");
        translationBuilder.add(BackpackItems.BLACK_NETHERITE_BACKPACK, "Чорний незеритовий рюкзак");
        translationBuilder.add(BackpackItems.BROWN_BACKPACK, "Коричневий рюкзак");
        translationBuilder.add(BackpackItems.BROWN_COPPER_BACKPACK, "Коричневий мідний рюкзак");
        translationBuilder.add(BackpackItems.BROWN_IRON_BACKPACK, "Коричневий залізний рюкзак");
        translationBuilder.add(BackpackItems.BROWN_GOLDEN_BACKPACK, "Коричневий золотий рюкзак");
        translationBuilder.add(BackpackItems.BROWN_DIAMOND_BACKPACK, "Коричневий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.BROWN_NETHERITE_BACKPACK, "Коричневий незеритовий рюкзак");
        translationBuilder.add(BackpackItems.RED_BACKPACK, "Червоний рюкзак");
        translationBuilder.add(BackpackItems.RED_COPPER_BACKPACK, "Червоний мідний рюкзак");
        translationBuilder.add(BackpackItems.RED_IRON_BACKPACK, "Червоний залізний рюкзак");
        translationBuilder.add(BackpackItems.RED_GOLDEN_BACKPACK, "Червоний золотий рюкзак");
        translationBuilder.add(BackpackItems.RED_DIAMOND_BACKPACK, "Червоний діамантовий рюкзак");
        translationBuilder.add(BackpackItems.RED_NETHERITE_BACKPACK, "Червоний незеритовий рюкзак");
        translationBuilder.add(BackpackItems.ORANGE_BACKPACK, "Помаранчевий рюкзак");
        translationBuilder.add(BackpackItems.ORANGE_COPPER_BACKPACK, "Помаранчевий мідний рюкзак");
        translationBuilder.add(BackpackItems.ORANGE_IRON_BACKPACK, "Помаранчевий залізний рюкзак");
        translationBuilder.add(BackpackItems.ORANGE_GOLDEN_BACKPACK, "Помаранчевий золотий рюкзак");
        translationBuilder.add(BackpackItems.ORANGE_DIAMOND_BACKPACK, "Помаранчевий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.ORANGE_NETHERITE_BACKPACK, "Помаранчевий незеритовий рюкзак");
        translationBuilder.add(BackpackItems.YELLOW_BACKPACK, "Жовтий рюкзак");
        translationBuilder.add(BackpackItems.YELLOW_COPPER_BACKPACK, "Жовтий мідний рюкзак");
        translationBuilder.add(BackpackItems.YELLOW_IRON_BACKPACK, "Жовтий залізний рюкзак");
        translationBuilder.add(BackpackItems.YELLOW_GOLDEN_BACKPACK, "Жовтий золотий рюкзак");
        translationBuilder.add(BackpackItems.YELLOW_DIAMOND_BACKPACK, "Жовтий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.YELLOW_NETHERITE_BACKPACK, "Жовтий незеритовий рюкзак");
        translationBuilder.add(BackpackItems.LIME_BACKPACK, "Лаймовий рюкзак");
        translationBuilder.add(BackpackItems.LIME_COPPER_BACKPACK, "Лаймовий мідний рюкзак");
        translationBuilder.add(BackpackItems.LIME_IRON_BACKPACK, "Лаймовий залізний рюкзак");
        translationBuilder.add(BackpackItems.LIME_GOLDEN_BACKPACK, "Лаймовий золотий рюкзак");
        translationBuilder.add(BackpackItems.LIME_DIAMOND_BACKPACK, "Лаймовий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.LIME_NETHERITE_BACKPACK, "Лаймовий незеритовий рюкзак");
        translationBuilder.add(BackpackItems.GREEN_BACKPACK, "Зелений рюкзак");
        translationBuilder.add(BackpackItems.GREEN_COPPER_BACKPACK, "Зелений мідний рюкзак");
        translationBuilder.add(BackpackItems.GREEN_IRON_BACKPACK, "Зелений залізний рюкзак");
        translationBuilder.add(BackpackItems.GREEN_GOLDEN_BACKPACK, "Зелений золотий рюкзак");
        translationBuilder.add(BackpackItems.GREEN_DIAMOND_BACKPACK, "Зелений діамантовий рюкзак");
        translationBuilder.add(BackpackItems.GREEN_NETHERITE_BACKPACK, "Зелений незеритовий рюкзак");
        translationBuilder.add(BackpackItems.CYAN_BACKPACK, "Бірюзовий рюкзак");
        translationBuilder.add(BackpackItems.CYAN_COPPER_BACKPACK, "Бірюзовий мідний рюкзак");
        translationBuilder.add(BackpackItems.CYAN_IRON_BACKPACK, "Бірюзовий залізний рюкзак");
        translationBuilder.add(BackpackItems.CYAN_GOLDEN_BACKPACK, "Бірюзовий золотий рюкзак");
        translationBuilder.add(BackpackItems.CYAN_DIAMOND_BACKPACK, "Бірюзовий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.CYAN_NETHERITE_BACKPACK, "Бірюзовий незеритовий рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_BACKPACK, "Блакитний рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_COPPER_BACKPACK, "Блакитний мідний рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_IRON_BACKPACK, "Блакитний залізний рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_GOLDEN_BACKPACK, "Блакитний золотий рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_DIAMOND_BACKPACK, "Блакитний діамантовий рюкзак");
        translationBuilder.add(BackpackItems.LIGHT_BLUE_NETHERITE_BACKPACK, "Блакитний незеритовий рюкзак");
        translationBuilder.add(BackpackItems.BLUE_BACKPACK, "Синій рюкзак");
        translationBuilder.add(BackpackItems.BLUE_COPPER_BACKPACK, "Синій мідний рюкзак");
        translationBuilder.add(BackpackItems.BLUE_IRON_BACKPACK, "Синій залізний рюкзак");
        translationBuilder.add(BackpackItems.BLUE_GOLDEN_BACKPACK, "Синій золотий рюкзак");
        translationBuilder.add(BackpackItems.BLUE_DIAMOND_BACKPACK, "Синій діамантовий рюкзак");
        translationBuilder.add(BackpackItems.BLUE_NETHERITE_BACKPACK, "Синій незеритовий рюкзак");
        translationBuilder.add(BackpackItems.PURPLE_BACKPACK, "Фіолетовий рюкзак");
        translationBuilder.add(BackpackItems.PURPLE_COPPER_BACKPACK, "Фіолетовий мідний рюкзак");
        translationBuilder.add(BackpackItems.PURPLE_IRON_BACKPACK, "Фіолетовий залізний рюкзак");
        translationBuilder.add(BackpackItems.PURPLE_GOLDEN_BACKPACK, "Фіолетовий золотий рюкзак");
        translationBuilder.add(BackpackItems.PURPLE_DIAMOND_BACKPACK, "Фіолетовий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.PURPLE_NETHERITE_BACKPACK, "Фіолетовий незеритовий рюкзак");
        translationBuilder.add(BackpackItems.MAGENTA_BACKPACK, "Пурпуровий рюкзак");
        translationBuilder.add(BackpackItems.MAGENTA_COPPER_BACKPACK, "Пурпуровий мідний рюкзак");
        translationBuilder.add(BackpackItems.MAGENTA_IRON_BACKPACK, "Пурпуровий залізний рюкзак");
        translationBuilder.add(BackpackItems.MAGENTA_GOLDEN_BACKPACK, "Пурпуровий золотий рюкзак");
        translationBuilder.add(BackpackItems.MAGENTA_DIAMOND_BACKPACK, "Пурпуровий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.MAGENTA_NETHERITE_BACKPACK, "Пурпуровий незеритовий рюкзак");
        translationBuilder.add(BackpackItems.PINK_BACKPACK, "Рожевий рюкзак");
        translationBuilder.add(BackpackItems.PINK_COPPER_BACKPACK, "Рожевий мідний рюкзак");
        translationBuilder.add(BackpackItems.PINK_IRON_BACKPACK, "Рожевий залізний рюкзак");
        translationBuilder.add(BackpackItems.PINK_GOLDEN_BACKPACK, "Рожевий золотий рюкзак");
        translationBuilder.add(BackpackItems.PINK_DIAMOND_BACKPACK, "Рожевий діамантовий рюкзак");
        translationBuilder.add(BackpackItems.PINK_NETHERITE_BACKPACK, "Рожевий незеритовий рюкзак");

        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Backpacks");
        translationBuilder.add(MOD_ID + ".container.backpack", "Рюкзак");
        translationBuilder.add("key.category." + MOD_ID + "." + MOD_ID, "Nemo's Backpacks");
        translationBuilder.add(MOD_ID + ".key.swapBackpack", "Змінити рюкзаки в слоті рюкзака");
        translationBuilder.add(MOD_ID + ".key.interactBackpack", "Відкрити / закрити рюкзак");
    }
}
