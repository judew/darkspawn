package com.judewheeler.darkspawn;

import com.judewheeler.darkspawn.handlers.RecipeHandlers;
import com.judewheeler.darkspawn.items.DarkspawnItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DarkspawnMod.MODID, version = DarkspawnMod.VERSION)
public class DarkspawnMod {
	public static final String MODID = "darkspawn_mod";
	public static final String VERSION = "1.0";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		DarkspawnItems.registerItems();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		RecipeHandlers.registerRecipes();
	}
}
