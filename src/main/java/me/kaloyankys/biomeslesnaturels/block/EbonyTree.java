package me.kaloyankys.biomeslesnaturels.block;

import me.kaloyankys.biomeslesnaturels.Biomeslesnaturels;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class EbonyTree extends TallPlantBlock {
    public EbonyTree(Settings settings) {
        super(settings);
    }

    public static final VoxelShape SHAPE = Block.createCuboidShape(1D, 0D, 1D, 14D, 16D, 14D);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(2) == 0) {
            Direction direction = Direction.random(random);
            if (direction != Direction.NORTH) {
                BlockPos blockPos = pos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos);
                if (!state.isOpaque() || !blockState.isSideSolidFullSquare(world, blockPos, direction.getOpposite())) {
                    world.addParticle(Biomeslesnaturels.LEAF, (double) pos.getX(), (double) pos.getY() + 1, (double) pos.getZ(), 0.9D, -0.1D, 0.001D);
                }
            }
        }
    }
}