package com.lucasgoldner.goldenworlds;

import com.lucasgoldner.goldenworlds.blocks.ContainerExtractor;
import com.lucasgoldner.goldenworlds.blocks.TileEntityExtractor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.lucasgoldner.goldenworlds.client.GUIExtractor;

import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler{

	public static int guiID = 0;
    public static int extractor = guiID++;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(ID == extractor){
			return new ContainerExtractor(player.inventory, (TileEntityExtractor)entity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		if(ID == extractor){
			return new GUIExtractor(player.inventory, (TileEntityExtractor)entity);
		}
		return null;
	}

}