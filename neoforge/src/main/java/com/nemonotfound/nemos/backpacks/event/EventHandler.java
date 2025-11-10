package com.nemonotfound.nemos.backpacks.event;

import com.nemonotfound.nemos.backpacks.world.item.BackpackItems;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.LootTableLoadEvent;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

@EventBusSubscriber(modid = MOD_ID)
public class EventHandler {

    @SubscribeEvent
    public static void onLootTableLoadEvent(LootTableLoadEvent event) {
        var resourceKey = event.getKey();
        var lootTable = event.getTable();

        if (
                resourceKey == BuiltInLootTables.ABANDONED_MINESHAFT ||
                        resourceKey == BuiltInLootTables.SHIPWRECK_TREASURE ||
                        resourceKey == BuiltInLootTables.SIMPLE_DUNGEON ||
                        resourceKey == BuiltInLootTables.UNDERWATER_RUIN_BIG
        ) {
            lootTable.addPool(createUpgradeTemplateLootPool(5, 2));
        }

        if (resourceKey == BuiltInLootTables.BURIED_TREASURE) {
            lootTable.addPool(createUpgradeTemplateLootPool(2, 5));
        }

        if (resourceKey == BuiltInLootTables.ANCIENT_CITY) {
            lootTable.addPool(createUpgradeTemplateLootPool(5, 9));
        }

        if (
                resourceKey == BuiltInLootTables.DESERT_PYRAMID ||
                        resourceKey == BuiltInLootTables.JUNGLE_TEMPLE ||
                        resourceKey == BuiltInLootTables.PILLAGER_OUTPOST
        ) {
            lootTable.addPool(createUpgradeTemplateLootPool(3, 1));
        }

        if (resourceKey == BuiltInLootTables.UNDERWATER_RUIN_SMALL) {
            lootTable.addPool(createCommonUpgradeTemplateLootPool(2));
        }

        if (
                resourceKey == BuiltInLootTables.VILLAGE_WEAPONSMITH ||
                        resourceKey == BuiltInLootTables.VILLAGE_TOOLSMITH
        ) {
            lootTable.addPool(createCommonUpgradeTemplateLootPool(1));
        }

        if (resourceKey == BuiltInLootTables.WOODLAND_MANSION) {
            lootTable.addPool(createUpgradeTemplateLootPool(4, 6));
        }

        if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_RARE) {
            lootTable.addPool(createRareUpgradeTemplateLootPool(5));
        }

        if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_COMMON) {
            lootTable.addPool(createCommonUpgradeTemplateLootPool(4));
        }

        if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_UNIQUE) {
            lootTable.addPool(createRareUpgradeTemplateLootPool(7));
        }

        if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_OMINOUS_RARE) {
            lootTable.addPool(createRareUpgradeTemplateLootPool(6));
        }

        if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_OMINOUS_COMMON) {
            lootTable.addPool(createCommonUpgradeTemplateLootPool(5));
        }

        if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_OMINOUS_UNIQUE) {
            lootTable.addPool(createRareUpgradeTemplateLootPool(8));
        }
    }

    private static LootPool createCommonUpgradeTemplateLootPool(int commonWeight) {
        var fullWeight = 100;
        var emptyItemWeight = fullWeight - (2 * commonWeight);

        return LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(BackpackItems.COPPER_UPGRADE_SMITHING_TEMPLATE.get()).setWeight(commonWeight))
                .add(LootItem.lootTableItem(BackpackItems.IRON_UPGRADE_SMITHING_TEMPLATE.get()).setWeight(commonWeight))
                .add(EmptyLootItem.emptyItem().setWeight(emptyItemWeight))
                .build();
    }

    private static LootPool createRareUpgradeTemplateLootPool(int rareWeight) {
        var fullWeight = 100;
        var emptyItemWeight = fullWeight - (2 * rareWeight);

        return LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(BackpackItems.GOLD_UPGRADE_SMITHING_TEMPLATE.get()).setWeight(rareWeight))
                .add(LootItem.lootTableItem(BackpackItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get()).setWeight(rareWeight))
                .add(EmptyLootItem.emptyItem().setWeight(emptyItemWeight))
                .build();
    }

    private static LootPool createUpgradeTemplateLootPool(int commonWeight, int rareWeight) {
        var fullWeight = 100;
        var emptyItemWeight = fullWeight - (2 * commonWeight) - (2 * rareWeight);

        return LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(BackpackItems.COPPER_UPGRADE_SMITHING_TEMPLATE.get()).setWeight(commonWeight))
                .add(LootItem.lootTableItem(BackpackItems.IRON_UPGRADE_SMITHING_TEMPLATE.get()).setWeight(commonWeight))
                .add(LootItem.lootTableItem(BackpackItems.GOLD_UPGRADE_SMITHING_TEMPLATE.get()).setWeight(rareWeight))
                .add(LootItem.lootTableItem(BackpackItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE.get()).setWeight(rareWeight))
                .add(EmptyLootItem.emptyItem().setWeight(emptyItemWeight))
                .build();
    }
}
