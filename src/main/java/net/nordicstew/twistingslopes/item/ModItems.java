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
import org.jetbrains.annotations.NotNull;

public class ModItems {

    public static final Item FROST_ROD = registerItem("frost_rod", new Item(new FabricItemSettings()));
    private static void addItemsToBuildingBlocksTabItemGroup(@NotNull FabricItemGroupEntries entries) {
        entries.add(ModBlocks.FROZEN_STONE);
    }
    private static void addItemsToIngredientTabItemGroup(@NotNull FabricItemGroupEntries entries) {
        entries.add(ModItems.FROST_ROD);
    }

    private static void addItemsToNaturalTabItemGroup(@NotNull FabricItemGroupEntries entries) {
        entries.add(ModBlocks.FROZEN_STONE);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TwistingSlopes.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TwistingSlopes.LOGGER.info("Registering Mod Items for " + TwistingSlopes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalTabItemGroup);
    }
}
