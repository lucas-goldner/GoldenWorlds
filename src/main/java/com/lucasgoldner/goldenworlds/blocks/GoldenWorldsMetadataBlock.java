package com.lucasgoldner.goldenworlds.blocks;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GoldenWorldsMetadataBlock extends GoldenWorldsModBlock
{
	private String[] textureNames;
    @SideOnly(Side.CLIENT)
    private IIcon[] theIcon;
    public int metaCount;

    public GoldenWorldsMetadataBlock(int blockCount, String[] textureExtensions, Material mat, String tex, String name, float hard, float resist, SoundType sound)
    {
        super(mat, tex, name, hard, resist, sound);
        
        this.metaCount = blockCount;
        this.textureNames = textureExtensions;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        if (par2 < 0 || par2 >= textureNames.length)
        {
            par2 = 0;
        }
        
        return this.theIcon[par2];
    }

    public int damageDropped(int par1)
    {
        return par1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < metaCount; ++i)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icons)
    {
        this.theIcon = new IIcon[textureNames.length];

        for (int i = 0; i < this.textureNames.length; ++i)
        {
            String s = this.getTextureName();

            if (textureNames[i] != null)
            {
                s = s + "_" + textureNames[i];
            }

            this.theIcon[i] = icons.registerIcon(s);
        }
    }
    
    public GoldenWorldsMetadataBlock register(Class<? extends ItemBlock> ib, String name){
    	GameRegistry.registerBlock(this, ib, name);
    	return this;
    }
}