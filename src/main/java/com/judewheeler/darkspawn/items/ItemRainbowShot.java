package com.judewheeler.darkspawn.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;

import com.judewheeler.darkspawn.DarkspawnMod;

public class ItemRainbowShot extends ItemBow {

	public ItemRainbowShot(String name) {
		setUnlocalizedName(DarkspawnMod.MODID + "_" + name);
		setTextureName(DarkspawnMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
