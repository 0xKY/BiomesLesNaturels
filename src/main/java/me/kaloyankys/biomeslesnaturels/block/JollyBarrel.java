package me.kaloyankys.biomeslesnaturels.block;

import me.kaloyankys.biomeslesnaturels.modinit.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class JollyBarrel extends Block {
    public static final DirectionProperty FACING;
    public static final IntProperty WINE_LEVEL = IntProperty.of("wine_level", 0, 1000);

    public JollyBarrel(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(WINE_LEVEL, FACING);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int i = 0;
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.getItem() == ModItems.GRAPES) {
            if (i < 5)
                if (!world.isClient) {
                    itemStack.decrement(1);
                    i++;
                    world.setBlockState(pos, state.with(WINE_LEVEL, i));
                    return ActionResult.SUCCESS;
                }
        } else if (itemStack.getItem() == Items.GLASS_BOTTLE) {
            if (i >= 1)
                if (!world.isClient) {
                    if (itemStack.isEmpty()) {
                        player.setStackInHand(hand, new ItemStack(Items.HONEY_BOTTLE));
                    } else if (!player.inventory.insertStack(new ItemStack(Items.HONEY_BOTTLE))) {
                        player.dropItem(new ItemStack(Items.HONEY_BOTTLE), false);
                    }
                    itemStack.decrement(1);
                    i--;
                    world.setBlockState(pos, state.with(WINE_LEVEL, i));
                    return ActionResult.SUCCESS;
                }
        } else {
            return super.onUse(state, world, pos, player, hand, hit);
        }
        return ActionResult.SUCCESS;
    }

    static {
        FACING = Properties.FACING;
    }
}

