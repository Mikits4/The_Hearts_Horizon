package net.mikitstrees.theheartshorizon;

import net.fabricmc.api.ModInitializer;
import net.mikitstrees.theheartshorizon.block.ModBlocks;
import net.mikitstrees.theheartshorizon.component.ModDataComponentTypes;
import net.mikitstrees.theheartshorizon.item.ModItemGroups;
import net.mikitstrees.theheartshorizon.item.ModItems;
import net.mikitstrees.theheartshorizon.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class TheHeartsHorizon implements ModInitializer {
	public static final String MOD_ID = "theheartshorizon";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

//		ModWorldGeneration.generateModWorldGeneration();

		ModSounds.registerSounds();

		ModDataComponentTypes.registerDataComponentTypes();
	}
}