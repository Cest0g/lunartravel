package net.cestog.lunartravel.datagen;

import net.cestog.lunartravel.LunarTravel;
import net.cestog.lunartravel.item.LunarItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class LunarModelProvider extends ModelProvider {
    public LunarModelProvider(PackOutput output) {
        super(output, LunarTravel.MODID);
    }


    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

//        Rauwe materialen
        itemModels.generateFlatItem(LunarItems.RAW_DESH.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.RAW_OSTRUM.get(), ModelTemplates.FLAT_ITEM);
//        itemModels.generateFlatItem(LunarItems.RAW_ALUMINIUM.get(), ModelTemplates.FLAT_ITEM);
//        itemModels.generateFlatItem(LunarItems.RAW_TITANIUM.get(), ModelTemplates.FLAT_ITEM);



//      Ingots
        itemModels.generateFlatItem(LunarItems.DESH_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.OSTRUM_INGOT.get(), ModelTemplates.FLAT_ITEM);



        itemModels.generateFlatItem(LunarItems.CHEMICALLY_PURIFIED_CARBON.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.COMPRESSED_IRON.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.COMPRESSED_DESH.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.TIER_1_HEAVY_DUTY_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.TIER_2_HEAVY_DUTY_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.BASIC_CIRCUIT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.ADVANCED_CIRCUIT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.OXYGEN_VENT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.OXYGEN_CONCENTRATOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.ROCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.ROCKET_FIN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.ROCKET_ENGINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.NOSE_CONE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.SMALL_OXYGEN_TANK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.MEDIUM_OXYGEN_TANK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.LARGE_OXYGEN_TANK.get(), ModelTemplates.FLAT_ITEM);

//        TOOLS
        itemModels.generateFlatItem(LunarItems.STEEL_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(LunarItems.DESH_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(LunarItems.DESH_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);


//        ARMOR
        itemModels.generateFlatItem(LunarItems.SPACE_SUIT_HELMET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.SPACE_SUIT_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.SPACE_SUIT_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.SPACE_SUIT_BOOTS.get(), ModelTemplates.FLAT_ITEM);
    }
}
