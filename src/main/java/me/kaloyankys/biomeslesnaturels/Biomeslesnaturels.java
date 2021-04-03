package me.kaloyankys.biomeslesnaturels;

import me.kaloyankys.biomeslesnaturels.client.particle.MyDefaultParticleType;
import me.kaloyankys.biomeslesnaturels.modinit.ModBlocks;
import me.kaloyankys.biomeslesnaturels.modinit.ModItems;
import me.kaloyankys.biomeslesnaturels.modinit.ModBiomes;
import me.kaloyankys.biomeslesnaturels.modinit.ModFeatures;
import net.fabricmc.api.ModInitializer;
import net.minecraft.particle.DefaultParticleType;

public class Biomeslesnaturels implements ModInitializer {

    public static final DefaultParticleType GEYSER_BUBBLE = new MyDefaultParticleType(true);

    @Override
    public void onInitialize() {
        new ModItems();
        new ModBiomes();
        new ModBlocks();
        new ModFeatures();
    }
}
