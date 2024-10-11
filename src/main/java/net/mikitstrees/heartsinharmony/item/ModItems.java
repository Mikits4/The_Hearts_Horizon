package net.mikitstrees.heartsinharmony.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mikitstrees.heartsinharmony.HeartsinHarmony;
import net.mikitstrees.heartsinharmony.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

 //   public static final Item LOVEBIRD_SPAWN_EGG = new SpawnEggItem(ModEntities.LOVEBIRD, 0xc4c4c4, 0xadadad, new FabricItemSettings());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HeartsinHarmony.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HeartsinHarmony.LOGGER.info("Registering Mod Items for " + HeartsinHarmony.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> { //entries into the creative inventory, into ingredients tab?

        });
    }


}