package com.lucasgoldner.goldenworlds.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

import com.lucasgoldner.goldenworlds.GoldenWorldsTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockNoahScheibe extends BlockPane {
	protected BlockNoahScheibe() {
		super("goldenworlds:noah_scheibe", "goldenworlds:noah_scheibe", Material.glass, false);
		setCreativeTab(GoldenWorldsTabs.Blocks);
		setHardness(3.5f);
		setResistance(0.0f);
		setBlockName("NoahScheibe");
	}

	public int getRenderBlockPass(){
		return 1;
	}

	public BlockNoahScheibe register(String name){
		GameRegistry.registerBlock(this, name);
		return this;
	}
}
