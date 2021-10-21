package com.lucasgoldner.goldenworlds.dimension.gen;

import com.lucasgoldner.goldenworlds.GoldenWorlds;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OverworldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
				if (world.provider.dimensionId == GoldenWorlds
						.goldenWorldsDimID) {
						generateGoldenWorlds(world, random, chunkX * 16, chunkZ * 16);
				}
	}

	public void generateGoldenWorlds(World world, Random random, int chunkX, int chunkZ){
		for (int i = 0; i < 2; i++){
			int Xcoord1 = chunkX + random.nextInt(16);
			int Ycoord1 = 127;
			int Zcoord1 = chunkZ + random.nextInt(16);
			if(random.nextInt(500) == 50) new WorldGenSkyDungeon().generate(world, random, Xcoord1, Ycoord1, Zcoord1);
		}
	}
}
