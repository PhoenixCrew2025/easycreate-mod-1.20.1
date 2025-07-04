package net.phoenixcrew2025.easycreate.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }




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
        simpleItem(ModItems.ECREATE_SEEDS);
        simpleItem(ModItems.ECREATE_ESSENCE);

        simpleItem(ModItems.GOD_MAIN_PART);
        simpleItem(ModItems.BLOOD_GOD_PART);
        simpleItem(ModItems.CREATE_GOD_PART);
        simpleItem(ModItems.FOOD_GOD_PART);
        simpleItem(ModItems.MEK_GOD_PART);
        simpleItem(ModItems.ORE_GOD_PART);
        simpleItem(ModItems.MODIUM_GOD_PART);
        simpleItem(ModItems.ECREATE_CRYSTAL);

        simpleItem(ModItems.DEMONS_SONG_MUSIC_DISC);

        handheldItem(ModItems.ECREATE_SWORD);
        handheldItem(ModItems.ECREATE_AXE);
        handheldItem(ModItems.ECREATE_PICKAXE);
        handheldItem(ModItems.ECREATE_SHOVEL);
        handheldItem(ModItems.ECREATE_HOE);

        trimmedArmorItem(ModItems.ECREATE_HELMET);
        trimmedArmorItem(ModItems.ECREATE_CHESTPLATE);
        trimmedArmorItem(ModItems.ECREATE_LEGGINGS);
        trimmedArmorItem(ModItems.ECREATE_BOOTS);
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = EasyCreate.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
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
