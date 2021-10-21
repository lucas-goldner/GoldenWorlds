package com.lucasgoldner.goldenworlds.dimension.gen;

import com.lucasgoldner.goldenworlds.GoldenWorlds;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorldProviderGoldenWorlds extends WorldProvider{

	@Override
	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(GoldenWorlds.goldenWorldsBiome, 0.8f);
		this.dimensionId = GoldenWorlds.goldenWorldsDimID;
	}
	
	public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderGoldenWorlds(worldObj, worldObj.getSeed(), true);
    }
	
	@SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {
        return 225;
    }
	
	@Override
	public String getDimensionName() {
		return "Golden Worlds"; //TODO: find a decent name for the dimension
	}
	
	@Override
	public boolean canRespawnHere(){
		return false;
	}
}
