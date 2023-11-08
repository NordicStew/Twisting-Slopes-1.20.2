package net.nordicstew.twistingslopes;

import net.fabricmc.api.ModInitializer;

import net.nordicstew.twistingslopes.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwistingSlopes implements ModInitializer {
	public static final String MOD_ID = "twistingslopes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}