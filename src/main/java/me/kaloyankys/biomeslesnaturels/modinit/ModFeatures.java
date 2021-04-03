package me.kaloyankys.biomeslesnaturels.modinit;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
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

public class ModFeatures {

    private static ConfiguredFeature<?, ?> LIMESTONE_PATCH = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.LIMESTONE.getDefaultState(),
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
                    ModBlocks.RUFFROCK.getDefaultState(),
                    64))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    240)))//haha
            .spreadHorizontally()
            .repeat(128);

    public ModFeatures() {

        RegistryKey<ConfiguredFeature<?, ?>> limestonePatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "limestone_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, limestonePatch.getValue(), LIMESTONE_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT), GenerationStep.Feature.UNDERGROUND_ORES, limestonePatch);
        RegistryKey<ConfiguredFeature<?, ?>> ruffrockPatch = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("biomeslesnaturels", "ruffrock_patch"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ruffrockPatch.getValue(), RUFFROCK_PATCH);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MOUNTAINS, BiomeKeys.SNOWY_MOUNTAINS, BiomeKeys.WOODED_MOUNTAINS), GenerationStep.Feature.UNDERGROUND_ORES, ruffrockPatch);
    }
}
