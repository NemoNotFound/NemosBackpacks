package com.nemonotfound.nemos.backpacks.network.protocol.game;

import com.nemonotfound.nemos.backpacks.helper.Backpacker;
import commonnetwork.networking.data.PacketContext;
import commonnetwork.networking.data.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;

import static com.nemonotfound.nemos.backpacks.Constants.MOD_ID;

public class BackpackOpenedPacket {

    public static final Identifier CHANNEL = Identifier.fromNamespaceAndPath(MOD_ID, "backpack_opened");
    public static final StreamCodec<FriendlyByteBuf, BackpackOpenedPacket> STREAM_CODEC = StreamCodec.ofMember(BackpackOpenedPacket::encode, BackpackOpenedPacket::new);
    private final ItemStack itemStack;

    public BackpackOpenedPacket(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public static CustomPacketPayload.Type<CustomPacketPayload> type() {
        return new CustomPacketPayload.Type<>(CHANNEL);
    }

    public BackpackOpenedPacket(FriendlyByteBuf buf) {
        this.itemStack = buf.readLenientJsonWithCodec(BuiltInRegistries.ITEM.byNameCodec()).getDefaultInstance();
    }

    public void encode(FriendlyByteBuf buf) {
        buf.writeJsonWithCodec(BuiltInRegistries.ITEM.byNameCodec(), itemStack.getItem());
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public static void handle(PacketContext<BackpackOpenedPacket> context) {
        if (Side.SERVER.equals(context.side())) {
            return;
        }

        var player = Minecraft.getInstance().player;

        if (player == null) {
            return;
        }

        ((Backpacker) Minecraft.getInstance().player).nemosBackpacks$setLastOpenedBackpack(context.message().getItemStack());
    }
}
