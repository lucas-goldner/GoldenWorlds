package com.lucasgoldner.goldenworlds.event;

import com.lucasgoldner.goldenworlds.GoldenWorlds;
import com.lucasgoldner.goldenworlds.items.GoldenWorldsItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ArmorBonusEvent {
	public static boolean hasAquatic;
	public static boolean hasFlamestone;
	@SubscribeEvent
	public void tickEvent(PlayerTickEvent evt){
		Item helmet = null, chestplate = null, leggings = null, boots = null;
		ItemStack stackBoots = evt.player.inventory.armorItemInSlot(0);
		ItemStack stackLeggings = evt.player.inventory.armorItemInSlot(1);
		ItemStack stackChestplate = evt.player.inventory.armorItemInSlot(2);
		ItemStack stackHelmet = evt.player.inventory.armorItemInSlot(3);
		
		if(stackHelmet != null) helmet = stackHelmet.getItem();
		if(stackChestplate != null) chestplate = stackChestplate.getItem();
		if(stackLeggings != null) leggings = stackLeggings.getItem();
		if(stackBoots != null) boots = stackBoots.getItem();
		
		if (helmet == GoldenWorldsItems.goldenkinghelmet && chestplate == GoldenWorldsItems.goldenkingchestplate && leggings == GoldenWorldsItems.goldenkingleggings && boots == GoldenWorldsItems.goldenkingboots){
			evt.player.addPotionEffect(new PotionEffect(11, 0, 3, false));
			evt.player.addPotionEffect(new PotionEffect(12, 0, 2, false));
			evt.player.addPotionEffect(new PotionEffect(5, 0, 2, false));
		}

		if (helmet == GoldenWorldsItems.sonic_helmet && chestplate == GoldenWorldsItems.sonic_chestplate && leggings == GoldenWorldsItems.sonic_leggings && boots == GoldenWorldsItems.sonic_boots){
			hasAquatic = true;
			evt.player.addPotionEffect(new PotionEffect(5, 0, 1, false));
			evt.player.addPotionEffect(new PotionEffect(1, 0, 9, false));
			evt.player.addPotionEffect(new PotionEffect(16, 0, 1, false));
			if(evt.player.isInWater()){
				evt.player.capabilities.isFlying = true;
				evt.player.addPotionEffect(new PotionEffect(13, 1, 0, true));
			}else{
				if(!evt.player.capabilities.isCreativeMode){
					evt.player.capabilities.isFlying = false;
				}
			}
		}else{
			hasAquatic = false;
		}
	}
	
	public static boolean getAquatic(){
		return hasAquatic;
	}

	public static boolean getFlamestone(){
		return hasFlamestone;
	}
}
