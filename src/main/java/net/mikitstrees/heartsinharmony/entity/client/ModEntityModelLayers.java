package net.mikitstrees.heartsinharmony.entity.client;

import net.mikitstrees.heartsinharmony.HeartsinHarmony;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModEntityModelLayers {
    public static final EntityModelLayer LOVEBIRD =
            new EntityModelLayer(Identifier.of(HeartsinHarmony.MOD_ID, "lovebird"), "main");

}
