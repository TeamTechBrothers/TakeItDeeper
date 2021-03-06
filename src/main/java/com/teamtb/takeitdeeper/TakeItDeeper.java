package com.teamtb.takeitdeeper;

import com.teamtb.takeitdeeper.core.proxy.CommonProxy;
import com.teamtb.takeitdeeper.creativetab.TakeItDeeperCreativeTab;
import com.teamtb.takeitdeeper.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)
public class TakeItDeeper {
    /**
     * An instance of our @Mod
     */
    @Mod.Instance
    public static TakeItDeeper instance;
	
	@SidedProxy(clientSide = References.CLIENTPROXYLOCATION, serverSide = References.COMMONPROXYLOCATION)
	public static CommonProxy proxy;

	private static CreativeTabs TakeItDeeperCreativeTab = new TakeItDeeperCreativeTab(CreativeTabs.getNextID(), References.MODID);

	public static CreativeTabs getCreativeTab()
	{
		return TakeItDeeperCreativeTab;
	}

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
				
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent event)
	{
        
	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{

	}
}
