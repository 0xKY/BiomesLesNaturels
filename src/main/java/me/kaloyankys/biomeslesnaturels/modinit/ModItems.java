package me.kaloyankys.biomeslesnaturels.modinit;

import me.kaloyankys.biomeslesnaturels.item.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class ModItems {

    public static final Item OAT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item OAT_BREAD = new Item(new FabricItemSettings().food(ModFoodComponents.OAT_BREAD).group(ItemGroup.FOOD));
    public static final Item GOATBERRY_BUNCH = new Item(new FabricItemSettings().food(ModFoodComponents.GOATBERRY_BUNCH).group(ItemGroup.FOOD));

    public ModItems() {

        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "oat"), OAT);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "oat_bread"), OAT_BREAD);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "goatberry"), GOATBERRY_BUNCH);
    }
}
