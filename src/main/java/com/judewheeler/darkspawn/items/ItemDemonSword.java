package com.judewheeler.darkspawn.items;

import com.judewheeler.darkspawn.DarkspawnMod;

import net.minecraft.item.ItemSword;

public class ItemDemonSword extends ItemSword {
	
	public ItemDemonSword(ToolMaterial material, String name) {
		super(material);
		
		setUnlocalizedName(DarkspawnMod.MODID + "_" + name);
		setTextureName(DarkspawnMod.MODID + ":" + name);
		
	}
}
