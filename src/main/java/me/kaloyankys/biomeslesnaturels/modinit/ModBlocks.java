package me.kaloyankys.biomeslesnaturels.modinit;

import me.kaloyankys.biomeslesnaturels.block.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block OAT_GRASS = new OatGrassBlock(FabricBlockSettings.of(Material.PLANT).strength(0f).collidable(false));
    public static final Block OAT_GRASS_SMALL = new OatGrassSmall(FabricBlockSettings.of(Material.PLANT).strength(0f).collidable(false));
    public static final Block LIMESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f));
    public static final Block LAYERED_LIMESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f));
    public static final Block SUNLEAF = new SunLeafBlock(FabricBlockSettings.of(Material.PLANT).strength(0f).collidable(false));
    public static final Block OAT_BUNDLE = new Block(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block GEYSER = new Geyser(FabricBlockSettings.of(Material.PLANT).strength(1.7f));
    public static final Block RUFFROCK = new Block(FabricBlockSettings.of(Material.PLANT).strength(1.7f));
    public static final Block GOATBERRY = new GoatberryBush(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block MINT = new AbstractGrass(FabricBlockSettings.of(Material.PLANT).strength(0f).collidable(false));
    public static final Block WIND = new WindBlock(FabricBlockSettings.of(Material.AIR).strength(0f).collidable(false));
    public static final Block FLOURISHING_WINDGRASS = new AbstractGrass(FabricBlockSettings.of(Material.PLANT).strength(0f).collidable(false));
    public static final Block MUDDY_DIRT = new GrassBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5f));
    public static final Block EBONY_TREE = new EbonyTree(FabricBlockSettings.of(Material.WOOD).strength(0.9f));

    public ModBlocks() {

        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "oat_grass"), OAT_GRASS);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "oat_grass"), new BlockItem(OAT_GRASS, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "oat_grass_small"), OAT_GRASS_SMALL);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "oat_grass_small"), new BlockItem(OAT_GRASS_SMALL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "limestone"), LIMESTONE);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "limestone"), new BlockItem(LIMESTONE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "layered_limestone"), LAYERED_LIMESTONE);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "layered_limestone"), new BlockItem(LAYERED_LIMESTONE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "sun_leaf"), SUNLEAF);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "sun_leaf"), new BlockItem(SUNLEAF, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "oat_bundle"), OAT_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "oat_bundle"), new BlockItem(OAT_BUNDLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "geyser"), GEYSER);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "geyser"), new BlockItem(GEYSER, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "ruffrock"), RUFFROCK);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "ruffrock"), new BlockItem(RUFFROCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "goatberry_bush"), GOATBERRY);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "goatberry_bush"), new BlockItem(GOATBERRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "mint"), MINT);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "mint"), new BlockItem(MINT, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "muddy_dirt"), MUDDY_DIRT);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "muddy_dirt"), new BlockItem(MUDDY_DIRT, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "wind"), WIND);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "wind"), new BlockItem(WIND, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "flourishing_windgrass"), FLOURISHING_WINDGRASS);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "flourishing_windgrass"), new BlockItem(FLOURISHING_WINDGRASS, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "ebony_tree"), EBONY_TREE);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "ebony_tree"), new BlockItem(EBONY_TREE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

    }
}
