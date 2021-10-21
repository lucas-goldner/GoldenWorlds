package com.lucasgoldner.goldenworlds;

import com.lucasgoldner.goldenworlds.blocks.GoldenWorldsBlocks;
import com.lucasgoldner.goldenworlds.items.GoldenWorldsItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GoldenWorldsTabs {
	public static final CreativeTabs Blocks = new CreativeTabs(CreativeTabs.getNextID(), "GoldenWorldsBlocks"){
		@Override
		public Item getTabIconItem(){
			return Item.getItemFromBlock(GoldenWorldsBlocks.goldenworlds_reacher);
		}
	};

	public static final CreativeTabs Items = new CreativeTabs(CreativeTabs.getNextID(), "GoldenWorldsItems"){
		@Override
		public Item getTabIconItem(){
			return GoldenWorldsItems.quickShard;
		}
	};
	
	public static final CreativeTabs Combat = new CreativeTabs(CreativeTabs.getNextID(), "GoldenWorldsCombatItems"){
		@Override
		public Item getTabIconItem(){
			return GoldenWorldsItems.goldenKingSword;
		}
	};
	
	public static final CreativeTabs Tools = new CreativeTabs(CreativeTabs.getNextID(), "GoldenWorldsTools"){
		@Override
		public Item getTabIconItem(){
			return GoldenWorldsItems.quick_pickaxe;
		}
	};
}
