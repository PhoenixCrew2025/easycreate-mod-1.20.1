package net.phoenixcrew2025.easycreate.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.phoenixcrew2025.easycreate.EasyCreate;

public class ModTags {

    public static class Blocks{
        public static final TagKey<Block> NEEDS_ECREATE_TOOL = tag("needs_ecreate_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(EasyCreate.MOD_ID, name));
        }
    }



    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(EasyCreate.MOD_ID, name));
        }
    }
}


