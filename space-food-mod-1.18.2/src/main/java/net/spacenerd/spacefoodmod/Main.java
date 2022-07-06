package net.spacenerd.spacefoodmod;

import net.fabricmc.api.ModInitializer;
import net.spacenerd.spacefoodmod.item.NewItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	public static final String MOD_ID = "spacefoodmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		NewItems.registerModItems();
	}
}
