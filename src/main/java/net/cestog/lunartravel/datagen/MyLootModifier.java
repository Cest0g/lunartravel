package net.cestog.lunartravel.datagen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;

public class MyLootModifier extends LootModifier {

    public static final MapCodec<MyLootModifier> CODEC = RecordCodecBuilder.mapCodec(inst ->
            LootModifier.codecStart(inst).and(inst.group(
                    Codec.STRING.fieldOf("field1").forGetter(e -> e.field1),
                    Codec.INT.fieldOf("field2").forGetter(e -> e.field2),
                    BuiltInRegistries.ITEM.byNameCodec().fieldOf("field3").forGetter(e -> e.field3)
            )).apply(inst, MyLootModifier::new)
    );

    private final String field1;
    private final int field2;
    private final Item field3;

    public MyLootModifier(LootItemCondition[] conditions, String field1, int field2, Item field3) {
        super(conditions, 0);
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public MyLootModifier(LootItemCondition[] conditions, int priority, String field1, int field2, Item field3) {
        super(conditions, priority);
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }

    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        generatedLoot.add(new ItemStack(this.field3, this.field2));
        return generatedLoot;
    }
}