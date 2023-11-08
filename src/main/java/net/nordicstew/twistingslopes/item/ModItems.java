package net.nordicstew.twistingslopes.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nordicstew.twistingslopes.TwistingSlopes;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TwistingSlopes.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TwistingSlopes.LOGGER.info("Registring Mod Items for " + TwistingSlopes.MOD_ID);
    }
}
