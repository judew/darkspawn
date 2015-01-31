package com.judewheeler.darkspawn.items;

import net.minecraft.item.ItemPickaxe;

import com.judewheeler.darkspawn.DarkspawnMod;

public class ItemDemonPickaxe extends ItemPickaxe {
	
	public ItemDemonPickaxe(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(DarkspawnMod.MODID + "_" + name);
		setTextureName(DarkspawnMod.MODID + ":" + name);
	}
}
