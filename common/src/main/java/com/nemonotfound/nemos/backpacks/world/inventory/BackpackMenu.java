package com.nemonotfound.nemos.backpacks.world.inventory;

import com.nemonotfound.nemos.backpacks.world.item.BackpackMaterial;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemContainerContents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

//TODO: Refactor
public class BackpackMenu extends AbstractContainerMenu {

    private final Container container;
    private final int containerRows;
    private final ItemStack itemStack;
    private final Inventory playerInventory;
    private final BackpackMaterial backpackMaterial;
    private final DyeColor dyeColor;

    public static BackpackMenu defaultBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, 1);
    }

    public static BackpackMenu defaultBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, null, itemStack, container, 1);
    }

    public static BackpackMenu defaultWhiteBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.WHITE, 1);
    }

    public static BackpackMenu defaultWhiteBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.WHITE, itemStack, container, 1);
    }

    public static BackpackMenu defaultLightGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.LIGHT_GRAY, 1);
    }

    public static BackpackMenu defaultLightGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.LIGHT_GRAY, itemStack, container, 1);
    }

    public static BackpackMenu defaultGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.GRAY, 1);
    }

    public static BackpackMenu defaultGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.GRAY, itemStack, container, 1);
    }

    public static BackpackMenu defaultBlackBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.BLACK, 1);
    }

    public static BackpackMenu defaultBlackBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.BLACK, itemStack, container, 1);
    }

    public static BackpackMenu defaultBrownBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.BROWN, 1);
    }

    public static BackpackMenu defaultBrownBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.BROWN, itemStack, container, 1);
    }

    public static BackpackMenu defaultRedBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.RED, 1);
    }

    public static BackpackMenu defaultRedBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.RED, itemStack, container, 1);
    }

    public static BackpackMenu defaultOrangeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.ORANGE, 1);
    }

    public static BackpackMenu defaultOrangeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.ORANGE, itemStack, container, 1);
    }

    public static BackpackMenu defaultYellowBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.YELLOW, 1);
    }

    public static BackpackMenu defaultYellowBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.YELLOW, itemStack, container, 1);
    }

    public static BackpackMenu defaultLimeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.LIME, 1);
    }

    public static BackpackMenu defaultLimeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.LIME, itemStack, container, 1);
    }

    public static BackpackMenu defaultGreenBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.GREEN, 1);
    }

    public static BackpackMenu defaultGreenBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.GREEN, itemStack, container, 1);
    }

    public static BackpackMenu defaultCyanBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.CYAN, 1);
    }

    public static BackpackMenu defaultCyanBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.CYAN, itemStack, container, 1);
    }

    public static BackpackMenu defaultLightBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.LIGHT_BLUE, 1);
    }

    public static BackpackMenu defaultLightBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.LIGHT_BLUE, itemStack, container, 1);
    }

    public static BackpackMenu defaultBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.BLUE, 1);
    }

    public static BackpackMenu defaultBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.BLUE, itemStack, container, 1);
    }

    public static BackpackMenu defaultPurpleBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.PURPLE, 1);
    }

    public static BackpackMenu defaultPurpleBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.PURPLE, itemStack, container, 1);
    }

    public static BackpackMenu defaultMagentaBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.MAGENTA, 1);
    }

    public static BackpackMenu defaultMagentaBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.MAGENTA, itemStack, container, 1);
    }

    public static BackpackMenu defaultPinkBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.PINK, 1);
    }

    public static BackpackMenu defaultPinkBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.STRING, DyeColor.PINK, itemStack, container, 1);
    }

    public static BackpackMenu copperBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, 2);
    }

    public static BackpackMenu copperBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, null, itemStack, container, 2);
    }

    public static BackpackMenu copperWhiteBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.WHITE, 2);
    }

    public static BackpackMenu copperWhiteBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.WHITE, itemStack, container, 2);
    }

    public static BackpackMenu copperLightGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.LIGHT_GRAY, 2);
    }

    public static BackpackMenu copperLightGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.LIGHT_GRAY, itemStack, container, 2);
    }

    public static BackpackMenu copperGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.GRAY, 2);
    }

    public static BackpackMenu copperGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.GRAY, itemStack, container, 2);
    }

    public static BackpackMenu copperBlackBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.BLACK, 2);
    }

    public static BackpackMenu copperBlackBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.BLACK, itemStack, container, 2);
    }

    public static BackpackMenu copperBrownBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.BROWN, 2);
    }

    public static BackpackMenu copperBrownBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.BROWN, itemStack, container, 2);
    }

    public static BackpackMenu copperRedBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.RED, 2);
    }

    public static BackpackMenu copperRedBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.RED, itemStack, container, 2);
    }

    public static BackpackMenu copperOrangeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.ORANGE, 2);
    }

    public static BackpackMenu copperOrangeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.ORANGE, itemStack, container, 2);
    }

    public static BackpackMenu copperYellowBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.YELLOW, 2);
    }

    public static BackpackMenu copperYellowBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.YELLOW, itemStack, container, 2);
    }

    public static BackpackMenu copperLimeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.LIME, 2);
    }

    public static BackpackMenu copperLimeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.LIME, itemStack, container, 2);
    }

    public static BackpackMenu copperGreenBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.GREEN, 2);
    }

    public static BackpackMenu copperGreenBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.GREEN, itemStack, container, 2);
    }

    public static BackpackMenu copperCyanBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.CYAN, 2);
    }

    public static BackpackMenu copperCyanBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.CYAN, itemStack, container, 2);
    }

    public static BackpackMenu copperLightBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.LIGHT_BLUE, 2);
    }

    public static BackpackMenu copperLightBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.LIGHT_BLUE, itemStack, container, 2);
    }

    public static BackpackMenu copperBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.BLUE, 2);
    }

    public static BackpackMenu copperBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.BLUE, itemStack, container, 2);
    }

    public static BackpackMenu copperPurpleBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.PURPLE, 2);
    }

    public static BackpackMenu copperPurpleBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.PURPLE, itemStack, container, 2);
    }

    public static BackpackMenu copperMagentaBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.MAGENTA, 2);
    }

    public static BackpackMenu copperMagentaBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.MAGENTA, itemStack, container, 2);
    }

    public static BackpackMenu copperPinkBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.PINK, 2);
    }

    public static BackpackMenu copperPinkBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.COPPER, DyeColor.PINK, itemStack, container, 2);
    }

    public static BackpackMenu ironBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, 3);
    }

    public static BackpackMenu ironBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, null, itemStack, container, 3);
    }

    public static BackpackMenu ironWhiteBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.WHITE, 3);
    }

    public static BackpackMenu ironWhiteBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.WHITE, itemStack, container, 3);
    }

    public static BackpackMenu ironLightGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.LIGHT_GRAY, 3);
    }

    public static BackpackMenu ironLightGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.LIGHT_GRAY, itemStack, container, 3);
    }

    public static BackpackMenu ironGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.GRAY, 3);
    }

    public static BackpackMenu ironGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.GRAY, itemStack, container, 3);
    }

    public static BackpackMenu ironBlackBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.BLACK, 3);
    }

    public static BackpackMenu ironBlackBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.BLACK, itemStack, container, 3);
    }

    public static BackpackMenu ironBrownBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.BROWN, 3);
    }

    public static BackpackMenu ironBrownBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.BROWN, itemStack, container, 3);
    }

    public static BackpackMenu ironRedBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.RED, 3);
    }

    public static BackpackMenu ironRedBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.RED, itemStack, container, 3);
    }

    public static BackpackMenu ironOrangeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.ORANGE, 3);
    }

    public static BackpackMenu ironOrangeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.ORANGE, itemStack, container, 3);
    }

    public static BackpackMenu ironYellowBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.YELLOW, 3);
    }

    public static BackpackMenu ironYellowBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.YELLOW, itemStack, container, 3);
    }

    public static BackpackMenu ironLimeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.LIME, 3);
    }

    public static BackpackMenu ironLimeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.LIME, itemStack, container, 3);
    }

    public static BackpackMenu ironGreenBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.GREEN, 3);
    }

    public static BackpackMenu ironGreenBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.GREEN, itemStack, container, 3);
    }

    public static BackpackMenu ironCyanBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.CYAN, 3);
    }

    public static BackpackMenu ironCyanBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.CYAN, itemStack, container, 3);
    }

    public static BackpackMenu ironLightBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.LIGHT_BLUE, 3);
    }

    public static BackpackMenu ironLightBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.LIGHT_BLUE, itemStack, container, 3);
    }

    public static BackpackMenu ironBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.BLUE, 3);
    }

    public static BackpackMenu ironBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.BLUE, itemStack, container, 3);
    }

    public static BackpackMenu ironPurpleBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.PURPLE, 3);
    }

    public static BackpackMenu ironPurpleBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.PURPLE, itemStack, container, 3);
    }

    public static BackpackMenu ironMagentaBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.MAGENTA, 3);
    }

    public static BackpackMenu ironMagentaBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.MAGENTA, itemStack, container, 3);
    }

    public static BackpackMenu ironPinkBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.PINK, 3);
    }

    public static BackpackMenu ironPinkBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.IRON, DyeColor.PINK, itemStack, container, 3);
    }

    public static BackpackMenu goldenBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, 4);
    }

    public static BackpackMenu goldenBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, null, itemStack, container, 4);
    }

    public static BackpackMenu goldenWhiteBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.WHITE, 4);
    }

    public static BackpackMenu goldenWhiteBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.WHITE, itemStack, container, 4);
    }

    public static BackpackMenu goldenLightGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.LIGHT_GRAY, 4);
    }

    public static BackpackMenu goldenLightGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.LIGHT_GRAY, itemStack, container, 4);
    }

    public static BackpackMenu goldenGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.GRAY, 4);
    }

    public static BackpackMenu goldenGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.GRAY, itemStack, container, 4);
    }

    public static BackpackMenu goldenBlackBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.BLACK, 4);
    }

    public static BackpackMenu goldenBlackBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.BLACK, itemStack, container, 4);
    }

    public static BackpackMenu goldenBrownBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.BROWN, 4);
    }

    public static BackpackMenu goldenBrownBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.BROWN, itemStack, container, 4);
    }

    public static BackpackMenu goldenRedBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.RED, 4);
    }

    public static BackpackMenu goldenRedBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.RED, itemStack, container, 4);
    }

    public static BackpackMenu goldenOrangeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.ORANGE, 4);
    }

    public static BackpackMenu goldenOrangeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.ORANGE, itemStack, container, 4);
    }

    public static BackpackMenu goldenYellowBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.YELLOW, 4);
    }

    public static BackpackMenu goldenYellowBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.YELLOW, itemStack, container, 4);
    }

    public static BackpackMenu goldenLimeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.LIME, 4);
    }

    public static BackpackMenu goldenLimeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.LIME, itemStack, container, 4);
    }

    public static BackpackMenu goldenGreenBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.GREEN, 4);
    }

    public static BackpackMenu goldenGreenBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.GREEN, itemStack, container, 4);
    }

    public static BackpackMenu goldenCyanBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.CYAN, 4);
    }

    public static BackpackMenu goldenCyanBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.CYAN, itemStack, container, 4);
    }

    public static BackpackMenu goldenLightBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.LIGHT_BLUE, 4);
    }

    public static BackpackMenu goldenLightBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.LIGHT_BLUE, itemStack, container, 4);
    }

    public static BackpackMenu goldenBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.BLUE, 4);
    }

    public static BackpackMenu goldenBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.BLUE, itemStack, container, 4);
    }

    public static BackpackMenu goldenPurpleBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.PURPLE, 4);
    }

    public static BackpackMenu goldenPurpleBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.PURPLE, itemStack, container, 4);
    }

    public static BackpackMenu goldenMagentaBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.MAGENTA, 4);
    }

    public static BackpackMenu goldenMagentaBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.MAGENTA, itemStack, container, 4);
    }

    public static BackpackMenu goldenPinkBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.PINK, 4);
    }

    public static BackpackMenu goldenPinkBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.GOLD, DyeColor.PINK, itemStack, container, 4);
    }

    public static BackpackMenu diamondBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, 5);
    }

    public static BackpackMenu diamondBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, null, itemStack, container, 5);
    }

    public static BackpackMenu diamondWhiteBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.WHITE, 5);
    }

    public static BackpackMenu diamondWhiteBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.WHITE, itemStack, container, 5);
    }

    public static BackpackMenu diamondLightGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.LIGHT_GRAY, 5);
    }

    public static BackpackMenu diamondLightGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.LIGHT_GRAY, itemStack, container, 5);
    }

    public static BackpackMenu diamondGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.GRAY, 5);
    }

    public static BackpackMenu diamondGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.GRAY, itemStack, container, 5);
    }

    public static BackpackMenu diamondBlackBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.BLACK, 5);
    }

    public static BackpackMenu diamondBlackBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.BLACK, itemStack, container, 5);
    }

    public static BackpackMenu diamondBrownBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.BROWN, 5);
    }

    public static BackpackMenu diamondBrownBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.BROWN, itemStack, container, 5);
    }

    public static BackpackMenu diamondRedBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.RED, 5);
    }

    public static BackpackMenu diamondRedBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.RED, itemStack, container, 5);
    }

    public static BackpackMenu diamondOrangeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.ORANGE, 5);
    }

    public static BackpackMenu diamondOrangeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.ORANGE, itemStack, container, 5);
    }

    public static BackpackMenu diamondYellowBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.YELLOW, 5);
    }

    public static BackpackMenu diamondYellowBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.YELLOW, itemStack, container, 5);
    }

    public static BackpackMenu diamondLimeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.LIME, 5);
    }

    public static BackpackMenu diamondLimeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.LIME, itemStack, container, 5);
    }

    public static BackpackMenu diamondGreenBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.GREEN, 5);
    }

    public static BackpackMenu diamondGreenBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.GREEN, itemStack, container, 5);
    }

    public static BackpackMenu diamondCyanBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.CYAN, 5);
    }

    public static BackpackMenu diamondCyanBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.CYAN, itemStack, container, 5);
    }

    public static BackpackMenu diamondLightBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.LIGHT_BLUE, 5);
    }

    public static BackpackMenu diamondLightBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.LIGHT_BLUE, itemStack, container, 5);
    }

    public static BackpackMenu diamondBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.BLUE, 5);
    }

    public static BackpackMenu diamondBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.BLUE, itemStack, container, 5);
    }

    public static BackpackMenu diamondPurpleBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.PURPLE, 5);
    }

    public static BackpackMenu diamondPurpleBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.PURPLE, itemStack, container, 5);
    }

    public static BackpackMenu diamondMagentaBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.MAGENTA, 5);
    }

    public static BackpackMenu diamondMagentaBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.MAGENTA, itemStack, container, 5);
    }

    public static BackpackMenu diamondPinkBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.PINK, 5);
    }

    public static BackpackMenu diamondPinkBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.DIAMOND, DyeColor.PINK, itemStack, container, 5);
    }

    public static BackpackMenu netheriteBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, 6);
    }

    public static BackpackMenu netheriteBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, null, itemStack, container, 6);
    }

    public static BackpackMenu netheriteWhiteBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.WHITE, 6);
    }

    public static BackpackMenu netheriteWhiteBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_WHITE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.WHITE, itemStack, container, 6);
    }

    public static BackpackMenu netheriteLightGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.LIGHT_GRAY, 6);
    }

    public static BackpackMenu netheriteLightGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_LIGHT_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.LIGHT_GRAY, itemStack, container, 6);
    }

    public static BackpackMenu netheriteGrayBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.GRAY, 6);
    }

    public static BackpackMenu netheriteGrayBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_GRAY_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.GRAY, itemStack, container, 6);
    }

    public static BackpackMenu netheriteBlackBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.BLACK, 6);
    }

    public static BackpackMenu netheriteBlackBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_BLACK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.BLACK, itemStack, container, 6);
    }

    public static BackpackMenu netheriteBrownBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.BROWN, 6);
    }

    public static BackpackMenu netheriteBrownBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_BROWN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.BROWN, itemStack, container, 6);
    }

    public static BackpackMenu netheriteRedBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.RED, 6);
    }

    public static BackpackMenu netheriteRedBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_RED_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.RED, itemStack, container, 6);
    }

    public static BackpackMenu netheriteOrangeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.ORANGE, 6);
    }

    public static BackpackMenu netheriteOrangeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_ORANGE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.ORANGE, itemStack, container, 6);
    }

    public static BackpackMenu netheriteYellowBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.YELLOW, 6);
    }

    public static BackpackMenu netheriteYellowBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_YELLOW_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.YELLOW, itemStack, container, 6);
    }

    public static BackpackMenu netheriteLimeBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.LIME, 6);
    }

    public static BackpackMenu netheriteLimeBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_LIME_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.LIME, itemStack, container, 6);
    }

    public static BackpackMenu netheriteGreenBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.GREEN, 6);
    }

    public static BackpackMenu netheriteGreenBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_GREEN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.GREEN, itemStack, container, 6);
    }

    public static BackpackMenu netheriteCyanBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.CYAN, 6);
    }

    public static BackpackMenu netheriteCyanBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_CYAN_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.CYAN, itemStack, container, 6);
    }

    public static BackpackMenu netheriteLightBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.LIGHT_BLUE, 6);
    }

    public static BackpackMenu netheriteLightBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_LIGHT_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.LIGHT_BLUE, itemStack, container, 6);
    }

    public static BackpackMenu netheriteBlueBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.BLUE, 6);
    }

    public static BackpackMenu netheriteBlueBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_BLUE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.BLUE, itemStack, container, 6);
    }

    public static BackpackMenu netheritePurpleBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.PURPLE, 6);
    }

    public static BackpackMenu netheritePurpleBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_PURPLE_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.PURPLE, itemStack, container, 6);
    }

    public static BackpackMenu netheriteMagentaBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.MAGENTA, 6);
    }

    public static BackpackMenu netheriteMagentaBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_MAGENTA_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.MAGENTA, itemStack, container, 6);
    }

    public static BackpackMenu netheritePinkBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.PINK, 6);
    }

    public static BackpackMenu netheritePinkBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_PINK_BACKPACK.get(), containerId, playerInventory, BackpackMaterial.NETHERITE, DyeColor.PINK, itemStack, container, 6);
    }

    private BackpackMenu(MenuType<?> menuType, int containerId, Inventory playerInventory, BackpackMaterial backpackMaterial, int rows) {
        this(menuType, containerId, playerInventory, backpackMaterial, null, ItemStack.EMPTY, new SimpleContainer(9 * rows), rows);
    }

    private BackpackMenu(MenuType<?> menuType, int containerId, Inventory playerInventory, BackpackMaterial backpackMaterial, DyeColor dyeColor, int rows) {
        this(menuType, containerId, playerInventory, backpackMaterial, dyeColor, ItemStack.EMPTY, new SimpleContainer(9 * rows), rows);
    }

    public BackpackMenu(@Nullable MenuType<?> menuType, int containerId, Inventory playerInventory, BackpackMaterial backpackMaterial, DyeColor dyeColor, ItemStack itemStack, Container container, int rows) {
        super(menuType, containerId);
        checkContainerSize(container, rows * 9);
        this.container = container;
        this.containerRows = rows;
        this.itemStack = itemStack;
        this.playerInventory = playerInventory;
        this.backpackMaterial = backpackMaterial;
        this.dyeColor = dyeColor;
        container.startOpen(playerInventory.player);

        var xOffset = 8;
        var yOffset = 18;
        var gapBetweenContainerAndInventory = 13;

        this.addBackpackGrid(container, xOffset, yOffset);
        int inventoryYOffset = yOffset + this.containerRows * yOffset + gapBetweenContainerAndInventory;
        this.addStandardInventorySlots(playerInventory, xOffset, inventoryYOffset);
    }

    private void addBackpackGrid(Container container, int xOffset, int yOffset) {
        var slotCountPerRow = 9;

        for (int rowIndex = 0; rowIndex < this.containerRows; rowIndex++) {
            for (int slotIndex = 0; slotIndex < slotCountPerRow; slotIndex++) {
                this.addSlot(new BackpackSlot(container, slotIndex + rowIndex * slotCountPerRow, xOffset + slotIndex * yOffset, yOffset + rowIndex * yOffset));
            }
        }
    }

    @Override
    public @NotNull ItemStack quickMoveStack(@NotNull Player player, int index) {
        var itemstack = ItemStack.EMPTY;
        var slot = this.slots.get(index);

        if (slot.hasItem()) {
            var slotItemStack = slot.getItem();
            itemstack = slotItemStack.copy();

            if (index < this.container.getContainerSize()) {
                if (!this.moveItemStackTo(slotItemStack, this.container.getContainerSize(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(slotItemStack, 0, this.container.getContainerSize(), false)) {
                return ItemStack.EMPTY;
            }

            if (slotItemStack.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        storeBackpackItems();

        return itemstack;
    }

    @Override
    public boolean stillValid(@NotNull Player player) {
        return this.container.stillValid(player);
    }

    @Override
    public void clicked(int slotId, int button, @NotNull ClickType clickType, @NotNull Player player) {
        if (itemStack.isEmpty() || isItemBackpackInUse(slotId, clickType, button)) {
            return;
        }

        super.clicked(slotId, button, clickType, player);

        storeBackpackItems();
    }

    private boolean isItemBackpackInUse(int slotId, ClickType clickType, int button) {
        var containerSize = container.getContainerSize();
        var playerInventoryContainerSize = 27;
        var hotbarSize = 9;
        var hotbarStartIndex = containerSize + playerInventoryContainerSize;
        var hotbarEndIndex = hotbarStartIndex + hotbarSize - 1;
        var isSlotIdWithinHotbarBounds = slotId >= hotbarStartIndex && slotId <= hotbarEndIndex;

        return (isSlotIdWithinHotbarBounds && playerInventory.getItem(slotId - containerSize - playerInventoryContainerSize) == itemStack) ||
                (slotId >= 9 && clickType.equals(ClickType.SWAP) && playerInventory.getItem(button) == itemStack);
    }

    @Override
    public void removed(@NotNull Player player) {
        super.removed(player);
        storeBackpackItems();
        this.container.stopOpen(player);
    }

    private void storeBackpackItems() {
        List<ItemStack> containerItems = new ArrayList<>();

        for (int i = 0; i < container.getContainerSize(); i++) {
            containerItems.add(container.getItem(i));
        }

        itemStack.set(DataComponents.CONTAINER, ItemContainerContents.fromItems(containerItems));
    }

    public int getRowCount() {
        return this.containerRows;
    }

    public BackpackMaterial getBackpackMaterial() {
        return backpackMaterial;
    }

    public DyeColor getDyeColor() {
        return dyeColor;
    }
}
