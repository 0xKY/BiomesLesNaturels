package me.kaloyankys.biomeslesnaturels;

import me.kaloyankys.biomeslesnaturels.client.particle.MyDefaultParticleType;
import me.kaloyankys.biomeslesnaturels.modinit.ModBlocks;
import me.kaloyankys.biomeslesnaturels.modinit.ModItems;
import me.kaloyankys.biomeslesnaturels.modinit.ModBiomes;
import me.kaloyankys.biomeslesnaturels.modinit.ModFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Biomeslesnaturels implements ModInitializer {
//Particles
    public static final DefaultParticleType GEYSER_BUBBLE = new MyDefaultParticleType(true);
    public static final DefaultParticleType LEAF = new MyDefaultParticleType(true);
//Tabs
public static final ItemGroup BIOMESLESNATURELS_ITEMGROUP = FabricItemGroupBuilder.build(
        new Identifier("biomeslesnaturels", "biomeslesnaturels_itemgroup"),
        () -> new ItemStack(ModBlocks.OIL_LAMP));

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
    }
}
