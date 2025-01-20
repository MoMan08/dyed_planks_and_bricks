package net.moman08.dyed_planks_and_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.moman08.dyed_planks_and_bricks.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void offerBrickDyeingRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .input('#', Blocks.BRICKS)
                .input('X', input)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("dyed_bricks")
                .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                .offerTo(exporter);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerBrickDyeingRecipe(recipeExporter, ModBlocks.WHITE_BRICKS, Items.WHITE_DYE);
    }
}
