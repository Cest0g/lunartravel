package net.cestog.lunartravel.datagen.provider;

import net.cestog.lunartravel.block.LunarBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class LunarBlockTagProvider extends BlockTagsProvider {
    public LunarBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, "testmod");
    }
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE);
        tag(BlockTags.CAULDRONS).add(LunarBlocks.CRUDE_OIL_CAULDRON.get());
        tag(BlockTags.NEEDS_IRON_TOOL);


    }
}
