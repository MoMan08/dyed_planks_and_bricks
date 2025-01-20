package net.moman08.dyed_planks_and_bricks;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.moman08.dyed_planks_and_bricks.datagen.ModBlockTagProvider;
import net.moman08.dyed_planks_and_bricks.datagen.ModLootTableProvider;
import net.moman08.dyed_planks_and_bricks.datagen.ModModelProvider;
import net.moman08.dyed_planks_and_bricks.datagen.ModRecipeProvider;

public class DyedPlanksBricksDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
