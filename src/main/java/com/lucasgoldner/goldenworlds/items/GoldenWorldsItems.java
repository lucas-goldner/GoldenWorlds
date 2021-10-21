package com.lucasgoldner.goldenworlds.items;

import com.lucasgoldner.goldenworlds.GoldenWorldsTabs;
import com.lucasgoldner.goldenworlds.blocks.GoldenWorldsBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class GoldenWorldsItems {
	
	public static final int HELMET = 0, CHESTPLATE = 1, LEGGINGS = 2, BOOTS = 3;

	public static final ArmorMaterial IRONa = addArmorMaterial("IRON", 206, 9);
	public static final ArmorMaterial DIAMONDa = addArmorMaterial("DIAMOND", 454, 10);
	public static final ArmorMaterial SONICa = addArmorMaterial("QUICK", 3651, 20);
	public static final ArmorMaterial GOLDENKINGa = addArmorMaterial("GOLDENKING", 5651, 30);

	public static final ToolMaterial QUICKt = EnumHelper.addToolMaterial("QUICK", 15, 3651, 35f, 8.5f, 15);
	public static final ToolMaterial GOLDENKINGt = EnumHelper.addToolMaterial("GOLDENKING", 15, 5651, 35f, 22.5f, 30);
	
	//Overworld
	public static final Item.ToolMaterial goldenWorldsGoldMaterial = EnumHelper.addToolMaterial("goldenWorldsGoldMaterial", 4, 2000, 10.0F, 6.0F, Items.golden_sword.getItemEnchantability() + 3);
	public static ItemGoldenKingSword goldenKingSword;
	public static ItemBalanceBreaker balanceBreaker;
	public static Item supergoldenIngot;
	public static Item pureGold;
	public static Item quickShard;
	public static Item goldNerdSpawnEgg;
	public static Item hermanoDeJuanesSpawnEgg;

	public static ItemGoldenWorldsQuickArmor sonic_helmet, sonic_chestplate, sonic_leggings, sonic_boots;
	public static ItemGoldenWorldsGoldenKingArmor goldenkinghelmet, goldenkingchestplate, goldenkingleggings, goldenkingboots;
	
	public static ItemGoldenWorldsSword quick_sword;
	public static ItemGoldenWorldsAxe quick_axe;
	public static ItemGoldenWorldsPickaxe quick_pickaxe;
	public static ItemGoldenWorldsShovel quick_shovel;

	public static ItemGoldenWorldsAxe goldenkingaxe;
	public static ItemGoldenWorldsPickaxe goldenkingspickaxe;
	public static ItemGoldenWorldsShovel goldenkingshovel;

	public static ItemGoldenWorldsBow goldenking_bow, quick_bow;
	public static GoldenWorldsModItem goldenkingarrow, quick_arrow;


	public static void init(){
		pureGold = new ItemPureGold().setUnlocalizedName("Pure Gold").setTextureName("goldenworlds:pure_gold").setCreativeTab(GoldenWorldsTabs.Items);
		supergoldenIngot = new ItemSuperGoldenIngot().setUnlocalizedName("Super Golden Ingot").setTextureName("goldenworlds:super_golden_ingot").setCreativeTab(GoldenWorldsTabs.Items);
		goldenKingSword = (ItemGoldenKingSword) new ItemGoldenKingSword(goldenWorldsGoldMaterial).setUnlocalizedName("GoldenKingSword").setTextureName("goldenworlds:goldenkingsword").setCreativeTab(GoldenWorldsTabs.Combat);
		goldNerdSpawnEgg = new ItemGoldNerdSpanwer().setCreativeTab(GoldenWorldsTabs.Items).setTextureName("goldenworlds:goldnerdspawner");
		hermanoDeJuanesSpawnEgg = new ItemHermanoDeJuanesSpanwer().setCreativeTab(GoldenWorldsTabs.Items).setTextureName("goldenworlds:hermanospawner");
		quickShard = new ItemQuickShard().setUnlocalizedName("Quick Shard").setTextureName("goldenworlds:quick_shard").setCreativeTab(GoldenWorldsTabs.Items);
		sonic_helmet = (ItemGoldenWorldsQuickArmor) new ItemGoldenWorldsQuickArmor(SONICa, HELMET, "sonic", "goldenworlds:sonic_helmet", "helmetSonic", 90D).setCreativeTab(GoldenWorldsTabs.Combat);
		sonic_chestplate = (ItemGoldenWorldsQuickArmor) new ItemGoldenWorldsQuickArmor(SONICa, CHESTPLATE, "sonic", "goldenworlds:sonic_chestplate", "chestplateSonic", 90D).setCreativeTab(GoldenWorldsTabs.Combat);
		sonic_leggings = (ItemGoldenWorldsQuickArmor) new ItemGoldenWorldsQuickArmor(SONICa, LEGGINGS, "sonic", "goldenworlds:sonic_leggings", "leggingsSonic", 90D).setCreativeTab(GoldenWorldsTabs.Combat);
		sonic_boots = (ItemGoldenWorldsQuickArmor) new ItemGoldenWorldsQuickArmor(SONICa, BOOTS, "sonic", "goldenworlds:sonic_boots", "bootsSonic", 90D).setCreativeTab(GoldenWorldsTabs.Combat);
		quick_sword = new ItemGoldenWorldsSword(QUICKt, "goldenworlds:quick_sword", "swordQuick", false);
		quick_pickaxe = (ItemGoldenWorldsPickaxe) new ItemGoldenWorldsPickaxe(QUICKt, "goldenworlds:quick_pickaxe", "pickaxeQuick", false).setCreativeTab(GoldenWorldsTabs.Tools);
		quick_axe = (ItemGoldenWorldsAxe) new ItemGoldenWorldsAxe(QUICKt, "goldenworlds:quick_axe", "axeQuick", false).setCreativeTab(GoldenWorldsTabs.Tools);
		quick_shovel = (ItemGoldenWorldsShovel) new ItemGoldenWorldsShovel(QUICKt, "goldenworlds:quick_shovel", "shovelQuick", false).setCreativeTab(GoldenWorldsTabs.Tools);
		quick_arrow = new GoldenWorldsModItem("goldenworlds:quick_arrow", "arrowQuick");
		quick_arrow.register("quick_arrow");
		quick_bow = new ItemGoldenWorldsBow("goldenworlds:quick_bow", "bowQuick", GoldenWorldsItems.quick_arrow, 3962, 12);

		goldenkinghelmet = new ItemGoldenWorldsGoldenKingArmor(GOLDENKINGa, HELMET, "goldenking", "goldenworlds:goldenking_helmet", "helmetGoldenKing", 90D);
		goldenkingchestplate = new ItemGoldenWorldsGoldenKingArmor(GOLDENKINGa, CHESTPLATE, "goldenking", "goldenworlds:goldenking_chestplate", "chestplateGoldenKing", 90D);
		goldenkingleggings = new ItemGoldenWorldsGoldenKingArmor(GOLDENKINGa, LEGGINGS, "goldenking", "goldenworlds:goldenking_leggings", "leggingsGoldenKing", 90D);
		goldenkingboots = new ItemGoldenWorldsGoldenKingArmor(GOLDENKINGa, BOOTS, "goldenking", "goldenworlds:goldenking_boots", "bootsGoldenKing", 90D);
		goldenkingspickaxe = new ItemGoldenWorldsPickaxe(GOLDENKINGt, "goldenworlds:goldenkingpickaxe", "pickaxeGoldenKing", false);
		goldenkingaxe = new ItemGoldenWorldsAxe(GOLDENKINGt, "goldenworlds:goldenkingaxe", "axeGoldenKing", false);
		goldenkingshovel = new ItemGoldenWorldsShovel(GOLDENKINGt, "goldenworlds:goldenkingshovel", "shovelGoldenKing", false);
		goldenkingarrow = new GoldenWorldsModItem("goldenworlds:goldenking_arrow", "arrowGoldenKing");

		goldenkingarrow.register("goldenking_arrow");
		goldenkinghelmet.register("goldenking_helmet");
		goldenkingchestplate.register("goldenking_chestplate");
		goldenkingleggings.register("goldenking_leggings");
		goldenkingboots.register("goldenking_boots");
		sonic_helmet.register("quick_helmet");
		sonic_chestplate.register("quick_chestplate");
		sonic_leggings.register("quick_leggings");
		sonic_boots.register("quick_boots");
		goldenking_bow = new ItemGoldenWorldsBow("goldenworlds:goldenking_bow", "bowGoldenKing", GoldenWorldsItems.goldenkingarrow, 3962, 20);
		balanceBreaker = (ItemBalanceBreaker) new ItemBalanceBreaker().setUnlocalizedName("Balance Breaker").setTextureName("goldenworlds:balance_breaker").setCreativeTab(GoldenWorldsTabs.Combat);

		GameRegistry.registerItem(pureGold, pureGold.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(goldenKingSword, goldenKingSword.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(supergoldenIngot, supergoldenIngot.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(goldNerdSpawnEgg, goldNerdSpawnEgg.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(hermanoDeJuanesSpawnEgg, hermanoDeJuanesSpawnEgg.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(quickShard, quickShard.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(goldenking_bow, goldenking_bow.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(goldenkingspickaxe, goldenkingspickaxe.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(goldenkingaxe, goldenkingaxe.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(goldenkingshovel, goldenkingshovel.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(quick_axe, quick_axe.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(quick_shovel, quick_shovel.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(quick_pickaxe, quick_pickaxe.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(quick_sword, quick_sword.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(quick_bow, quick_bow.getUnlocalizedName().substring((5)));
		GameRegistry.registerItem(balanceBreaker, balanceBreaker.getUnlocalizedName().substring((5)));
	}
	
	public static ArmorMaterial addArmorMaterial(String name, int durability, int enchantability)
	{
        return EnumHelper.addEnum(ArmorMaterial.class, name, durability/14, new int[]{0, 0, 0, 0}, enchantability);
    }
}
