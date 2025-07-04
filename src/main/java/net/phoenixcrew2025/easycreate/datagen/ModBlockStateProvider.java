package net.phoenixcrew2025.easycreate.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.block.ModBlocks;
import net.phoenixcrew2025.easycreate.block.custom.EcreateCropBlock;

import java.util.function.Function;

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

        makeEcreateCrop((CropBlock) ModBlocks.ECREATE_CROP.get(), "ecreate_stage", "ecreate_stage");
    }

    public void makeEcreateCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> ecreateStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] ecreateStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((EcreateCropBlock) block).getAgeProperty()),
                new ResourceLocation(EasyCreate.MOD_ID, "block/" + textureName + state.getValue(((EcreateCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
