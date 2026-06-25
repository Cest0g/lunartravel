package net.cestog.lunartravel.datagen;

import net.cestog.lunartravel.item.LunarItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class LunarLanguagueProvider extends LanguageProvider {
    public LunarLanguagueProvider(PackOutput output) {
        super(output, "lunartravel", "en_us");
    }
    @Override
    protected void addTranslations() {


//        Raw Items
        add(LunarItems.RAW_DESH.get(), "Raw Desh");
        add(LunarItems.RAW_LUNAR.get(), "Raw Lunar");
        add(LunarItems.RAW_ALUMINIUM.get(), "Raw Aluminium");
        add(LunarItems.RAW_NICKEL.get(), "Raw Nickel");
        add(LunarItems.RAW_PLATINA.get(), "Raw Platina");
        add(LunarItems.RAW_LITHIUM.get(), "Raw Lithium");
        add(LunarItems.RAW_TITANIUM.get(), "Raw Titanium");
        add(LunarItems.RAW_METEORITE_IRON.get(), "Raw Meteorite Iron");



//        Ingots
        add(LunarItems.DESH_INGOT.get(), "Desh Ingot");
        add(LunarItems.LUNAR_INGOT.get(), "Lunar Ingot");
        add(LunarItems.ALUMINIUM_INGOT.get(), "Aluminium Ingot");
        add(LunarItems.NICKEL_INGOT.get(), "Nickel Ingot");
        add(LunarItems.METEORITE_IRON_INGOT.get(), "Meteorite Iron Ingot");
        add(LunarItems.PLATINA_INGOT.get(), "Platina Ingot");
        add(LunarItems.TITANIUM_INGOT.get(), "Titanium Ingot");
        add(LunarItems.LITHIUM_INGOT.get(), "Lithium Ingot");
        add(LunarItems.CHEMICALLY_PURIFIED_CARBON.get(), "Chemically Purified Carbon");


//        Compressed Ingots
        add(LunarItems.COMPRESSED_IRON.get(), "Compressed Iron");
        add(LunarItems.COMPRESSED_DESH.get(), "Compressed Desh");

//        Plates
        add(LunarItems.TIER_1_HEAVY_DUTY_PLATE.get(), "Tier 1 Heavy Duty Plate");
        add(LunarItems.TIER_2_HEAVY_DUTY_PLATE.get(), "Tier 2 Heavy Duty Plate");

//        Circuits
        add(LunarItems.BASIC_CIRCUIT.get(), "Basic Circuit");
        add(LunarItems.ADVANCED_CIRCUIT.get(), "Advanced Circuit");

//        Parts
        add(LunarItems.OXYGEN_VENT.get(), "Oxygen Vent");
        add(LunarItems.OXYGEN_CONCENTRATOR.get(), "Oxygen Concentrator");
        add(LunarItems.ROCKET.get(), "Rocket");
        add(LunarItems.ROCKET_FIN.get(), "Rocket Fin");
        add(LunarItems.ROCKET_ENGINE.get(), "Rocket Engine");
        add(LunarItems.NOSE_CONE.get(), "Nose Cone");
//        Oxygen Tanks
        add(LunarItems.SMALL_OXYGEN_TANK.get(), "Small Oxygen Tank");
        add(LunarItems.MEDIUM_OXYGEN_TANK.get(), "Medium Oxygen Tank");
        add(LunarItems.LARGE_OXYGEN_TANK.get(), "Large Oxygen Tank");

//        Tools
        add(LunarItems.STEEL_HAMMER.get(), "Steel Hammer");
        add(LunarItems.DESH_SWORD.get(), "Desh Sword");
        add(LunarItems.DESH_PICKAXE.get(), "Desh Pickaxe");


//        Space armor
        add(LunarItems.SPACE_SUIT_HELMET.get(), "Space Helmet");
        add(LunarItems.SPACE_SUIT_CHESTPLATE.get(), "Space Chestplate");
        add(LunarItems.SPACE_SUIT_LEGGINGS.get(), "Space Leggings");
        add(LunarItems.SPACE_SUIT_BOOTS.get(), "Space Boots");




//        CreativeModeTab
        add("creativetab.lunartravel.lunar_blocks", "Lunar Travel");


    }
}
