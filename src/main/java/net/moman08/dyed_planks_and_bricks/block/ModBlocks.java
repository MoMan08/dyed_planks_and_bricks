package net.moman08.dyed_planks_and_bricks.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moman08.dyed_planks_and_bricks.DyedPlanksBricks;

public class ModBlocks {
    public static final Block WHITE_BRICKS = registerBlock(
            "white_bricks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F))
    );

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
            entries.add(ModBlocks.WHITE_BRICKS);
        });
    }
}
