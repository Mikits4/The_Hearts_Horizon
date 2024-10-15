package net.mikitstrees.loversbunch;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.mikitstrees.loversbunch.block.ModBlocks;
import net.mikitstrees.loversbunch.entity.ModEntities;
import net.mikitstrees.loversbunch.entity.client.LovebirdEntityModel;
import net.mikitstrees.loversbunch.entity.client.LovebirdEntityRenderer;
import net.mikitstrees.loversbunch.entity.client.ModEntityModelLayers;
import net.minecraft.client.render.RenderLayer;

public class LoversBunchClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.LOVEBIRD, LovebirdEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.LOVEBIRD, LovebirdEntityModel::getTexturedModelData);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUTTERCUP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BUTTERCUP, RenderLayer.getCutout());
    }
}
