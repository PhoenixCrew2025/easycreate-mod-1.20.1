package net.phoenixcrew2025.easycreate.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.phoenixcrew2025.easycreate.EasyCreate;
import net.phoenixcrew2025.easycreate.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier ECREATE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 50000000, 20f, 500f, 32,
                    ModTags.Blocks.NEEDS_ECREATE_TOOL, () -> Ingredient.of(ModItems.ECREATE_CORRUPTED_DIAMOND.get())),
            new ResourceLocation(EasyCreate.MOD_ID, "ecreate_tools"), List.of(Tiers.NETHERITE), List.of());
}
