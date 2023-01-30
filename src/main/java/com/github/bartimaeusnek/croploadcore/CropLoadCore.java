package com.github.bartimaeusnek.croploadcore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = CropLoadCore.MODID,
        name = CropLoadCore.MODNAME,
        version = CropLoadCore.VERSION,
        dependencies = " after:witchery;" + " after:Ztones;"
                + " after:GalacticraftCore;"
                + " after:GalacticraftPlanets;"
                + " after:IC2;"
                + " after:Mantle;"
                + " after:Natura;"
                + " after:TConstruct;"
                + " after:BiomesOPlenty;"
                + " after:Thaumcraft;"
                + " after:ExtraTrees;"
                + " after:gregtech;"
                + " after:dreamcraft;"
                + " after:thaumicbases")

public class CropLoadCore {

    public static final String MODID = "croploadcore";
    public static final String MODNAME = "CropLoadCore";
    public static final String VERSION = "GRADLETOKEN_VERSION";
    public static final Logger CLClogger = LogManager.getLogger("CropLoadCore");

    @Instance(value = "CropLoadCore")
    public static CropLoadCore instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent preinit) {
        ModsLoaded.check_init("bartimaeusnek's mods");
    }

    @EventHandler
    public void Init(FMLInitializationEvent init) {
        OreDict.register();
    }
}
