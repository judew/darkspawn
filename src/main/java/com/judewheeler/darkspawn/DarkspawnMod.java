package com.judewheeler.darkspawn;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.judewheeler.darkspawn.items.DarkspawnItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = DarkspawnMod.MODID, version = DarkspawnMod.VERSION)
public class DarkspawnMod {
	public static final String MODID = "darkspawn_mod";
	public static final String VERSION = "1.0";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// This is formerly where we were creating items. Not sure if we still need it. [WLW]
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		addBasicRecipes();
		addEnchantmentRecipes();
	}
	
	private void addBasicRecipes() {
		GameRegistry.addRecipe(new ItemStack(DarkspawnItems.battery),
				" A ",
				" A ",
				" A ",
				'A', Items.iron_ingot);
	}
	
	private void addEnchantmentRecipes() {
		
		// Efficient axe
		ItemStack efficientAxe = new ItemStack(Items.diamond_axe);
		efficientAxe.addEnchantment(Enchantment.efficiency, 127);
		GameRegistry.addShapelessRecipe(efficientAxe, Items.diamond, Items.diamond_axe);
		
		// Efficient pickaxe
		ItemStack efficientPickaxe = new ItemStack(Items.diamond_pickaxe);
		efficientPickaxe.addEnchantment(Enchantment.efficiency, 127);
		GameRegistry.addShapelessRecipe(efficientPickaxe, Items.diamond, Items.diamond_pickaxe);

		// Unbreaking pickaxe
		ItemStack unbreakingPickaxe = new ItemStack(Items.diamond_pickaxe);
		unbreakingPickaxe.addEnchantment(Enchantment.unbreaking, 127);
		GameRegistry.addShapelessRecipe(unbreakingPickaxe, Items.diamond, Items.diamond_pickaxe);
		
		// Fireproof chestplate
		ItemStack fireproofChestplate = new ItemStack(Items.diamond_chestplate);
		fireproofChestplate.addEnchantment(Enchantment.fireProtection, 127);
		GameRegistry.addShapelessRecipe (fireproofChestplate, Items.diamond, Items.diamond_chestplate);
		
		// Fireproof pants
		ItemStack fireproofPants = new ItemStack(Items.diamond_leggings);
		fireproofPants.addEnchantment(Enchantment.fireProtection, 127);
		GameRegistry.addShapelessRecipe (fireproofPants, Items.diamond, Items.diamond_leggings);
		
		// Fireproof booties
		ItemStack fireproofBooties = new ItemStack(Items.diamond_boots);
		fireproofBooties.addEnchantment(Enchantment.fireProtection, 127);
		GameRegistry.addShapelessRecipe (fireproofBooties, Items.diamond, Items.diamond_boots);
		
		// Fireproof helmet
		ItemStack fireproofhelmet = new ItemStack(Items.diamond_helmet);
		fireproofhelmet.addEnchantment(Enchantment.fireProtection, 127);
		GameRegistry.addShapelessRecipe (fireproofhelmet, Items.diamond, Items.diamond_helmet);
		
		// Demon pickaxe
		ItemStack demonPickaxe = new ItemStack(DarkspawnItems.demon_pickaxe);
		demonPickaxe.addEnchantment(Enchantment.efficiency, 127);
		GameRegistry.addShapelessRecipe(demonPickaxe, Items.diamond, DarkspawnItems.demon_pickaxe);
	}
}
