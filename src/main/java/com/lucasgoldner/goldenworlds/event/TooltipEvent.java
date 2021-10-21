package com.lucasgoldner.goldenworlds.event;

import com.lucasgoldner.goldenworlds.items.ItemGoldenWorldsSword;
import com.lucasgoldner.goldenworlds.items.ItemGoldenWorldsTool;
import com.lucasgoldner.goldenworlds.items.GoldenWorldsItems;
import net.minecraft.item.ItemBow;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class TooltipEvent {
	
	@SubscribeEvent
	public void tooltipEvent(ItemTooltipEvent evt){
		if (evt.itemStack.getItem() instanceof ItemGoldenWorldsSword){
			for(int i = 0; i < evt.toolTip.size(); i++){
				if(evt.toolTip.get(i).contains("Attack Damage") && evt.toolTip.get(i).contains("+")){
					evt.toolTip.remove(i);
					evt.toolTip.remove(i - 1);
				}
			}
		}
		
		if (evt.itemStack.getItem() instanceof ItemGoldenWorldsTool){
			for(int i = 0; i < evt.toolTip.size(); i++){
				if(evt.toolTip.get(i).contains("Attack Damage") && evt.toolTip.get(i).contains("+")){
					evt.toolTip.remove(i);
					evt.toolTip.remove(i - 1);
				}
			}
		}
		
		if (evt.itemStack.getItem() instanceof ItemBow){
			evt.toolTip.add(EnumChatFormatting.GREEN + "" + (evt.itemStack.getMaxDamage() - evt.itemStack.getItemDamage()) + " Uses Remaining");
			evt.toolTip.add(EnumChatFormatting.RED + "" + "2 Minimum Ranged Damage");
		}
	}
}
