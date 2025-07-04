package net.phoenixcrew2025.easycreate.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.block.ModBlocks;
import net.phoenixcrew2025.easycreate.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
   private static final List<ItemLike> CORRUPTED_IRON_SMELTABLES = List.of(ModItems.ECREATE_CORRUPTED_RAW_IRON.get(),
           ModBlocks.ECREATE_CORRUPTED_IRON_ORE.get());

    private static final List<ItemLike> CORRUPTED_GOLD_SMELTABLES = List.of(ModItems.ECREATE_CORRUPTED_RAW_GOLD.get(),
            ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get());

    private static final List<ItemLike> CORRUPTED_DIAMOND_SMELTABLES = List.of(ModItems.ECREATE_CORRUPTED_RAW_DIAMOND.get(),
            ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get());

    private static final List<ItemLike> CORRUPTED_EMERALD_SMELTABLES = List.of(ModItems.ECREATE_CORRUPTED_RAW_EMERALD.get(),
            ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, CORRUPTED_IRON_SMELTABLES, RecipeCategory.MISC, ModItems.ECREATE_CORRUPTED_IRON_INGOT.get(), 0.25f, 480, "ecreate_corrupted_iron");
        oreBlasting(pWriter, CORRUPTED_IRON_SMELTABLES, RecipeCategory.MISC, ModItems.ECREATE_CORRUPTED_IRON_INGOT.get(), 0.25f, 180, "ecreate_corrupted_iron");

        oreSmelting(pWriter, CORRUPTED_GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.ECREATE_CORRUPTED_GOLD.get(), 0.25f, 480, "ecreate_corrupted_gold");
        oreBlasting(pWriter, CORRUPTED_GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.ECREATE_CORRUPTED_GOLD.get(), 0.25f, 180, "ecreate_corrupted_gold");

        oreSmelting(pWriter, CORRUPTED_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.ECREATE_CORRUPTED_DIAMOND.get(), 0.25f, 480, "ecreate_corrupted_diamond");
        oreBlasting(pWriter, CORRUPTED_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.ECREATE_CORRUPTED_DIAMOND.get(), 0.25f, 180, "ecreate_corrupted_diamond");

        oreSmelting(pWriter, CORRUPTED_EMERALD_SMELTABLES, RecipeCategory.MISC, ModItems.ECREATE_CORRUPTED_EMERALD.get(), 0.25f, 480, "ecreate_corrupted_emerald");
        oreBlasting(pWriter, CORRUPTED_EMERALD_SMELTABLES, RecipeCategory.MISC, ModItems.ECREATE_CORRUPTED_EMERALD.get(), 0.25f, 180, "ecreate_corrupted_emerald");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ECREATE_CORRUPTED_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.ECREATE_CORRUPTED_IRON_INGOT.get()), has(ModItems.ECREATE_CORRUPTED_IRON_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ECREATE_CORRUPTED_IRON_INGOT.get(), 9)
                .requires(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get()), has(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get()))
                .save(pWriter);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  EasyCreate.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
