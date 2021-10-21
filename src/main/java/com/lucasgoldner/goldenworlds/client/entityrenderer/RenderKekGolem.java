package com.lucasgoldner.goldenworlds.client.entityrenderer;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import java.util.Random;

public class RenderKekGolem extends RenderLiving {
	int n;

	public RenderKekGolem() {
		super(new ModelKekGolem(), 0.75f);
		Random rand = new Random();
		this.n = rand.nextInt(2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		ResourceLocation texture = new ResourceLocation("goldenworlds:textures/entity/kek_golem_"+ this.n +".png");
		return texture;
	}
	
	protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_)
    {
		float scale = 1.2f;
        GL11.glScalef(scale, scale, scale);
    }
}
