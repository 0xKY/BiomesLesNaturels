package me.kaloyankys.biomeslesnaturels.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.IceBlock;
import net.minecraft.entity.Entity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class WindStream extends IceBlock {
    public WindStream(Settings settings) {
        super(settings);
    }

    public void onSteppedOn(World world, BlockPos pos, Entity entity) {
        {

            entity.setSprinting(true);
            entity.setVelocity(0, 2, 0);
            world.addParticle(ParticleTypes.LARGE_SMOKE, (double) pos.getX(), (double) pos.getY() + 1, (double) pos.getZ(), 0.0D, 0.5D, 0.0D);
            world.addParticle(ParticleTypes.SMOKE, (double) pos.getX(), (double) pos.getY() + 1, (double) pos.getZ(), 0.0D, 0.5D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, (double) pos.getX(), (double) pos.getY() + 1, (double) pos.getZ(), 0.0D, 0.5D, 0.0D);
        }

        super.onSteppedOn(world, pos, entity);
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = Direction.random(random);
            if (direction != Direction.UP) {
                BlockPos blockPos = pos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos);
                if (!state.isOpaque() || !blockState.isSideSolidFullSquare(world, blockPos, direction.getOpposite())) {
                    double d = direction.getOffsetX() == 0 ? random.nextDouble() : 0.5D + (double) direction.getOffsetX() * 0.6D;
                    double e = direction.getOffsetY() == 0 ? random.nextDouble() : 0.5D + (double) direction.getOffsetY() * 0.6D;
                    double f = direction.getOffsetZ() == 0 ? random.nextDouble() : 0.5D + (double) direction.getOffsetZ() * 0.6D;
                    world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (double) pos.getX() + d, (double) pos.getY() + 1, (double) pos.getZ() + f, 0.0D, 0.3D, 0.0D);
                }
            }
        }
    }
}