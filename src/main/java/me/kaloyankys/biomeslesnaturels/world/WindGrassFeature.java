package me.kaloyankys.biomeslesnaturels.world;

import com.mojang.serialization.Codec;
import me.kaloyankys.biomeslesnaturels.modinit.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

import java.util.Random;

public class WindGrassFeature extends Feature {
    public WindGrassFeature(Codec configCodec) {
        super(configCodec);
    }
    @Override
    public boolean generate(StructureWorldAccess world, ChunkGenerator generator, Random random, BlockPos pos,
                            FeatureConfig config) {
        BlockPos topPos = world.getTopPosition(Heightmap.Type.WORLD_SURFACE, pos);
        Direction offset = Direction.NORTH;

        int y = 0; {
            world.setBlockState(topPos.up(y), ModBlocks.WINDGRASS.getDefaultState(), 1);
        }

        return true;
    }
}