package com.nemonotfound.nemos.backpacks.world.inventory;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

public class BackpackMenuTypes {

    public static MenuType<BackpackMenu> DEFAULT_BACKPACK = register("default_backpack", BackpackMenu::defaultBackpack);
    public static MenuType<BackpackMenu> COPPER_BACKPACK = register("copper_backpack", BackpackMenu::copperBackpack);
    public static MenuType<BackpackMenu> IRON_BACKPACK = register("iron_backpack", BackpackMenu::ironBackpack);
    public static MenuType<BackpackMenu> GOLDEN_BACKPACK = register("golden_backpack", BackpackMenu::goldenBackpack);
    public static MenuType<BackpackMenu> DIAMOND_BACKPACK = register("diamond_backpack", BackpackMenu::diamondBackpack);
    public static MenuType<BackpackMenu> NETHERITE_BACKPACK = register("netherite_backpack", BackpackMenu::netheriteBackpack);

    public static void init() {}

    public static <T extends AbstractContainerMenu> MenuType<T> register(String id, MenuType.MenuSupplier<T> menuSupplier) {
        return Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(MOD_ID, id), new MenuType<>(menuSupplier, FeatureFlags.DEFAULT_FLAGS));
    }
}
