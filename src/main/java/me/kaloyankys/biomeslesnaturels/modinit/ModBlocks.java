package me.kaloyankys.biomeslesnaturels.modinit;

import me.kaloyankys.biomeslesnaturels.block.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block OAT_GRASS = new OatGrassBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().collidable(false));
    public static final Block OAT_GRASS_SMALL = new OatGrassSmall(FabricBlockSettings.of(Material.PLANT).breakInstantly().collidable(false));
    public static final Block LIMESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 1));
    public static final Block LAYERED_LIMESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block SMOOTH_LIMESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block SUNLEAF = new SunLeafBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().collidable(false));
    public static final Block OAT_BUNDLE = new Block(FabricBlockSettings.of(Material.PLANT).strength(0.5f).breakByTool(FabricToolTags.HOES, 1));
    public static final Block GEYSER = new Geyser(FabricBlockSettings.of(Material.STONE).strength(3.2f).breakByTool(FabricToolTags.PICKAXES, 1));
    public static final Block RUFFROCK = new Block(FabricBlockSettings.of(Material.STONE).strength(3.2f).breakByTool(FabricToolTags.PICKAXES, 1));
    public static final Block POLISHED_RUFFROCK = new Block(FabricBlockSettings.of(Material.STONE).strength(3.2f).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block POLISHED_RUFFROCK_TILES = new Block(FabricBlockSettings.of(Material.STONE).strength(3.2f).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block GOATBERRY = new GoatberryBush(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block MINT = new AbstractGrass(FabricBlockSettings.of(Material.PLANT).strength(0f).collidable(false));
    public static final Block WIND = new WindBlock(FabricBlockSettings.of(Material.AIR).strength(1000f).collidable(false));
    public static final Block FLOURISHING_WINDGRASS = new AbstractGrass(FabricBlockSettings.of(Material.PLANT).breakInstantly().collidable(false));
    public static final Block MUDDY_DIRT = new GrassBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5f).breakByTool(FabricToolTags.SHOVELS, 1));
    public static final Block EBONY_TREE = new EbonyTree(FabricBlockSettings.of(Material.WOOD).strength(0.9f).collidable(false).breakByTool(FabricToolTags.AXES, 2));
    public static final Block EDELWEISS = new AbstractGrass(FabricBlockSettings.of(Material.PLANT).breakInstantly().collidable(false));
    public static final Block OLIVE_TREE = new OliveTree(FabricBlockSettings.of(Material.WOOD).strength(0.9f).collidable(false).breakByTool(FabricToolTags.AXES, 2));
    public static final Block JOLLY_BARREL = new JollyBarrel(FabricBlockSettings.of(Material.WOOD).strength(0.9f).breakByTool(FabricToolTags.AXES, 2));

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
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "edelweiss"), EDELWEISS);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "edelweiss"), new BlockItem(EDELWEISS, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "smooth_limestone"), SMOOTH_LIMESTONE);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "smooth_limestone"), new BlockItem(SMOOTH_LIMESTONE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "polished_ruffrock"), POLISHED_RUFFROCK);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "polished_ruffrock"), new BlockItem(POLISHED_RUFFROCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "ruffrock_tiles"), POLISHED_RUFFROCK_TILES);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "ruffrock_tiles"), new BlockItem(POLISHED_RUFFROCK_TILES, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "olive_tree"), OLIVE_TREE);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "olive_tree"), new BlockItem(OLIVE_TREE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "drinking_barrel"), JOLLY_BARREL);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "drinking_barrel"), new BlockItem(JOLLY_BARREL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    }
}
