package com.lucasgoldner.goldenworlds.client.entityrenderer;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderHuman extends RenderBiped {
    public RenderHuman(ModelBiped p_i1257_1_, float p_i1257_2_) {
        super(p_i1257_1_, p_i1257_2_);
    }
    protected ResourceLocation getEntityTexture(Entity entitiy){
        return new ResourceLocation("goldenworlds:textures/entity/goldnerd.png");
    }

    public void doRender(Entity entity, double x, double y, double z, float rotationYaw, float rotationPitch){
        this.doRender((EntityLiving)entity, x, y, z, rotationYaw, rotationPitch);
    }

}
