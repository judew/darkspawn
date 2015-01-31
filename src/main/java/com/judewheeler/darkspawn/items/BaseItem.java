package com.judewheeler.darkspawn.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.judewheeler.darkspawn.DarkspawnMod;

public abstract class BaseItem extends Item {
	
	public BaseItem(String name, CreativeTabs creativeTab) {
		setUnlocalizedName(DarkspawnMod.MODID + "_" + name);
		setTextureName(DarkspawnMod.MODID + ":" + name);
		setCreativeTab(creativeTab);
	}
}
