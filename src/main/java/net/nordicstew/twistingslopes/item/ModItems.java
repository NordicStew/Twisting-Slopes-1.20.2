package net.nordicstew.twistingslopes.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nordicstew.twistingslopes.TwistingSlopes;
import net.nordicstew.twistingslopes.block.ModBlocks;

public class ModItems {

    private static void addItemsToBuildingBlocksTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.FROZEN_STONE_BLOCK);
    }

    private static void addItemsToNaturalTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.FROZEN_STONE_BLOCK);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TwistingSlopes.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TwistingSlopes.LOGGER.info("Registering Mod Items for " + TwistingSlopes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalTabItemGroup);
    }
}
