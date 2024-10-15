package net.mikitstrees.theheartshorizon.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mikitstrees.theheartshorizon.TheHeartsHorizon;
import net.mikitstrees.theheartshorizon.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

//public class ModItemGroups {
//    public static final ItemGroup THE_HEARTS_HORIZON_GROUP = Registry.register(Registries.ITEM_GROUP,
//            Identifier.of(TheHeartsHorizon.MOD_ID, "the_hearts_horizon.json"), FabricItemGroup.builder()
//                    .icon(() -> new ItemStack(ModBlocks.BUTTERCUP)) //group icon
//                    .displayName(Text.translatable("itemGroup.loversbunch.the_hearts_horizon"))
//                    .entries((displayContext, entries) -> { //group entries into this group, yoinks it from ModBlocks
//
//                    }).build());
//
//    public static void registerItemGroups() {
//        TheHeartsHorizon.LOGGER.info("Registering Item Groups for " + TheHeartsHorizon.MOD_ID);
//    }
//}
