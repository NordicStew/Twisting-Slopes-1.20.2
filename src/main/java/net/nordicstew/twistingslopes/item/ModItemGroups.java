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

    public static final ItemGroup TWISTING_SLOPES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TwistingSlopes.MOD_ID, "twistingslopes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.twistingslopes"))
                    .icon(() -> new ItemStack(ModItems.FROST_ROD)).entries((displayContext, entries) -> {

                        entries.add(ModItems.FROST_ROD);

                        entries.add(ModBlocks.FROZEN_STONE);

                    }).build());
    public static void registerItemGroups() {
        TwistingSlopes.LOGGER.info("Registering Item Groups for " + TwistingSlopes.MOD_ID);
    }
}
