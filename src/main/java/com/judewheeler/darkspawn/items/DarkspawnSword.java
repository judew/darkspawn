package com.judewheeler.darkspawn.items;

import net.minecraft.item.ItemSword;

import com.judewheeler.darkspawn.DarkspawnMod;

public abstract class DarkspawnSword extends ItemSword {
	
	public DarkspawnSword(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(DarkspawnMod.MODID + "_" + name);
		setTextureName(DarkspawnMod.MODID + ":" + name);
	}
}
