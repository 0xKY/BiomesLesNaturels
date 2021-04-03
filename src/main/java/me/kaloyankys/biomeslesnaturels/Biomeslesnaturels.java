package me.kaloyankys.biomeslesnaturels;

import me.kaloyankys.biomeslesnaturels.block.*;
import me.kaloyankys.biomeslesnaturels.client.particle.MyDefaultParticleType;
import me.kaloyankys.biomeslesnaturels.item.ModFoodComponents;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Biomeslesnaturels implements ModInitializer {
    public static final Block OAT_GRASS = new OatGrassBlock(FabricBlockSettings.of(Material.PLANT).strength(0f).nonOpaque());
    public static final Block OAT_GRASS_SMALL = new OatGrassSmall(FabricBlockSettings.of(Material.PLANT).strength(0f).nonOpaque());
    public static final Block LIMESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f));
    public static final Block LAYERED_LIMESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f));
    public static final Block SUNLEAF = new SunLeafBlock(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block OAT_BUNDLE = new Block(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block GEYSER = new WindStream(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block RUFFROCK = new Block(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block GOATBERRY = new GoatberryBush(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block MINT = new AbstractGrass(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block WINDGRASS = new AbstractGrass(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block FLOURISHING_WINDGRASS = new AbstractGrass(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block TUNDRA_GRASS = new GrassBlock(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block PATCHY_GRASS = new GrassBlock(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Block MUDDY_DIRT = new GrassBlock(FabricBlockSettings.of(Material.PLANT).strength(0.5f));
    public static final Item OAT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Item OAT_BREAD = new Item(new FabricItemSettings().food(ModFoodComponents.OAT_BREAD).group(ItemGroup.FOOD));
    public static final Item GOATBERRY_BUNCH = new Item(new FabricItemSettings().food(ModFoodComponents.GOATBERRY_BUNCH).group(ItemGroup.FOOD));
    private static ConfiguredFeature<?, ?> LIMESTONE_PATCH = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Biomeslesnaturels.LIMESTONE.getDefaultState(),
                    50))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(50);
    private static ConfiguredFeature<?, ?> RUFFROCK_PATCH = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Biomeslesnaturels.RUFFROCK.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    240)))//haha
            .spreadHorizontally()
            .repeat(128);
    public static final DefaultParticleType GEYSER_BUBBLE = new MyDefaultParticleType(true);

    @Override
    public void onInitialize() {
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
        RegistryKey<ConfiguredFeature<?, ?>> limestonePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "limestone_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, limestonePatch.getValue(), LIMESTONE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, limestonePatch);
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "geyser"), GEYSER);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "geyser"), new BlockItem(GEYSER, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "ruffrock"), RUFFROCK);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "ruffrock"), new BlockItem(RUFFROCK, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "goatberry_bush"), GOATBERRY);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "goatberry_bush"), new BlockItem(GOATBERRY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "mint"), MINT);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "mint"), new BlockItem(MINT, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        RegistryKey<ConfiguredFeature<?, ?>> ruffrockPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "ruffrock_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ruffrockPatch.getValue(), RUFFROCK_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MOUNTAINS, BiomeKeys.SNOWY_MOUNTAINS, BiomeKeys.WOODED_MOUNTAINS), GenerationStep.Feature.UNDERGROUND_ORES, ruffrockPatch);
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "tundra_grass"), TUNDRA_GRASS);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "tundra_grass"), new BlockItem(TUNDRA_GRASS, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "patchy_tundra_grass"), PATCHY_GRASS);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "patchy_tundra_grass"), new BlockItem(PATCHY_GRASS, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "muddy_dirt"), MUDDY_DIRT);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "muddy_dirt"), new BlockItem(MUDDY_DIRT, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "windgrass"), WINDGRASS);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "windgrass"), new BlockItem(WINDGRASS, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier("biomeslesnaturels", "flourishing_windgrass"), FLOURISHING_WINDGRASS);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "flourishing_windgrass"), new BlockItem(FLOURISHING_WINDGRASS, new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "oat"), OAT);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "oat_bread"), OAT_BREAD);
        Registry.register(Registry.ITEM, new Identifier("biomeslesnaturels", "goatberry"), GOATBERRY_BUNCH);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier("biomeslesnaturels", "geyser_bubble"), GEYSER_BUBBLE);
    }
}
