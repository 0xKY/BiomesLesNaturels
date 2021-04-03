package me.kaloyankys.biomeslesnaturels.client;

import me.kaloyankys.biomeslesnaturels.Biomeslesnaturels;
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
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.OAT_GRASS, ModBlocks.OAT_GRASS_SMALL, ModBlocks.SUNLEAF, ModBlocks.OAT_BUNDLE, ModBlocks.GOATBERRY, ModBlocks.MINT, ModBlocks.WINDGRASS, ModBlocks.FLOURISHING_WINDGRASS);
        ParticleFactoryRegistry.getInstance().register(Biomeslesnaturels.GEYSER_BUBBLE, GeyserBubbleParticle.Factory::new);
    }
}
