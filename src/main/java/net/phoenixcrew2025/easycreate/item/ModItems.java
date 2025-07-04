package net.phoenixcrew2025.easycreate.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.block.ModBlocks;
import net.phoenixcrew2025.easycreate.item.custom.Fuelitem;
import net.phoenixcrew2025.easycreate.item.custom.ModArmorItem;
import net.phoenixcrew2025.easycreate.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EasyCreate.MOD_ID);


    public static final RegistryObject<Item> ECREATE_CORRUPTED_IRON_INGOT = ITEMS.register("ecreate_corrupted_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREATE_NETHER_STAR = ITEMS.register("create_nether_star",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_SHARD = ITEMS.register("ecreate_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_ROD = ITEMS.register("ecreate_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_QUARTS = ITEMS.register("ecreate_quarts",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEART_OF_ECREATE = ITEMS.register("heart_of_ecreate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_CORRUPTED_RAW_IRON = ITEMS.register("ecreate_corrupted_raw_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_CORRUPTED_RAW_GOLD = ITEMS.register("ecreate_corrupted_raw_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_CORRUPTED_GOLD = ITEMS.register("ecreate_corrupted_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_CORRUPTED_RAW_DIAMOND = ITEMS.register("ecreate_corrupted_raw_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_CORRUPTED_DIAMOND = ITEMS.register("ecreate_corrupted_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_CORRUPTED_RAW_EMERALD = ITEMS.register("ecreate_corrupted_raw_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_CORRUPTED_EMERALD = ITEMS.register("ecreate_corrupted_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_CORRUPTED_COAL = ITEMS.register("ecreate_corrupted_coal",
            () -> new Fuelitem(new Item.Properties(), 72000));

    public static final RegistryObject<Item> ECREATE_SWORD = ITEMS.register("ecreate_sword",
            () -> new SwordItem(ModToolTiers.ECREATE, 1000, 80, new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_PICKAXE = ITEMS.register("ecreate_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ECREATE, 800, 80, new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_AXE = ITEMS.register("ecreate_axe",
            () -> new AxeItem(ModToolTiers.ECREATE, 1200, 80, new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_SHOVEL = ITEMS.register("ecreate_shovel",
            () -> new ShovelItem(ModToolTiers.ECREATE, 500, 80, new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_HOE = ITEMS.register("ecreate_hoe",
            () -> new HoeItem(ModToolTiers.ECREATE, 500, 80, new Item.Properties()));

    public static final RegistryObject<Item> ECREATE_HELMET = ITEMS.register("ecreate_helmet",
            () -> new ArmorItem(ModArmorMaterials.ECREATE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_CHESTPLATE = ITEMS.register("ecreate_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ECREATE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_LEGGINGS = ITEMS.register("ecreate_leggings",
            () -> new ArmorItem(ModArmorMaterials.ECREATE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_BOOTS = ITEMS.register("ecreate_boots",
            () -> new ArmorItem(ModArmorMaterials.ECREATE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> ECREATE_SEEDS = ITEMS.register("ecreate_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ECREATE_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> ECREATE_ESSENCE = ITEMS.register("ecreate_essence",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> BLOOD_GOD_PART = ITEMS.register("blood_god_part",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREATE_GOD_PART = ITEMS.register("create_god_part",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECREATE_CRYSTAL = ITEMS.register("ecreate_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_GOD_PART = ITEMS.register("food_god_part",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOD_MAIN_PART = ITEMS.register("god_main_part",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEK_GOD_PART = ITEMS.register("mek_god_part",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MODIUM_GOD_PART = ITEMS.register("modium_god_part",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORE_GOD_PART = ITEMS.register("ore_god_part",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEMONS_SONG_MUSIC_DISC = ITEMS.register("demons_song_music_disc",
            () -> new RecordItem(6, ModSounds.DEMONS_SONG, new Item.Properties().stacksTo(1), 3500));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
