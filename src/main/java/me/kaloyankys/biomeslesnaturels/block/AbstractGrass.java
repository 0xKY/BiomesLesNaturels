package me.kaloyankys.biomeslesnaturels.block;

import me.kaloyankys.biomeslesnaturels.modinit.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class AbstractGrass extends PlantBlock {
    public AbstractGrass(Settings settings) {
        super(settings);
    }

    public static final VoxelShape SHAPE = Block.createCuboidShape(0D, 0D, 0D, 16D, 1D, 16D);


    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.GRASS) || floor.isOf(Blocks.DIRT) || floor.isOf(ModBlocks.TUNDRA_GRASS)|| floor.isOf(ModBlocks.MUDDY_DIRT) || floor.isOf(ModBlocks.PATCHY_GRASS);
    }
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return type == NavigationType.AIR && !this.collidable ? true : super.canPathfindThrough(state, world, pos, type);
    }

}