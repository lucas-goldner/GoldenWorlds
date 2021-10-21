package com.lucasgoldner.goldenworlds.entity;

import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityHermanoDeJuanes extends EntityVillager {

    public EntityHermanoDeJuanes(World world) {
        super(world);
        setSize(1,2);
        preventEntitySpawning = true;
        this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(1, new EntityAITempt(this, 1.5D, Items.gold_ingot, false));
        this.setCanPickUpLoot(true);
        this.setCustomNameTag("Hermano De Juanes");
    }

    public EntityHermanoDeJuanes(World world, double x, double y, double z){
        this(world);
        setPosition(x,y,z);
    }

    public boolean isAIEnabled(){
        return true;
    }


    public int getExperiencePoints(EntityPlayer goldnerd) {
        return 100;
    }
}
