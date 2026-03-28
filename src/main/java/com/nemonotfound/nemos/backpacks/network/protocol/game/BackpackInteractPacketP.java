package com.nemonotfound.nemos.backpacks.network.protocol.game;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import org.jspecify.annotations.NonNull;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

public record BackpackInteractPacketP(String ignore) implements CustomPacketPayload {

    public static final Type<BackpackInteractPacketP> TYPE = new Type<>(Identifier.fromNamespaceAndPath(MOD_ID, "backpack_interact"));
    public static final StreamCodec<RegistryFriendlyByteBuf, BackpackInteractPacketP> CODEC = StreamCodec.composite(ByteBufCodecs.STRING_UTF8, BackpackInteractPacketP::ignore, BackpackInteractPacketP::new);

    @Override
    public @NonNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
