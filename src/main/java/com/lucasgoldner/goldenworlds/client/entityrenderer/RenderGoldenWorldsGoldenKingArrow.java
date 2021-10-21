package com.lucasgoldner.goldenworlds.client.entityrenderer;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderGoldenWorldsGoldenKingArrow extends RenderArrow{
	
	private String textureName;
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
    {
        return new ResourceLocation("goldenworlds:textures/entity/arrow/goldenking.png");
    }
}
