package com.judewheeler.darkspawn.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.judewheeler.darkspawn.DarkspawnMod;

public abstract class DarkspawnItem extends Item {
	
	public DarkspawnItem(String name, CreativeTabs creativeTab) {
		setUnlocalizedName(DarkspawnMod.MODID + "_" + name);
		setTextureName(DarkspawnMod.MODID + ":" + name);
		setCreativeTab(creativeTab);
	}
}
