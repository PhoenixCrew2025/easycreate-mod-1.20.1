package net.phoenixcrew2025.easycreate.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECREATE_CORRUPTED_COAL_ORE_KEY = registerKey("ecreate_corrupted_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECREATE_CORRUPTED_IRON_ORE_KEY = registerKey("ecreate_corrupted_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECREATE_CORRUPTED_GOLD_ORE_KEY = registerKey("ecreate_corrupted_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECREATE_CORRUPTED_DIAMOND_ORE_KEY = registerKey("ecreate_corrupted_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ECREATE_CORRUPTED_EMERALD_ORE_KEY = registerKey("ecreate_corrupted_emerald_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

        register(context, OVERWORLD_ECREATE_CORRUPTED_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.ECREATE_CORRUPTED_COAL_ORE.get().defaultBlockState())), 5));

        register(context, OVERWORLD_ECREATE_CORRUPTED_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(OreConfiguration.target(stoneReplaceable, 
                ModBlocks.ECREATE_CORRUPTED_IRON_ORE.get().defaultBlockState())), 5));

        register(context, OVERWORLD_ECREATE_CORRUPTED_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(OreConfiguration.target(stoneReplaceable, 
                ModBlocks.ECREATE_CORRUPTED_GOLD_ORE.get().defaultBlockState())), 5));

        register(context, OVERWORLD_ECREATE_CORRUPTED_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(OreConfiguration.target(stoneReplaceable, 
                ModBlocks.ECREATE_CORRUPTED_DIAMOND_ORE.get().defaultBlockState())), 5));

        register(context, OVERWORLD_ECREATE_CORRUPTED_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(
                List.of(OreConfiguration.target(stoneReplaceable, 
                ModBlocks.ECREATE_CORRUPTED_EMERALD_ORE.get().defaultBlockState())), 5));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(EasyCreate.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}