package net.mikitstrees.packy;

import net.fabricmc.api.ModInitializer;

import net.mikitstrees.packy.block.ModBlocks;
import net.mikitstrees.packy.item.ModItemGroups;
import net.mikitstrees.packy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class Packy implements ModInitializer {
	public static final String MOD_ID = "packy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}