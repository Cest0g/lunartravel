package net.cestog.lunartravel.CreativeModeTab;

import net.cestog.lunartravel.LunarTravel;
import net.cestog.lunartravel.item.LunarItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.cestog.lunartravel.LunarTravel.MODID;

public class LunarCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final Supplier<CreativeModeTab> LUNAR_TRAVEL = CREATIVE_MODE_TABS.register("lunartravel",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(LunarItems.ROCKET.get()))
                    .title(Component.translatable("creativetab.lunartravel.lunar_blocks"))
                    .displayItems((params, output) -> {
//                        Items
                        output.accept(LunarItems.RAW_DESH.get());
                        output.accept(LunarItems.DESH_INGOT.get());
                        output.accept(LunarItems.RAW_OSTRUM.get());
                        output.accept(LunarItems.OSTRUM_INGOT.get());
                        output.accept(LunarItems.CHEMICALLY_PURIFIED_CARBON.get());
                        output.accept(LunarItems.COMPRESSED_IRON.get());
                        output.accept(LunarItems.COMPRESSED_DESH.get());
                        output.accept(LunarItems.TIER_1_HEAVY_DUTY_PLATE.get());
                        output.accept(LunarItems.TIER_2_HEAVY_DUTY_PLATE.get());
                        output.accept(LunarItems.BASIC_CIRCUIT.get());
                        output.accept(LunarItems.ADVANCED_CIRCUIT.get());
                        output.accept(LunarItems.OXYGEN_VENT.get());
                        output.accept(LunarItems.OXYGEN_CONCENTRATOR.get());
                        output.accept(LunarItems.ROCKET_FIN.get());
                        output.accept(LunarItems.ROCKET_ENGINE.get());
                        output.accept(LunarItems.NOSE_CONE.get());
                        output.accept(LunarItems.SMALL_OXYGEN_TANK.get());
                        output.accept(LunarItems.MEDIUM_OXYGEN_TANK.get());
                        output.accept(LunarItems.LARGE_OXYGEN_TANK.get());
                        output.accept(LunarItems.ROCKET.get());

//                        Tools
                        output.accept(LunarItems.STEEL_HAMMER.get());
                        output.accept(LunarItems.DESH_SWORD.get());
                        output.accept(LunarItems.DESH_PICKAXE.get());

//                        Armor
                        output.accept(LunarItems.SPACE_SUIT_HELMET.get());
                        output.accept(LunarItems.SPACE_SUIT_CHESTPLATE.get());
                        output.accept(LunarItems.SPACE_SUIT_LEGGINGS.get());
                        output.accept(LunarItems.SPACE_SUIT_BOOTS.get());

                   })
                    .build()
    );

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TABS.register(eventbus);
    }

}
