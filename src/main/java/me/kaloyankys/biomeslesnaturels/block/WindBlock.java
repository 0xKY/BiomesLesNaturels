package me.kaloyankys.biomeslesnaturels.block;

import me.kaloyankys.biomeslesnaturels.Biomeslesnaturels;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class WindBlock extends Block {
    public WindBlock(Settings settings) {
        super(settings);
    }

    public static final VoxelShape SHAPE = Block.createCuboidShape(0D, 1D, 0D, 32D, 32D, 32D);

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.setVelocity(1, 0, 0);
    }
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
                    double d = direction.getOffsetX() == 0 ? random.nextDouble() : 0.5D + (double) direction.getOffsetX() * 0.6D;
                    double e = direction.getOffsetY() == 0 ? random.nextDouble() : 0.5D + (double) direction.getOffsetY() * 0.6D;
                    double f = direction.getOffsetZ() == 0 ? random.nextDouble() : 0.5D + (double) direction.getOffsetZ() * 0.6D;
                    world.addParticle(Biomeslesnaturels.LEAF, (double) pos.getX() + d, (double) pos.getY() + 1, (double) pos.getZ() + f, 1D, -0.1D, 0.001D);
                    world.addParticle(ParticleTypes.POOF, (double) pos.getX() + d, (double) pos.getY() + 1, (double) pos.getZ() + f, 0.9D, -0.1D, 0.001D);
                }
            }
        }
    }

}
