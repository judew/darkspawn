package com.judewheeler.darkspawn.items;

import net.minecraft.item.ItemSword;

import com.judewheeler.darkspawn.DarkspawnMod;

public abstract class BaseSword extends ItemSword {
	
	public BaseSword(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(DarkspawnMod.MODID + "_" + name);
		setTextureName(DarkspawnMod.MODID + ":" + name);
	}
}
