package com.lucasgoldner.goldenworlds.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;

import com.lucasgoldner.goldenworlds.GoldenWorldsTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemGoldenWorldsSword extends ItemSword{
	private ToolMaterial t;
	
    public ItemGoldenWorldsSword(ToolMaterial tool, String tex, String name, boolean isVanilla) {
		super(tool);
		setTextureName(tex);
		setUnlocalizedName(name);
		if (!isVanilla) setCreativeTab(GoldenWorldsTabs.Combat); else setCreativeTab(null);
		t = tool;
	}

	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}

	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
		if(item.getMaxDamage() == -1) {
			infoList.add(EnumChatFormatting.BLUE + "Infinite Uses");
		}
		else {
			infoList.add(EnumChatFormatting.GREEN + "" + (item.getMaxDamage() - item.getItemDamage()) + " Uses Remaining");
		}
		
		infoList.add(EnumChatFormatting.DARK_RED + "" + (t.getDamageVsEntity() + 4.0f) + " Attack Damage");
	}
	
	public ItemGoldenWorldsSword register(String name){
		GameRegistry.registerItem(this, name);
		return this;
	}
}