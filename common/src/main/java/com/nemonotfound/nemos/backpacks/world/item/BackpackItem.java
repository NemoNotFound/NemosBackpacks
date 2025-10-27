package com.nemonotfound.nemos.backpacks.world.item;

import com.nemonotfound.nemos.backpacks.tags.BackpackItemTags;
import com.nemonotfound.nemos.backpacks.world.inventory.BackpackMenu;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

public class BackpackItem extends Item {

    private static final Component TITLE = Component.translatable(MOD_ID + ".container.backpack");
    private final BackpackMaterial backpackMaterial;
    private final DyeColor dyeColor;

    public BackpackItem(Properties properties, BackpackMaterial backpackMaterial, DyeColor dyeColor) {
        super(properties);
        this.backpackMaterial = backpackMaterial;
        this.dyeColor = dyeColor;
    }

    @Override
    public @NotNull InteractionResult use(@NotNull Level level, Player player, @NotNull InteractionHand interactionHand) {
        player.openMenu(createScreenHandlerFactory(player, interactionHand));
        player.awardStat(Stats.ITEM_USED.get(this));

        return InteractionResult.SUCCESS;
    }

    @Nullable
    public MenuProvider createScreenHandlerFactory(Player player, @NotNull InteractionHand interactionHand) {
        var itemStack = player.getItemInHand(interactionHand);
        var components = itemStack.getComponents();
        var itemContainerContents = components.getOrDefault(DataComponents.CONTAINER, ItemContainerContents.EMPTY);
        var slotCountPerRow = 9;
        var container = new SimpleContainer(slotCountPerRow * getRowCount());
        var items = itemContainerContents.stream().toList();

        for (int i = 0; i < items.size(); i++) {
            container.setItem(i, items.get(i));
        }

        return new SimpleMenuProvider(
                (syncId, playerInventory, player1) -> switch (backpackMaterial) {
                    case STRING -> {
                        if (dyeColor == null) {
                            yield BackpackMenu.defaultBackpack(syncId, playerInventory, itemStack, container);
                        } else {
                            yield switch (dyeColor) {
                                case WHITE -> BackpackMenu.defaultWhiteBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_GRAY -> BackpackMenu.defaultLightGrayBackpack(syncId, playerInventory, itemStack, container);
                                case GRAY -> BackpackMenu.defaultGrayBackpack(syncId, playerInventory, itemStack, container);
                                case BLACK -> BackpackMenu.defaultBlackBackpack(syncId, playerInventory, itemStack, container);
                                case BROWN -> BackpackMenu.defaultBrownBackpack(syncId, playerInventory, itemStack, container);
                                case RED -> BackpackMenu.defaultRedBackpack(syncId, playerInventory, itemStack, container);
                                case ORANGE -> BackpackMenu.defaultOrangeBackpack(syncId, playerInventory, itemStack, container);
                                case YELLOW -> BackpackMenu.defaultYellowBackpack(syncId, playerInventory, itemStack, container);
                                case LIME -> BackpackMenu.defaultLimeBackpack(syncId, playerInventory, itemStack, container);
                                case GREEN -> BackpackMenu.defaultGreenBackpack(syncId, playerInventory, itemStack, container);
                                case CYAN -> BackpackMenu.defaultCyanBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_BLUE -> BackpackMenu.defaultLightBlueBackpack(syncId, playerInventory, itemStack, container);
                                case BLUE -> BackpackMenu.defaultBlueBackpack(syncId, playerInventory, itemStack, container);
                                case PURPLE -> BackpackMenu.defaultPurpleBackpack(syncId, playerInventory, itemStack, container);
                                case MAGENTA -> BackpackMenu.defaultMagentaBackpack(syncId, playerInventory, itemStack, container);
                                case PINK -> BackpackMenu.defaultPinkBackpack(syncId, playerInventory, itemStack, container);
                            };
                        }
                    }

                    case COPPER -> {
                        if (dyeColor == null) {
                            yield BackpackMenu.copperBackpack(syncId, playerInventory, itemStack, container);
                        } else {
                            yield switch (dyeColor) {
                                case WHITE -> BackpackMenu.copperWhiteBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_GRAY -> BackpackMenu.copperLightGrayBackpack(syncId, playerInventory, itemStack, container);
                                case GRAY -> BackpackMenu.copperGrayBackpack(syncId, playerInventory, itemStack, container);
                                case BLACK -> BackpackMenu.copperBlackBackpack(syncId, playerInventory, itemStack, container);
                                case BROWN -> BackpackMenu.copperBrownBackpack(syncId, playerInventory, itemStack, container);
                                case RED -> BackpackMenu.copperRedBackpack(syncId, playerInventory, itemStack, container);
                                case ORANGE -> BackpackMenu.copperOrangeBackpack(syncId, playerInventory, itemStack, container);
                                case YELLOW -> BackpackMenu.copperYellowBackpack(syncId, playerInventory, itemStack, container);
                                case LIME -> BackpackMenu.copperLimeBackpack(syncId, playerInventory, itemStack, container);
                                case GREEN -> BackpackMenu.copperGreenBackpack(syncId, playerInventory, itemStack, container);
                                case CYAN -> BackpackMenu.copperCyanBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_BLUE -> BackpackMenu.copperLightBlueBackpack(syncId, playerInventory, itemStack, container);
                                case BLUE -> BackpackMenu.copperBlueBackpack(syncId, playerInventory, itemStack, container);
                                case PURPLE -> BackpackMenu.copperPurpleBackpack(syncId, playerInventory, itemStack, container);
                                case MAGENTA -> BackpackMenu.copperMagentaBackpack(syncId, playerInventory, itemStack, container);
                                case PINK -> BackpackMenu.copperPinkBackpack(syncId, playerInventory, itemStack, container);
                            };
                        }
                    }
                    case IRON -> {
                        if (dyeColor == null) {
                            yield BackpackMenu.ironBackpack(syncId, playerInventory, itemStack, container);
                        } else {
                            yield switch (dyeColor) {
                                case WHITE -> BackpackMenu.ironWhiteBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_GRAY -> BackpackMenu.ironLightGrayBackpack(syncId, playerInventory, itemStack, container);
                                case GRAY -> BackpackMenu.ironGrayBackpack(syncId, playerInventory, itemStack, container);
                                case BLACK -> BackpackMenu.ironBlackBackpack(syncId, playerInventory, itemStack, container);
                                case BROWN -> BackpackMenu.ironBrownBackpack(syncId, playerInventory, itemStack, container);
                                case RED -> BackpackMenu.ironRedBackpack(syncId, playerInventory, itemStack, container);
                                case ORANGE -> BackpackMenu.ironOrangeBackpack(syncId, playerInventory, itemStack, container);
                                case YELLOW -> BackpackMenu.ironYellowBackpack(syncId, playerInventory, itemStack, container);
                                case LIME -> BackpackMenu.ironLimeBackpack(syncId, playerInventory, itemStack, container);
                                case GREEN -> BackpackMenu.ironGreenBackpack(syncId, playerInventory, itemStack, container);
                                case CYAN -> BackpackMenu.ironCyanBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_BLUE -> BackpackMenu.ironLightBlueBackpack(syncId, playerInventory, itemStack, container);
                                case BLUE -> BackpackMenu.ironBlueBackpack(syncId, playerInventory, itemStack, container);
                                case PURPLE -> BackpackMenu.ironPurpleBackpack(syncId, playerInventory, itemStack, container);
                                case MAGENTA -> BackpackMenu.ironMagentaBackpack(syncId, playerInventory, itemStack, container);
                                case PINK -> BackpackMenu.ironPinkBackpack(syncId, playerInventory, itemStack, container);
                            };
                        }
                    }
                    case GOLD -> {
                        if (dyeColor == null) {
                            yield BackpackMenu.goldenBackpack(syncId, playerInventory, itemStack, container);
                        } else {
                            yield switch (dyeColor) {
                                case WHITE -> BackpackMenu.goldenWhiteBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_GRAY -> BackpackMenu.goldenLightGrayBackpack(syncId, playerInventory, itemStack, container);
                                case GRAY -> BackpackMenu.goldenGrayBackpack(syncId, playerInventory, itemStack, container);
                                case BLACK -> BackpackMenu.goldenBlackBackpack(syncId, playerInventory, itemStack, container);
                                case BROWN -> BackpackMenu.goldenBrownBackpack(syncId, playerInventory, itemStack, container);
                                case RED -> BackpackMenu.goldenRedBackpack(syncId, playerInventory, itemStack, container);
                                case ORANGE -> BackpackMenu.goldenOrangeBackpack(syncId, playerInventory, itemStack, container);
                                case YELLOW -> BackpackMenu.goldenYellowBackpack(syncId, playerInventory, itemStack, container);
                                case LIME -> BackpackMenu.goldenLimeBackpack(syncId, playerInventory, itemStack, container);
                                case GREEN -> BackpackMenu.goldenGreenBackpack(syncId, playerInventory, itemStack, container);
                                case CYAN -> BackpackMenu.goldenCyanBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_BLUE -> BackpackMenu.goldenLightBlueBackpack(syncId, playerInventory, itemStack, container);
                                case BLUE -> BackpackMenu.goldenBlueBackpack(syncId, playerInventory, itemStack, container);
                                case PURPLE -> BackpackMenu.goldenPurpleBackpack(syncId, playerInventory, itemStack, container);
                                case MAGENTA -> BackpackMenu.goldenMagentaBackpack(syncId, playerInventory, itemStack, container);
                                case PINK -> BackpackMenu.goldenPinkBackpack(syncId, playerInventory, itemStack, container);
                            };
                        }
                    }
                    case DIAMOND -> {
                        if (dyeColor == null) {
                            yield BackpackMenu.diamondBackpack(syncId, playerInventory, itemStack, container);
                        } else {
                            yield switch (dyeColor) {
                                case WHITE -> BackpackMenu.diamondWhiteBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_GRAY -> BackpackMenu.diamondLightGrayBackpack(syncId, playerInventory, itemStack, container);
                                case GRAY -> BackpackMenu.diamondGrayBackpack(syncId, playerInventory, itemStack, container);
                                case BLACK -> BackpackMenu.diamondBlackBackpack(syncId, playerInventory, itemStack, container);
                                case BROWN -> BackpackMenu.diamondBrownBackpack(syncId, playerInventory, itemStack, container);
                                case RED -> BackpackMenu.diamondRedBackpack(syncId, playerInventory, itemStack, container);
                                case ORANGE -> BackpackMenu.diamondOrangeBackpack(syncId, playerInventory, itemStack, container);
                                case YELLOW -> BackpackMenu.diamondYellowBackpack(syncId, playerInventory, itemStack, container);
                                case LIME -> BackpackMenu.diamondLimeBackpack(syncId, playerInventory, itemStack, container);
                                case GREEN -> BackpackMenu.diamondGreenBackpack(syncId, playerInventory, itemStack, container);
                                case CYAN -> BackpackMenu.diamondCyanBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_BLUE -> BackpackMenu.diamondLightBlueBackpack(syncId, playerInventory, itemStack, container);
                                case BLUE -> BackpackMenu.diamondBlueBackpack(syncId, playerInventory, itemStack, container);
                                case PURPLE -> BackpackMenu.diamondPurpleBackpack(syncId, playerInventory, itemStack, container);
                                case MAGENTA -> BackpackMenu.diamondMagentaBackpack(syncId, playerInventory, itemStack, container);
                                case PINK -> BackpackMenu.diamondPinkBackpack(syncId, playerInventory, itemStack, container);
                            };
                        }
                    }
                    case NETHERITE -> {
                        if (dyeColor == null) {
                            yield BackpackMenu.netheriteBackpack(syncId, playerInventory, itemStack, container);
                        } else {
                            yield switch (dyeColor) {
                                case WHITE -> BackpackMenu.netheriteWhiteBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_GRAY -> BackpackMenu.netheriteLightGrayBackpack(syncId, playerInventory, itemStack, container);
                                case GRAY -> BackpackMenu.netheriteGrayBackpack(syncId, playerInventory, itemStack, container);
                                case BLACK -> BackpackMenu.netheriteBlackBackpack(syncId, playerInventory, itemStack, container);
                                case BROWN -> BackpackMenu.netheriteBrownBackpack(syncId, playerInventory, itemStack, container);
                                case RED -> BackpackMenu.netheriteRedBackpack(syncId, playerInventory, itemStack, container);
                                case ORANGE -> BackpackMenu.netheriteOrangeBackpack(syncId, playerInventory, itemStack, container);
                                case YELLOW -> BackpackMenu.netheriteYellowBackpack(syncId, playerInventory, itemStack, container);
                                case LIME -> BackpackMenu.netheriteLimeBackpack(syncId, playerInventory, itemStack, container);
                                case GREEN -> BackpackMenu.netheriteGreenBackpack(syncId, playerInventory, itemStack, container);
                                case CYAN -> BackpackMenu.netheriteCyanBackpack(syncId, playerInventory, itemStack, container);
                                case LIGHT_BLUE -> BackpackMenu.netheriteLightBlueBackpack(syncId, playerInventory, itemStack, container);
                                case BLUE -> BackpackMenu.netheriteBlueBackpack(syncId, playerInventory, itemStack, container);
                                case PURPLE -> BackpackMenu.netheritePurpleBackpack(syncId, playerInventory, itemStack, container);
                                case MAGENTA -> BackpackMenu.netheriteMagentaBackpack(syncId, playerInventory, itemStack, container);
                                case PINK -> BackpackMenu.netheritePinkBackpack(syncId, playerInventory, itemStack, container);
                            };
                        }
                    }
                },
                TITLE
        );
    }

    @Override
    public void onDestroyed(ItemEntity itemEntity) {
        var itemContainerContents = this.components().getOrDefault(DataComponents.CONTAINER, ItemContainerContents.EMPTY);

        itemEntity.getItem().set(DataComponents.CONTAINER, ItemContainerContents.EMPTY);
        ItemUtils.onContainerDestroyed(itemEntity, itemContainerContents.nonEmptyItemsCopy());
    }

    public boolean overrideStackedOnOther(@NotNull ItemStack backpack, @NotNull Slot slot, @NotNull ClickAction action, @NotNull Player player) {
        return overrideStackingLogic(backpack, slot.getItem(), slot, false, action, player);
    }

    public boolean overrideOtherStackedOnMe(@NotNull ItemStack backpack, @NotNull ItemStack other, @NotNull Slot slot, @NotNull ClickAction action, @NotNull Player player, @NotNull SlotAccess access) {
        return overrideStackingLogic(backpack, other, slot, true, action, player);
    }

    private boolean overrideStackingLogic(ItemStack backpack, ItemStack other, Slot slot, boolean isSlotModified, ClickAction action, Player player) {
        if (other.is(BackpackItemTags.BACKPACKS) || action != ClickAction.PRIMARY || other.isEmpty()) {
            return false;
        }

        var itemContainerContents = backpack.get(DataComponents.CONTAINER);

        if (itemContainerContents == null) {
            return false;
        }

        var container = getContainer(itemContainerContents);

        if ((!isSlotModified || slot.allowModification(player)) && tryMoveItem(container, other)) {
            playInsertSound(player);
        } else {
            playInsertFailSound(player);
        }

        storeItemsIntoBackpack(container, backpack, player);

        return true;
    }

    private SimpleContainer getContainer(ItemContainerContents itemContainerContents) {
        var slotCountPerRow = 9;
        var container = new SimpleContainer(slotCountPerRow * getRowCount());
        var items = itemContainerContents.stream().toList();

        for (int i = 0; i < items.size(); i++) {
            container.setItem(i, items.get(i));
        }

        return container;
    }

    private boolean tryMoveItem(SimpleContainer container, ItemStack itemToMove) {
        var remainingStack = container.addItem(itemToMove);
        var itemWasMoved = remainingStack.isEmpty() || remainingStack.getCount() != itemToMove.getCount();

        if (!itemWasMoved) {
            return false;
        }

        itemToMove.setCount(remainingStack.getCount());

        return true;
    }

    private void playInsertSound(Entity entity) {
        entity.playSound(SoundEvents.BUNDLE_INSERT, 0.8F, 0.8F + entity.level().getRandom().nextFloat() * 0.4F);
    }

    private void playInsertFailSound(Entity entity) {
        entity.playSound(SoundEvents.BUNDLE_INSERT_FAIL, 1.0F, 1.0F);
    }

    private void storeItemsIntoBackpack(SimpleContainer container, ItemStack backpack, Player player) {
        var containerItems = new ArrayList<ItemStack>();

        for (int i = 0; i < container.getContainerSize(); i++) {
            containerItems.add(container.getItem(i));
        }

        backpack.set(DataComponents.CONTAINER, ItemContainerContents.fromItems(containerItems));
        this.broadcastChangesOnContainerMenu(player);
    }

    private void broadcastChangesOnContainerMenu(Player player) {
        AbstractContainerMenu abstractContainerMenu = player.containerMenu;
        abstractContainerMenu.slotsChanged(player.getInventory());
    }

    private int getRowCount() {
        return switch (backpackMaterial) {
            case STRING -> 1;
            case COPPER -> 2;
            case IRON -> 3;
            case GOLD -> 4;
            case DIAMOND -> 5;
            case NETHERITE -> 6;
        };
    }

    public static Item getByColorAndBackpackMaterial(DyeColor color, BackpackMaterial backpackMaterial) {
        var resourceLocation = ResourceLocation.fromNamespaceAndPath(MOD_ID, getItemName(color, backpackMaterial));
        var item = BuiltInRegistries.ITEM.getValue(resourceLocation);

        if (item == Items.AIR) {
            throw new IllegalArgumentException("Missing item: " + resourceLocation);
        }

        return item;
    }

    public static Item getByBackpackMaterial(BackpackMaterial backpackMaterial) {
        var resourceLocation = ResourceLocation.fromNamespaceAndPath(MOD_ID, getItemName(backpackMaterial));
        var item = BuiltInRegistries.ITEM.getValue(resourceLocation);

        if (item == Items.AIR) {
            throw new IllegalArgumentException("Missing item: " + resourceLocation);
        }

        return item;
    }

    private static String getItemName(DyeColor color, BackpackMaterial backpackMaterial) {
        var materialPrefix = switch (backpackMaterial) {
            case STRING -> "";
            case COPPER -> "copper";
            case IRON -> "iron";
            case GOLD -> "golden";
            case DIAMOND -> "diamond";
            case NETHERITE -> "netherite";
        };

        return color.getName() + (!materialPrefix.isEmpty() ? "_" + materialPrefix : "") + "_backpack";
    }

    private static String getItemName(BackpackMaterial backpackMaterial) {
        var materialPrefix = switch (backpackMaterial) {
            case STRING -> "";
            case COPPER -> "copper";
            case IRON -> "iron";
            case GOLD -> "golden";
            case DIAMOND -> "diamond";
            case NETHERITE -> "netherite";
        };

        return (!materialPrefix.isEmpty() ? materialPrefix + "_" : "") + "backpack";
    }
}
