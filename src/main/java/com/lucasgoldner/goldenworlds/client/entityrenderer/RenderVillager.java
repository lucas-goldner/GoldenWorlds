package com.lucasgoldner.goldenworlds.client.entityrenderer;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderVillager extends net.minecraft.client.renderer.entity.RenderVillager {

    protected ResourceLocation getEntityTexture(Entity entitiy){
        return new ResourceLocation("goldenworlds:textures/entity/hermano.png");
    }

    public void doRender(Entity entity, double x, double y, double z, float rotationYaw, float rotationPitch){
        this.doRender((EntityLiving)entity, x, y, z, rotationYaw, rotationPitch);
    }
}
