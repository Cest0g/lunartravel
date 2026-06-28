package net.cestog.lunartravel;

import net.cestog.lunartravel.CreativeModeTab.LunarCreativeModeTab;
import net.cestog.lunartravel.block.LunarBlocks;
import net.cestog.lunartravel.fluid.LunarFluids;
import net.cestog.lunartravel.item.LunarItems;
import net.minecraft.world.level.block.DispenserBlock;
import net.neoforged.neoforge.transfer.fluid.DispenseFluidContainer;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(LunarTravel.MODID)
public class LunarTravel {
    public static final String MODID = "lunartravel";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LunarTravel(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        LunarFluids.FLUIDS.register(modEventBus);
        LunarFluids.FLUID_TYPES.register(modEventBus);
        LunarBlocks.register(modEventBus);
        LunarItems.register(modEventBus);
        LunarCreativeModeTab.register(modEventBus);


       NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> DispenserBlock.registerBehavior(LunarItems.CRUDE_OIL_BUCKET, DispenseFluidContainer.getInstance()));


    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
