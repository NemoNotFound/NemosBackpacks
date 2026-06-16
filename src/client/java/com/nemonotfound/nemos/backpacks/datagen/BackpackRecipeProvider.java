package com.nemonotfound.nemos.backpacks.datagen;

import com.nemonotfound.nemos.backpacks.tags.BackpackItemTags;
import com.nemonotfound.nemos.backpacks.world.item.BackpackItem;
import com.nemonotfound.nemos.backpacks.world.item.BackpackItems;
import com.nemonotfound.nemos.backpacks.world.item.BackpackMaterial;
import com.nemonotfound.nemos.upgrade.templates.world.item.UpgradeTemplateItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class BackpackRecipeProvider extends FabricRecipeProvider {

    public BackpackRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider, @NonNull RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                this.shaped(RecipeCategory.TOOLS, BackpackItems.BACKPACK)
                        .define('-', Items.STRING)
                        .define('#', Items.LEATHER)
                        .pattern("###")
                        .pattern("#-#")
                        .pattern("###")
                        .unlockedBy("has_leather", this.has(Items.LEATHER))
                        .save(this.output);

                backpackDyeRecipes(BackpackItemTags.DEFAULT_BACKPACKS, BackpackMaterial.STRING, "");
                backpackDyeRecipes(BackpackItemTags.COPPER_BACKPACKS, BackpackMaterial.COPPER, "copper");
                backpackDyeRecipes(BackpackItemTags.IRON_BACKPACKS, BackpackMaterial.IRON, "iron");
                backpackDyeRecipes(BackpackItemTags.GOLDEN_BACKPACKS, BackpackMaterial.GOLD, "golden");
                backpackDyeRecipes(BackpackItemTags.DIAMOND_BACKPACKS, BackpackMaterial.DIAMOND, "diamond");
                backpackDyeRecipes(BackpackItemTags.NETHERITE_BACKPACKS, BackpackMaterial.NETHERITE, "netherite");

                backpackSmithingRecipes(BackpackMaterial.STRING, UpgradeTemplateItems.COPPER_UPGRADE_SMITHING_TEMPLATE, ItemTags.COPPER_TOOL_MATERIALS, "has_copper_ingot");
                backpackSmithingRecipes(BackpackMaterial.COPPER, UpgradeTemplateItems.IRON_UPGRADE_SMITHING_TEMPLATE, ItemTags.IRON_TOOL_MATERIALS, "has_iron_ingot");
                backpackSmithingRecipes(BackpackMaterial.IRON, UpgradeTemplateItems.GOLD_UPGRADE_SMITHING_TEMPLATE, ItemTags.GOLD_TOOL_MATERIALS, "has_gold_ingot");
                backpackSmithingRecipes(BackpackMaterial.GOLD, UpgradeTemplateItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE, ItemTags.DIAMOND_TOOL_MATERIALS, "has_diamond");
                backpackSmithingRecipes(BackpackMaterial.DIAMOND, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ItemTags.NETHERITE_TOOL_MATERIALS, "has_netherite_ingot");
            }

            private void backpackDyeRecipes(TagKey<Item> ingredientTag, BackpackMaterial backpackMaterial, String groupPrefix) {
                var ingredient = this.tag(ingredientTag);

                if (!groupPrefix.isEmpty()) {
                    groupPrefix = groupPrefix + "_";
                }

                backpackDyeRecipe(ingredient, Items.DYE.white(), DyeColor.WHITE, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.orange(), DyeColor.ORANGE, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.magenta(), DyeColor.MAGENTA, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.lightBlue(), DyeColor.LIGHT_BLUE, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.yellow(), DyeColor.YELLOW, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.lime(), DyeColor.LIME, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.pink(), DyeColor.PINK, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.gray(), DyeColor.GRAY, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.lightGray(), DyeColor.LIGHT_GRAY, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.cyan(), DyeColor.CYAN, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.purple(), DyeColor.PURPLE, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.blue(), DyeColor.BLUE, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.brown(), DyeColor.BROWN, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.green(), DyeColor.GREEN, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.red(), DyeColor.RED, backpackMaterial, groupPrefix);
                backpackDyeRecipe(ingredient, Items.DYE.black(), DyeColor.BLACK, backpackMaterial, groupPrefix);
            }

            private void backpackDyeRecipe(Ingredient ingredient, Item dyeItem, DyeColor dyeColor, BackpackMaterial backpackMaterial, String groupPrefix) {
                TransmuteRecipeBuilder.transmute(
                                RecipeCategory.TOOLS,
                                ingredient,
                                Ingredient.of(dyeItem),
                                BackpackItem.getByColorAndBackpackMaterial(dyeColor, backpackMaterial)
                        )
                        .group(groupPrefix + "backpack_dye")
                        .unlockedBy(getHasName(dyeItem), this.has(dyeItem))
                        .save(this.output);
            }

            private void backpackSmithingRecipes(BackpackMaterial backpackMaterial, Item smithingTemplate, TagKey<Item> itemTag, String condition) {
                smithing(
                        smithingTemplate,
                        BackpackItem.getByBackpackMaterial(backpackMaterial),
                        itemTag,
                        condition,
                        BackpackItem.getByBackpackMaterial(BackpackMaterial.getNextMaterialLevel(backpackMaterial))
                );

                for (DyeColor dyeColor : DyeColor.values()) {
                    smithing(
                            smithingTemplate,
                            BackpackItem.getByColorAndBackpackMaterial(dyeColor, backpackMaterial),
                            itemTag,
                            condition,
                            BackpackItem.getByColorAndBackpackMaterial(
                                    dyeColor,
                                    BackpackMaterial.getNextMaterialLevel(backpackMaterial)
                            )
                    );
                }
            }

            private void smithing(Item smithingTemplate, Item ingredientItem, TagKey<Item> itemTag, String condition, Item resultItem) {
                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(smithingTemplate),
                                Ingredient.of(ingredientItem),
                                this.tag(itemTag),
                                RecipeCategory.TOOLS,
                                resultItem
                        )
                        .unlocks(condition, this.has(itemTag))
                        .save(this.output, getItemName(resultItem) + "_smithing");
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Backpacks Recipes";
    }
}
