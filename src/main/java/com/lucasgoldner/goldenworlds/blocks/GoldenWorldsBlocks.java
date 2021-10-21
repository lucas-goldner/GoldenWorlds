package com.lucasgoldner.goldenworlds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class GoldenWorldsBlocks {
	//Overworld
    public static GoldenWorldsModBlock damdidoo_block;
    public static GoldenWorldsModBlock goldenworlds_stone;
    public static GoldenWorldsModBlock goldenworlds_cobblestone;
    public static Block extractor;
    public static Block extractor_on;
    public static BlockNoahScheibe noah_scheibe;
    public static BlockGoldChest gold_chest;
    public static GoldenWorldsModBlock goldenworlds_reacher;
    public static GoldenWorldsModBlock goldenworlds_portal;

    public static void init(){
        noah_scheibe = new BlockNoahScheibe().register("noah_scheibe");
        damdidoo_block = new BlockDamdidoo().register("goldenworldsdamdidoo");
        goldenworlds_cobblestone = new BlockGoldenWorldCobbleStone().register("goldenworldscobblestone");
        goldenworlds_stone = new BlockGoldenWorldStone().register("goldenworldstone");
        goldenworlds_reacher = new BlockGoldenWorldReacher().register("goldenworldreacherblock");
	    extractor = new BlockExtractor(false).register("extractor");
        extractor_on = new BlockExtractor(true).register("extractor_on");
        gold_chest = new BlockGoldChest().register("gold_chest");
        goldenworlds_portal = new BlockGoldenWorldsPortal().register("goldenworlds_portal");
	}
}