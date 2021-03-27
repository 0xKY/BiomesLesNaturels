package me.kaloyankys.biomeslesnaturels.client;

import me.kaloyankys.biomeslesnaturels.Biomeslesnaturels;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class BiomeslesnaturelsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                Biomeslesnaturels.OAT_GRASS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                Biomeslesnaturels.OAT_GRASS_SMALL);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                Biomeslesnaturels.SUNLEAF);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                Biomeslesnaturels.OAT_BUNDLE);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                Biomeslesnaturels.GOATBERRY);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                Biomeslesnaturels.MINT);
    }
}
