package net.cestog.lunartravel.block;

import net.cestog.lunartravel.LunarTravel;
import net.cestog.lunartravel.fluid.LunarFluids;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;



public class LunarBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LunarTravel.MODID);

    public static final DeferredBlock<LiquidBlock> CRUDE_OIL = BLOCKS.registerBlock(
            "crude_oil",
            properties -> new LiquidBlock(LunarFluids.CRUDE_OIL.get(), properties),
            () -> BlockBehaviour.Properties.of()
                    .liquid()
                    .noLootTable()
                    .noCollision()
                    .replaceable()
                    .pushReaction(PushReaction.DESTROY)
                    .sound(SoundType.EMPTY)
                    .strength(100)
                    .lightLevel(_ -> 0)
    );
    public static final DeferredBlock<CrudeOilCauldronBlock> CRUDE_OIL_CAULDRON = BLOCKS.registerBlock(
            "crude_oil_cauldron",
            CrudeOilCauldronBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON).lightLevel(_ -> 0)
    );





    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
