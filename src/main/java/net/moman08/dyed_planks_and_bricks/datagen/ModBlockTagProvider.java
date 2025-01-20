package net.moman08.dyed_planks_and_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.moman08.dyed_planks_and_bricks.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.OLD_BRICKS)
                .add(ModBlocks.OLD_BRICK_STAIRS)
                .add(ModBlocks.OLD_BRICK_SLAB)
                .add(ModBlocks.OLD_BRICK_WALL)

                .add(ModBlocks.WHITE_BRICKS)
                .add(ModBlocks.WHITE_BRICK_STAIRS)
                .add(ModBlocks.WHITE_BRICK_SLAB)
                .add(ModBlocks.WHITE_BRICK_WALL)

                .add(ModBlocks.LIGHT_GRAY_BRICKS)
                .add(ModBlocks.LIGHT_GRAY_BRICK_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_BRICK_SLAB)
                .add(ModBlocks.LIGHT_GRAY_BRICK_WALL)

                .add(ModBlocks.GRAY_BRICKS)
                .add(ModBlocks.GRAY_BRICK_STAIRS)
                .add(ModBlocks.GRAY_BRICK_SLAB)
                .add(ModBlocks.GRAY_BRICK_WALL)

                .add(ModBlocks.BLACK_BRICKS)
                .add(ModBlocks.BLACK_BRICK_STAIRS)
                .add(ModBlocks.BLACK_BRICK_SLAB)
                .add(ModBlocks.BLACK_BRICK_WALL)

                .add(ModBlocks.BROWN_BRICKS)
                .add(ModBlocks.BROWN_BRICK_STAIRS)
                .add(ModBlocks.BROWN_BRICK_SLAB)
                .add(ModBlocks.BROWN_BRICK_WALL)

                .add(ModBlocks.RED_BRICKS)
                .add(ModBlocks.RED_BRICK_STAIRS)
                .add(ModBlocks.RED_BRICK_SLAB)
                .add(ModBlocks.RED_BRICK_WALL)

                .add(ModBlocks.ORANGE_BRICKS)
                .add(ModBlocks.ORANGE_BRICK_STAIRS)
                .add(ModBlocks.ORANGE_BRICK_SLAB)
                .add(ModBlocks.ORANGE_BRICK_WALL)

                .add(ModBlocks.YELLOW_BRICKS)
                .add(ModBlocks.YELLOW_BRICK_STAIRS)
                .add(ModBlocks.YELLOW_BRICK_SLAB)
                .add(ModBlocks.YELLOW_BRICK_WALL)

                .add(ModBlocks.LIME_BRICKS)
                .add(ModBlocks.LIME_BRICK_STAIRS)
                .add(ModBlocks.LIME_BRICK_SLAB)
                .add(ModBlocks.LIME_BRICK_WALL)

                .add(ModBlocks.GREEN_BRICKS)
                .add(ModBlocks.GREEN_BRICK_STAIRS)
                .add(ModBlocks.GREEN_BRICK_SLAB)
                .add(ModBlocks.GREEN_BRICK_WALL)

                .add(ModBlocks.CYAN_BRICKS)
                .add(ModBlocks.CYAN_BRICK_STAIRS)
                .add(ModBlocks.CYAN_BRICK_SLAB)
                .add(ModBlocks.CYAN_BRICK_WALL)

                .add(ModBlocks.LIGHT_BLUE_BRICKS)
                .add(ModBlocks.LIGHT_BLUE_BRICK_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_BRICK_SLAB)
                .add(ModBlocks.LIGHT_BLUE_BRICK_WALL)

                .add(ModBlocks.BLUE_BRICKS)
                .add(ModBlocks.BLUE_BRICK_STAIRS)
                .add(ModBlocks.BLUE_BRICK_SLAB)
                .add(ModBlocks.BLUE_BRICK_WALL)

                .add(ModBlocks.PURPLE_BRICKS)
                .add(ModBlocks.PURPLE_BRICK_STAIRS)
                .add(ModBlocks.PURPLE_BRICK_SLAB)
                .add(ModBlocks.PURPLE_BRICK_WALL)

                .add(ModBlocks.MAGENTA_BRICKS)
                .add(ModBlocks.MAGENTA_BRICK_STAIRS)
                .add(ModBlocks.MAGENTA_BRICK_SLAB)
                .add(ModBlocks.MAGENTA_BRICK_WALL)

                .add(ModBlocks.PINK_BRICKS)
                .add(ModBlocks.PINK_BRICK_STAIRS)
                .add(ModBlocks.PINK_BRICK_SLAB)
                .add(ModBlocks.PINK_BRICK_WALL);


        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.OLD_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.WHITE_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.LIGHT_GRAY_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.GRAY_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.BLACK_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.BROWN_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.RED_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.ORANGE_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.YELLOW_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.LIME_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.GREEN_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.CYAN_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.LIGHT_BLUE_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.BLUE_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.PURPLE_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.MAGENTA_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.PINK_BRICK_WALL);
    }
}
