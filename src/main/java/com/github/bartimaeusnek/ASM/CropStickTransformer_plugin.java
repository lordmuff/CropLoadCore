package com.github.bartimaeusnek.ASM;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.Name;

import java.util.Map;

@MCVersion("1.7.10")
@TransformerExclusions({"com.github.bartimaeusnek.ASM"})
@Name(CropStickTransformer_plugin.NAME)
public class CropStickTransformer_plugin implements IFMLLoadingPlugin {

    public static final String NAME = "CroploadCore ASM Core";

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{CropStickTransformer.class.getName()};
    }

    @Override
    public String getModContainerClass() {
        return CropLoadCoreASM.class.getName();
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

}
