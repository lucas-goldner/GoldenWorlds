package com.lucasgoldner.goldenworlds;

import com.lucasgoldner.goldenworlds.blocks.GoldenWorldsBlocks;
import com.lucasgoldner.goldenworlds.blocks.TERegistry;
import com.lucasgoldner.goldenworlds.dimension.gen.OverworldGen;
import com.lucasgoldner.goldenworlds.entity.Entities;
import com.lucasgoldner.goldenworlds.items.GoldenWorldsItems;
import com.lucasgoldner.goldenworlds.dimension.gen.BiomeGenGoldenWorlds;
import com.lucasgoldner.goldenworlds.dimension.gen.WorldProviderGoldenWorlds;
import com.lucasgoldner.goldenworlds.proxies.CommonProxy;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import com.lucasgoldner.goldenworlds.crafting.OverworldCrafting;
import com.lucasgoldner.goldenworlds.event.ArmorBonusEvent;
import com.lucasgoldner.goldenworlds.event.OverlayEvent;
import com.lucasgoldner.goldenworlds.event.TooltipEvent;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = GoldenWorlds.MODID, version = GoldenWorlds.VERSION)
public class GoldenWorlds {
	public static final String MODID = "goldenworlds";
	public static final String VERSION = "1.0";

	@SidedProxy(clientSide = "com.lucasgoldner.goldenworlds.proxies.ClientProxy", serverSide = "com.lucasgoldner.goldenworlds.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(MODID)
	public static GoldenWorlds instance;
	public static SimpleNetworkWrapper network;
	public static int goldenWorldsDimID = 23;
	public static BiomeGenBase goldenWorldsBiome;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt){
		System.out.println("[GoldenWorlds] Initializing mod.");
		DimensionManager.registerProviderType(goldenWorldsDimID, WorldProviderGoldenWorlds.class, true);
    	DimensionManager.registerDimension(goldenWorldsDimID, goldenWorldsDimID);
		goldenWorldsBiome = new BiomeGenGoldenWorlds(55).setColor(48).setBiomeName("GoldenWorlds Biome").setHeight(new BiomeGenBase.Height(-1.8f, 1.0f));
    	network = NetworkRegistry.INSTANCE.newSimpleChannel("GoldenWorldsPackets");

		GoldenWorldsBlocks.init();
		GoldenWorldsItems.init();
		GameRegistry.registerWorldGenerator(new OverworldGen(), 1);
		TERegistry.init();
		OverworldCrafting.initRecipes();



		NetworkRegistry.INSTANCE.registerGuiHandler(GoldenWorlds.instance, new GUIHandler());
		FMLCommonHandler.instance().bus().register(new ArmorBonusEvent());
		MinecraftForge.EVENT_BUS.register(new TooltipEvent());
		proxy.preInit(evt);
		proxy.preInitEntities();

		if(FMLCommonHandler.instance().getSide().isClient()){
			MinecraftForge.EVENT_BUS.register(new OverlayEvent());
		}
	}
	
	@EventHandler
	public void init(FMLInitializationEvent evt){
		proxy.initEntities();
		proxy.registerRenderers();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt){
		System.out.println("[GoldenWorlds] Sucessfully enabled mod. Have fun!");
	}
}
