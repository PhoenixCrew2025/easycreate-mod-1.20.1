package net.phoenixcrew2025.easycreate.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EasyCreate.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CREATE_NETHER_STAR);
        simpleItem(ModItems.ECREATE_CORRUPTED_COAL);
        simpleItem(ModItems.ECREATE_CORRUPTED_DIAMOND);
        simpleItem(ModItems.ECREATE_CORRUPTED_EMERALD);
        simpleItem(ModItems.ECREATE_CORRUPTED_GOLD);
        simpleItem(ModItems.ECREATE_ROD);
        simpleItem(ModItems.ECREATE_CORRUPTED_RAW_DIAMOND);
        simpleItem(ModItems.ECREATE_CORRUPTED_RAW_EMERALD);
        simpleItem(ModItems.ECREATE_CORRUPTED_RAW_GOLD);
        simpleItem(ModItems.ECREATE_CORRUPTED_RAW_IRON);
        simpleItem(ModItems.ECREATE_QUARTS);
        simpleItem(ModItems.ECREATE_SHARD);
        simpleItem(ModItems.HEART_OF_ECREATE);
        simpleItem(ModItems.ECREATE_CORRUPTED_IRON_INGOT);

        handheldItem(ModItems.ECREATE_SWORD);
        handheldItem(ModItems.ECREATE_AXE);
        handheldItem(ModItems.ECREATE_PICKAXE);
        handheldItem(ModItems.ECREATE_SHOVEL);
        handheldItem(ModItems.ECREATE_HOE);
    }


    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(EasyCreate.MOD_ID,"item/" + item.getId().getPath()));
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EasyCreate.MOD_ID, "item/" + item.getId().getPath()));
    }
}
