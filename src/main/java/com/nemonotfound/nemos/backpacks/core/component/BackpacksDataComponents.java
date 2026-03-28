package com.nemonotfound.nemos.backpacks.core.component;

import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.resources.Identifier;

import java.util.function.UnaryOperator;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

public class BackpacksDataComponents {

    public static final DataComponentType<Boolean> IS_BACKPACK_OPEN = register(
            "is_backpack_open",
            (builder) -> builder.persistent(Codec.BOOL)
            .networkSynchronized(ByteBufCodecs.BOOL));

    public static void init() {}

    private static <T> DataComponentType<T> register(String id, UnaryOperator<DataComponentType.Builder<T>> builder) {
        var identifier = Identifier.fromNamespaceAndPath(MOD_ID, id);
        return Registry.register(BuiltInRegistries.DATA_COMPONENT_TYPE, identifier, builder.apply(DataComponentType.builder()).build());
    }
}
