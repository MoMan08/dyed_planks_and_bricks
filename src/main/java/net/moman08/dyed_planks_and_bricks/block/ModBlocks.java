package net.moman08.dyed_planks_and_bricks.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moman08.dyed_planks_and_bricks.DyedPlanksBricks;

public class ModBlocks {

    public static final Block OLD_BRICKS = registerBlock(
            "old_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block OLD_BRICK_STAIRS = registerBlock(
            "old_brick_stairs", new StairsBlock(ModBlocks.OLD_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block OLD_BRICK_SLAB = registerBlock(
            "old_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block OLD_BRICK_WALL = registerBlock(
            "old_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block WHITE_BRICKS = registerBlock(
            "white_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block WHITE_BRICK_STAIRS = registerBlock(
            "white_brick_stairs", new StairsBlock(ModBlocks.WHITE_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block WHITE_BRICK_SLAB = registerBlock(
            "white_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block WHITE_BRICK_WALL = registerBlock(
            "white_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block LIGHT_GRAY_BRICKS = registerBlock(
            "light_gray_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block LIGHT_GRAY_BRICK_STAIRS = registerBlock(
            "light_gray_brick_stairs", new StairsBlock(ModBlocks.LIGHT_GRAY_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block LIGHT_GRAY_BRICK_SLAB = registerBlock(
            "light_gray_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block LIGHT_GRAY_BRICK_WALL = registerBlock(
            "light_gray_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block GRAY_BRICKS = registerBlock(
            "gray_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block GRAY_BRICK_STAIRS = registerBlock(
            "gray_brick_stairs", new StairsBlock(ModBlocks.GRAY_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block GRAY_BRICK_SLAB = registerBlock(
            "gray_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block GRAY_BRICK_WALL = registerBlock(
            "gray_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block BLACK_BRICKS = registerBlock(
            "black_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block BLACK_BRICK_STAIRS = registerBlock(
            "black_brick_stairs", new StairsBlock(ModBlocks.BLACK_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block BLACK_BRICK_SLAB = registerBlock(
            "black_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block BLACK_BRICK_WALL = registerBlock(
            "black_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block BROWN_BRICKS = registerBlock(
            "brown_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block BROWN_BRICK_STAIRS = registerBlock(
            "brown_brick_stairs", new StairsBlock(ModBlocks.BROWN_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block BROWN_BRICK_SLAB = registerBlock(
            "brown_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block BROWN_BRICK_WALL = registerBlock(
            "brown_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block RED_BRICKS = registerBlock(
            "red_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block RED_BRICK_STAIRS = registerBlock(
            "red_brick_stairs", new StairsBlock(ModBlocks.RED_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block RED_BRICK_SLAB = registerBlock(
            "red_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block RED_BRICK_WALL = registerBlock(
            "red_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block ORANGE_BRICKS = registerBlock(
            "orange_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block ORANGE_BRICK_STAIRS = registerBlock(
            "orange_brick_stairs", new StairsBlock(ModBlocks.ORANGE_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block ORANGE_BRICK_SLAB = registerBlock(
            "orange_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block ORANGE_BRICK_WALL = registerBlock(
            "orange_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block YELLOW_BRICKS = registerBlock(
            "yellow_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block YELLOW_BRICK_STAIRS = registerBlock(
            "yellow_brick_stairs", new StairsBlock(ModBlocks.YELLOW_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block YELLOW_BRICK_SLAB = registerBlock(
            "yellow_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block YELLOW_BRICK_WALL = registerBlock(
            "yellow_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block LIME_BRICKS = registerBlock(
            "lime_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block LIME_BRICK_STAIRS = registerBlock(
            "lime_brick_stairs", new StairsBlock(ModBlocks.LIME_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block LIME_BRICK_SLAB = registerBlock(
            "lime_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block LIME_BRICK_WALL = registerBlock(
            "lime_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block GREEN_BRICKS = registerBlock(
            "green_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block GREEN_BRICK_STAIRS = registerBlock(
            "green_brick_stairs", new StairsBlock(ModBlocks.GREEN_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block GREEN_BRICK_SLAB = registerBlock(
            "green_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block GREEN_BRICK_WALL = registerBlock(
            "green_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block CYAN_BRICKS = registerBlock(
            "cyan_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block CYAN_BRICK_STAIRS = registerBlock(
            "cyan_brick_stairs", new StairsBlock(ModBlocks.CYAN_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block CYAN_BRICK_SLAB = registerBlock(
            "cyan_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block CYAN_BRICK_WALL = registerBlock(
            "cyan_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block LIGHT_BLUE_BRICKS = registerBlock(
            "light_blue_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block LIGHT_BLUE_BRICK_STAIRS = registerBlock(
            "light_blue_brick_stairs", new StairsBlock(ModBlocks.LIGHT_BLUE_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block LIGHT_BLUE_BRICK_SLAB = registerBlock(
            "light_blue_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block LIGHT_BLUE_BRICK_WALL = registerBlock(
            "light_blue_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block BLUE_BRICKS = registerBlock(
            "blue_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block BLUE_BRICK_STAIRS = registerBlock(
            "blue_brick_stairs", new StairsBlock(ModBlocks.BLUE_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block BLUE_BRICK_SLAB = registerBlock(
            "blue_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block BLUE_BRICK_WALL = registerBlock(
            "blue_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block PURPLE_BRICKS = registerBlock(
            "purple_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block PURPLE_BRICK_STAIRS = registerBlock(
            "purple_brick_stairs", new StairsBlock(ModBlocks.PURPLE_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block PURPLE_BRICK_SLAB = registerBlock(
            "purple_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block PURPLE_BRICK_WALL = registerBlock(
            "purple_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block MAGENTA_BRICKS = registerBlock(
            "magenta_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MAGENTA_BRICK_STAIRS = registerBlock(
            "magenta_brick_stairs", new StairsBlock(ModBlocks.MAGENTA_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block MAGENTA_BRICK_SLAB = registerBlock(
            "magenta_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MAGENTA_BRICK_WALL = registerBlock(
            "magenta_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block PINK_BRICKS = registerBlock(
            "pink_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block PINK_BRICK_STAIRS = registerBlock(
            "pink_brick_stairs", new StairsBlock(ModBlocks.PINK_BRICKS.getDefaultState(),
                    (AbstractBlock.Settings.create().mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))));
    public static final Block PINK_BRICK_SLAB = registerBlock(
            "pink_brick_slab", new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block PINK_BRICK_WALL = registerBlock(
            "pink_brick_wall", new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DyedPlanksBricks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(DyedPlanksBricks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        DyedPlanksBricks.LOGGER.info("Registering Mod Blocks for " + DyedPlanksBricks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(Blocks.BRICKS);
            entries.add(Blocks.BRICK_STAIRS);
            entries.add(Blocks.BRICK_SLAB);
            entries.add(Blocks.BRICK_WALL);

            entries.add(ModBlocks.OLD_BRICKS);
            entries.add(ModBlocks.OLD_BRICK_STAIRS);
            entries.add(ModBlocks.OLD_BRICK_SLAB);
            entries.add(ModBlocks.OLD_BRICK_WALL);

            entries.add(ModBlocks.WHITE_BRICKS);
            entries.add(ModBlocks.WHITE_BRICK_STAIRS);
            entries.add(ModBlocks.WHITE_BRICK_SLAB);
            entries.add(ModBlocks.WHITE_BRICK_WALL);

            entries.add(ModBlocks.LIGHT_GRAY_BRICKS);
            entries.add(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
            entries.add(ModBlocks.LIGHT_GRAY_BRICK_SLAB);
            entries.add(ModBlocks.LIGHT_GRAY_BRICK_WALL);

            entries.add(ModBlocks.GRAY_BRICKS);
            entries.add(ModBlocks.GRAY_BRICK_STAIRS);
            entries.add(ModBlocks.GRAY_BRICK_SLAB);
            entries.add(ModBlocks.GRAY_BRICK_WALL);

            entries.add(ModBlocks.BLACK_BRICKS);
            entries.add(ModBlocks.BLACK_BRICK_STAIRS);
            entries.add(ModBlocks.BLACK_BRICK_SLAB);
            entries.add(ModBlocks.BLACK_BRICK_WALL);

            entries.add(ModBlocks.BROWN_BRICKS);
            entries.add(ModBlocks.BROWN_BRICK_STAIRS);
            entries.add(ModBlocks.BROWN_BRICK_SLAB);
            entries.add(ModBlocks.BROWN_BRICK_WALL);

            entries.add(ModBlocks.RED_BRICKS);
            entries.add(ModBlocks.RED_BRICK_STAIRS);
            entries.add(ModBlocks.RED_BRICK_SLAB);
            entries.add(ModBlocks.RED_BRICK_WALL);

            entries.add(ModBlocks.ORANGE_BRICKS);
            entries.add(ModBlocks.ORANGE_BRICK_STAIRS);
            entries.add(ModBlocks.ORANGE_BRICK_SLAB);
            entries.add(ModBlocks.ORANGE_BRICK_WALL);

            entries.add(ModBlocks.YELLOW_BRICKS);
            entries.add(ModBlocks.YELLOW_BRICK_STAIRS);
            entries.add(ModBlocks.YELLOW_BRICK_SLAB);
            entries.add(ModBlocks.YELLOW_BRICK_WALL);

            entries.add(ModBlocks.LIME_BRICKS);
            entries.add(ModBlocks.LIME_BRICK_STAIRS);
            entries.add(ModBlocks.LIME_BRICK_SLAB);
            entries.add(ModBlocks.LIME_BRICK_WALL);

            entries.add(ModBlocks.GREEN_BRICKS);
            entries.add(ModBlocks.GREEN_BRICK_STAIRS);
            entries.add(ModBlocks.GREEN_BRICK_SLAB);
            entries.add(ModBlocks.GREEN_BRICK_WALL);

            entries.add(ModBlocks.CYAN_BRICKS);
            entries.add(ModBlocks.CYAN_BRICK_STAIRS);
            entries.add(ModBlocks.CYAN_BRICK_SLAB);
            entries.add(ModBlocks.CYAN_BRICK_WALL);

            entries.add(ModBlocks.LIGHT_BLUE_BRICKS);
            entries.add(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
            entries.add(ModBlocks.LIGHT_BLUE_BRICK_SLAB);
            entries.add(ModBlocks.LIGHT_BLUE_BRICK_WALL);

            entries.add(ModBlocks.BLUE_BRICKS);
            entries.add(ModBlocks.BLUE_BRICK_STAIRS);
            entries.add(ModBlocks.BLUE_BRICK_SLAB);
            entries.add(ModBlocks.BLUE_BRICK_WALL);

            entries.add(ModBlocks.PURPLE_BRICKS);
            entries.add(ModBlocks.PURPLE_BRICK_STAIRS);
            entries.add(ModBlocks.PURPLE_BRICK_SLAB);
            entries.add(ModBlocks.PURPLE_BRICK_WALL);

            entries.add(ModBlocks.MAGENTA_BRICKS);
            entries.add(ModBlocks.MAGENTA_BRICK_STAIRS);
            entries.add(ModBlocks.MAGENTA_BRICK_SLAB);
            entries.add(ModBlocks.MAGENTA_BRICK_WALL);

            entries.add(ModBlocks.PINK_BRICKS);
            entries.add(ModBlocks.PINK_BRICK_STAIRS);
            entries.add(ModBlocks.PINK_BRICK_SLAB);
            entries.add(ModBlocks.PINK_BRICK_WALL);
        });
    }
}
