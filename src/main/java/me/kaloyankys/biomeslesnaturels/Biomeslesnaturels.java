package me.kaloyankys.biomeslesnaturels;

import me.kaloyankys.biomeslesnaturels.client.particle.MyDefaultParticleType;
import me.kaloyankys.biomeslesnaturels.modinit.ModBlocks;
import me.kaloyankys.biomeslesnaturels.modinit.ModItems;
import me.kaloyankys.biomeslesnaturels.modinit.ModBiomes;
import me.kaloyankys.biomeslesnaturels.modinit.ModFeatures;
import net.fabricmc.api.ModInitializer;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Biomeslesnaturels implements ModInitializer {
//Particles
    public static final DefaultParticleType GEYSER_BUBBLE = new MyDefaultParticleType(true);
    public static final DefaultParticleType LEAF = new MyDefaultParticleType(true);
    public static final DefaultParticleType WIND_PUFF = new MyDefaultParticleType(true);

    @Override
    public void onInitialize() {
        //ModInit
        new ModItems();
        new ModBiomes();
        new ModBlocks();
        new ModFeatures();
        //Particles
        Registry.register(Registry.PARTICLE_TYPE, new Identifier("biomeslesnaturels", "geyser_bubble"), GEYSER_BUBBLE);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier("biomeslesnaturels", "leaf"), LEAF);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier("biomeslesnaturels", "wind_puff"), WIND_PUFF);
    }
}
