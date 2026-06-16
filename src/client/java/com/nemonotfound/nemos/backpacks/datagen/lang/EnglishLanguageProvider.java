package com.nemonotfound.nemos.backpacks.datagen.lang;

import com.nemonotfound.nemos.backpacks.world.item.BackpackItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(BackpackItems.BACKPACK, "Backpack");
        translationBuilder.add(BackpackItems.COPPER_BACKPACK, "Copper Backpack");
        translationBuilder.add(BackpackItems.IRON_BACKPACK, "Iron Backpack");
        translationBuilder.add(BackpackItems.GOLDEN_BACKPACK, "Golden Backpack");
        translationBuilder.add(BackpackItems.DIAMOND_BACKPACK, "Diamond Backpack");
        translationBuilder.add(BackpackItems.NETHERITE_BACKPACK, "Netherite Backpack");

        // WHITE
        translationBuilder.add(BackpackItems.DYED_BACKPACK.white(), "White Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.white(), "White Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.white(), "White Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.white(), "White Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.white(), "White Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.white(), "White Netherite Backpack");

        // LIGHT_GRAY
        translationBuilder.add(BackpackItems.DYED_BACKPACK.lightGray(), "Light Gray Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.lightGray(), "Light Gray Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.lightGray(), "Light Gray Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.lightGray(), "Light Gray Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.lightGray(), "Light Gray Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.lightGray(), "Light Gray Netherite Backpack");

        // GRAY
        translationBuilder.add(BackpackItems.DYED_BACKPACK.gray(), "Gray Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.gray(), "Gray Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.gray(), "Gray Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.gray(), "Gray Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.gray(), "Gray Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.gray(), "Gray Netherite Backpack");

        // BLACK
        translationBuilder.add(BackpackItems.DYED_BACKPACK.black(), "Black Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.black(), "Black Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.black(), "Black Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.black(), "Black Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.black(), "Black Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.black(), "Black Netherite Backpack");

        // BROWN
        translationBuilder.add(BackpackItems.DYED_BACKPACK.brown(), "Brown Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.brown(), "Brown Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.brown(), "Brown Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.brown(), "Brown Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.brown(), "Brown Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.brown(), "Brown Netherite Backpack");

        // RED
        translationBuilder.add(BackpackItems.DYED_BACKPACK.red(), "Red Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.red(), "Red Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.red(), "Red Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.red(), "Red Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.red(), "Red Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.red(), "Red Netherite Backpack");

        // ORANGE
        translationBuilder.add(BackpackItems.DYED_BACKPACK.orange(), "Orange Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.orange(), "Orange Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.orange(), "Orange Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.orange(), "Orange Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.orange(), "Orange Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.orange(), "Orange Netherite Backpack");

        // YELLOW
        translationBuilder.add(BackpackItems.DYED_BACKPACK.yellow(), "Yellow Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.yellow(), "Yellow Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.yellow(), "Yellow Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.yellow(), "Yellow Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.yellow(), "Yellow Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.yellow(), "Yellow Netherite Backpack");

        // LIME
        translationBuilder.add(BackpackItems.DYED_BACKPACK.lime(), "Lime Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.lime(), "Lime Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.lime(), "Lime Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.lime(), "Lime Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.lime(), "Lime Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.lime(), "Lime Netherite Backpack");

        // GREEN
        translationBuilder.add(BackpackItems.DYED_BACKPACK.green(), "Green Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.green(), "Green Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.green(), "Green Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.green(), "Green Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.green(), "Green Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.green(), "Green Netherite Backpack");

        // CYAN
        translationBuilder.add(BackpackItems.DYED_BACKPACK.cyan(), "Cyan Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.cyan(), "Cyan Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.cyan(), "Cyan Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.cyan(), "Cyan Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.cyan(), "Cyan Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.cyan(), "Cyan Netherite Backpack");

        // LIGHT_BLUE
        translationBuilder.add(BackpackItems.DYED_BACKPACK.lightBlue(), "Light Blue Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.lightBlue(), "Light Blue Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.lightBlue(), "Light Blue Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.lightBlue(), "Light Blue Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.lightBlue(), "Light Blue Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.lightBlue(), "Light Blue Netherite Backpack");

        // BLUE
        translationBuilder.add(BackpackItems.DYED_BACKPACK.blue(), "Blue Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.blue(), "Blue Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.blue(), "Blue Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.blue(), "Blue Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.blue(), "Blue Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.blue(), "Blue Netherite Backpack");

        // PURPLE
        translationBuilder.add(BackpackItems.DYED_BACKPACK.purple(), "Purple Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.purple(), "Purple Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.purple(), "Purple Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.purple(), "Purple Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.purple(), "Purple Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.purple(), "Purple Netherite Backpack");

        // MAGENTA
        translationBuilder.add(BackpackItems.DYED_BACKPACK.magenta(), "Magenta Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.magenta(), "Magenta Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.magenta(), "Magenta Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.magenta(), "Magenta Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.magenta(), "Magenta Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.magenta(), "Magenta Netherite Backpack");

        // PINK
        translationBuilder.add(BackpackItems.DYED_BACKPACK.pink(), "Pink Backpack");
        translationBuilder.add(BackpackItems.DYED_COPPER_BACKPACK.pink(), "Pink Copper Backpack");
        translationBuilder.add(BackpackItems.DYED_IRON_BACKPACK.pink(), "Pink Iron Backpack");
        translationBuilder.add(BackpackItems.DYED_GOLDEN_BACKPACK.pink(), "Pink Golden Backpack");
        translationBuilder.add(BackpackItems.DYED_DIAMOND_BACKPACK.pink(), "Pink Diamond Backpack");
        translationBuilder.add(BackpackItems.DYED_NETHERITE_BACKPACK.pink(), "Pink Netherite Backpack");

        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Backpacks");
        translationBuilder.add(MOD_ID + ".container.backpack", "Backpack");
        translationBuilder.add("key.category." + MOD_ID + "." + MOD_ID, "Nemo's Backpacks");
        translationBuilder.add(MOD_ID + ".key.swapBackpack", "Swap Backpack With Backpack Slot");
        translationBuilder.add(MOD_ID + ".key.interactBackpack", "Open/Close Backpack");
    }
}
