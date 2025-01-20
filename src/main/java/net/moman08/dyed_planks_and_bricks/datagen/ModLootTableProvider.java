package net.moman08.dyed_planks_and_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.moman08.dyed_planks_and_bricks.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.OLD_BRICKS);
        addDrop(ModBlocks.OLD_BRICK_STAIRS);
        addDrop(ModBlocks.OLD_BRICK_SLAB, slabDrops(ModBlocks.OLD_BRICK_SLAB));
        addDrop(ModBlocks.OLD_BRICK_WALL);

        addDrop(ModBlocks.WHITE_BRICKS);
        addDrop(ModBlocks.WHITE_BRICK_STAIRS);
        addDrop(ModBlocks.WHITE_BRICK_SLAB, slabDrops(ModBlocks.WHITE_BRICK_SLAB));
        addDrop(ModBlocks.WHITE_BRICK_WALL);

        addDrop(ModBlocks.LIGHT_GRAY_BRICKS);
        addDrop(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_BRICK_WALL);

        addDrop(ModBlocks.GRAY_BRICKS);
        addDrop(ModBlocks.GRAY_BRICK_STAIRS);
        addDrop(ModBlocks.GRAY_BRICK_SLAB, slabDrops(ModBlocks.GRAY_BRICK_SLAB));
        addDrop(ModBlocks.GRAY_BRICK_WALL);

        addDrop(ModBlocks.BLACK_BRICKS);
        addDrop(ModBlocks.BLACK_BRICK_STAIRS);
        addDrop(ModBlocks.BLACK_BRICK_SLAB, slabDrops(ModBlocks.BLACK_BRICK_SLAB));
        addDrop(ModBlocks.BLACK_BRICK_WALL);

        addDrop(ModBlocks.BROWN_BRICKS);
        addDrop(ModBlocks.BROWN_BRICK_STAIRS);
        addDrop(ModBlocks.BROWN_BRICK_SLAB, slabDrops(ModBlocks.BROWN_BRICK_SLAB));
        addDrop(ModBlocks.BROWN_BRICK_WALL);

        addDrop(ModBlocks.RED_BRICKS);
        addDrop(ModBlocks.RED_BRICK_STAIRS);
        addDrop(ModBlocks.RED_BRICK_SLAB, slabDrops(ModBlocks.RED_BRICK_SLAB));
        addDrop(ModBlocks.RED_BRICK_WALL);

        addDrop(ModBlocks.ORANGE_BRICKS);
        addDrop(ModBlocks.ORANGE_BRICK_STAIRS);
        addDrop(ModBlocks.ORANGE_BRICK_SLAB, slabDrops(ModBlocks.ORANGE_BRICK_SLAB));
        addDrop(ModBlocks.ORANGE_BRICK_WALL);

        addDrop(ModBlocks.YELLOW_BRICKS);
        addDrop(ModBlocks.YELLOW_BRICK_STAIRS);
        addDrop(ModBlocks.YELLOW_BRICK_SLAB, slabDrops(ModBlocks.YELLOW_BRICK_SLAB));
        addDrop(ModBlocks.YELLOW_BRICK_WALL);

        addDrop(ModBlocks.LIME_BRICKS);
        addDrop(ModBlocks.LIME_BRICK_STAIRS);
        addDrop(ModBlocks.LIME_BRICK_SLAB, slabDrops(ModBlocks.LIME_BRICK_SLAB));
        addDrop(ModBlocks.LIME_BRICK_WALL);

        addDrop(ModBlocks.GREEN_BRICKS);
        addDrop(ModBlocks.GREEN_BRICK_STAIRS);
        addDrop(ModBlocks.GREEN_BRICK_SLAB, slabDrops(ModBlocks.GREEN_BRICK_SLAB));
        addDrop(ModBlocks.GREEN_BRICK_WALL);

        addDrop(ModBlocks.CYAN_BRICKS);
        addDrop(ModBlocks.CYAN_BRICK_STAIRS);
        addDrop(ModBlocks.CYAN_BRICK_SLAB, slabDrops(ModBlocks.CYAN_BRICK_SLAB));
        addDrop(ModBlocks.CYAN_BRICK_WALL);

        addDrop(ModBlocks.LIGHT_BLUE_BRICKS);
        addDrop(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_BRICK_WALL);

        addDrop(ModBlocks.BLUE_BRICKS);
        addDrop(ModBlocks.BLUE_BRICK_STAIRS);
        addDrop(ModBlocks.BLUE_BRICK_SLAB, slabDrops(ModBlocks.BLUE_BRICK_SLAB));
        addDrop(ModBlocks.BLUE_BRICK_WALL);

        addDrop(ModBlocks.PURPLE_BRICKS);
        addDrop(ModBlocks.PURPLE_BRICK_STAIRS);
        addDrop(ModBlocks.PURPLE_BRICK_SLAB, slabDrops(ModBlocks.PURPLE_BRICK_SLAB));
        addDrop(ModBlocks.PURPLE_BRICK_WALL);

        addDrop(ModBlocks.MAGENTA_BRICKS);
        addDrop(ModBlocks.MAGENTA_BRICK_STAIRS);
        addDrop(ModBlocks.MAGENTA_BRICK_SLAB, slabDrops(ModBlocks.MAGENTA_BRICK_SLAB));
        addDrop(ModBlocks.MAGENTA_BRICK_WALL);

        addDrop(ModBlocks.PINK_BRICKS);
        addDrop(ModBlocks.PINK_BRICK_STAIRS);
        addDrop(ModBlocks.PINK_BRICK_SLAB, slabDrops(ModBlocks.PINK_BRICK_SLAB));
        addDrop(ModBlocks.PINK_BRICK_WALL);
    }
}
