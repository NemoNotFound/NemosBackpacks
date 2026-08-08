package com.nemonotfound.nemos.backpacks.client.model;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

public class BackpackModel extends EntityModel<@NotNull AvatarRenderState> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
            Identifier.fromNamespaceAndPath(MOD_ID, "backpack"), "main"
    );

    private final ModelPart body;

    public BackpackModel(ModelPart ignoredBakedRoot) {
        super(createModelRoot(), RenderTypes::entityCutout);
        this.body = root().getChild("body");
    }

    public static LayerDefinition createBodyLayer() {
        var mesh = new MeshDefinition();
        var root = mesh.getRoot();
        root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);

        return LayerDefinition.create(mesh, 32, 32);
    }

    private static ModelPart createModelRoot() {
        var cubes = List.of(
                perFaceCube(-4.0F, 1.0F, 2.4F, 8.0F, 9.0F, 3.0F,
                        uv(0, 0, 8, 9), uv(0, 13, 3, 22), uv(8, 0, 16, 9),
                        uv(3, 13, 6, 22), uv(14, 16, 6, 13), uv(22, 13, 14, 16)),
                perFaceCube(-4.0F, 1.0F, 5.4F, 8.0F, 3.5F, 0.5F,
                        uv(0, 9, 8, 13), uv(20, 1, 21, 5), uv(8, 9, 16, 13),
                        uv(13, 20, 14, 24), uv(24, 10, 16, 9), uv(24, 10, 16, 11)),
                perFaceCube(4.0F, 5.0F, 2.9F, 1.0F, 4.0F, 2.0F,
                        uv(14, 20, 15, 24), uv(13, 16, 15, 20), uv(15, 20, 16, 24),
                        uv(15, 16, 17, 20), uv(22, 3, 21, 1), uv(22, 3, 21, 5)),
                perFaceCube(-5.0F, 5.0F, 2.9F, 1.0F, 4.0F, 2.0F,
                        uv(16, 20, 17, 24), uv(17, 0, 19, 4), uv(20, 16, 21, 20),
                        uv(17, 4, 19, 8), uv(22, 13, 21, 11), uv(22, 16, 21, 18)),
                perFaceCube(3.0F, 0.0F, -3.1F, 1.0F, 9.0F, 0.5F,
                        uv(16, 0, 17, 9), uv(6, 16, 7, 25), uv(7, 16, 8, 25),
                        uv(8, 16, 9, 25), uv(18, 22, 17, 21), uv(19, 21, 18, 22)),
                perFaceCube(-4.0F, 0.0F, -3.1F, 1.0F, 9.0F, 0.5F,
                        uv(9, 16, 10, 25), uv(10, 16, 11, 25), uv(11, 16, 12, 25),
                        uv(12, 16, 13, 25), uv(19, 23, 18, 22), uv(23, 18, 22, 19)),
                perFaceCube(3.0F, -0.5F, -2.6F, 1.0F, 0.5F, 5.0F,
                        uv(19, 22, 20, 23), uv(16, 11, 21, 12), uv(22, 19, 23, 20),
                        uv(16, 12, 21, 13), uv(18, 21, 17, 16), uv(19, 16, 18, 21)),
                perFaceCube(3.0F, 0.5F, 2.4F, 1.0F, 0.5F, 1.0F,
                        uv(21, 18, 22, 19), uv(19, 21, 20, 22), uv(21, 19, 22, 20),
                        uv(20, 21, 21, 22), uv(22, 22, 21, 21), uv(1, 22, 0, 23)),
                perFaceCube(-4.0F, 0.5F, 2.4F, 1.0F, 0.5F, 1.0F,
                        uv(4, 22, 5, 23), uv(22, 4, 23, 5), uv(5, 22, 6, 23),
                        uv(22, 8, 23, 9), uv(23, 12, 22, 11), uv(23, 12, 22, 13)),
                perFaceCube(-4.0F, -0.5F, -2.6F, 1.0F, 0.5F, 5.0F,
                        uv(20, 22, 21, 23), uv(17, 8, 22, 9), uv(21, 22, 22, 23),
                        uv(19, 0, 24, 1), uv(20, 6, 19, 1), uv(20, 16, 19, 21)),
                perFaceCube(-2.0F, 0.5F, 3.5F, 4.0F, 0.5F, 1.0F,
                        uv(19, 6, 23, 7), uv(22, 21, 23, 22), uv(19, 7, 23, 8),
                        uv(22, 22, 23, 23), uv(24, 6, 20, 5), uv(24, 20, 20, 21)),
                perFaceCube(3.0F, 0.0F, 2.4F, 1.0F, 0.5F, 0.5F,
                        uv(1, 22, 2, 23), uv(22, 1, 23, 2), uv(2, 22, 3, 23),
                        uv(22, 2, 23, 3), uv(4, 23, 3, 22), uv(23, 3, 22, 4)),
                perFaceCube(-4.0F, 0.0F, 2.4F, 1.0F, 0.5F, 0.5F,
                        uv(22, 13, 23, 14), uv(22, 14, 23, 15), uv(22, 15, 23, 16),
                        uv(22, 16, 23, 17), uv(18, 23, 17, 22), uv(23, 17, 22, 18))
        );
        var body = new ModelPart(cubes, Map.of());
        body.setInitialPose(PartPose.ZERO);
        var root = new ModelPart(List.of(), Map.of("body", body));
        root.setInitialPose(PartPose.ZERO);
        return root;
    }

    private static ModelPart.Cube cube(float x, float y, float z,
                                       float width, float height, float depth) {
        return new ModelPart.Cube(0, 0, x, y, z, width, height, depth,
                0.0F, 0.0F, 0.0F, false, 32.0F, 32.0F, EnumSet.allOf(Direction.class));
    }

    private static ModelPart.Cube perFaceCube(float x, float y, float z, float width, float height, float depth,
                                              float[] north, float[] east, float[] south,
                                              float[] west, float[] up, float[] down) {
        var cube = cube(x, y, z, width, height, depth);
        var faceUvs = new EnumMap<Direction, float[]>(Direction.class);
        faceUvs.put(Direction.NORTH, north);
        faceUvs.put(Direction.EAST, east);
        faceUvs.put(Direction.SOUTH, south);
        faceUvs.put(Direction.WEST, west);
        faceUvs.put(Direction.UP, down);
        faceUvs.put(Direction.DOWN, up);

        for (int i = 0; i < cube.polygons.length; i++) {
            var polygon = cube.polygons[i];
            var direction = directionFromNormal(polygon.normal());
            var faceUv = faceUvs.get(direction);
            cube.polygons[i] = new ModelPart.Polygon(
                    polygon.vertices(), faceUv[0], faceUv[1], faceUv[2], faceUv[3],
                    32.0F, 32.0F, false, direction
            );
        }

        return cube;
    }

    private static Direction directionFromNormal(org.joml.Vector3fc normal) {
        Direction closest = Direction.NORTH;
        float closestDot = -Float.MAX_VALUE;

        for (var direction : Direction.values()) {
            float dot = normal.x() * direction.getStepX()
                    + normal.y() * direction.getStepY()
                    + normal.z() * direction.getStepZ();
            if (dot > closestDot) {
                closest = direction;
                closestDot = dot;
            }
        }

        return closest;
    }

    private static float[] uv(float u1, float v1, float u2, float v2) {
        return new float[]{u1, v1, u2, v2};
    }

    @Override
    public void setupAnim(@NotNull AvatarRenderState renderState) {
        super.setupAnim(renderState);

        if (renderState.isCrouching) {
            body.xRot = 0.5F;
            body.y = 3.2F;
        }
    }
}
