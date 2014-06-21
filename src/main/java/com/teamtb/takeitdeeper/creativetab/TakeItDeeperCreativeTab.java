package com.teamtb.takeitdeeper.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TakeItDeeperCreativeTab extends CreativeTabs {

	public TakeItDeeperCreativeTab(int id, String modid)
	{
		super(id, modid);
	}

	@Override
	public Item getTabIconItem()
	{
		return Items.paper;
	}
	
}
