package me.kaloyankys.biomeslesnaturels.modinit;

import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public final class ModBiomes {

    public static final RegistryKey<Biome> WINDSWEPT_PEAKS_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("biomeslesnaturels", "windswept_peaks"));
        private static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> WINDSWEPT_PEAKS_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
                .withConfig(new TernarySurfaceConfig(
                        Blocks.GRASS_BLOCK.getDefaultState(),
                        ModBlocks.MUDDY_DIRT.getDefaultState(),
                        Blocks.STONE.getDefaultState()));



        private static final Biome WINDSWEPT_PEAKS = createWindsweptPeaks();

        private static Biome createWindsweptPeaks() {

            SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
            DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
            DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);

            GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
            generationSettings.surfaceBuilder(WINDSWEPT_PEAKS_SURFACE_BUILDER);
            DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
            DefaultBiomeFeatures.addDungeons(generationSettings);
            DefaultBiomeFeatures.addMineables(generationSettings);
            DefaultBiomeFeatures.addDefaultOres(generationSettings);
            DefaultBiomeFeatures.addDefaultDisks(generationSettings);
            DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
            DefaultBiomeFeatures.addMountainTrees(generationSettings);
            DefaultBiomeFeatures.addPlainsFeatures(generationSettings);
            DefaultBiomeFeatures.addPlainsTallGrass(generationSettings);

            return (new Biome.Builder())
                    .precipitation(Biome.Precipitation.SNOW)
                    .category(Biome.Category.ICY)
                    .depth(0.2F)
                    .scale(0.2F)
                    .temperature(0)
                    .downfall(5F)
                    .effects((new BiomeEffects.Builder())
                            .waterColor(0x1e499e)
                            .waterFogColor(0x1e499e)
                            .fogColor(0xc8e4e6)
                            .skyColor(0x77adff)
                            .grassColor(0xcf5011)
                            .build())

                    .spawnSettings(spawnSettings.build())
                    .generationSettings(generationSettings.build())
                    .build();
        }

    public ModBiomes() {

        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("biomeslesnaturels", "windswept_peaks"), WINDSWEPT_PEAKS_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, WINDSWEPT_PEAKS_KEY.getValue(), WINDSWEPT_PEAKS);
        OverworldBiomes.addContinentalBiome(WINDSWEPT_PEAKS_KEY, OverworldClimate.COOL, 100D);
        OverworldBiomes.addContinentalBiome(WINDSWEPT_PEAKS_KEY, OverworldClimate.COOL, 100D);

    }
}
