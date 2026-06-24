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
        add(LunarItems.RAW_DESH.get(), "Raw Desh");
        add(LunarItems.RAW_OSTRUM.get(), "Desh Ingot");
        add(LunarItems.OSTRUM_INGOT.get(), "Ostrum Ingot");
        add(LunarItems.CHEMICALLY_PURIFIED_CARBON.get(), "Chemically Purified Carbon");
        add(LunarItems.COMPRESSED_IRON.get(), "Compressed Iron");
        add(LunarItems.COMPRESSED_DESH.get(), "Compressed Desh");
        add(LunarItems.TIER_1_HEAVY_DUTY_PLATE.get(), "Tier 1 Heavy Duty Plate");
        add(LunarItems.TIER_2_HEAVY_DUTY_PLATE.get(), "Tier 2 Heavy Duty Plate");
        add(LunarItems.BASIC_CIRCUIT.get(), "Basic Circuit");
        add(LunarItems.ADVANCED_CIRCUIT.get(), "Advanced Circuit");
        add(LunarItems.OXYGEN_VENT.get(), "Oxygen Vent");
        add(LunarItems.OXYGEN_CONCENTRATOR.get(), "Oxygen Concentrator");
        add(LunarItems.ROCKET_FIN.get(), "Rocket Fin");
        add(LunarItems.ROCKET_ENGINE.get(), "Rocket Engine");
        add(LunarItems.NOSE_CONE.get(), "Nose Cone");
        add(LunarItems.SMALL_OXYGEN_TANK.get(), "Small Oxygen Tank");
        add(LunarItems.MEDIUM_OXYGEN_TANK.get(), "Medium Oxygen Tank");
        add(LunarItems.LARGE_OXYGEN_TANK.get(), "Large Oxygen Tank");
        add(LunarItems.STEEL_HAMMER.get(), "Steel Hammer");
        add(LunarItems.DESH_SWORD.get(), "Desh Sword");
        add(LunarItems.DESH_PICKAXE.get(), "Desh Pickaxe");
        add(LunarItems.SPACE_SUIT_HELMET.get(), "Space Helmet");
        add(LunarItems.SPACE_SUIT_CHESTPLATE.get(), "Space Chestplate");
        add(LunarItems.SPACE_SUIT_LEGGINGS.get(), "Space Leggings");
        add(LunarItems.SPACE_SUIT_BOOTS.get(), "Space Boots");
        add("creativetab.lunartravel.lunar_blocks", "Lunar Travel");


    }
}
