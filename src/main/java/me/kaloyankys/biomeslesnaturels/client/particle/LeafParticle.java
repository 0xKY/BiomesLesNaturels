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
public class LeafParticle extends AscendingParticle {
    public LeafParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, float scale, SpriteProvider spriteProvider) {
        super(world, x, y, z, 1F, -0.4F, 0F, velocityX, velocityY, velocityZ, scale, spriteProvider, 0.8F, 30, 0D, true);
    }

    @Override
    public float getSize(float tickDelta) {
        float ageDelta = ((float)this.age + tickDelta) / ((float)this.maxAge / 2);
        return this.scale * (8.0F - ageDelta) * 4.0F;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new LeafParticle(clientWorld, x, y, z, velocityX, velocityY, velocityZ, 0.2F, this.spriteProvider);
        }
    }
}