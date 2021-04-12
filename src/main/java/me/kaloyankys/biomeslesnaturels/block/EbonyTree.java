package me.kaloyankys.biomeslesnaturels.block;

import me.kaloyankys.biomeslesnaturels.Biomeslesnaturels;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class EbonyTree extends TallGrassBlock {
    public EbonyTree(FabricBlockSettings group) {
        super(Settings.of(Material.WOOD).nonOpaque().strength(0.9f));
    }
    public static final VoxelShape SHAPE = Block.createCuboidShape(1D, 0D, 1D, 15D, 16D, 15D);

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.GRASS_BLOCK)|| floor.isOf(Blocks.DIRT) || floor.isOf(Blocks.STONE);
    }
    @Override
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }
    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return type == NavigationType.AIR && !this.collidable ? true : super.canPathfindThrough(state, world, pos, type);
    }
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        world.addParticle(Biomeslesnaturels.LEAF, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ(), 0.3D, -0.1D, 0.001D);
    }
}
