package net.cestog.lunartravel.block;

import net.cestog.lunartravel.LunarTravel;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LunarBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LunarTravel.MODID);

//    public static final DeferredBlock<Block> MY_BETTER_BLOCK = BLOCKS.register(
//            "my_better_block",
//            registryName -> new Block(BlockBehaviour.Properties.of()
//                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
//                    .destroyTime(2.0f)
//                    .explosionResistance(10.0f)
//                    .sound(SoundType.GRAVEL)
//                    .lightLevel(state -> 7)
//            ));



    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
