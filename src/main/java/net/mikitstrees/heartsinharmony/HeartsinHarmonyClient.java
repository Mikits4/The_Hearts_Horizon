package net.mikitstrees.heartsinharmony;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.mikitstrees.heartsinharmony.entity.ModEntities;
import net.mikitstrees.heartsinharmony.entity.client.LovebirdEntityModel;
import net.mikitstrees.heartsinharmony.entity.client.LovebirdEntityRenderer;
import net.mikitstrees.heartsinharmony.entity.client.ModEntityModelLayers;

public class HeartsinHarmonyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.LOVEBIRD, LovebirdEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.LOVEBIRD, LovebirdEntityModel::getTexturedModelData);
    }
}
