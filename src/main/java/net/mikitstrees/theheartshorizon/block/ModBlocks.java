package net.mikitstrees.theheartshorizon.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mikitstrees.theheartshorizon.TheHeartsHorizon;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BUTTERCUP = registerBlock("buttercup",
            new FlowerBlock(StatusEffects.OOZING, 4, Block.Settings.copy(Blocks.ALLIUM)));
    public static final Block POTTED_BUTTERCUP = registerBlockWithoutBlockItem("potted_buttercup",
            new FlowerPotBlock(BUTTERCUP, Block.Settings.copy(Blocks.POTTED_ALLIUM)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(TheHeartsHorizon.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TheHeartsHorizon.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TheHeartsHorizon.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TheHeartsHorizon.LOGGER.info("Registering Mod Blocks for " + TheHeartsHorizon.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}