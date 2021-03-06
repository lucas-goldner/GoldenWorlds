package com.lucasgoldner.goldenworlds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.lucasgoldner.goldenworlds.GoldenWorlds;
import com.lucasgoldner.goldenworlds.dimension.gen.TeleporterGoldenWorlds;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGoldenWorldsPortal extends GoldenWorldsModBlock {
	
	public BlockGoldenWorldsPortal() {
		super(Material.ice, "goldenworlds:goldenworlds_portal", "goldenworldsPortal", 0f, 0f, soundTypeGlass);
		setCreativeTab(null);
		setBlockUnbreakable();
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
    {
		if ((entity.ridingEntity == null) && (entity.riddenByEntity == null) && ((entity instanceof EntityPlayerMP)))
        {
            EntityPlayerMP thePlayer = (EntityPlayerMP)entity;
            if (thePlayer.timeUntilPortal > 0)
            {
                thePlayer.timeUntilPortal = 10;
            }
            else if (thePlayer.dimension != GoldenWorlds.goldenWorldsDimID)
            {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, GoldenWorlds.goldenWorldsDimID, new TeleporterGoldenWorlds(thePlayer.mcServer.worldServerForDimension(GoldenWorlds.goldenWorldsDimID)));
            }
            
            else if (thePlayer.dimension == GoldenWorlds.goldenWorldsDimID)
            {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterGoldenWorlds(thePlayer.mcServer.worldServerForDimension(0)));
            }
        }
    }

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
		return null;
    }
	
	@Override
	public int getRenderBlockPass(){
		return 1;
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
    {
        Block block = p_149646_1_.getBlock(p_149646_2_, p_149646_3_, p_149646_4_);
            if (p_149646_1_.getBlockMetadata(p_149646_2_, p_149646_3_, p_149646_4_) != p_149646_1_.getBlockMetadata(p_149646_2_ - Facing.offsetsXForSide[p_149646_5_], p_149646_3_ - Facing.offsetsYForSide[p_149646_5_], p_149646_4_ - Facing.offsetsZForSide[p_149646_5_]))
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }

        return block == this ? false : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
    }
}
