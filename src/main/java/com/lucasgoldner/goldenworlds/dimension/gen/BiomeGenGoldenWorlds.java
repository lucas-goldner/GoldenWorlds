package com.lucasgoldner.goldenworlds.dimension.gen;

import java.util.Random;

import com.lucasgoldner.goldenworlds.entity.EntityGoldNerd;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenGoldenWorlds extends BiomeGenBase
{
    private static final String __OBFID = "CL_00000179";

    public BiomeGenGoldenWorlds(int id)
    {
        super(id);
    }

    @Override
    public TempCategory getTempCategory()
    {
        return TempCategory.WARM;
    }

    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {
        super.genTerrainBlocks(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }

    @Override
    public BiomeGenBase setBiomeName(String p_76735_1_) {
        return super.setBiomeName("Golden Worlds");
    }
}