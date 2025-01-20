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
    public static void offerBrickStairsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, output, input, 1);
    }
    public static void offerBrickSlabRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .input('#', input)
                .pattern("   ")
                .pattern("   ")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, output, input, 2);
    }
    public static void offerBrickWallRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .input('#', input)
                .pattern("   ")
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, output, input, 1);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerBrickStairsRecipe(recipeExporter, ModBlocks.OLD_BRICK_STAIRS, ModBlocks.OLD_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.OLD_BRICK_SLAB, ModBlocks.OLD_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.OLD_BRICK_WALL, ModBlocks.OLD_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.WHITE_BRICKS, Items.WHITE_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.WHITE_BRICK_STAIRS, ModBlocks.WHITE_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.WHITE_BRICK_SLAB, ModBlocks.WHITE_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.WHITE_BRICK_WALL, ModBlocks.WHITE_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.LIGHT_GRAY_BRICKS, Items.LIGHT_GRAY_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.LIGHT_GRAY_BRICK_STAIRS, ModBlocks.LIGHT_GRAY_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.LIGHT_GRAY_BRICK_SLAB, ModBlocks.LIGHT_GRAY_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.LIGHT_GRAY_BRICK_WALL, ModBlocks.LIGHT_GRAY_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.GRAY_BRICKS, Items.GRAY_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.GRAY_BRICK_STAIRS, ModBlocks.GRAY_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.GRAY_BRICK_SLAB, ModBlocks.GRAY_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.GRAY_BRICK_WALL, ModBlocks.GRAY_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.BLACK_BRICKS, Items.BLACK_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.BLACK_BRICK_STAIRS, ModBlocks.BLACK_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.BLACK_BRICK_SLAB, ModBlocks.BLACK_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.BLACK_BRICK_WALL, ModBlocks.BLACK_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.BROWN_BRICKS, Items.BROWN_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.BROWN_BRICK_STAIRS, ModBlocks.BROWN_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.BROWN_BRICK_SLAB, ModBlocks.BROWN_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.BROWN_BRICK_WALL, ModBlocks.BROWN_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.RED_BRICKS, Items.RED_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.RED_BRICK_STAIRS, ModBlocks.RED_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.RED_BRICK_SLAB, ModBlocks.RED_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.RED_BRICK_WALL, ModBlocks.RED_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.ORANGE_BRICKS, Items.ORANGE_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.ORANGE_BRICK_STAIRS, ModBlocks.ORANGE_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.ORANGE_BRICK_SLAB, ModBlocks.ORANGE_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.ORANGE_BRICK_WALL, ModBlocks.ORANGE_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.YELLOW_BRICKS, Items.YELLOW_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.YELLOW_BRICK_STAIRS, ModBlocks.YELLOW_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.YELLOW_BRICK_SLAB, ModBlocks.YELLOW_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.YELLOW_BRICK_WALL, ModBlocks.YELLOW_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.LIME_BRICKS, Items.LIME_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.LIME_BRICK_STAIRS, ModBlocks.LIME_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.LIME_BRICK_SLAB, ModBlocks.LIME_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.LIME_BRICK_WALL, ModBlocks.LIME_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.GREEN_BRICKS, Items.GREEN_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.GREEN_BRICK_STAIRS, ModBlocks.GREEN_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.GREEN_BRICK_SLAB, ModBlocks.GREEN_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.GREEN_BRICK_WALL, ModBlocks.GREEN_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.CYAN_BRICKS, Items.CYAN_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.CYAN_BRICK_STAIRS, ModBlocks.CYAN_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.CYAN_BRICK_SLAB, ModBlocks.CYAN_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.CYAN_BRICK_WALL, ModBlocks.CYAN_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.LIGHT_BLUE_BRICKS, Items.LIGHT_BLUE_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.LIGHT_BLUE_BRICK_STAIRS, ModBlocks.LIGHT_BLUE_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.LIGHT_BLUE_BRICK_SLAB, ModBlocks.LIGHT_BLUE_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.LIGHT_BLUE_BRICK_WALL, ModBlocks.LIGHT_BLUE_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.BLUE_BRICKS, Items.BLUE_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.BLUE_BRICK_STAIRS, ModBlocks.BLUE_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.BLUE_BRICK_SLAB, ModBlocks.BLUE_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.BLUE_BRICK_WALL, ModBlocks.BLUE_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.PURPLE_BRICKS, Items.PURPLE_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.PURPLE_BRICK_STAIRS, ModBlocks.PURPLE_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.PURPLE_BRICK_SLAB, ModBlocks.PURPLE_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.PURPLE_BRICK_WALL, ModBlocks.PURPLE_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.MAGENTA_BRICKS, Items.MAGENTA_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.MAGENTA_BRICK_STAIRS, ModBlocks.MAGENTA_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.MAGENTA_BRICK_SLAB, ModBlocks.MAGENTA_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.MAGENTA_BRICK_WALL, ModBlocks.MAGENTA_BRICKS);

        offerBrickDyeingRecipe(recipeExporter, ModBlocks.PINK_BRICKS, Items.PINK_DYE);
        offerBrickStairsRecipe(recipeExporter, ModBlocks.PINK_BRICK_STAIRS, ModBlocks.PINK_BRICKS);
        offerBrickSlabRecipe(recipeExporter, ModBlocks.PINK_BRICK_SLAB, ModBlocks.PINK_BRICKS);
        offerBrickWallRecipe(recipeExporter, ModBlocks.PINK_BRICK_WALL, ModBlocks.PINK_BRICKS);
    }
}
