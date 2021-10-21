package com.lucasgoldner.goldenworlds.entity;

import java.util.Random;

import com.lucasgoldner.goldenworlds.items.GoldenWorldsItems;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityKekGolem extends EntityMob{

	public EntityKekGolem(World w) {
		super(w);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        setSize(0.6F, 1.8F);
	}

	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.314159265D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
    }
	
	@Override
	protected void entityInit()
    {
        super.entityInit();
        this.getDataWatcher().addObject(12, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(13, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(14, Byte.valueOf((byte)0));
    }
	
	@Override
	protected boolean isAIEnabled(){
		return true;
	}
	
	@Override
	protected String getLivingSound()
    {
        return "goldenworlds:mob.kekgolem.growl";
    }

    @Override
    protected String getHurtSound()
    {
        return "goldenworlds:mob.kekgolem.death";
    }

    @Override
    protected String getDeathSound()
    {
        return "goldenworlds:mob.kekgolem.death";
    }
    
    @Override
    protected Item getDropItem()
    {
        Random rand = new Random();
        int i = rand.nextInt(4);
        if (i == 1) return GoldenWorldsItems.goldNerdSpawnEgg;
        if (i == 2) return GoldenWorldsItems.hermanoDeJuanesSpawnEgg;
        else return Item.getItemFromBlock(Blocks.air);
    }
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.ARTHROPOD;
    }
    
    @Override
    protected boolean isValidLightLevel(){
    	return true;
    }
    
    @Override
    public boolean getCanSpawnHere()
    {
        return this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && !this.worldObj.isAnyLiquid(this.boundingBox);
    }
}
