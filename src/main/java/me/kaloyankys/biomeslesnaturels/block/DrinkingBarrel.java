package me.kaloyankys.biomeslesnaturels.block;

import me.kaloyankys.biomeslesnaturels.modinit.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DrinkingBarrel extends Block {

    public static IntProperty WINE_LEVEL = IntProperty.of("wine_level",0,1000000);
    int i = 0;

    public DrinkingBarrel(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(WINE_LEVEL);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.getItem() == ModItems.GRAPES) {
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
                      player.setStackInHand(hand, new ItemStack(ModItems.WINE_BOTTLE));
                    } else if (!player.inventory.insertStack(new ItemStack(ModItems.WINE_BOTTLE))) {
                      player.dropItem(new ItemStack(ModItems.WINE_BOTTLE), false);
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
}
