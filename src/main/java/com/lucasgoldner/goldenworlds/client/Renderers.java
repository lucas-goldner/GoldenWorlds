package com.lucasgoldner.goldenworlds.client;

import com.lucasgoldner.goldenworlds.blocks.GoldenWorldsBlocks;
import com.lucasgoldner.goldenworlds.blocks.TileEntityGoldChest;
import com.lucasgoldner.goldenworlds.client.blockrenderers.*;
import com.lucasgoldner.goldenworlds.client.entityrenderer.*;
import com.lucasgoldner.goldenworlds.client.itemrenderer.*;
import com.lucasgoldner.goldenworlds.entity.EntityGoldNerd;
import com.lucasgoldner.goldenworlds.entity.EntityHermanoDeJuanes;
import com.lucasgoldner.goldenworlds.entity.projectile.EntityBullet;
import com.lucasgoldner.goldenworlds.entity.projectile.EntityGoldenWorldsArrow;
import com.lucasgoldner.goldenworlds.items.ItemCannon;
import com.lucasgoldner.goldenworlds.items.GoldenWorldsItems;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.lucasgoldner.goldenworlds.entity.EntityKekGolem;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class Renderers {

	public static void init(){
		
		RenderingRegistry.registerBlockHandler(new RenderExtractor());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldChest.class, new RenderGoldChest());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(GoldenWorldsBlocks.gold_chest), new ItemRendererGoldChest());
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldNerd.class, new RenderHuman(new ModelBiped(), 1));
		RenderingRegistry.registerEntityRenderingHandler(EntityHermanoDeJuanes.class, new RenderVillager());
		RenderingRegistry.registerEntityRenderingHandler(EntityKekGolem.class, new RenderKekGolem());
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldenWorldsArrow.class, new RenderGoldenWorldsArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldenWorldsArrow.class, new RenderGoldenWorldsQuickArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldenWorldsArrow.class, new RenderGoldenWorldsGoldenKingArrow());
		
	}
}
