package me.kaloyankys.biomeslesnaturels.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent OAT_BREAD = new FoodComponent.Builder().hunger(5).saturationModifier(4).build();
    public static final FoodComponent GOATBERRY_BUNCH = new FoodComponent.Builder().hunger(3).saturationModifier(2).build();
    public static final FoodComponent GRAPES = new FoodComponent.Builder().hunger(2).saturationModifier(2).snack().build();
}
