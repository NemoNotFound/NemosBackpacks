package com.nemonotfound.nemos.backpacks.world.item;

public enum BackpackMaterial {

    STRING("default", 1),
    COPPER("copper", 2),
    IRON("iron", 3),
    GOLD("golden", 4),
    DIAMOND("diamond", 5),
    NETHERITE("netherite", 6);

    private final String name;
    private final int rows;

    BackpackMaterial(String name, int rows) {
        this.name = name;
        this.rows = rows;
    }

    public static BackpackMaterial getNextMaterialLevel(BackpackMaterial backpackMaterial) {
        return switch (backpackMaterial) {
            case STRING -> COPPER;
            case COPPER -> IRON;
            case IRON -> GOLD;
            case GOLD -> DIAMOND;
            case DIAMOND, NETHERITE -> NETHERITE;
        };
    }

    public String getName() {
        return this.name;
    }

    public int getRows() {
        return this.rows;
    }
}
