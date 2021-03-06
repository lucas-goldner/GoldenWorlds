package com.lucasgoldner.goldenworlds.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.lucasgoldner.goldenworlds.GoldenWorldsTabs;
import com.lucasgoldner.goldenworlds.entity.projectile.EntityBullet;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCannon extends GoldenWorldsModItem {

	private Item ammoItem;
	public float damage;

	public ItemCannon(String tex, String name, int uses, Item ammo, float damage) {
		super(tex, name);
		this.maxStackSize = 1;
		this.setMaxDamage(uses);
		this.ammoItem = ammo;
		this.damage = damage;
		setCreativeTab(GoldenWorldsTabs.Combat);
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {

		if (!world.isRemote) {
			if(player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(ammoItem))
		    {
				world.playSoundAtEntity(player, "goldenworlds:random.cannon", 0.5F, 0.4F /(itemRand.nextFloat() * 0.4F + 0.8F));

				stack.damageItem(1, player);
				
				world.spawnEntityInWorld(new EntityBullet(world, player, damage, ammoItem));
		    }else{
				 world.playSoundAtEntity(player, "gui.button.press", 0.5F, 0.4F /(itemRand.nextFloat() * 0.4F + 0.8F));
		    }
		}

			return stack;
	}
	
	public ItemCannon register(String name){
		GameRegistry.registerItem(this, name);
		return this;
	}
	
	@Override
	public boolean isFull3D(){
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4){
		if(this.getMaxDamage() == -1) list.add(EnumChatFormatting.BLUE + "Infinite Uses");
		else list.add(EnumChatFormatting.GREEN + "" + (stack.getMaxDamage() - stack.getItemDamage()) + " Uses Remaining");
		list.add(EnumChatFormatting.RED + "" + this.damage + " Ranged Damage");
	}
}