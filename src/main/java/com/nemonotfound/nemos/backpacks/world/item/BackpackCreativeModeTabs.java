package com.nemonotfound.nemos.backpacks.world.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;
import static com.nemonotfound.nemos.backpacks.world.item.BackpackItems.*;

public class BackpackCreativeModeTabs {

    public static void init() {
        var creativeModeTab = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                .title(Component.translatable("itemGroup." + MOD_ID))
                .icon(() -> new ItemStack(GOLDEN_BACKPACK))
                .displayItems((_, output) -> {
                    output.accept(BACKPACK);
                    output.accept(COPPER_BACKPACK);
                    output.accept(IRON_BACKPACK);
                    output.accept(GOLDEN_BACKPACK);
                    output.accept(DIAMOND_BACKPACK);
                    output.accept(NETHERITE_BACKPACK);
                    output.accept(DYED_BACKPACK.white());
                    output.accept(DYED_COPPER_BACKPACK.white());
                    output.accept(DYED_IRON_BACKPACK.white());
                    output.accept(DYED_GOLDEN_BACKPACK.white());
                    output.accept(DYED_DIAMOND_BACKPACK.white());
                    output.accept(DYED_NETHERITE_BACKPACK.white());
                    output.accept(DYED_BACKPACK.lightGray());
                    output.accept(DYED_COPPER_BACKPACK.lightGray());
                    output.accept(DYED_IRON_BACKPACK.lightGray());
                    output.accept(DYED_GOLDEN_BACKPACK.lightGray());
                    output.accept(DYED_DIAMOND_BACKPACK.lightGray());
                    output.accept(DYED_NETHERITE_BACKPACK.lightGray());
                    output.accept(DYED_BACKPACK.gray());
                    output.accept(DYED_COPPER_BACKPACK.gray());
                    output.accept(DYED_IRON_BACKPACK.gray());
                    output.accept(DYED_GOLDEN_BACKPACK.gray());
                    output.accept(DYED_DIAMOND_BACKPACK.gray());
                    output.accept(DYED_NETHERITE_BACKPACK.gray());
                    output.accept(DYED_BACKPACK.black());
                    output.accept(DYED_COPPER_BACKPACK.black());
                    output.accept(DYED_IRON_BACKPACK.black());
                    output.accept(DYED_GOLDEN_BACKPACK.black());
                    output.accept(DYED_DIAMOND_BACKPACK.black());
                    output.accept(DYED_NETHERITE_BACKPACK.black());
                    output.accept(DYED_BACKPACK.brown());
                    output.accept(DYED_COPPER_BACKPACK.brown());
                    output.accept(DYED_IRON_BACKPACK.brown());
                    output.accept(DYED_GOLDEN_BACKPACK.brown());
                    output.accept(DYED_DIAMOND_BACKPACK.brown());
                    output.accept(DYED_NETHERITE_BACKPACK.brown());
                    output.accept(DYED_BACKPACK.red());
                    output.accept(DYED_COPPER_BACKPACK.red());
                    output.accept(DYED_IRON_BACKPACK.red());
                    output.accept(DYED_GOLDEN_BACKPACK.red());
                    output.accept(DYED_DIAMOND_BACKPACK.red());
                    output.accept(DYED_NETHERITE_BACKPACK.red());
                    output.accept(DYED_BACKPACK.orange());
                    output.accept(DYED_COPPER_BACKPACK.orange());
                    output.accept(DYED_IRON_BACKPACK.orange());
                    output.accept(DYED_GOLDEN_BACKPACK.orange());
                    output.accept(DYED_DIAMOND_BACKPACK.orange());
                    output.accept(DYED_NETHERITE_BACKPACK.orange());
                    output.accept(DYED_BACKPACK.yellow());
                    output.accept(DYED_COPPER_BACKPACK.yellow());
                    output.accept(DYED_IRON_BACKPACK.yellow());
                    output.accept(DYED_GOLDEN_BACKPACK.yellow());
                    output.accept(DYED_DIAMOND_BACKPACK.yellow());
                    output.accept(DYED_NETHERITE_BACKPACK.yellow());
                    output.accept(DYED_BACKPACK.lime());
                    output.accept(DYED_COPPER_BACKPACK.lime());
                    output.accept(DYED_IRON_BACKPACK.lime());
                    output.accept(DYED_GOLDEN_BACKPACK.lime());
                    output.accept(DYED_DIAMOND_BACKPACK.lime());
                    output.accept(DYED_NETHERITE_BACKPACK.lime());
                    output.accept(DYED_BACKPACK.green());
                    output.accept(DYED_COPPER_BACKPACK.green());
                    output.accept(DYED_IRON_BACKPACK.green());
                    output.accept(DYED_GOLDEN_BACKPACK.green());
                    output.accept(DYED_DIAMOND_BACKPACK.green());
                    output.accept(DYED_NETHERITE_BACKPACK.green());
                    output.accept(DYED_BACKPACK.cyan());
                    output.accept(DYED_COPPER_BACKPACK.cyan());
                    output.accept(DYED_IRON_BACKPACK.cyan());
                    output.accept(DYED_GOLDEN_BACKPACK.cyan());
                    output.accept(DYED_DIAMOND_BACKPACK.cyan());
                    output.accept(DYED_NETHERITE_BACKPACK.cyan());
                    output.accept(DYED_BACKPACK.lightBlue());
                    output.accept(DYED_COPPER_BACKPACK.lightBlue());
                    output.accept(DYED_IRON_BACKPACK.lightBlue());
                    output.accept(DYED_GOLDEN_BACKPACK.lightBlue());
                    output.accept(DYED_DIAMOND_BACKPACK.lightBlue());
                    output.accept(DYED_NETHERITE_BACKPACK.lightBlue());
                    output.accept(DYED_BACKPACK.blue());
                    output.accept(DYED_COPPER_BACKPACK.blue());
                    output.accept(DYED_IRON_BACKPACK.blue());
                    output.accept(DYED_GOLDEN_BACKPACK.blue());
                    output.accept(DYED_DIAMOND_BACKPACK.blue());
                    output.accept(DYED_NETHERITE_BACKPACK.blue());
                    output.accept(DYED_BACKPACK.purple());
                    output.accept(DYED_COPPER_BACKPACK.purple());
                    output.accept(DYED_IRON_BACKPACK.purple());
                    output.accept(DYED_GOLDEN_BACKPACK.purple());
                    output.accept(DYED_DIAMOND_BACKPACK.purple());
                    output.accept(DYED_NETHERITE_BACKPACK.purple());
                    output.accept(DYED_BACKPACK.magenta());
                    output.accept(DYED_COPPER_BACKPACK.magenta());
                    output.accept(DYED_IRON_BACKPACK.magenta());
                    output.accept(DYED_GOLDEN_BACKPACK.magenta());
                    output.accept(DYED_DIAMOND_BACKPACK.magenta());
                    output.accept(DYED_NETHERITE_BACKPACK.magenta());
                    output.accept(DYED_BACKPACK.pink());
                    output.accept(DYED_COPPER_BACKPACK.pink());
                    output.accept(DYED_IRON_BACKPACK.pink());
                    output.accept(DYED_GOLDEN_BACKPACK.pink());
                    output.accept(DYED_DIAMOND_BACKPACK.pink());
                    output.accept(DYED_NETHERITE_BACKPACK.pink());
                })
                .build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, MOD_ID), creativeModeTab);
    }
}
