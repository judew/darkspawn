package com.judewheeler.darkspawn.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.judewheeler.darkspawn.DarkspawnMod;

public class ItemBattery extends Item {
	private static final String NAME = "battery";
	
	public ItemBattery() {
		setUnlocalizedName(DarkspawnMod.MODID + "_" + NAME);
		setTextureName(DarkspawnMod.MODID + ":" + NAME);
		setCreativeTab(CreativeTabs.tabMisc);
	}
}
