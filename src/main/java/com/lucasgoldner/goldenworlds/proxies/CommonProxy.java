package com.lucasgoldner.goldenworlds.proxies;

import com.lucasgoldner.goldenworlds.GoldenWorlds;
import com.lucasgoldner.goldenworlds.client.Renderers;
import com.lucasgoldner.goldenworlds.client.entityrenderer.RenderGoldenWorldsArrow;
import com.lucasgoldner.goldenworlds.client.entityrenderer.RenderGoldenWorldsGoldenKingArrow;
import com.lucasgoldner.goldenworlds.client.entityrenderer.RenderGoldenWorldsQuickArrow;
import com.lucasgoldner.goldenworlds.client.entityrenderer.RenderKekGolem;
import com.lucasgoldner.goldenworlds.entity.EntityGoldNerd;
import com.lucasgoldner.goldenworlds.entity.EntityHermanoDeJuanes;
import com.lucasgoldner.goldenworlds.entity.EntityKekGolem;
import com.lucasgoldner.goldenworlds.entity.projectile.EntityGoldenWorldsArrow;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.renderer.entity.Render;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e)
    {
        EntityRegistry.registerModEntity(EntityGoldNerd.class, "GoldNerd", 200, GoldenWorlds.instance, 80, 1, false);
        EntityRegistry.registerModEntity(EntityHermanoDeJuanes.class, "Hermano de Juanes", 201, GoldenWorlds.instance, 50, 1, false);
        EntityRegistry.registerGlobalEntityID(EntityKekGolem.class, "KekGolem", 202, 0x7AE8FF, 0x47FFE2);
    }

    public void preInitEntities(){

    }

    public void registerRenderers(){

    }

    public void initEntities(){

    }


}
