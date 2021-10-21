package com.lucasgoldner.goldenworlds.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import java.util.Random;

public class BlockGoldenWorldCobbleStone extends GoldenWorldsModBlock {

	public BlockGoldenWorldCobbleStone() {
		super(Material.glass, "goldenworlds:goldenworlds_cobblestone", "GoldenWorlds Cobblestone",
				3f, 12f, soundTypeStone);
	}
}
