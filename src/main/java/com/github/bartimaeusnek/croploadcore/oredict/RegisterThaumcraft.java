package com.github.bartimaeusnek.croploadcore.oredict;

import static thaumcraft.api.ItemApi.getBlock;

import net.minecraftforge.oredict.OreDictionary;

public class RegisterThaumcraft implements OreDictRegistrator {

    @Override
    public String getModWhichRegisters() {
        return "Thaumcraft";
    }

    @Override
    public void run() {
        OreDictionary.registerOre("cropShimmerleaf", getBlock("blockCustomPlant", 2));
        OreDictionary.registerOre("cropCinderpearl", getBlock("blockCustomPlant", 3));
        OreDictionary.registerOre("cropGrass", getBlock("blockTaintFibres", 1));
    }
}
