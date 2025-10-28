package com.devnemo.nemos.backpacks.datagen.lang;

import com.devnemo.nemos.backpacks.world.item.NemosBackpackItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.devnemo.nemos.backpacks.Constants.MOD_ID;

public class UkrainianLanguageProvider extends FabricLanguageProvider {

    public UkrainianLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(NemosBackpackItems.BACKPACK.get(), "Рюкзак");
        translationBuilder.add(NemosBackpackItems.COPPER_BACKPACK.get(), "Мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.IRON_BACKPACK.get(), "Залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.GOLDEN_BACKPACK.get(), "Золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.DIAMOND_BACKPACK.get(), "Діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.NETHERITE_BACKPACK.get(), "Незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.WHITE_BACKPACK.get(), "Білий рюкзак");
        translationBuilder.add(NemosBackpackItems.WHITE_COPPER_BACKPACK.get(), "Білий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.WHITE_IRON_BACKPACK.get(), "Білий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.WHITE_GOLDEN_BACKPACK.get(), "Білий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.WHITE_DIAMOND_BACKPACK.get(), "Білий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.WHITE_NETHERITE_BACKPACK.get(), "Білий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_GRAY_BACKPACK.get(), "Світло-сірий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_GRAY_COPPER_BACKPACK.get(), "Світло-сірий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_GRAY_IRON_BACKPACK.get(), "Світло-сірий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_GRAY_GOLDEN_BACKPACK.get(), "Світло-сірий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_GRAY_DIAMOND_BACKPACK.get(), "Світло-сірий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_GRAY_NETHERITE_BACKPACK.get(), "Світло-сірий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.GRAY_BACKPACK.get(), "Сірий рюкзак");
        translationBuilder.add(NemosBackpackItems.GRAY_COPPER_BACKPACK.get(), "Сірий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.GRAY_IRON_BACKPACK.get(), "Сірий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.GRAY_GOLDEN_BACKPACK.get(), "Сірий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.GRAY_DIAMOND_BACKPACK.get(), "Сірий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.GRAY_NETHERITE_BACKPACK.get(), "Сірий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.BLACK_BACKPACK.get(), "Чорний рюкзак");
        translationBuilder.add(NemosBackpackItems.BLACK_COPPER_BACKPACK.get(), "Чорний мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.BLACK_IRON_BACKPACK.get(), "Чорний залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.BLACK_GOLDEN_BACKPACK.get(), "Чорний золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.BLACK_DIAMOND_BACKPACK.get(), "Чорний діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.BLACK_NETHERITE_BACKPACK.get(), "Чорний незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.BROWN_BACKPACK.get(), "Коричневий рюкзак");
        translationBuilder.add(NemosBackpackItems.BROWN_COPPER_BACKPACK.get(), "Коричневий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.BROWN_IRON_BACKPACK.get(), "Коричневий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.BROWN_GOLDEN_BACKPACK.get(), "Коричневий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.BROWN_DIAMOND_BACKPACK.get(), "Коричневий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.BROWN_NETHERITE_BACKPACK.get(), "Коричневий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.RED_BACKPACK.get(), "Червоний рюкзак");
        translationBuilder.add(NemosBackpackItems.RED_COPPER_BACKPACK.get(), "Червоний мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.RED_IRON_BACKPACK.get(), "Червоний залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.RED_GOLDEN_BACKPACK.get(), "Червоний золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.RED_DIAMOND_BACKPACK.get(), "Червоний діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.RED_NETHERITE_BACKPACK.get(), "Червоний незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.ORANGE_BACKPACK.get(), "Помаранчевий рюкзак");
        translationBuilder.add(NemosBackpackItems.ORANGE_COPPER_BACKPACK.get(), "Помаранчевий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.ORANGE_IRON_BACKPACK.get(), "Помаранчевий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.ORANGE_GOLDEN_BACKPACK.get(), "Помаранчевий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.ORANGE_DIAMOND_BACKPACK.get(), "Помаранчевий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.ORANGE_NETHERITE_BACKPACK.get(), "Помаранчевий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.YELLOW_BACKPACK.get(), "Жовтий рюкзак");
        translationBuilder.add(NemosBackpackItems.YELLOW_COPPER_BACKPACK.get(), "Жовтий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.YELLOW_IRON_BACKPACK.get(), "Жовтий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.YELLOW_GOLDEN_BACKPACK.get(), "Жовтий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.YELLOW_DIAMOND_BACKPACK.get(), "Жовтий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.YELLOW_NETHERITE_BACKPACK.get(), "Жовтий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIME_BACKPACK.get(), "Лаймовий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIME_COPPER_BACKPACK.get(), "Лаймовий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.LIME_IRON_BACKPACK.get(), "Лаймовий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.LIME_GOLDEN_BACKPACK.get(), "Лаймовий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIME_DIAMOND_BACKPACK.get(), "Лаймовий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIME_NETHERITE_BACKPACK.get(), "Лаймовий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.GREEN_BACKPACK.get(), "Зелений рюкзак");
        translationBuilder.add(NemosBackpackItems.GREEN_COPPER_BACKPACK.get(), "Зелений мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.GREEN_IRON_BACKPACK.get(), "Зелений залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.GREEN_GOLDEN_BACKPACK.get(), "Зелений золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.GREEN_DIAMOND_BACKPACK.get(), "Зелений діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.GREEN_NETHERITE_BACKPACK.get(), "Зелений незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.CYAN_BACKPACK.get(), "Бірюзовий рюкзак");
        translationBuilder.add(NemosBackpackItems.CYAN_COPPER_BACKPACK.get(), "Бірюзовий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.CYAN_IRON_BACKPACK.get(), "Бірюзовий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.CYAN_GOLDEN_BACKPACK.get(), "Бірюзовий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.CYAN_DIAMOND_BACKPACK.get(), "Бірюзовий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.CYAN_NETHERITE_BACKPACK.get(), "Бірюзовий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_BLUE_BACKPACK.get(), "Блакитний рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_BLUE_COPPER_BACKPACK.get(), "Блакитний мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_BLUE_IRON_BACKPACK.get(), "Блакитний залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_BLUE_GOLDEN_BACKPACK.get(), "Блакитний золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_BLUE_DIAMOND_BACKPACK.get(), "Блакитний діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.LIGHT_BLUE_NETHERITE_BACKPACK.get(), "Блакитний незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.BLUE_BACKPACK.get(), "Синій рюкзак");
        translationBuilder.add(NemosBackpackItems.BLUE_COPPER_BACKPACK.get(), "Синій мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.BLUE_IRON_BACKPACK.get(), "Синій залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.BLUE_GOLDEN_BACKPACK.get(), "Синій золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.BLUE_DIAMOND_BACKPACK.get(), "Синій діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.BLUE_NETHERITE_BACKPACK.get(), "Синій незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.PURPLE_BACKPACK.get(), "Фіолетовий рюкзак");
        translationBuilder.add(NemosBackpackItems.PURPLE_COPPER_BACKPACK.get(), "Фіолетовий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.PURPLE_IRON_BACKPACK.get(), "Фіолетовий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.PURPLE_GOLDEN_BACKPACK.get(), "Фіолетовий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.PURPLE_DIAMOND_BACKPACK.get(), "Фіолетовий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.PURPLE_NETHERITE_BACKPACK.get(), "Фіолетовий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.MAGENTA_BACKPACK.get(), "Пурпуровий рюкзак");
        translationBuilder.add(NemosBackpackItems.MAGENTA_COPPER_BACKPACK.get(), "Пурпуровий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.MAGENTA_IRON_BACKPACK.get(), "Пурпуровий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.MAGENTA_GOLDEN_BACKPACK.get(), "Пурпуровий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.MAGENTA_DIAMOND_BACKPACK.get(), "Пурпуровий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.MAGENTA_NETHERITE_BACKPACK.get(), "Пурпуровий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.PINK_BACKPACK.get(), "Рожевий рюкзак");
        translationBuilder.add(NemosBackpackItems.PINK_COPPER_BACKPACK.get(), "Рожевий мідний рюкзак");
        translationBuilder.add(NemosBackpackItems.PINK_IRON_BACKPACK.get(), "Рожевий залізний рюкзак");
        translationBuilder.add(NemosBackpackItems.PINK_GOLDEN_BACKPACK.get(), "Рожевий золотий рюкзак");
        translationBuilder.add(NemosBackpackItems.PINK_DIAMOND_BACKPACK.get(), "Рожевий діамантовий рюкзак");
        translationBuilder.add(NemosBackpackItems.PINK_NETHERITE_BACKPACK.get(), "Рожевий незеритовий рюкзак");
        translationBuilder.add(NemosBackpackItems.COPPER_UPGRADE_SMITHING_TEMPLATE.get(), "Мідне покращення");
        translationBuilder.add("item.nemos_backpacks.smithing_template.copper_upgrade.applies_to", "Звичайний рюкзак");
        translationBuilder.add("item.nemos_backpacks.smithing_template.copper_upgrade.additions_slot_description", "Додайте мідний злиток");
        translationBuilder.add("item.nemos_backpacks.smithing_template.copper_upgrade.base_slot_description", "Додайте звичайний рюкзак");
        translationBuilder.add("item.nemos_backpacks.smithing_template.copper_upgrade.ingredients", "Мідний злиток");
        translationBuilder.add(NemosBackpackItems.IRON_UPGRADE_SMITHING_TEMPLATE.get(), "Залізне покращення");
        translationBuilder.add("item.nemos_backpacks.smithing_template.iron_upgrade.applies_to", "Мідний рюкзак");
        translationBuilder.add("item.nemos_backpacks.smithing_template.iron_upgrade.additions_slot_description", "Додайте pfkspybq злиток");
        translationBuilder.add("item.nemos_backpacks.smithing_template.iron_upgrade.base_slot_description", "Додайте звичайний рюкзак");
        translationBuilder.add("item.nemos_backpacks.smithing_template.iron_upgrade.ingredients", "Залізний злиток");
        translationBuilder.add(NemosBackpackItems.GOLD_UPGRADE_SMITHING_TEMPLATE.get(), "Золоте покращення");
        translationBuilder.add("item.nemos_backpacks.smithing_template.gold_upgrade.applies_to", "Залізний рюкзак");
        translationBuilder.add("item.nemos_backpacks.smithing_template.gold_upgrade.additions_slot_description", "Додайте pjkjnbq злиток");
        translationBuilder.add("item.nemos_backpacks.smithing_template.gold_upgrade.base_slot_description", "Додайте звичайний рюкзак");
        translationBuilder.add("item.nemos_backpacks.smithing_template.gold_upgrade.ingredients", "Золотий злиток");
        translationBuilder.add(NemosBackpackItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get(), "Діамантове покращення");
        translationBuilder.add("item.nemos_backpacks.smithing_template.diamond_upgrade.applies_to", "Золотий рюкзак");
        translationBuilder.add("item.nemos_backpacks.smithing_template.diamond_upgrade.additions_slot_description", "Додайте діамант");
        translationBuilder.add("item.nemos_backpacks.smithing_template.diamond_upgrade.base_slot_description", "Додайте звичайний рюкзак");
        translationBuilder.add("item.nemos_backpacks.smithing_template.diamond_upgrade.ingredients", "Діамант");

        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Backpacks");
        translationBuilder.add(MOD_ID + ".container.backpack", "Рюкзак");
    }
}
