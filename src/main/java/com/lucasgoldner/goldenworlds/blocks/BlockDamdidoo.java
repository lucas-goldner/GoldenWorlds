package com.lucasgoldner.goldenworlds.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import java.util.Random;

public class BlockDamdidoo extends GoldenWorldsModBlock {
	public BlockDamdidoo() {
		super(Material.glass, "goldenworlds:damdidoo_block", "Damdidoo Block",
				15f, 12f, soundTypeStone);
	}
}
