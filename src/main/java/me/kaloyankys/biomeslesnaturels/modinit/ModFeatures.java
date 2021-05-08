package me.kaloyankys.biomeslesnaturels.modinit;

import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.placer.DoublePlantPlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;

import java.util.OptionalInt;

public class ModFeatures {

    //Ores + Stone Patches
    private static ConfiguredFeature<?, ?> LIMESTONE_PATCH = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.LIMESTONE.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(90);
    private static ConfiguredFeature<?, ?> LAYERED_LIMESTONE_PATCH = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.LAYERED_LIMESTONE.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(90);
    private static ConfiguredFeature<?, ?> GRASSY_PATCH = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Blocks.GRASS_BLOCK.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    50,
                    0,
                    100)))
            .spreadHorizontally()
            .repeat(100);
    private static ConfiguredFeature<?, ?> GEYSER_PATCH = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.GEYSER.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    60,
                    0,
                    240)))
            .spreadHorizontally()
            .repeat(50);
    private static ConfiguredFeature<?, ?> MUD_PATCH = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.MUDDY_DIRT.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    50,
                    0,
                    100)))//haha
            .spreadHorizontally()
            .repeat(128);
    private static ConfiguredFeature<?, ?> RUFFROCK_PATCH = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.RUFFROCK.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    90,
                    0,
                    240)))//haha
            .spreadHorizontally()
            .repeat(96);
    private static ConfiguredFeature<?, ?> RUFFROCK_PATCH_DEEP = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.RUFFROCK.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    60)))//haha
            .spreadHorizontally()
            .repeat(120);

    private static ConfiguredFeature<?, ?> MARBLE_PATCH = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.MARBLE.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    120,
                    0,
                    150)))//haha
            .spreadHorizontally()
            .repeat(120);
    private static ConfiguredFeature<?, ?> MARBLE_PATCH_DEEP = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.MARBLE.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    60)))//haha
            .spreadHorizontally()
            .repeat(120);

    //Random Patches
    public static final ConfiguredFeature<?, ?> GOATBERRY_FEATURE = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.GOATBERRY.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(3).build());
    public static final ConfiguredFeature<?, ?> EBONY_TREE_FEATURE = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.EBONY_TREE.getDefaultState()), new DoublePlantPlacer())).tries(15).build());
    public static final ConfiguredFeature<?, ?> WIND_FEATURE = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.WIND.getDefaultState()), SimpleBlockPlacer.INSTANCE)).build());
    public static final ConfiguredFeature<?, ?> MINT_FEATURE = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.MINT.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(50).build());
    public static final ConfiguredFeature<?, ?> EDELWEISS_FEATURE = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.EDELWEISS.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(30).build());

    public static final ConfiguredFeature<?, ?> SUNLEAF_FEATURE = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.SUNLEAF.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(20).build());
    public static final ConfiguredFeature<?, ?> OAT_FEATURE = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.OAT_GRASS.getDefaultState()), new DoublePlantPlacer())).tries(5).build());
    public static final ConfiguredFeature<?, ?> SMALL_OAT_FEATURE = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.OAT_GRASS_SMALL.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(10).build());

    public static final ConfiguredFeature<?, ?> OLIVE_FEATURE = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.OLIVE_TREE.getDefaultState()), new DoublePlantPlacer())).tries(15).build());
    public static final ConfiguredFeature<?, ?> GRAPE_VINES = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.GRAPE.getDefaultState()), new DoublePlantPlacer())).tries(30).build());
    public static final ConfiguredFeature<?, ?> CLOVER_FEATURE = Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder
            (new SimpleBlockStateProvider(ModBlocks.CLOVER_PATCH.getDefaultState()), SimpleBlockPlacer.INSTANCE)).tries(20).build());

    //Trees
    public static final ConfiguredFeature<TreeFeatureConfig, ?> TEST_TREE = Feature.TREE.configure((new TreeFeatureConfig.Builder
            (new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
                    new LargeOakFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(2), 2),
                    new LargeOakTrunkPlacer(8, 11, 2),
                    new TwoLayersFeatureSize(2, 0, 0, OptionalInt.of(3)))
            .decorators(ImmutableList.of(ConfiguredFeatures.Decorators.REGULAR_BEEHIVES_TREES)).ignoreVines().build()));

    //Features

    public ModFeatures() {

        //Stone Patches
        RegistryKey<ConfiguredFeature<?, ?>> ruffrockPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "ruffrock_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ruffrockPatch.getValue(), RUFFROCK_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WINDSWEPT_PEAKS_KEY, BiomeKeys.MOUNTAINS, BiomeKeys.SNOWY_MOUNTAINS, BiomeKeys.WOODED_MOUNTAINS), GenerationStep.Feature.UNDERGROUND_ORES, ruffrockPatch);
        RegistryKey<ConfiguredFeature<?, ?>> mudPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "mud_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mudPatch.getValue(), MUD_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WINDSWEPT_PEAKS_KEY, BiomeKeys.MOUNTAINS, BiomeKeys.SNOWY_MOUNTAINS, BiomeKeys.WOODED_MOUNTAINS), GenerationStep.Feature.UNDERGROUND_ORES, mudPatch);
        RegistryKey<ConfiguredFeature<?, ?>> grassyPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "grassy_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, grassyPatch.getValue(), GRASSY_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WINDSWEPT_PEAKS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, grassyPatch);
        RegistryKey<ConfiguredFeature<?, ?>> ruffrockAlternatePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "ruffrock_alternate_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ruffrockAlternatePatch.getValue(), RUFFROCK_PATCH_DEEP);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WINDSWEPT_PEAKS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ruffrockAlternatePatch);

        RegistryKey<ConfiguredFeature<?, ?>> limestonePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "limestone_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, limestonePatch.getValue(), LIMESTONE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, limestonePatch);
        RegistryKey<ConfiguredFeature<?, ?>> layeredLimestonePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "layered_sandstone_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, layeredLimestonePatch.getValue(), LAYERED_LIMESTONE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, layeredLimestonePatch);

        RegistryKey<ConfiguredFeature<?, ?>> marblePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "marble_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, marblePatch.getValue(), MARBLE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MEDITERRANEAN_MOUNTAINS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, marblePatch);
        RegistryKey<ConfiguredFeature<?, ?>> marbleDeepPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "marble_deep_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, marbleDeepPatch.getValue(), MARBLE_PATCH_DEEP);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MEDITERRANEAN_MOUNTAINS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, marbleDeepPatch);


        //Random Patches
        RegistryKey<ConfiguredFeature<?, ?>> goatBerry = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "goatberry_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, goatBerry.getValue(), GOATBERRY_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WINDSWEPT_PEAKS_KEY), GenerationStep.Feature.VEGETAL_DECORATION, goatBerry);
        RegistryKey<ConfiguredFeature<?, ?>> ebonyTree = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "ebony_tree_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ebonyTree.getValue(), EBONY_TREE_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WINDSWEPT_PEAKS_KEY), GenerationStep.Feature.VEGETAL_DECORATION, ebonyTree);
        RegistryKey<ConfiguredFeature<?, ?>> windFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "wind_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, windFeature.getValue(), WIND_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WINDSWEPT_PEAKS_KEY), GenerationStep.Feature.VEGETAL_DECORATION, windFeature);
        RegistryKey<ConfiguredFeature<?, ?>> edelweissFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "edelweiss_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, edelweissFeature.getValue(), EDELWEISS_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WINDSWEPT_PEAKS_KEY), GenerationStep.Feature.VEGETAL_DECORATION, edelweissFeature);
        RegistryKey<ConfiguredFeature<?, ?>> geyserPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "geyser_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, geyserPatch.getValue(), GEYSER_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WINDSWEPT_PEAKS_KEY), GenerationStep.Feature.VEGETAL_DECORATION, geyserPatch);
        RegistryKey<ConfiguredFeature<?, ?>> mintPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "mint_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mintPatch.getValue(), MINT_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.WINDSWEPT_PEAKS_KEY), GenerationStep.Feature.VEGETAL_DECORATION, mintPatch);

        RegistryKey<ConfiguredFeature<?, ?>> sunleafFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "sunleaf_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, sunleafFeature.getValue(), SUNLEAF_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.VEGETAL_DECORATION, sunleafFeature);
        RegistryKey<ConfiguredFeature<?, ?>> oatFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "oat_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oatFeature.getValue(), OAT_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.VEGETAL_DECORATION, oatFeature);
        RegistryKey<ConfiguredFeature<?, ?>> smallOatFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "small_oat_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, smallOatFeature.getValue(), SMALL_OAT_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.VEGETAL_DECORATION, smallOatFeature);

        RegistryKey<ConfiguredFeature<?, ?>> oliveFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "olive_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oliveFeature.getValue(), OLIVE_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MEDITERRANEAN_KEY), GenerationStep.Feature.VEGETAL_DECORATION, oliveFeature);
        RegistryKey<ConfiguredFeature<?, ?>> grapeFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "grape_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, grapeFeature.getValue(), GRAPE_VINES);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MEDITERRANEAN_PLAINS_KEY), GenerationStep.Feature.VEGETAL_DECORATION, grapeFeature);
        RegistryKey<ConfiguredFeature<?, ?>> cloverFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "clover_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, cloverFeature.getValue(), CLOVER_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MEDITERRANEAN_PLAINS_KEY, ModBiomes.MEDITERRANEAN_KEY), GenerationStep.Feature.VEGETAL_DECORATION, cloverFeature);

        //Trees
        RegistryKey<ConfiguredFeature<?, ?>> testTree = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "test_tree"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, testTree.getValue(), TEST_TREE);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MEDITERRANEAN_KEY), GenerationStep.Feature.VEGETAL_DECORATION, testTree);

        //Features
    }
}
