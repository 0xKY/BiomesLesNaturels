package me.kaloyankys.biomeslesnaturels.mixin;

import me.kaloyankys.biomeslesnaturels.modinit.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

    @Mixin(CowEntity.class)
    public abstract class TemptMixin extends AnimalEntity {
        public TemptMixin(EntityType<? extends net.minecraft.entity.passive.CowEntity> entityType, World world) {
            super(entityType, world);
        }

        @Inject(method = "initGoals()V", at = @At("TAIL"))
        public void onInitGoals(CallbackInfo ci) {

                this.goalSelector.add(3, new TemptGoal(this, 2D, Ingredient.ofItems(ModItems.GOATBERRY_BUNCH), false));
            }
        }

