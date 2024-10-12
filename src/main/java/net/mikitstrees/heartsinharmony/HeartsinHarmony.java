package net.mikitstrees.heartsinharmony;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.mikitstrees.heartsinharmony.block.ModBlocks;
import net.mikitstrees.heartsinharmony.component.ModDataComponentTypes;
import net.mikitstrees.heartsinharmony.entity.ModEntities;
import net.mikitstrees.heartsinharmony.entity.custom.LovebirdEntity;

import net.mikitstrees.heartsinharmony.item.ModItemGroups;
import net.mikitstrees.heartsinharmony.item.ModItems;
import net.mikitstrees.heartsinharmony.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class HeartsinHarmony implements ModInitializer {
	public static final String MOD_ID = "heartsinharmony";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();

		ModDataComponentTypes.registerDataComponentTypes();

		FabricDefaultAttributeRegistry.register(ModEntities.LOVEBIRD, LovebirdEntity.createLovebirdAttributes());
	}
}