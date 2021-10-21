package com.lucasgoldner.goldenworlds.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class BlockGoldenWorldStone extends GoldenWorldsModBlock {

	public BlockGoldenWorldStone() {
		super(Material.glass, "goldenworlds:goldenworlds_stone", "GoldenWorlds Stone",
				15f, 12f, soundTypeStone);
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Item.getItemFromBlock(GoldenWorldsBlocks.goldenworlds_cobblestone);
	}

	@Override
	public int quantityDropped(Random p_149745_1_) {
		return 1;
	}
}
