package net.cestog.lunartravel;

import net.cestog.lunartravel.datagen.LunarLanguagueProvider;
import net.cestog.lunartravel.datagen.LunarModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.cestog.lunartravel.datagen.provider.LunarGlobalLootModifier;
import net.cestog.lunartravel.datagen.provider.LunarRecipeProvider;
import net.cestog.lunartravel.datagen.provider.LunarLootTableProvider;
@EventBusSubscriber(modid = LunarTravel.MODID)
public class LunarDataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new LunarModelProvider(packOutput));
        generator.addProvider(true, new LunarLanguagueProvider(packOutput));
        generator.addProvider(true, new LunarRecipeProvider.Runner(packOutput, lookupProvider));
        generator.addProvider(true, new LunarLootTableProvider(packOutput, lookupProvider));
        generator.addProvider(true, new LunarGlobalLootModifier(packOutput, lookupProvider));
    }
}

