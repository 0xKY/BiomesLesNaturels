package me.kaloyankys.biomeslesnaturels.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.AscendingParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

@Environment(EnvType.CLIENT)
public class GeyserBubbleParticle extends AscendingParticle {
    public GeyserBubbleParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, float scale, SpriteProvider spriteProvider) {
        super(world, x, y, z, 0.1F, 0.1F, 0.1F, velocityX, velocityY, velocityZ, scale, spriteProvider, 0.8F, 60, 0.006D, true);
    }

    @Override
    public float getSize(float tickDelta) {
        float ageDelta = ((float)this.age + tickDelta) / ((float)this.maxAge / 2);
        return this.scale * (1.0F - ageDelta) * 1.4F;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new GeyserBubbleParticle(clientWorld, x, y, z, velocityX, velocityY, velocityZ, 1.0F, this.spriteProvider);
        }
    }
}