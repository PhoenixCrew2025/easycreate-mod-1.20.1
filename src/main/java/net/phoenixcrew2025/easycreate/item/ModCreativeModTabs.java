package net.phoenixcrew2025.easycreate.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EasyCreate.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EASY_CREATE_TAB = CREATIVE_MODE_TABS.register("easy_create_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ECREATE_CORRUPTED_IRON_INGOT.get()))
                    .title(Component.translatable("creativetab.easy_create_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ECREATE_CORRUPTED_IRON_INGOT.get());
                        pOutput.accept(ModItems.CREATE_NETHER_STAR.get());
                        pOutput.accept(ModItems.ECREATE_SHARD.get());
                        pOutput.accept(ModItems.ECREATE_ROD.get());
                        pOutput.accept(ModItems.ECREATE_QUARTS.get());
                        pOutput.accept(ModItems.HEART_OF_ECREATE.get());
                        pOutput.accept(ModItems.ECREATE_CORRUPTED_RAW_IRON.get());
                        pOutput.accept(ModItems.ECREATE_CORRUPTED_RAW_GOLD.get());
                        pOutput.accept(ModItems.ECREATE_CORRUPTED_GOLD.get());
                        pOutput.accept(ModItems.ECREATE_CORRUPTED_DIAMOND.get());
                        pOutput.accept(ModItems.ECREATE_CORRUPTED_RAW_DIAMOND.get());
                        pOutput.accept(ModItems.ECREATE_CORRUPTED_EMERALD.get());
                        pOutput.accept(ModItems.ECREATE_CORRUPTED_RAW_EMERALD.get());
                        pOutput.accept(ModItems.ECREATE_CORRUPTED_COAL.get());

                        pOutput.accept(ModItems.ECREATE_SWORD.get());
                        pOutput.accept(ModItems.ECREATE_PICKAXE.get());
                        pOutput.accept(ModItems.ECREATE_AXE.get());
                        pOutput.accept(ModItems.ECREATE_SHOVEL.get());
                        pOutput.accept(ModItems.ECREATE_HOE.get());

                        pOutput.accept(ModItems.ECREATE_HELMET.get());
                        pOutput.accept(ModItems.ECREATE_CHESTPLATE.get());
                        pOutput.accept(ModItems.ECREATE_LEGGINGS.get());
                        pOutput.accept(ModItems.ECREATE_BOOTS.get());

                        pOutput.accept(ModBlocks.ECREATE_CORRUPTED_IRON_BLOCK.get());
                        pOutput.accept(ModBlocks.ECREATE_CORRUPTED_IRON_ORE.get());
                        pOutput.accept(ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get());
                        pOutput.accept(ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get());
                        pOutput.accept(ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get());
                        pOutput.accept(ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get());


                        pOutput.accept(ModItems.ECREATE_SEEDS.get());
                        pOutput.accept(ModItems.ECREATE_ESSENCE.get());

                        pOutput.accept(ModItems.BLOOD_GOD_PART.get());
                        pOutput.accept(ModItems.CREATE_GOD_PART.get());
                        pOutput.accept(ModItems.FOOD_GOD_PART.get());
                        pOutput.accept(ModItems.GOD_MAIN_PART.get());
                        pOutput.accept(ModItems.ORE_GOD_PART.get());
                        pOutput.accept(ModItems.MODIUM_GOD_PART.get());
                        pOutput.accept(ModItems.MEK_GOD_PART.get());
                        pOutput.accept(ModItems.ECREATE_CRYSTAL.get());

                        pOutput.accept(ModItems.DEMONS_SONG_MUSIC_DISC.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
