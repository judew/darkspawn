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
	public static final ItemDemonSword demon_sword = new ItemDemonSword(DarkspawnMaterials.demos, "demon_sword");
	public static final ItemRainbowShot rainbow_shot = new ItemRainbowShot("rainbow_shot");
	public static final ItemEmeraldSword emerald_sword = new ItemEmeraldSword(DarkspawnMaterials.demos, "emerald_sword");
	
	public static void registerItems() {
		GameRegistry.registerItem(battery, "Battery");
		GameRegistry.registerItem(demon_pickaxe, "DemonPickaxe");
		GameRegistry.registerItem(demon_sword, "DemonSword");
		GameRegistry.registerItem(rainbow_shot, "RainbowShot");
		GameRegistry.registerItem(emerald_sword, "EmeraldSword");
	}
}
