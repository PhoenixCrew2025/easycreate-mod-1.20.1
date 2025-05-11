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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ECREATE_INGOT.get()))
                    .title(Component.translatable("creativetab.easy_create_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ECREATE_INGOT.get());
                        pOutput.accept(ModItems.CREATE_NETHER_STAR.get());
                        pOutput.accept(ModItems.ECREATE_SHARD.get());
                        pOutput.accept(ModItems.ECREATE_ROD.get());
                        pOutput.accept(ModItems.ECREATE_QUARTS.get());
                        pOutput.accept(ModItems.ECREATE_JEWEL.get());
                        pOutput.accept(ModItems.HEART_OF_ECREATE.get());
                        pOutput.accept(ModItems.RAW_ECREATE.get());

                        pOutput.accept(ModBlocks.ECREATE_BLOCK.get());
                        pOutput.accept(ModBlocks.ECREATE_ORE.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
