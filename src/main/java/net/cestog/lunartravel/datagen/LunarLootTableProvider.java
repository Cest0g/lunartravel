package net.cestog.lunartravel.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.cestog.lunartravel.block.LunarBlocks;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class LunarLootTableProvider extends LootTableProvider {
    public LunarLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(
                output,
                Set.of(),
                List.of(
                        new SubProviderEntry(ModLootTableSubProvider::new, LootContextParamSets.BLOCK)
                ),
                registries
        );
    }

    private static final class ModLootTableSubProvider extends BlockLootSubProvider {
        ModLootTableSubProvider(HolderLookup.Provider registries) {
            super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return LunarBlocks.BLOCKS.getEntries()
                    .stream()
                    .map(e -> (Block) e.value())
                    .toList();
        }

        @Override
        protected void generate() {
            dropOther(LunarBlocks.CRUDE_OIL_CAULDRON.get(), Items.CAULDRON);
        }
    }
}

