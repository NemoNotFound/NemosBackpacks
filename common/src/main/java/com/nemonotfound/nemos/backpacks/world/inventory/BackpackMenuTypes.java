package com.nemonotfound.nemos.backpacks.world.inventory;

import com.nemonotfound.nemos.backpacks.platform.Services;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

import java.util.function.Supplier;

public class BackpackMenuTypes {

    public static Supplier<MenuType<BackpackMenu>> DEFAULT_BACKPACK = register("default_backpack", BackpackMenu::defaultBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_WHITE_BACKPACK = register("default_white_backpack", BackpackMenu::defaultWhiteBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_LIGHT_GRAY_BACKPACK = register("default_light_gray_backpack", BackpackMenu::defaultLightGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_GRAY_BACKPACK = register("default_gray_backpack", BackpackMenu::defaultGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_BLACK_BACKPACK = register("default_black_backpack", BackpackMenu::defaultBlackBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_BROWN_BACKPACK = register("default_brown_backpack", BackpackMenu::defaultBrownBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_RED_BACKPACK = register("default_red_backpack", BackpackMenu::defaultRedBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_ORANGE_BACKPACK = register("default_orange_backpack", BackpackMenu::defaultOrangeBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_YELLOW_BACKPACK = register("default_yellow_backpack", BackpackMenu::defaultYellowBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_LIME_BACKPACK = register("default_lime_backpack", BackpackMenu::defaultLimeBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_GREEN_BACKPACK = register("default_green_backpack", BackpackMenu::defaultGreenBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_CYAN_BACKPACK = register("default_cyan_backpack", BackpackMenu::defaultCyanBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_LIGHT_BLUE_BACKPACK = register("default_light_blue_backpack", BackpackMenu::defaultLightBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_BLUE_BACKPACK = register("default_blue_backpack", BackpackMenu::defaultBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_PURPLE_BACKPACK = register("default_purple_backpack", BackpackMenu::defaultPurpleBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_MAGENTA_BACKPACK = register("default_magenta_backpack", BackpackMenu::defaultMagentaBackpack);
    public static Supplier<MenuType<BackpackMenu>> DEFAULT_PINK_BACKPACK = register("default_pink_backpack", BackpackMenu::defaultPinkBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_BACKPACK = register("copper_backpack", BackpackMenu::copperBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_WHITE_BACKPACK = register("copper_white_backpack", BackpackMenu::copperWhiteBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_LIGHT_GRAY_BACKPACK = register("copper_light_gray_backpack", BackpackMenu::copperLightGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_GRAY_BACKPACK = register("copper_gray_backpack", BackpackMenu::copperGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_BLACK_BACKPACK = register("copper_black_backpack", BackpackMenu::copperBlackBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_BROWN_BACKPACK = register("copper_brown_backpack", BackpackMenu::copperBrownBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_RED_BACKPACK = register("copper_red_backpack", BackpackMenu::copperRedBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_ORANGE_BACKPACK = register("copper_orange_backpack", BackpackMenu::copperOrangeBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_YELLOW_BACKPACK = register("copper_yellow_backpack", BackpackMenu::copperYellowBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_LIME_BACKPACK = register("copper_lime_backpack", BackpackMenu::copperLimeBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_GREEN_BACKPACK = register("copper_green_backpack", BackpackMenu::copperGreenBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_CYAN_BACKPACK = register("copper_cyan_backpack", BackpackMenu::copperCyanBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_LIGHT_BLUE_BACKPACK = register("copper_light_blue_backpack", BackpackMenu::copperLightBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_BLUE_BACKPACK = register("copper_blue_backpack", BackpackMenu::copperBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_PURPLE_BACKPACK = register("copper_purple_backpack", BackpackMenu::copperPurpleBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_MAGENTA_BACKPACK = register("copper_magenta_backpack", BackpackMenu::copperMagentaBackpack);
    public static Supplier<MenuType<BackpackMenu>> COPPER_PINK_BACKPACK = register("copper_pink_backpack", BackpackMenu::copperPinkBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_BACKPACK = register("iron_backpack", BackpackMenu::ironBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_WHITE_BACKPACK = register("iron_white_backpack", BackpackMenu::ironWhiteBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_LIGHT_GRAY_BACKPACK = register("iron_light_gray_backpack", BackpackMenu::ironLightGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_GRAY_BACKPACK = register("iron_gray_backpack", BackpackMenu::ironGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_BLACK_BACKPACK = register("iron_black_backpack", BackpackMenu::ironBlackBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_BROWN_BACKPACK = register("iron_brown_backpack", BackpackMenu::ironBrownBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_RED_BACKPACK = register("iron_red_backpack", BackpackMenu::ironRedBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_ORANGE_BACKPACK = register("iron_orange_backpack", BackpackMenu::ironOrangeBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_YELLOW_BACKPACK = register("iron_yellow_backpack", BackpackMenu::ironYellowBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_LIME_BACKPACK = register("iron_lime_backpack", BackpackMenu::ironLimeBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_GREEN_BACKPACK = register("iron_green_backpack", BackpackMenu::ironGreenBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_CYAN_BACKPACK = register("iron_cyan_backpack", BackpackMenu::ironCyanBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_LIGHT_BLUE_BACKPACK = register("iron_light_blue_backpack", BackpackMenu::ironLightBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_BLUE_BACKPACK = register("iron_blue_backpack", BackpackMenu::ironBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_PURPLE_BACKPACK = register("iron_purple_backpack", BackpackMenu::ironPurpleBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_MAGENTA_BACKPACK = register("iron_magenta_backpack", BackpackMenu::ironMagentaBackpack);
    public static Supplier<MenuType<BackpackMenu>> IRON_PINK_BACKPACK = register("iron_pink_backpack", BackpackMenu::ironPinkBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_BACKPACK = register("golden_backpack", BackpackMenu::goldenBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_WHITE_BACKPACK = register("golden_white_backpack", BackpackMenu::goldenWhiteBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_LIGHT_GRAY_BACKPACK = register("golden_light_gray_backpack", BackpackMenu::goldenLightGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_GRAY_BACKPACK = register("golden_gray_backpack", BackpackMenu::goldenGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_BLACK_BACKPACK = register("golden_black_backpack", BackpackMenu::goldenBlackBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_BROWN_BACKPACK = register("golden_brown_backpack", BackpackMenu::goldenBrownBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_RED_BACKPACK = register("golden_red_backpack", BackpackMenu::goldenRedBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_ORANGE_BACKPACK = register("golden_orange_backpack", BackpackMenu::goldenOrangeBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_YELLOW_BACKPACK = register("golden_yellow_backpack", BackpackMenu::goldenYellowBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_LIME_BACKPACK = register("golden_lime_backpack", BackpackMenu::goldenLimeBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_GREEN_BACKPACK = register("golden_green_backpack", BackpackMenu::goldenGreenBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_CYAN_BACKPACK = register("golden_cyan_backpack", BackpackMenu::goldenCyanBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_LIGHT_BLUE_BACKPACK = register("golden_light_blue_backpack", BackpackMenu::goldenLightBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_BLUE_BACKPACK = register("golden_blue_backpack", BackpackMenu::goldenBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_PURPLE_BACKPACK = register("golden_purple_backpack", BackpackMenu::goldenPurpleBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_MAGENTA_BACKPACK = register("golden_magenta_backpack", BackpackMenu::goldenMagentaBackpack);
    public static Supplier<MenuType<BackpackMenu>> GOLDEN_PINK_BACKPACK = register("golden_pink_backpack", BackpackMenu::goldenPinkBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_BACKPACK = register("diamond_backpack", BackpackMenu::diamondBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_WHITE_BACKPACK = register("diamond_white_backpack", BackpackMenu::diamondWhiteBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_LIGHT_GRAY_BACKPACK = register("diamond_light_gray_backpack", BackpackMenu::diamondLightGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_GRAY_BACKPACK = register("diamond_gray_backpack", BackpackMenu::diamondGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_BLACK_BACKPACK = register("diamond_black_backpack", BackpackMenu::diamondBlackBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_BROWN_BACKPACK = register("diamond_brown_backpack", BackpackMenu::diamondBrownBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_RED_BACKPACK = register("diamond_red_backpack", BackpackMenu::diamondRedBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_ORANGE_BACKPACK = register("diamond_orange_backpack", BackpackMenu::diamondOrangeBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_YELLOW_BACKPACK = register("diamond_yellow_backpack", BackpackMenu::diamondYellowBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_LIME_BACKPACK = register("diamond_lime_backpack", BackpackMenu::diamondLimeBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_GREEN_BACKPACK = register("diamond_green_backpack", BackpackMenu::diamondGreenBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_CYAN_BACKPACK = register("diamond_cyan_backpack", BackpackMenu::diamondCyanBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_LIGHT_BLUE_BACKPACK = register("diamond_light_blue_backpack", BackpackMenu::diamondLightBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_BLUE_BACKPACK = register("diamond_blue_backpack", BackpackMenu::diamondBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_PURPLE_BACKPACK = register("diamond_purple_backpack", BackpackMenu::diamondPurpleBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_MAGENTA_BACKPACK = register("diamond_magenta_backpack", BackpackMenu::diamondMagentaBackpack);
    public static Supplier<MenuType<BackpackMenu>> DIAMOND_PINK_BACKPACK = register("diamond_pink_backpack", BackpackMenu::diamondPinkBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_BACKPACK = register("netherite_backpack", BackpackMenu::netheriteBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_WHITE_BACKPACK = register("netherite_white_backpack", BackpackMenu::netheriteWhiteBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_LIGHT_GRAY_BACKPACK = register("netherite_light_gray_backpack", BackpackMenu::netheriteLightGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_GRAY_BACKPACK = register("netherite_gray_backpack", BackpackMenu::netheriteGrayBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_BLACK_BACKPACK = register("netherite_black_backpack", BackpackMenu::netheriteBlackBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_BROWN_BACKPACK = register("netherite_brown_backpack", BackpackMenu::netheriteBrownBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_RED_BACKPACK = register("netherite_red_backpack", BackpackMenu::netheriteRedBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_ORANGE_BACKPACK = register("netherite_orange_backpack", BackpackMenu::netheriteOrangeBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_YELLOW_BACKPACK = register("netherite_yellow_backpack", BackpackMenu::netheriteYellowBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_LIME_BACKPACK = register("netherite_lime_backpack", BackpackMenu::netheriteLimeBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_GREEN_BACKPACK = register("netherite_green_backpack", BackpackMenu::netheriteGreenBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_CYAN_BACKPACK = register("netherite_cyan_backpack", BackpackMenu::netheriteCyanBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_LIGHT_BLUE_BACKPACK = register("netherite_light_blue_backpack", BackpackMenu::netheriteLightBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_BLUE_BACKPACK = register("netherite_blue_backpack", BackpackMenu::netheriteBlueBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_PURPLE_BACKPACK = register("netherite_purple_backpack", BackpackMenu::netheritePurpleBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_MAGENTA_BACKPACK = register("netherite_magenta_backpack", BackpackMenu::netheriteMagentaBackpack);
    public static Supplier<MenuType<BackpackMenu>> NETHERITE_PINK_BACKPACK = register("netherite_pink_backpack", BackpackMenu::netheritePinkBackpack);

    public static void init() {}

    public static <T extends AbstractContainerMenu> Supplier<MenuType<T>> register(String id, MenuType.MenuSupplier<T> menuSupplier) {
        return Services.REGISTRY_HELPER.registerMenuType(id, menuSupplier);
    }
}
