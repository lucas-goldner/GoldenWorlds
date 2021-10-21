package com.lucasgoldner.goldenworlds.blocks;

import net.minecraft.tileentity.TileEntityChest;

public class TileEntityGoldChest extends TileEntityChest{
	
	public TileEntityGoldChest(){
		func_145976_a("Gold Chest");
	}
	
	private int cachedChestType;
	@Override
	public void closeInventory()
    {
        if (this.getBlockType() instanceof BlockGoldChest)
        {
            --this.numPlayersUsing;
            this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, this.getBlockType(), 1, this.numPlayersUsing);
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, this.getBlockType());
            this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord - 1, this.zCoord, this.getBlockType());
        }
    }
	
	@Override
	public int func_145980_j()
    {
        return 0;
    }
	
	@Override
	public boolean hasCustomInventoryName()
    {
        return true;
    }

}
