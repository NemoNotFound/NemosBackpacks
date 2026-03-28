package com.nemonotfound.nemos.backpacks.client.gui.screens;

import com.nemonotfound.nemos.backpacks.client.gui.screens.inventory.BackpackScreen;
import com.nemonotfound.nemos.backpacks.world.inventory.BackpackMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.MenuAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import org.jspecify.annotations.NonNull;

public class BackpackMenuScreens {

    public static void init() {
        register(BackpackMenuTypes.DEFAULT_BACKPACK, BackpackScreen::new);
        register(BackpackMenuTypes.COPPER_BACKPACK, BackpackScreen::new);
        register(BackpackMenuTypes.IRON_BACKPACK, BackpackScreen::new);
        register(BackpackMenuTypes.GOLDEN_BACKPACK, BackpackScreen::new);
        register(BackpackMenuTypes.DIAMOND_BACKPACK, BackpackScreen::new);
        register(BackpackMenuTypes.NETHERITE_BACKPACK, BackpackScreen::new);
    }

    private static <T extends AbstractContainerMenu, U extends Screen & MenuAccess<T>> void register(MenuType<T> menuType, MenuScreens.ScreenConstructor<T, @NonNull U> screenConstructor) {
        MenuScreens.register(menuType, screenConstructor);
    }
}
