package net.cestog.lunartravel.item;

import net.cestog.lunartravel.LunarTravel;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LunarItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LunarTravel.MODID);


    //  Ertsen en Ruwe materialen
    public static final DeferredItem<Item> RAW_DESH = ITEMS.registerSimpleItem("raw_desh");
    public static final DeferredItem<Item> RAW_OSTRUM = ITEMS.registerSimpleItem("raw_ostrum");
    public static final DeferredItem<Item> RAW_ALUMINIUM = ITEMS.registerSimpleItem("raw_aluminium");
    public static final DeferredItem<Item> RAW_TITANIUM = ITEMS.registerSimpleItem("raw_titanium");
    public static final DeferredItem<Item> RAW_NICKEL = ITEMS.registerSimpleItem("raw_titanium");
    public static final DeferredItem<Item> RAW_METEORITE_IRON = ITEMS.registerSimpleItem("raw_meteorite_iron");
    public static final DeferredItem<Item> RAW_LITHIUM = ITEMS.registerSimpleItem("raw_lithium");
    public static final DeferredItem<Item> RAW_PLATINA = ITEMS.registerSimpleItem("raw_lithium");

    public static final DeferredItem<Item> CHEMICALLY_PURIFIED_CARBON = ITEMS.registerSimpleItem("purified_carbon");
//    Ingots
    public static final DeferredItem<Item> DESH_INGOT = ITEMS.registerSimpleItem("desh_ingot");
    public static final DeferredItem<Item> OSTRUM_INGOT = ITEMS.registerSimpleItem("ostrum_ingot");
    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.registerSimpleItem("aluminium_ingot");
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.registerSimpleItem("titanium_ingot");
    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.registerSimpleItem("titanium_ingot");
    public static final DeferredItem<Item> METEORITE_IRON_INGOT = ITEMS.registerSimpleItem("meteorite_iron_ingot");
    public static final DeferredItem<Item> LITHIUM_INGOT = ITEMS.registerSimpleItem("lithium_ingot");
    public static final DeferredItem<Item> PLATINA_INGOT = ITEMS.registerSimpleItem("platina_ingot");




    // Geperste platen
    public static final DeferredItem<Item> COMPRESSED_IRON = ITEMS.registerSimpleItem("compressed_iron");
    public static final DeferredItem<Item> COMPRESSED_DESH = ITEMS.registerSimpleItem("compressed_desh");
    public static final DeferredItem<Item> TIER_1_HEAVY_DUTY_PLATE = ITEMS.registerSimpleItem("tier_1_heavy_duty_plate");
    public static final DeferredItem<Item> TIER_2_HEAVY_DUTY_PLATE = ITEMS.registerSimpleItem("tier_2_heavy_duty_plate");

    // Electronica
    public static final DeferredItem<Item> BASIC_CIRCUIT = ITEMS.registerSimpleItem("basic_circuit");
    public static final DeferredItem<Item> ADVANCED_CIRCUIT = ITEMS.registerSimpleItem("advanced_circuit");
    public static final DeferredItem<Item> OXYGEN_VENT = ITEMS.registerSimpleItem("oxygen_vent");
    public static final DeferredItem<Item> OXYGEN_CONCENTRATOR = ITEMS.registerSimpleItem("oxygen_concentrator");

    // Rakket onderdelen
    public static final DeferredItem<Item> ROCKET = ITEMS.registerSimpleItem("rocket");
    public static final DeferredItem<Item> ROCKET_FIN = ITEMS.registerSimpleItem("rocket_fin");
    public static final DeferredItem<Item> ROCKET_ENGINE = ITEMS.registerSimpleItem("rocket_engine");
    public static final DeferredItem<Item> NOSE_CONE = ITEMS.registerSimpleItem("nose_cone");

    // Zuurstoftanks
    public static final DeferredItem<Item> SMALL_OXYGEN_TANK = ITEMS.registerSimpleItem("small_oxygen_tank",
            props -> props.stacksTo(1));
    public static final DeferredItem<Item> MEDIUM_OXYGEN_TANK = ITEMS.registerSimpleItem("medium_oxygen_tank",
            props -> props.stacksTo(1));
    public static final DeferredItem<Item> LARGE_OXYGEN_TANK = ITEMS.registerSimpleItem("large_oxygen_tank",
            props -> props.stacksTo(1));

    // Wapens/Tools
    public static final DeferredItem<Item> STEEL_HAMMER = ITEMS.registerSimpleItem("steel_hammer",
            props -> props.durability(250));
    public static final DeferredItem<Item> DESH_SWORD = ITEMS.registerItem("desh_sword",
            props -> new Item(
                    props.sword(
                            ToolMaterial.COPPER,
                            3,
                            -2.4f
                    )
            ));
    public static final DeferredItem<Item> DESH_PICKAXE = ITEMS.registerItem("desh_pickaxe",
            props -> new Item(
                    props.pickaxe(
                            ToolMaterial.COPPER,
                            1,
                            -2.8f
                    )
            ));
    // Ruimte pak (Armor)
    public static final DeferredItem<Item> SPACE_SUIT_HELMET = ITEMS.registerItem("space_suit_helmet",
            props -> new Item(
                    props.humanoidArmor(
                            ArmorMaterials.COPPER,
                            ArmorType.HELMET
                    )
            ));

    public static final DeferredItem<Item> SPACE_SUIT_CHESTPLATE = ITEMS.registerItem("space_suit_chestplate",
            props -> new Item(
                    props.humanoidArmor(
                            ArmorMaterials.COPPER,
                            ArmorType.CHESTPLATE
                    )
            ));
    public static final DeferredItem<Item> SPACE_SUIT_LEGGINGS = ITEMS.registerItem("space_suit_leggings",
            props -> new Item(
                    props.humanoidArmor(
                            ArmorMaterials.COPPER,
                            ArmorType.LEGGINGS
                    )
            ));
    public static final DeferredItem<Item> SPACE_SUIT_BOOTS = ITEMS.registerItem("space_suit_boots",
            props -> new Item(
                    props.humanoidArmor(
                            ArmorMaterials.COPPER,
                            ArmorType.BOOTS
                    )
            ));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
