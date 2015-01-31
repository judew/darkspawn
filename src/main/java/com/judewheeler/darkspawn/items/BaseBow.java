package com.judewheeler.darkspawn.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.judewheeler.darkspawn.DarkspawnMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//http://stackoverflow.com/questions/27305013/custom-bow-pulling-animation-not-showing-minecraft-forge-for-1-7-10
public abstract class BaseBow extends ItemBow {
	private String name;
	
	// Currently just using RPG for all icons, since we don't really "pull" an RPG.
	private final String[] bowPullIconNameArray;
	
	public BaseBow(String name) {
		this.name = name;
		setUnlocalizedName(DarkspawnMod.MODID + "_" + name);
		setTextureName(DarkspawnMod.MODID + ":" + name);
		
		// TODO With real bows we want "name_pulling_0", "name_pulling_1", "name_pulling_2" 
		this.bowPullIconNameArray = new String[] {
				name + "_pulling_0",
				name + "_pulling_1",
				name + "_pulling_2"
		};
	}
		
	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register) {
		
		// Standby icon
		this.itemIcon = register.registerIcon(DarkspawnMod.MODID + ":" + name);
		
		// Pulling icons
		this.iconArray = new IIcon[this.bowPullIconNameArray.length];
		for (int i = 0; i < this.iconArray.length; ++i) {
			this.iconArray[i] = register.registerIcon(DarkspawnMod.MODID + ":" + bowPullIconNameArray[i]);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {
		
		// This is bow behavior, not RPG behavior, but I'm just leaving it for future reference.
		if (usingItem != null) {
			int time = 72000 - useRemaining;
			if (time < 8) {
				return iconArray[0];
			} else if (time < 14) {
				return iconArray[1];
			} else {
				return iconArray[2];
			}
		}
		
		return getIcon(stack, renderPass);
	}

	@Override
	public IIcon getItemIconForUseDuration(int par1) {
		return this.iconArray[par1];
	}
}
