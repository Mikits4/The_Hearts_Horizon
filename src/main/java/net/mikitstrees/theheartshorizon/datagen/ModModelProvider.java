package net.mikitstrees.theheartshorizon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mikitstrees.theheartshorizon.block.ModBlocks;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BUTTERCUP, ModBlocks.POTTED_BUTTERCUP, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

}