package net.moman08.dyed_planks_and_bricks.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moman08.dyed_planks_and_bricks.DyedPlanksBricks;

public class ModItems {
    public static final Item TEST = registerItem("test", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DyedPlanksBricks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DyedPlanksBricks.LOGGER.info("Resgistering Mod Items for " + DyedPlanksBricks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(TEST);
        });
    }
}
