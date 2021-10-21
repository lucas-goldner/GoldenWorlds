package com.lucasgoldner.goldenworlds.client.entityrenderer;

import com.lucasgoldner.goldenworlds.entity.projectile.EntityGoldenWorldsArrow;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderGoldenWorldsArrow extends RenderArrow{
	
	private String textureName;
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
    {
        return new ResourceLocation("goldenworlds:textures/entity/arrow/" + ((EntityGoldenWorldsArrow)entity).getTextureName() + ".png");
    }
}
