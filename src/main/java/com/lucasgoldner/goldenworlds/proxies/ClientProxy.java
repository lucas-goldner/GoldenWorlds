package com.lucasgoldner.goldenworlds.proxies;

import com.lucasgoldner.goldenworlds.client.Renderers;
import com.lucasgoldner.goldenworlds.entity.Entities;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    public void preInitEntities(){
        Entities.preinit();
    }

    public void registerRenderers(){
        Renderers.init();
    }

    public void initEntities(){
        Entities.init();
    }
}
