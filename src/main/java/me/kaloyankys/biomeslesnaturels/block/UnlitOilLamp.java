package me.kaloyankys.biomeslesnaturels.block;

import me.kaloyankys.biomeslesnaturels.modinit.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UnlitOilLamp extends Block {
    public UnlitOilLamp(Settings settings) {
        super(settings);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.getItem() == Items.FLINT_AND_STEEL) {
            if (!world.isClient) {
                world.addParticle(DustParticleEffect.RED, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), 0.5D, 0.1D, 0.2D);
                world.addParticle(DustParticleEffect.RED, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), 0.2D, 0.1D, 0.5D);
                world.setBlockState(pos, (BlockState) ModBlocks.OIL_LAMP.getDefaultState());
            }
            return ActionResult.success(world.isClient);
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
    }
}
