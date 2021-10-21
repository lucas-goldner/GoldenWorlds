package com.lucasgoldner.goldenworlds.items;

import com.lucasgoldner.goldenworlds.GoldenWorldsTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class GoldenWorldsModItem extends Item {
	
	public GoldenWorldsModItem(String tex, String name){
		super();
		setTextureName(tex);
		setUnlocalizedName(name);
		setCreativeTab(GoldenWorldsTabs.Items);
	}

	public GoldenWorldsModItem register(String name){
		GameRegistry.registerItem(this, name);
		return this;
	}
}
