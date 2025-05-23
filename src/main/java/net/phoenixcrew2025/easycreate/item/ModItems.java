package net.phoenixcrew2025.easycreate.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.item.custom.Fuelitem;

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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
