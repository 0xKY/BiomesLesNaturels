package me.kaloyankys.biomeslesnaturels.block;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import java.util.Random;

public class SaltBlock extends Block implements Waterloggable {
    public SaltBlock(Settings settings) { super(settings); }

    public static int warmLight;

    public static final VoxelShape SHAPE = Block.createCuboidShape(1D, 0D, 1D, 14D, 14D, 14D);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.random.nextInt(5) == 0) {
            warmLight ++;
        }
    }
}
