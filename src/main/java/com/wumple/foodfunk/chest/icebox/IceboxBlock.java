package com.wumple.foodfunk.chest.icebox;

import com.wumple.util.xchest2.XChestBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class IceboxBlock extends XChestBlock
{
	public static final String ID = "foodfunk:icebox";

	public IceboxBlock()
	{
		super(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD));

		setRegistryName(ID);
	}

	/*
	public IceboxBlock(Block.Properties properties)
	{
		super(properties);
		
		setRegistryName(ID);
	}
	*/

	@Override
	public TileEntity createNewTileEntity(IBlockReader worldIn)
	{
		return new IceboxTileEntity();
	}
}
