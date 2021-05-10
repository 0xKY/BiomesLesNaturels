package me.kaloyankys.biomeslesnaturels.client;

import me.kaloyankys.biomeslesnaturels.Biomeslesnaturels;
import me.kaloyankys.biomeslesnaturels.client.particle.LeafParticle;
import me.kaloyankys.biomeslesnaturels.modinit.ModBlocks;
import me.kaloyankys.biomeslesnaturels.client.particle.GeyserBubbleParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class BiomeslesnaturelsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //Block Rendering
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.OAT_GRASS, ModBlocks.OAT_GRASS_SMALL, ModBlocks.SUNLEAF, ModBlocks.OAT_BUNDLE, ModBlocks.GOATBERRY, ModBlocks.MINT, ModBlocks.WIND, ModBlocks.FLOURISHING_WINDGRASS, ModBlocks.EBONY_TREE, ModBlocks.EDELWEISS,
                ModBlocks.OLIVE_TREE, ModBlocks.GRAPE, ModBlocks.CLOVER_PATCH, ModBlocks.BLOSSOM);

        //Particle Factories
        ParticleFactoryRegistry.getInstance().register(Biomeslesnaturels.GEYSER_BUBBLE, GeyserBubbleParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(Biomeslesnaturels.LEAF, LeafParticle.Factory::new);
    }
}
