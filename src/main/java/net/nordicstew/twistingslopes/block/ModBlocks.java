package net.nordicstew.twistingslopes.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.nordicstew.twistingslopes.TwistingSlopes;

public class ModBlocks {

    public static final Block FROZEN_STONE_BLOCK = registerBlock("frozen_stone_block",
    new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).instrument(Instrument.BASEDRUM).requiresTool().strength(28.0f, 52.0f).sounds(BlockSoundGroup.NETHERRACK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TwistingSlopes.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TwistingSlopes.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TwistingSlopes.LOGGER.info("Registering ModBlocks for " + TwistingSlopes.MOD_ID);
    }
}
