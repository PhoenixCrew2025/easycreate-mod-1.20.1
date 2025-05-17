package net.phoenixcrew2025.easycreate.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.phoenixcrew2025.easycreate.block.ModBlocks;
import net.phoenixcrew2025.easycreate.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get());

        this.add(ModBlocks.ECREATE_CORRUPTED_IRON_ORE.get(),
                block -> createecreateOreDrops(ModBlocks.ECREATE_CORRUPTED_IRON_ORE.get(), ModItems.ECREATE_CORRUPTED_RAW_IRON.get()));

        this.add(ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get(),
                block -> createecreateOreDrops(ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get(), ModItems.ECREATE_CORRUPTED_RAW_GOLD.get()));

        this.add(ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get(),
                block -> createecreateOreDrops(ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get(), ModItems.ECREATE_CORRUPTED_RAW_DIAMOND.get()));

        this.add(ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get(),
                block -> createecreateOreDrops(ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get(), ModItems.ECREATE_CORRUPTED_RAW_EMERALD.get()));

        this.add(ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get(),
                block -> createecreatecoalDrops(ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get(), ModItems.ECREATE_CORRUPTED_COAL.get()));
    }


    protected LootTable.Builder createecreateOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createecreatecoalDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 8.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
