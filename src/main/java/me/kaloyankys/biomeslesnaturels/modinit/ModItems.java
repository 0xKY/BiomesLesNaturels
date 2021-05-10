package me.kaloyankys.biomeslesnaturels.modinit;

import me.kaloyankys.biomeslesnaturels.Biomeslesnaturels;
import me.kaloyankys.biomeslesnaturels.item.ModFoodComponents;
import me.kaloyankys.biomeslesnaturels.item.WineBottle;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class ModItems {

    public static final Item OAT = register("oat", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item WINE_BOTTLE = register("wine_bottle", new WineBottle(new FabricItemSettings().group(ItemGroup.FOOD)));
    public static final Item OAT_BREAD = register("oat_bread", new Item(new FabricItemSettings().food(ModFoodComponents.OAT_BREAD).group(ItemGroup.FOOD)));
    public static final Item GOATBERRY_BUNCH = register("goatberry_bunch", new Item(new FabricItemSettings().food(ModFoodComponents.GOATBERRY_BUNCH).group(ItemGroup.FOOD)));
    public static final Item GRAPES = register("grapes", new Item(new FabricItemSettings().food(ModFoodComponents.GRAPES).group(ItemGroup.FOOD)));
    public static final Item OLIVE = register("olive", new Item(new FabricItemSettings().food(ModFoodComponents.GRAPES).group(ItemGroup.FOOD)));

    public static Item register(String id, Item item) {
        Item Item = new Item(new Item.Settings().group(Biomeslesnaturels.BIOMESLESNATURELS_ITEMGROUP));
        return Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", id), item);
    }
}
