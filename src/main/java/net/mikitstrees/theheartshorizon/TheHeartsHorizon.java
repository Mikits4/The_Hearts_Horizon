package net.mikitstrees.theheartshorizon;

import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.mikitstrees.theheartshorizon.block.ModBlocks;
import net.mikitstrees.theheartshorizon.component.ModDataComponentTypes;
import net.mikitstrees.theheartshorizon.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class TheHeartsHorizon implements ModInitializer {
    public static final String MOD_ID = "theheartshorizon";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
//		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModDataComponentTypes.registerDataComponentTypes();

		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.CLAY)
				.lightWithItem(Items.FEATHER)
				.destDimID(Identifier.of(TheHeartsHorizon.MOD_ID, "the_hearts_horizon"))
				.tintColor(0xc78efa)
				.registerPortal();
    }
}