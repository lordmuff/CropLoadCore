package lokko12.croploadcore;

import lokko12.croploadcore.CropLoadCore;
import cpw.mods.fml.common.Loader;

public class ModsLoaded {
	public static boolean GT = false;
	public static boolean IC2 = false;
	public static boolean Natura = false;
	public static boolean TConstruct = false;
	public static boolean BoP = false;
	public static boolean TC = false;
	public static boolean witchery = false;
	public static boolean dreamcraft = false;
	
	public static void check_init(String name) {
		IC2 = Loader.isModLoaded("IC2");
		Natura = Loader.isModLoaded("Natura");
		TConstruct = Loader.isModLoaded("TConstruct");
		BoP=Loader.isModLoaded("BiomesOPlenty");
		TC=Loader.isModLoaded("Thaumcraft");
		witchery=Loader.isModLoaded("witchery");
		GT=Loader.isModLoaded("gregtech");
		dreamcraft=Loader.isModLoaded("dreamcraft");
				
		if (ModsLoaded.IC2 == true)
			CropLoadCore.CLClogger.info("IC2 found! "+name+" will now load!");
		else 
			CropLoadCore.CLClogger.error("IC2 NOT INSTALLED! WTF? YOU NEED IT FOR CROPS! POWAOFCAPLSLOCK!",Loader.isModLoaded("IC2"));
		if (ModsLoaded.Natura == true) 
			CropLoadCore.CLClogger.info("Natura found! "+name+" will use their items!");
		else
			CropLoadCore.CLClogger.warn("Natura NOT found! "+name+" will NOT use their items!");
		
		if (ModsLoaded.TConstruct == true)
			CropLoadCore.CLClogger.info("Tinker's Construct found! "+name+" will use their items!");
		else
			CropLoadCore.CLClogger.warn("Tinker's Construct NOT found! "+name+" will NOT use their items!");
		
		if(ModsLoaded.BoP==true)
			CropLoadCore.CLClogger.info("Biomes O' Plenty found!"+name+" will use their items!");
		else
			CropLoadCore.CLClogger.warn("Biomes O' Plenty NOT found! "+name+" will NOT use their items!");
		if(ModsLoaded.TC==true)
			CropLoadCore.CLClogger.info("Thaumcraft found! "+name+" will use their items!");
		else
			CropLoadCore.CLClogger.warn("Thaumcraft NOT found! "+name+" will NOT use their items!");
		if(ModsLoaded.witchery==true)
			CropLoadCore.CLClogger.info("Witchery found! "+name+" will use their items!");
		else
			CropLoadCore.CLClogger.warn("Witchery NOT found! "+name+" will NOT use their items!");
		if(ModsLoaded.GT==true)
			CropLoadCore.CLClogger.info("Gregtech found! "+name+" will use their items!");
		else
			CropLoadCore.CLClogger.warn("Gregtech NOT found! "+name+" will NOT use their items!");
		if(ModsLoaded.dreamcraft==true)
			CropLoadCore.CLClogger.info("Gregtech New Horizons Core Mod found! "+name+" will use their items!");
		else
			CropLoadCore.CLClogger.warn("Gregtech New Horizons Core Mod NOT found! "+name+" will NOT use their items!");
		
	}
	
}
