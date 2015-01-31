package com.judewheeler.darkspawn.items;

import net.minecraft.item.ItemPickaxe;

import com.judewheeler.darkspawn.DarkspawnMod;

public abstract class DarkspawnPickaxe extends ItemPickaxe {
	
	public DarkspawnPickaxe(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(DarkspawnMod.MODID + "_" + name);
		setTextureName(DarkspawnMod.MODID + ":" + name);
	}
}
