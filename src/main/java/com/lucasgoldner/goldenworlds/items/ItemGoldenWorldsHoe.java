package com.lucasgoldner.goldenworlds.items;

import net.minecraft.item.ItemHoe;

import com.lucasgoldner.goldenworlds.GoldenWorldsTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemGoldenWorldsHoe extends ItemHoe
{

	public ItemGoldenWorldsHoe(ToolMaterial par1)
	{
		super(par1);
		setCreativeTab(GoldenWorldsTabs.Tools);
	}
	
	public ItemGoldenWorldsHoe register(String name){
		GameRegistry.registerItem(this, name);
		return this;
	}
}
