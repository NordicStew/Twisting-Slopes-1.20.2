package net.nordicstew.twistingslopes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nordicstew.twistingslopes.TwistingSlopes;
import net.nordicstew.twistingslopes.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup FROZEN_STONE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TwistingSlopes.MOD_ID, "frozen_stone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.frozen_stone"))
                    .icon(() -> new ItemStack(ModBlocks.FROZEN_STONE_BLOCK)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.FROZEN_STONE_BLOCK);

                    }).build());
    public static void registerItemGroups() {
        TwistingSlopes.LOGGER.info("Registering Item Groups for " + TwistingSlopes.MOD_ID);
    }
}
