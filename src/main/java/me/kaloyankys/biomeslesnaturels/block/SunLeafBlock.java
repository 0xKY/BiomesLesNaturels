package me.kaloyankys.biomeslesnaturels.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class SunLeafBlock extends PlantBlock {
        public SunLeafBlock(FabricBlockSettings group) {
            super(FabricBlockSettings.of(Material.PLANT).strength(0f).nonOpaque());

        }
        public static final VoxelShape SHAPE = Block.createCuboidShape(1D, 0D, 1D, 15D, 16D, 15D);


        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return SHAPE;
        }

        public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
            Block block = floor.getBlock();
            return block == Blocks.SAND;
        }
        public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
            return state.getFluidState().isEmpty();
        }

        public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
            return type == NavigationType.AIR && !this.collidable ? true : super.canPathfindThrough(state, world, pos, type);
        }

        public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
            entity.setOnFireFor(2);
            entity.slowMovement(state, new Vec3d(0.6D, 0.99999D, 0.6D));
        }
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    }
}