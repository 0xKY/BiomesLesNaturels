package me.kaloyankys.biomeslesnaturels.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.TallBlockItem;

public class TallGrassBlockItem extends TallBlockItem {
    public TallGrassBlockItem(Block block, Settings settings) {
        super(block, settings);
    }
    protected boolean place(ItemPlacementContext context, BlockState state) {
        context.getWorld().setBlockState(context.getBlockPos().up(), Blocks.AIR.getDefaultState(), 27);
        return super.place(context, state);
    }
}

