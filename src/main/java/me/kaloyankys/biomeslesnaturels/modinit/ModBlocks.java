package me.kaloyankys.biomeslesnaturels.modinit;

import me.kaloyankys.biomeslesnaturels.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block OAT_GRASS = register("oat_grass", new OatGrassBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().collidable(false)));
    public static final Block OAT_GRASS_SMALL = register("oat_grass_small", new OatGrassSmall(FabricBlockSettings.of(Material.PLANT).breakInstantly().collidable(false)));
    public static final Block LIMESTONE = register("limestone", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 1)));
    public static final Block LAYERED_LIMESTONE = register("layered_limestone", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block SMOOTH_LIMESTONE = register("oat_grass", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block SUNLEAF = register("sun_leaf", new SunLeafBlock(FabricBlockSettings.of(Material.PLANT).breakInstantly().collidable(false)));
    public static final Block OAT_BUNDLE = register("oat_bundle", new Block(FabricBlockSettings.of(Material.PLANT).strength(0.5f).breakByTool(FabricToolTags.HOES, 1)));
    public static final Block GEYSER = register("geyser", new Geyser(FabricBlockSettings.of(Material.STONE).strength(3.2f).breakByTool(FabricToolTags.PICKAXES, 1)));
    public static final Block RUFFROCK = register("ruffrock", new Block(FabricBlockSettings.of(Material.STONE).strength(3.2f).breakByTool(FabricToolTags.PICKAXES, 1)));
    public static final Block POLISHED_RUFFROCK = register("polished_ruffrock", new Block(FabricBlockSettings.of(Material.STONE).strength(3.2f).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block POLISHED_RUFFROCK_TILES = register("ruffrock_tiles", new Block(FabricBlockSettings.of(Material.STONE).strength(3.2f).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block GOATBERRY = register("goatberry_bush", new GoatberryBush(FabricBlockSettings.of(Material.PLANT).strength(0.5f)));
    public static final Block MINT = register("mint", new AbstractGrass(FabricBlockSettings.of(Material.PLANT).strength(0f).collidable(false)));
    public static final Block WIND = register("wind", new WindBlock(FabricBlockSettings.of(Material.AIR).strength(1000f).collidable(false)));
    public static final Block FLOURISHING_WINDGRASS = register("flourishing_windgrass", new AbstractGrass(FabricBlockSettings.of(Material.PLANT).breakInstantly().collidable(false)));
    public static final Block MUDDY_DIRT = register("muddy_dirt", new GrassBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5f).breakByTool(FabricToolTags.SHOVELS, 1)));
    public static final Block EBONY_TREE = register("ebony_tree", new EbonyTree(FabricBlockSettings.of(Material.WOOD).strength(0.9f).collidable(false).breakByTool(FabricToolTags.AXES, 2)));
    public static final Block EDELWEISS = register("edelweiss", new AbstractGrass(FabricBlockSettings.of(Material.PLANT).breakInstantly().collidable(false)));
    public static final Block OLIVE_TREE = register("olive_tree", new TallPlant(FabricBlockSettings.of(Material.WOOD).strength(0.9f).collidable(false).breakByTool(FabricToolTags.AXES, 2)));
    public static final Block JOLLY_BARREL = register("drinking_barrel", new JollyBarrel(FabricBlockSettings.of(Material.WOOD).strength(0.9f).breakByTool(FabricToolTags.AXES, 2)));
    public static final Block MARBLE = register("marble", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByTool(FabricToolTags.PICKAXES, 1)));
    public static final Block GRAPE = register("grape", new TallPlant(FabricBlockSettings.of(Material.PLANT).strength(0.1f).collidable(false)));
    public static final Block BLOSSOM = register("blossom", new CarpetPatchBlock(FabricBlockSettings.of(Material.PLANT).strength(0.05f).collidable(false)));
    public static final Block CLOVER_PATCH = register("clover", new CarpetPatchBlock(FabricBlockSettings.of(Material.PLANT).strength(0.05f).collidable(false)));
    public static final Block FOURLEAF_CLOVER = register("fourleaf_clover", new CarpetPatchBlock(FabricBlockSettings.of(Material.PLANT).strength(0.05f).collidable(false)));
    public static final Block OIL = register("oil", new Oil(FabricBlockSettings.of(Material.WOOL).strength(0.01f).slipperiness(1.2f)));

    public static Block register(String id, Block block) {
        Item blockItem = new BlockItem(block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", id), blockItem);
        return Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", id), block);
    }
}