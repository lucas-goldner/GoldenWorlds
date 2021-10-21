package com.lucasgoldner.goldenworlds.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBalanceBreaker extends Item {
    public ItemBalanceBreaker() {
        super();
        this.setFull3D();
    }

    @Override
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World world, EntityPlayer player) {
        float currentHealth = player.getHealth();
        if(currentHealth > 2.0F){
            player.setHealth(currentHealth - 2.0F);
            if (player.isPotionActive(5)){
                int curStrength = player.getActivePotionEffect(Potion.damageBoost).getAmplifier();
                curStrength++;
                player.addPotionEffect(new PotionEffect(5, 30 * 20 , curStrength, false));
            } else {
                player.addPotionEffect(new PotionEffect(5, 30 * 20 , 0, false));
            }
        } else {
            player.setHealth(2.0F);
        }
        return super.onItemRightClick(p_77659_1_, world, player);
    }
}

