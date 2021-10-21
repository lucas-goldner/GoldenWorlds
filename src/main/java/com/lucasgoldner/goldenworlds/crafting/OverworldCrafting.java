package com.lucasgoldner.goldenworlds.crafting;

import com.lucasgoldner.goldenworlds.blocks.GoldenWorldsBlocks;
import com.lucasgoldner.goldenworlds.items.GoldenWorldsItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

public class OverworldCrafting {
	
	public static void initRecipes(){
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.goldenKingSword), " G ", " G ", " S ",'G', GoldenWorldsItems.pureGold ,'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.quick_sword), " G ", " G ", " S ",'G', GoldenWorldsItems.quickShard ,'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.goldenkingaxe), "GG ", "GS ", " S ",'G', GoldenWorldsItems.pureGold ,'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.goldenkingshovel), " G ", " S ", " S ",'G', GoldenWorldsItems.pureGold ,'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.goldenkingspickaxe), "GGG", " S ", " S ",'G', GoldenWorldsItems.pureGold ,'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.goldenking_bow), " GS", "G S", " GS",'G', GoldenWorldsItems.pureGold ,'S', Items.string);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.goldenkingarrow, 16) , "G  ", " S ", "  F",'G', GoldenWorldsItems.pureGold ,'S', Items.stick, 'F', Items.feather);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.quick_axe), "GG ", "GS ", " S ",'G', GoldenWorldsItems.quickShard ,'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.quick_shovel), "G", "S", "S",'G', GoldenWorldsItems.quickShard ,'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.quick_pickaxe), "GGG", " S ", " S ",'G', GoldenWorldsItems.quickShard ,'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.quick_bow), " GS", "G S", " GS",'G', GoldenWorldsItems.quickShard ,'S', Items.string);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.quick_arrow, 16) , "G  ", " S ", "  F",'G', GoldenWorldsItems.quickShard ,'S', Items.stick, 'F', Items.feather);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.balanceBreaker),"GRG", "DRD", "DRD", 'G', GoldenWorldsItems.pureGold , 'R', Blocks.redstone_block, 'D', Items.redstone);
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.sonic_helmet), new Object[]{RecipeHelper.armorPatterns[0], 'X', GoldenWorldsItems.quickShard});
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.sonic_chestplate), new Object[]{RecipeHelper.armorPatterns[1], 'X', GoldenWorldsItems.quickShard});
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.sonic_leggings), new Object[]{RecipeHelper.armorPatterns[2], 'X', GoldenWorldsItems.quickShard});
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.sonic_boots), new Object[]{RecipeHelper.armorPatterns[3], 'X', GoldenWorldsItems.quickShard});
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.goldenkinghelmet), new Object[]{RecipeHelper.armorPatterns[0], 'X', GoldenWorldsItems.pureGold});
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.goldenkingchestplate), new Object[]{RecipeHelper.armorPatterns[1], 'X', GoldenWorldsItems.pureGold});
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.goldenkingleggings), new Object[]{RecipeHelper.armorPatterns[2], 'X', GoldenWorldsItems.pureGold});
		GameRegistry.addRecipe(new ItemStack(GoldenWorldsItems.goldenkingboots), new Object[]{RecipeHelper.armorPatterns[3], 'X', GoldenWorldsItems.pureGold});

		GameRegistry.addShapedRecipe(new ItemStack(GoldenWorldsBlocks.extractor, 3), "RGR","GNG", "RGR", 'G', Items.gold_ingot, 'R', Blocks.redstone_block, 'N', Items.nether_star);
		GameRegistry.addShapedRecipe(new ItemStack(GoldenWorldsBlocks.goldenworlds_reacher, 2), "DDD","DGD", "DDD", 'G', Blocks.gold_block, 'D', Blocks.diamond_block);
		ExtractorRecipes.addItemRecipe(Item.getItemFromBlock(GoldenWorldsBlocks.goldenworlds_stone), new ItemStack(Item.getItemFromBlock(Blocks.gold_block)), 150.0f);
		ExtractorRecipes.addItemRecipe(Item.getItemFromBlock(GoldenWorldsBlocks.damdidoo_block), new ItemStack(Item.getItemFromBlock(Blocks.melon_block)), 50.0f);
		ExtractorRecipes.addItemRecipe(GoldenWorldsItems.supergoldenIngot, new ItemStack(GoldenWorldsItems.pureGold), 50.0f);
	}
}
