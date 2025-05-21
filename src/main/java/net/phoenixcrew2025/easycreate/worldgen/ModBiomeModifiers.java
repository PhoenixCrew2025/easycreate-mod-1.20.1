package net.phoenixcrew2025.easycreate.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.phoenixcrew2025.easycreate.EasyCreate;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_CORRUPTED_COAL_ORE = registerKey("add_corrupted_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_CORRUPTED_IRON_ORE = registerKey("add_corrupted_iron_ore");
    public static final ResourceKey<BiomeModifier> ADD_CORRUPTED_GOLD_ORE = registerKey("add_corrupted_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_CORRUPTED_DIAMOND_ORE = registerKey("add_corrupted_diamond_ore");
    public static final ResourceKey<BiomeModifier> ADD_CORRUPTED_EMERALD_ORE = registerKey("add_corrupted_emerald_ore");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_CORRUPTED_COAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.DESERT)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ECREATE_CORRUPTED_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CORRUPTED_IRON_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.JUNGLE)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ECREATE_CORRUPTED_IRON_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CORRUPTED_GOLD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.BADLANDS)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ECREATE_CORRUPTED_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CORRUPTED_DIAMOND_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_TAIGA)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ECREATE_CORRUPTED_DIAMOND_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CORRUPTED_EMERALD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.DARK_FOREST)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ECREATE_CORRUPTED_EMERALD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(EasyCreate.MOD_ID + ":" + name));
    }
}