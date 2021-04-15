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
public class WindPuff extends AscendingParticle {
    public WindPuff(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, float scale, SpriteProvider spriteProvider) {
        super(world, x, y, z, 1F, 0.5F, 0F, velocityX, velocityY, velocityZ, scale, spriteProvider, 0.8F, 30, 0D, true);
    }

    @Override
    public float getSize(float tickDelta) {
        float ageDelta = (40F);
        return this.scale * (0.5F - ageDelta) * 2.0F;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new WindPuff(clientWorld, x, y, z, velocityX, velocityY, velocityZ, 0.2F, this.spriteProvider);
        }
    }
}