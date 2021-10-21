package com.lucasgoldner.goldenworlds.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityGoldNerd extends EntityAnimal {

    public EntityGoldNerd(World world) {
        super(world);
        setSize(1,2);
        preventEntitySpawning = true;
        this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(1, new EntityAITempt(this, 1.5D, Items.gold_ingot, false));
        this.setCanPickUpLoot(true);
        this.setCustomNameTag("GoldNerd");
    }

    public EntityGoldNerd(World world, double x, double y, double z){
        this(world);
        setPosition(x,y,z);
    }

    public boolean isAIEnabled(){
        return true;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entityAgeable) {
        return null;
    }


    public int getExperiencePoints(EntityPlayer goldnerd) {
        return 500;
    }
}
