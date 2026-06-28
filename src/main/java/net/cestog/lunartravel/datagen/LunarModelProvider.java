package net.cestog.lunartravel.datagen;

import net.cestog.lunartravel.LunarTravel;
import net.cestog.lunartravel.block.LunarBlocks;
import net.cestog.lunartravel.fluid.LunarFluids;
import net.cestog.lunartravel.item.LunarItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.neoforged.neoforge.client.model.item.DynamicFluidContainerModel;

import java.util.Optional;

public class LunarModelProvider extends ModelProvider {
    public LunarModelProvider(PackOutput output) {
        super(output, LunarTravel.MODID);
    }


    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

//        Rauwe materialen
        itemModels.generateFlatItem(LunarItems.RAW_DESH.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.RAW_LUNAR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.RAW_ALUMINIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.RAW_TITANIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.RAW_NICKEL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.RAW_LITHIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.RAW_PLATINA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.RAW_METEORITE_IRON.get(), ModelTemplates.FLAT_ITEM);



//      Ingots
        itemModels.generateFlatItem(LunarItems.DESH_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.LUNAR_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.ALUMINIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.TITANIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.NICKEL_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.LITHIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.PLATINA_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.METEORITE_IRON_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.CHEMICALLY_PURIFIED_CARBON.get(), ModelTemplates.FLAT_ITEM);


//        Compressed Ingots
        itemModels.generateFlatItem(LunarItems.COMPRESSED_IRON.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.COMPRESSED_DESH.get(), ModelTemplates.FLAT_ITEM);

//        Plates
        itemModels.generateFlatItem(LunarItems.TIER_1_HEAVY_DUTY_PLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.TIER_2_HEAVY_DUTY_PLATE.get(), ModelTemplates.FLAT_ITEM);

//        Circuits
        itemModels.generateFlatItem(LunarItems.BASIC_CIRCUIT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.ADVANCED_CIRCUIT.get(), ModelTemplates.FLAT_ITEM);


//        Parts
        itemModels.generateFlatItem(LunarItems.OXYGEN_VENT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.OXYGEN_CONCENTRATOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.ROCKET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.ROCKET_FIN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.ROCKET_ENGINE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(LunarItems.NOSE_CONE.get(), ModelTemplates.FLAT_ITEM);

//        Oxygen tank
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

//        Fluid
        itemModels.itemModelOutput.accept(LunarItems.CRUDE_OIL_BUCKET.get(), new DynamicFluidContainerModel.Unbaked(
                // The model's textures. The model is rendered in the order of base, fluid, cover (lowest to highest).
                new DynamicFluidContainerModel.Textures(
                        // The particle texture.
                        Optional.of(new Material(Identifier.withDefaultNamespace("item/bucket"))),
                        // The base texture.
                        Optional.of(new Material(Identifier.withDefaultNamespace("item/bucket"))),
                        // The fluid texture, i.e. the part that actually contains the fluid.
                        Optional.of(new Material(Identifier.fromNamespaceAndPath("neoforge", "item/mask/bucket_fluid"))),
                        // The cover texture. This is rendered last and can be a mask (see below).
                        Optional.empty()
                ),
                // The fluid to use.
                LunarFluids.CRUDE_OIL.get(),
                // Whether the bucket model should be flipped, commonly used for "gaseous" fluids.
                false,
                // If true, the cover texture is a mask. If false, the cover texture is rendered normally.
                // See below for more info.
                true,
                // If this is true, if the fluid emits light, the fluid element of the model becomes emissive.
                false));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(
                // Our cauldron block.
                LunarBlocks.CRUDE_OIL_CAULDRON.get(),
                // We use the `CAULDRON_FULL` model template.
                BlockModelGenerators.plainVariant(ModelTemplates.CAULDRON_FULL.create(
                        // Our cauldron block.
                        LunarBlocks.CRUDE_OIL_CAULDRON.get(),
                        // The cauldron fluid texture mapping.
                        TextureMapping.cauldron(TextureMapping.getBlockTexture(LunarBlocks.CRUDE_OIL.get(), "_still")),
                        blockModels.modelOutput))));
        blockModels.createNonTemplateModelBlock(LunarBlocks.CRUDE_OIL.get());

    }
}
