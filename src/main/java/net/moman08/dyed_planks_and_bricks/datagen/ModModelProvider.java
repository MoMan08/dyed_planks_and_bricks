package net.moman08.dyed_planks_and_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.moman08.dyed_planks_and_bricks.block.ModBlocks;
import net.moman08.dyed_planks_and_bricks.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool oldBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OLD_BRICKS);
        oldBrickPool.stairs(ModBlocks.OLD_BRICK_STAIRS);
        oldBrickPool.slab(ModBlocks.OLD_BRICK_SLAB);
        oldBrickPool.wall(ModBlocks.OLD_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool whiteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_BRICKS);
        whiteBrickPool.stairs(ModBlocks.WHITE_BRICK_STAIRS);
        whiteBrickPool.slab(ModBlocks.WHITE_BRICK_SLAB);
        whiteBrickPool.wall(ModBlocks.WHITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool lightGrayBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_BRICKS);
        lightGrayBrickPool.stairs(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
        lightGrayBrickPool.slab(ModBlocks.LIGHT_GRAY_BRICK_SLAB);
        lightGrayBrickPool.wall(ModBlocks.LIGHT_GRAY_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool grayBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_BRICKS);
        grayBrickPool.stairs(ModBlocks.GRAY_BRICK_STAIRS);
        grayBrickPool.slab(ModBlocks.GRAY_BRICK_SLAB);
        grayBrickPool.wall(ModBlocks.GRAY_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool blackBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_BRICKS);
        blackBrickPool.stairs(ModBlocks.BLACK_BRICK_STAIRS);
        blackBrickPool.slab(ModBlocks.BLACK_BRICK_SLAB);
        blackBrickPool.wall(ModBlocks.BLACK_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool brownBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_BRICKS);
        brownBrickPool.stairs(ModBlocks.BROWN_BRICK_STAIRS);
        brownBrickPool.slab(ModBlocks.BROWN_BRICK_SLAB);
        brownBrickPool.wall(ModBlocks.BROWN_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool redBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_BRICKS);
        redBrickPool.stairs(ModBlocks.RED_BRICK_STAIRS);
        redBrickPool.slab(ModBlocks.RED_BRICK_SLAB);
        redBrickPool.wall(ModBlocks.RED_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool orangeBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_BRICKS);
        orangeBrickPool.stairs(ModBlocks.ORANGE_BRICK_STAIRS);
        orangeBrickPool.slab(ModBlocks.ORANGE_BRICK_SLAB);
        orangeBrickPool.wall(ModBlocks.ORANGE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool yellowBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_BRICKS);
        yellowBrickPool.stairs(ModBlocks.YELLOW_BRICK_STAIRS);
        yellowBrickPool.slab(ModBlocks.YELLOW_BRICK_SLAB);
        yellowBrickPool.wall(ModBlocks.YELLOW_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool limeBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_BRICKS);
        limeBrickPool.stairs(ModBlocks.LIME_BRICK_STAIRS);
        limeBrickPool.slab(ModBlocks.LIME_BRICK_SLAB);
        limeBrickPool.wall(ModBlocks.LIME_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool greenBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_BRICKS);
        greenBrickPool.stairs(ModBlocks.GREEN_BRICK_STAIRS);
        greenBrickPool.slab(ModBlocks.GREEN_BRICK_SLAB);
        greenBrickPool.wall(ModBlocks.GREEN_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool cyanBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_BRICKS);
        cyanBrickPool.stairs(ModBlocks.CYAN_BRICK_STAIRS);
        cyanBrickPool.slab(ModBlocks.CYAN_BRICK_SLAB);
        cyanBrickPool.wall(ModBlocks.CYAN_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool lightBlueBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_BRICKS);
        lightBlueBrickPool.stairs(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
        lightBlueBrickPool.slab(ModBlocks.LIGHT_BLUE_BRICK_SLAB);
        lightBlueBrickPool.wall(ModBlocks.LIGHT_BLUE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool blueBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_BRICKS);
        blueBrickPool.stairs(ModBlocks.BLUE_BRICK_STAIRS);
        blueBrickPool.slab(ModBlocks.BLUE_BRICK_SLAB);
        blueBrickPool.wall(ModBlocks.BLUE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool purpleBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_BRICKS);
        purpleBrickPool.stairs(ModBlocks.PURPLE_BRICK_STAIRS);
        purpleBrickPool.slab(ModBlocks.PURPLE_BRICK_SLAB);
        purpleBrickPool.wall(ModBlocks.PURPLE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool magentaBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_BRICKS);
        magentaBrickPool.stairs(ModBlocks.MAGENTA_BRICK_STAIRS);
        magentaBrickPool.slab(ModBlocks.MAGENTA_BRICK_SLAB);
        magentaBrickPool.wall(ModBlocks.MAGENTA_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool pinkBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_BRICKS);
        pinkBrickPool.stairs(ModBlocks.PINK_BRICK_STAIRS);
        pinkBrickPool.slab(ModBlocks.PINK_BRICK_SLAB);
        pinkBrickPool.wall(ModBlocks.PINK_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.TEST, Models.GENERATED);
    }
}
