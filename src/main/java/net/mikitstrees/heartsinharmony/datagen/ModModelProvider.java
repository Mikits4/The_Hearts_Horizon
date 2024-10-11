package net.mikitstrees.heartsinharmony.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mikitstrees.heartsinharmony.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;

//public class ModModelProvider extends FabricModelProvider {
//    public ModModelProvider(FabricDataOutput output) {
//        super(output);
//    }

//    @Override
//    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//
//    }

//    @Override
//    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//        itemModelGenerator.register(ModItems.LOVEBIRD_SPAWN_EGG,
//                new Model(Optional.of(Identifier.of("item/lovebird_spawn_egg")), Optional.empty()));
//    }
//
//}