package com.judewheeler.darkspawn.items;

import com.judewheeler.darkspawn.DarkspawnMod;

import net.minecraft.item.ItemPickaxe;

public class ItemDemonPickaxe extends ItemPickaxe {
	
	public ItemDemonPickaxe(ToolMaterial material, String name) {
		super(material);
		
		setUnlocalizedName(DarkspawnMod.MODID + "_" + name);
		setTextureName(DarkspawnMod.MODID + ":" + name);
	}

}
