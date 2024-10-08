package net.mikitstrees.heartsinharmony.item;

import net.mikitstrees.heartsinharmony.HeartsinHarmony;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HeartsinHarmony.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HeartsinHarmony.LOGGER.info("Registering Mod Items for " + HeartsinHarmony.MOD_ID);


    }
}