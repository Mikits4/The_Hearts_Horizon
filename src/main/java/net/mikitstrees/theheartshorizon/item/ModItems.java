package net.mikitstrees.theheartshorizon.item;

import net.mikitstrees.theheartshorizon.TheHeartsHorizon;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheHeartsHorizon.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheHeartsHorizon.LOGGER.info("Registering Mod Items for " + TheHeartsHorizon.MOD_ID);
    }
}