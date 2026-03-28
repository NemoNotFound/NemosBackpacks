package com.nemonotfound.nemos.backpacks.network.protocol.game;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.NonNull;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

public record BackpackOpenedPacket(ItemStack itemStack) implements CustomPacketPayload {

    public static final Type<BackpackOpenedPacket> TYPE = new Type<>(Identifier.fromNamespaceAndPath(MOD_ID, "backpack_opened"));
    public static final StreamCodec<RegistryFriendlyByteBuf, BackpackOpenedPacket> CODEC = StreamCodec.composite(ItemStack.STREAM_CODEC, BackpackOpenedPacket::itemStack, BackpackOpenedPacket::new);

    @Override
    public @NonNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
