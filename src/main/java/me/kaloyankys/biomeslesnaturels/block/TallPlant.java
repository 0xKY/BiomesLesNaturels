package me.kaloyankys.biomeslesnaturels.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TallPlant extends TallPlantBlock {
    public TallPlant(Settings settings) {
        super(settings);
    }
    public static final VoxelShape SHAPE = Block.createCuboidShape(1D, 0D, 1D, 14D, 16D, 14D);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
