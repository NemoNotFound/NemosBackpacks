package com.nemonotfound.nemos.backpacks.world.inventory;

import com.nemonotfound.nemos.backpacks.core.component.BackpacksDataComponents;
import com.nemonotfound.nemos.backpacks.helper.Backpacker;
import com.nemonotfound.nemos.backpacks.world.item.BackpackItem;
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

    public static BackpackMenu defaultBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_BACKPACK.get(), containerId, playerInventory, 1);
    }

    public static BackpackMenu defaultBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DEFAULT_BACKPACK.get(), containerId, playerInventory, itemStack, container, 1);
    }

    public static BackpackMenu copperBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_BACKPACK.get(), containerId, playerInventory, 2);
    }

    public static BackpackMenu copperBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.COPPER_BACKPACK.get(), containerId, playerInventory, itemStack, container, 2);
    }

    public static BackpackMenu ironBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.IRON_BACKPACK.get(), containerId, playerInventory, 3);
    }

    public static BackpackMenu ironBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.IRON_BACKPACK.get(), containerId, playerInventory, itemStack, container, 3);
    }

    public static BackpackMenu goldenBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_BACKPACK.get(), containerId, playerInventory, 4);
    }

    public static BackpackMenu goldenBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.GOLDEN_BACKPACK.get(), containerId, playerInventory, itemStack, container, 4);
    }

    public static BackpackMenu diamondBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_BACKPACK.get(), containerId, playerInventory, 5);
    }

    public static BackpackMenu diamondBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.DIAMOND_BACKPACK.get(), containerId, playerInventory, itemStack, container, 5);
    }

    public static BackpackMenu netheriteBackpack(int containerId, Inventory playerInventory) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_BACKPACK.get(), containerId, playerInventory, 6);
    }

    public static BackpackMenu netheriteBackpack(int containerId, Inventory playerInventory, ItemStack itemStack, Container container) {
        return new BackpackMenu(BackpackMenuTypes.NETHERITE_BACKPACK.get(), containerId, playerInventory, itemStack, container, 6);
    }

    private BackpackMenu(MenuType<?> menuType, int containerId, Inventory playerInventory, int rows) {
        this(menuType, containerId, playerInventory, ((Backpacker) playerInventory.player).nemosBackpacks$getLastOpenedBackpack(), new SimpleContainer(9 * rows), rows);
    }

    public BackpackMenu(@Nullable MenuType<?> menuType, int containerId, Inventory playerInventory, ItemStack itemStack, Container container, int rows) {
        super(menuType, containerId);
        checkContainerSize(container, rows * SLOTS_PER_ROW);
        this.container = container;
        this.containerRows = rows;
        this.itemStack = itemStack;
        this.playerInventory = playerInventory;
        container.startOpen(playerInventory.player);

        var xOffset = 8;
        var yOffset = 18;
        var gapBetweenContainerAndInventory = 13;

        this.addBackpackGrid(container, xOffset, yOffset);
        int inventoryYOffset = yOffset + this.containerRows * yOffset + gapBetweenContainerAndInventory;
        this.addStandardInventorySlots(playerInventory, xOffset, inventoryYOffset);
    }

    private void addBackpackGrid(Container container, int xOffset, int yOffset) {
        for (int rowIndex = 0; rowIndex < this.containerRows; rowIndex++) {
            for (int slotIndex = 0; slotIndex < SLOTS_PER_ROW; slotIndex++) {
                this.addSlot(new BackpackSlot(container, slotIndex + rowIndex * SLOTS_PER_ROW, xOffset + slotIndex * yOffset, yOffset + rowIndex * yOffset));
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
        if (!clickType.equals(ClickType.CLONE) && isItemBackpackInUse(slotId, clickType, button)) {
            return;
        }

        super.clicked(slotId, button, clickType, player);

        storeBackpackItems();
    }

    private boolean isItemBackpackInUse(int slotId, ClickType clickType, int button) {
        var containerSize = container.getContainerSize();

        if (slotId < containerSize) {
            return false;
        }

        var inventoryContainerSize = 27;
        var hotbarStartIndex = containerSize + inventoryContainerSize;
        var hotbarEndIndex = hotbarStartIndex + SLOTS_PER_ROW - 1;
        var isSlotIdWithinHotbarBounds = slotId >= hotbarStartIndex && slotId <= hotbarEndIndex;
        var inventorySlotId = isSlotIdWithinHotbarBounds ? slotId - hotbarStartIndex : slotId - containerSize + SLOTS_PER_ROW;
        var item = playerInventory.getItem(inventorySlotId);

        if (clickType.equals(ClickType.SWAP)) {
            var itemToSwap = playerInventory.getItem(button);

            return isBackpackOpen(itemToSwap) || isBackpackOpen(item);
        }

        return isBackpackOpen(item);
    }

    private boolean isBackpackOpen(ItemStack itemStack) {
        return Boolean.TRUE.equals(itemStack.getOrDefault(BackpacksDataComponents.IS_BACKPACK_OPEN.get(), false));
    }

    @Override
    public void removed(@NotNull Player player) {
        super.removed(player);
        storeBackpackItems();
        this.container.stopOpen(player);
        itemStack.set(BackpacksDataComponents.IS_BACKPACK_OPEN.get(), false);
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
        var item = itemStack.getItem();

        if (!(item instanceof BackpackItem)) {
            return null;
        }

        return ((BackpackItem) item).getBackpackMaterial();
    }

    public DyeColor getDyeColor() {
        var item = itemStack.getItem();

        if (!(item instanceof BackpackItem)) {
            return null;
        }

        return ((BackpackItem) item).getDyeColor();
    }
}