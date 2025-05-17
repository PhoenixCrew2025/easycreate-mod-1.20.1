package net.phoenixcrew2025.easycreate.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EasyCreate.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get(),
                    ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get()
            );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get(),
                ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get(),
                ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get()
            );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get(),
                ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get(),
                ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get(),
                ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get(),
                ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get());
}
}