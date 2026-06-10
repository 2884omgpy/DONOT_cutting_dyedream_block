package com._2884omgpy.donotcuttingdyedreamblock;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DoNotCuttingDyedreamBlock.MOD_ID)
public class DoNotCuttingDyedreamBlock
{
    public static final String MOD_ID = "donotcuttingdyedreamblock";
    public static DoNotCuttingDyedreamBlock INSTANCE;

    public DoNotCuttingDyedreamBlock(FMLJavaModLoadingContext context)
    {
        INSTANCE = this;
        IEventBus modEventBus = context.getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
