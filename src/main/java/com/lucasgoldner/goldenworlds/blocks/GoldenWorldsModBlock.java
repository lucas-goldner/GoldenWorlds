package com.lucasgoldner.goldenworlds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.lucasgoldner.goldenworlds.GoldenWorldsTabs;

import cpw.mods.fml.common.registry.GameRegistry;
public class GoldenWorldsModBlock extends Block{

	public String blockName;
	
	public GoldenWorldsModBlock(Material mat, String tex, String name, float hard, float resist, SoundType sound) {
		super(mat);
		this.setBlockTextureName(tex);
		this.setBlockName(name);
		this.setHardness(hard);
		this.setResistance(resist);
		this.setCreativeTab(GoldenWorldsTabs.Blocks);
		this.setStepSound(sound);
		
		blockName = name;
	}
	
	public GoldenWorldsModBlock register(String nam){
		GameRegistry.registerBlock(this, nam);
		return this;
	}
}
