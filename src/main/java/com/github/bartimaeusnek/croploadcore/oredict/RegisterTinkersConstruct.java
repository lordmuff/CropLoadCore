package com.github.bartimaeusnek.croploadcore.oredict;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import tconstruct.world.TinkerWorld;

public class RegisterTinkersConstruct implements OreDictRegistrator {

    @Override
    public String getModWhichRegisters() {
        return "TConstruct";
    }

    @Override
    public void run() {
        OreDictionary.registerOre("cropGrass", new ItemStack(TinkerWorld.slimeGrass, 1, 0));
        OreDictionary.registerOre("cropGrass", new ItemStack(TinkerWorld.slimeTallGrass, 1, 0));
    }
}
