package com.judewheeler.darkspawn.items;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Darkspawn items go here.
 * 
 * @author judewheeler
 */
public class DarkspawnItems {
	public static final ItemBattery battery = new ItemBattery();
	public static final ItemDemonPickaxe demon_pickaxe = new ItemDemonPickaxe(DarkspawnMaterials.demos, "demon_pickaxe");
	
	static {
		GameRegistry.registerItem(battery, "Battery");
		GameRegistry.registerItem(demon_pickaxe, "DemonPickaxe");
	}
}
