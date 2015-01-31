package com.judewheeler.darkspawn.items;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Darkspawn items go here.
 * 
 * @author judewheeler
 * @author Willie Wheeler
 */
public class DarkspawnItems {
	
	// Items
	public static final ItemBattery battery = new ItemBattery();
	public static final ItemDemonPickaxe demon_pickaxe = new ItemDemonPickaxe();
	public static final ItemDemonSword demon_sword = new ItemDemonSword();
	public static final ItemRainbowShot rainbow_shot = new ItemRainbowShot();
	public static final ItemEmeraldSword emerald_sword = new ItemEmeraldSword();
	
	public static void registerItems() {
		GameRegistry.registerItem(battery, "Battery");
		GameRegistry.registerItem(demon_pickaxe, "DemonPickaxe");
		GameRegistry.registerItem(demon_sword, "DemonSword");
		GameRegistry.registerItem(rainbow_shot, "RainbowShot");
		GameRegistry.registerItem(emerald_sword, "EmeraldSword");
	}
}
