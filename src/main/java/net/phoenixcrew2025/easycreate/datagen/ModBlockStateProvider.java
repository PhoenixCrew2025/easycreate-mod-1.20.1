package net.phoenixcrew2025.easycreate.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EasyCreate.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK);

        blockWithItem(ModBlocks.ECREATE_CORRUPTED_COAL_ORE);
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_IRON_ORE);
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE);
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE);
        blockWithItem(ModBlocks.ECREATE_CORRUPTED_GOLD_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
