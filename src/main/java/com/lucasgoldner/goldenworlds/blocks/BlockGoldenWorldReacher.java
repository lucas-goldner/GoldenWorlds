package com.lucasgoldner.goldenworlds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockGoldenWorldReacher extends GoldenWorldsModBlock {
    public BlockGoldenWorldReacher() {
        super(Material.iron, "goldenworlds:goldenworldreacherblock", "GoldenWorldReacherBlock", 5.0f, 1000000.0f, soundTypeMetal);
    }

    @Override
    public int onBlockPlaced(World world, int i, int j, int k, int p_149660_5_,
                             float p_149660_6_, float p_149660_7_, float p_149660_8_,
                             int p_149660_9_) {
        if (world.getBlock(i, j - 1, k) == Blocks.diamond_block
                && world.getBlock(i, j - 2, k) == Blocks.iron_block
                && world.getBlock(i, j - 3, k) == Blocks.redstone_block
                && world.getBlock(i, j - 4, k) == Blocks.coal_block
                && world.getBlock(i+1, j - 1, k) == Blocks.gold_block
                && world.getBlock(i+1, j - 2, k) == Blocks.gold_block
                && world.getBlock(i+1, j - 3, k) == Blocks.gold_block
                && world.getBlock(i+1, j - 4, k) == Blocks.gold_block
                && world.getBlock(i-1, j - 1, k) == Blocks.gold_block
                && world.getBlock(i-1, j - 2, k) == Blocks.gold_block
                && world.getBlock(i-1, j - 3, k) == Blocks.gold_block
                && world.getBlock(i-1, j - 4, k) == Blocks.gold_block
                && world.getBlock(i, j - 1, k+1) == Blocks.gold_block
                && world.getBlock(i, j - 2, k+1) == Blocks.gold_block
                && world.getBlock(i, j - 3, k+1) == Blocks.gold_block
                && world.getBlock(i, j - 4, k+1) == Blocks.gold_block
                && world.getBlock(i, j - 1, k-1) == Blocks.gold_block
                && world.getBlock(i, j - 2, k-1) == Blocks.gold_block
                && world.getBlock(i, j - 3, k-1) == Blocks.gold_block
                && world.getBlock(i, j - 4, k-1) == Blocks.gold_block) {
            world.scheduleBlockUpdate(i, j, k, this, 4);
            world.setBlock(i, j-1, k, GoldenWorldsBlocks.goldenworlds_portal);
            world.setBlock(i, j-2, k, GoldenWorldsBlocks.goldenworlds_portal);
            world.setBlock(i, j-3, k, GoldenWorldsBlocks.goldenworlds_portal);
            world.setBlock(i, j-4, k, GoldenWorldsBlocks.goldenworlds_portal);
            world.setBlock(i, j-5, k, GoldenWorldsBlocks.goldenworlds_reacher);
            world.setBlock(i+1, j, k, GoldenWorldsBlocks.goldenworlds_reacher);
            world.setBlock(i-1, j, k, GoldenWorldsBlocks.goldenworlds_reacher);
            world.setBlock(i, j, k-1, GoldenWorldsBlocks.goldenworlds_reacher);
            world.setBlock(i, j, k+1,GoldenWorldsBlocks.goldenworlds_reacher);
            world.setBlock(i+1, j-4, k, GoldenWorldsBlocks.goldenworlds_reacher);
            world.setBlock(i-1, j-4, k, GoldenWorldsBlocks.goldenworlds_reacher);
            world.setBlock(i, j-4, k-1, GoldenWorldsBlocks.goldenworlds_reacher);
            world.setBlock(i, j-4, k+1, GoldenWorldsBlocks.goldenworlds_reacher);
            world.setBlock(i+1, j-1, k, Blocks.air);
            world.setBlock(i+1, j-2, k, Blocks.air);
            world.setBlock(i+1, j-3, k, Blocks.air);
            world.setBlock(i-1, j-1, k, Blocks.air);
            world.setBlock(i-1, j-2, k, Blocks.air);
            world.setBlock(i-1, j-3, k, Blocks.air);
            world.setBlock(i, j-1, k+1, Blocks.air);
            world.setBlock(i, j-2, k+1, Blocks.air);
            world.setBlock(i, j-3, k+1, Blocks.air);
            world.setBlock(i, j-1, k-1, Blocks.air);
            world.setBlock(i, j-2, k-1, Blocks.air);
            world.setBlock(i, j-3, k-1, Blocks.air);
        }

        return p_149660_9_;
    }
}
