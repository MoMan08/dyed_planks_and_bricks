package net.moman08.dyed_planks_and_bricks;

import net.fabricmc.api.ModInitializer;

import net.moman08.dyed_planks_and_bricks.block.ModBlocks;
import net.moman08.dyed_planks_and_bricks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DyedPlanksBricks implements ModInitializer {
	public static final String MOD_ID = "dyed_planks_and_bricks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}