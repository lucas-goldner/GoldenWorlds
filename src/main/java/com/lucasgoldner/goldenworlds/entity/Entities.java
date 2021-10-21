package com.lucasgoldner.goldenworlds.entity;

import com.lucasgoldner.goldenworlds.GoldenWorlds;
import com.lucasgoldner.goldenworlds.client.entityrenderer.RenderHuman;
import com.lucasgoldner.goldenworlds.client.entityrenderer.RenderVillager;
import com.lucasgoldner.goldenworlds.entity.projectile.EntityBullet;
import com.lucasgoldner.goldenworlds.entity.projectile.EntityGoldenWorldsArrow;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import cpw.mods.fml.common.registry.EntityRegistry;

public class Entities {
	
	public static void preinit(){
		//Mobs
		EntityRegistry.registerGlobalEntityID(EntityKekGolem.class, "KekGolem", 202, 0x7AE8FF, 0x47FFE2);

		EntityRegistry.registerModEntity(EntityGoldNerd.class, "GoldNerd",  200, GoldenWorlds.instance, 80, 1, false);
		EntityRegistry.registerModEntity(EntityHermanoDeJuanes.class, "Hermano de Juanes", 201, GoldenWorlds.instance, 50, 1, false);

		EntityRegistry.registerGlobalEntityID(EntityGoldenWorldsArrow.class, "ROCArrow", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityGoldenWorldsArrow.class, "ROCArrow", EntityRegistry.findGlobalUniqueEntityId(), GoldenWorlds.instance, 64, 1, true);
		
		EntityRegistry.registerGlobalEntityID(EntityBullet.class, "ROCBullet", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityBullet.class, "ROCBullet", EntityRegistry.findGlobalUniqueEntityId(), GoldenWorlds.instance, 64, 1, true);
	}
	
	public static void init(){
	}
}