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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.nemonotfound.nemos.backpacks.NemosBackpacks.MOD_ID;

// MOSTLY GENERATED FROM BLOCKBENCH MODEL
public class BackpackModel extends EntityModel<@NotNull AvatarRenderState> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
            Identifier.fromNamespaceAndPath(MOD_ID, "backpack"), "main"
    );
    private static final float TEXTURE_WIDTH = 64.0F;
    private static final float TEXTURE_HEIGHT = 64.0F;
    private static final String[] GROUP_DATA = {
            "-1,0,24,0,0,0,0",
            "-1,-4,24,6.1,0,0,0",
            "-1,-1,23.8,2.9,0,0,0",
            "9,0,24,7.8,0,-180,0",
            "-1,-6,23.8,2.9,0,0,0",
            "-1,0,21.5,0.3,0,0,0",
            "-1,0,20.2,1,0,0,0",
            "9,0.2,19.1,4.4,0,-90,0",
            "9,-10,24,1,0,0,0",
            "-1,0,19.2,4.4,0,0,0",
            "-1,0,19.2,4.4,0,-180,0",
            "10,0,24,7.8,0,-180,0"
    };
    private static final String[] MODEL_DATA = {
            "0,-4,14,2.4,4,20,6.4,0,0,0,0,0,0,4,4,12,10,0,4,4,10,16,4,24,10,12,4,16,10,12,4,4,0,20,0,12,4",
            "2,2,15,-2.2,3,24.1,-1.7,0,0,0,0,0,0,6,25,7,34,11,25,12,34,12,25,13,34,13,25,14,34,34,31,33,30,32,33,31,34",
            "2,2,23.8,-1.7,3,24.3,2.3,0,0,0,0,0,0,1,34,2,35,16,29,20,30,34,1,35,2,20,29,24,30,30,25,29,21,25,29,24,33",
            "2,2,23,2,3,23.3,3,0,0,0,0,0,0,33,31,34,32,32,33,33,34,33,32,34,33,33,33,34,34,1,35,0,34,35,0,34,1",
            "1,-2,23,4,-1,24.1,5,0,0,5.5,0,0,0,32,31,33,32,32,32,33,33,33,6,34,7,7,33,8,34,34,8,33,7,9,33,8,34",
            "1,-1.3,24,4,1.4,24.5,5,0,0,0,0,0,0,30,21,33,22,21,33,22,34,30,22,33,23,33,21,34,22,33,24,30,23,33,24,30,25",
            "1,1,23,4,2,24.1,5,0,0,0,0,0,0,33,8,34,9,9,33,10,34,33,9,34,10,33,18,34,19,34,20,33,19,34,20,33,21",
            "1,0,23.7,4,1,24,5,0,0,0,0,0,0,22,33,23,34,33,22,34,23,23,33,24,34,33,23,34,24,25,34,24,33,34,24,33,25",
            "1,-1,23.7,4,0,24,5,0,0,0,0,0,0,25,33,26,34,33,25,34,26,26,33,27,34,33,26,34,27,28,34,27,33,34,27,33,28",
            "2,2,23.3,1.7,3,23.8,2.5,-1,23.8,3.9,0,0,0,12,34,13,35,34,12,35,13,13,34,14,35,34,13,35,14,15,35,14,34,35,14,34,15",
            "0,-3.3,20,2.4,3.3,22.5,5.7,0,0,0,0,0,0,21,15,28,18,3,25,6,28,21,18,28,21,8,25,11,28,7,25,0,22,29,21,22,24",
            "0,-3,15,4.4,3,18,7.4,0,0,0,0,0,0,3,13,9,16,0,13,3,16,12,13,18,16,9,13,12,16,9,13,3,10,15,10,9,13",
            "3,4,18,10.1,5,19,12.3,0,24,7.8,0,0,0,35,17,36,18,32,12,34,13,18,35,19,36,32,13,34,14,11,34,10,32,15,32,14,34",
            "3,4.4,15.5,10.2,5.4,17.5,12.2,0.4,24,7.8,0,0,0,10,18,11,20,8,18,10,20,13,18,14,20,11,18,13,20,11,18,10,16,12,16,11,18",
            "3,4,15,9.7,5,18,12.7,0,24,7.8,0,0,0,3,19,4,22,0,19,3,22,7,19,8,22,4,19,7,22,4,19,3,16,5,16,4,19",
            "4,-3,15,-2.2,-2,24.1,-1.7,-6,24.8,0.9,0,0,0,7,22,8,31,0,25,1,34,1,25,2,34,2,25,3,34,33,28,32,27,32,32,31,33",
            "4,-3,23,2,-2,23.3,3,-6,23.8,4.9,0,0,0,23,34,24,35,34,23,35,24,24,34,25,35,34,24,35,25,26,35,25,34,35,25,34,26",
            "4,-3,23.8,-1.7,-2,24.3,2.3,-3,24.8,-3.1,0,0,0,26,34,27,35,30,16,34,17,34,26,35,27,30,17,34,18,20,34,19,30,21,30,20,34",
            "4,-3,23.3,1.7,-2,23.8,2.5,-6,23.8,3.9,0,0,0,27,34,28,35,34,27,35,28,28,34,29,35,34,28,35,29,30,35,29,34,35,29,34,30",
            "5,-2.6,19,6.4,2.6,19.5,6.7,0,0,0,0,0,0,16,28,21,29,28,33,29,34,28,18,33,19,33,28,34,29,33,20,28,19,33,20,28,21",
            "5,-3.6,19,2.1,3.6,22.5,2.4,0,0,0,0,0,0,8,21,15,25,5,28,6,32,15,21,22,25,10,28,11,32,32,14,25,13,21,25,14,26",
            "6,-0.7,19.5,6.4,0.7,19.9,6.9,0,20.2,1,0,0,0,30,34,31,35,34,30,35,31,31,34,32,35,34,31,35,32,33,35,32,34,35,32,34,33",
            "6,-0.7,18.5,6.4,0.7,18.9,6.9,0,19.2,1,0,0,0,33,34,34,35,34,33,35,34,34,34,35,35,0,35,1,36,36,1,35,0,2,35,1,36",
            "6,-0.7,18.9,6.4,-0.3,19.5,6.9,-1,19.6,1,0,0,0,35,4,36,5,5,35,6,36,35,5,36,6,6,35,7,36,36,7,35,6,8,35,7,36",
            "7,-0.3,17.7,9.8,0.7,18,10.1,0.2,18.3,4.4,0,0,0,35,7,36,8,8,35,9,36,35,8,36,9,9,35,10,36,36,10,35,9,11,35,10,36",
            "8,-5.2,17.6,3.2,-5,18,5.6,-10,24,1,0,0,0,35,13,36,14,21,31,23,32,14,35,15,36,31,28,33,29,22,27,21,25,10,31,9,33",
            "8,-5.2,18,3,-5,19,5.8,-10,24,1,0,0,0,35,14,36,15,31,0,34,1,15,35,16,36,31,1,34,2,28,33,27,30,29,30,28,33",
            "11,4,18,10.1,5,19,12.3,0,24,7.8,0,0,0,35,18,36,19,32,14,34,15,19,35,20,36,21,32,23,33,16,34,15,32,31,32,30,34",
            "11,4.4,15.5,10.2,5.4,17.5,12.2,0,0,0,0,0,0,10,18,11,20,8,18,10,20,13,18,14,20,11,18,13,20,11,18,10,16,12,16,11,18",
            "11,4,15,9.7,5,18,12.7,0,0,0,0,0,0,3,19,4,22,0,19,3,22,7,19,8,22,4,19,7,22,4,19,3,16,5,16,4,19",
            "0,-3.3,13.5,2.4,3.3,14,5.7,0,0,0,0,0,0,24,9,31,10,18,15,21,16,25,10,32,11,21,30,24,31,31,3,24,0,31,3,24,6",
            "5,-3.6,20,6.2,3.6,22.5,6.7,0,0,0,0,0,0,24,6,31,9,25,30,26,33,22,24,29,27,26,30,27,33,32,12,25,11,32,12,25,13",
            "5,-3.1,19.5,6.4,3.1,20,6.7,0,0,0,0,0,0,8,20,14,21,29,33,30,34,14,27,20,28,33,29,34,30,26,28,20,27,32,27,26,28",
            "5,-3.6,22.5,2.1,3.6,23,6.7,0,0,0,0,0,0,25,14,32,15,21,28,26,29,14,26,21,27,26,28,31,29,21,21,14,16,25,10,18,15",
            "2,2.8,14,-2.2,4.2,15,-1.7,0,0,0,0,0,0,2,34,3,35,34,2,35,3,3,34,4,35,34,3,35,4,5,35,4,34,35,4,34,5",
            "2,3,15,-2.2,3.7,16,-1.7,2.8,16,-2.2,0,0,0,5,34,6,35,34,5,35,6,6,34,7,35,34,6,35,7,8,35,7,34,35,7,34,8",
            "2,3,14,1.9,4.2,15,2.4,2.8,15,1.6,0,0,0,8,34,9,35,34,8,35,9,9,34,10,35,34,9,35,10,11,35,10,34,35,10,34,11",
            "2,3.7,14,-1.7,4.2,15,1.9,3.9,14,-2.9,0,0,0,11,34,12,35,25,29,29,30,34,11,35,12,29,25,33,26,30,33,29,29,17,30,16,34",
            "4,-4.2,14,-2.2,-2.7,15,-1.7,-4.1,15,-3.2,0,0,0,31,6,33,7,15,34,16,35,7,31,9,32,34,15,35,16,33,8,31,7,33,8,31,9",
            "4,-3.7,15,-2.2,-3,16,-1.7,-4.1,16,-3.2,0,0,0,16,34,17,35,34,16,35,17,17,34,18,35,34,17,35,18,19,35,18,34,35,18,34,19",
            "4,-4.2,14,1.9,-3,15,2.4,-4.1,15,0.6,0,0,0,19,34,20,35,34,19,35,20,20,34,21,35,34,20,35,21,22,35,21,34,35,21,34,22",
            "4,-4.2,14,-1.7,-3.7,15,1.9,-4.4,16,-2.9,0,0,0,22,34,23,35,29,26,33,27,34,22,35,23,30,15,34,16,18,34,17,30,19,30,18,34",
            "6,0.3,18.9,6.4,0.7,19.5,6.9,0,19.6,1,0,0,0,35,1,36,2,2,35,3,36,35,2,36,3,3,35,4,36,36,4,35,3,5,35,4,36",
            "7,-0.3,17.7,-0.9,0.7,18,-0.6,6.2,18.3,12.3,0,0,0,35,10,36,11,11,35,12,36,35,11,36,12,12,35,13,36,36,13,35,12,14,35,13,36",
            "8,-5.2,19,3,-3.6,19.2,5.8,-10,25.2,1,0,0,0,31,9,33,10,30,29,33,30,14,31,16,32,30,30,33,31,5,31,3,28,10,28,8,31",
            "8,5,17.6,3.2,5.2,18,5.6,0,24,0.8,0,0,0,35,15,36,16,30,31,32,32,16,35,17,36,7,32,9,33,24,33,23,31,6,32,5,34",
            "8,3.6,19,3,5.2,19.2,5.8,-1,25.2,0.8,0,0,0,32,10,34,11,31,2,34,3,32,11,34,12,31,3,34,4,16,31,14,28,30,15,28,18",
            "8,5,18,3,5.2,19,5.8,0,24,0.8,0,0,0,35,16,36,17,31,4,34,5,17,35,18,36,31,5,34,6,4,34,3,31,5,31,4,34"
    };

    private final ModelPart body;

    public BackpackModel(ModelPart ignoredBakedRoot) {
        super(createModelRoot(), RenderTypes::entityCutout);
        this.body = root().getChild("body");
    }

    public static LayerDefinition createBodyLayer() {
        var mesh = new MeshDefinition();
        mesh.getRoot().addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
        return LayerDefinition.create(mesh, (int) TEXTURE_WIDTH, (int) TEXTURE_HEIGHT);
    }

    private static ModelPart createModelRoot() {
        var groups = new float[GROUP_DATA.length][];
        Map<Integer, Map<String, ModelPart>> groupChildren = new LinkedHashMap<>();

        for (int index = 0; index < GROUP_DATA.length; index++) {
            groups[index] = parse(GROUP_DATA[index]);
            groupChildren.put(index, new LinkedHashMap<>());
        }

        for (int index = 0; index < MODEL_DATA.length; index++) {
            var values = parse(MODEL_DATA[index]);
            int parentIndex = (int) values[0];
            float fromX = values[1];
            float fromY = values[2];
            float fromZ = values[3];
            float toX = values[4];
            float toY = values[5];
            float toZ = values[6];
            float originX = values[7];
            float originY = values[8];
            float originZ = values[9];
            var parent = groups[parentIndex];

            var cube = perFaceCube(
                    fromX - originX, originY - toY, fromZ - originZ,
                    toX - fromX, toY - fromY, toZ - fromZ,
                    uv(values, 13), uv(values, 17), uv(values, 21),
                    uv(values, 25), uv(values, 29), uv(values, 33)
            );
            var element = new ModelPart(List.of(cube), Map.of());
            var elementPose = PartPose.offsetAndRotation(
                    originX - parent[1], parent[2] - originY, originZ - parent[3],
                    radians(-values[10]), radians(values[11]), radians(-values[12])
            );
            element.setInitialPose(elementPose);
            element.loadPose(elementPose);
            groupChildren.get(parentIndex).put("element_" + index, element);
        }

        Map<String, ModelPart> bodyChildren = new LinkedHashMap<>();
        var builtGroups = new boolean[groups.length];
        int builtGroupCount = 0;

        while (builtGroupCount < groups.length) {
            for (int index = 0; index < groups.length; index++) {
                if (builtGroups[index] || hasUnbuiltChildGroup(index, groups, builtGroups)) {
                    continue;
                }

                var values = groups[index];
                int parentIndex = (int) values[0];
                float parentX = parentIndex < 0 ? 0.0F : groups[parentIndex][1];
                float parentY = parentIndex < 0 ? 24.0F : groups[parentIndex][2];
                float parentZ = parentIndex < 0 ? 0.0F : groups[parentIndex][3];
                var group = new ModelPart(List.of(), groupChildren.get(index));
                var groupPose = PartPose.offsetAndRotation(
                        values[1] - parentX, parentY - values[2], values[3] - parentZ,
                        radians(-values[4]), radians(values[5]), radians(-values[6])
                );
                group.setInitialPose(groupPose);
                group.loadPose(groupPose);
                if (parentIndex < 0) {
                    bodyChildren.put("group_" + index, group);
                } else {
                    groupChildren.get(parentIndex).put("group_" + index, group);
                }
                builtGroups[index] = true;
                builtGroupCount++;
            }
        }

        var body = new ModelPart(List.of(), bodyChildren);
        body.setInitialPose(PartPose.ZERO);
        var root = new ModelPart(List.of(), Map.of("body", body));
        root.setInitialPose(PartPose.ZERO);
        return root;
    }

    private static boolean hasUnbuiltChildGroup(int groupIndex, float[][] groups, boolean[] builtGroups) {
        for (int index = 0; index < groups.length; index++) {
            if ((int) groups[index][0] == groupIndex && !builtGroups[index]) {
                return true;
            }
        }
        return false;
    }

    private static float[] parse(String data) {
        var parts = data.split(",");
        var values = new float[parts.length];
        for (int index = 0; index < parts.length; index++) {
            values[index] = Float.parseFloat(parts[index]);
        }
        return values;
    }

    private static float radians(float degrees) {
        return degrees * ((float) Math.PI / 180.0F);
    }

    private static ModelPart.Cube cube(float x, float y, float z,
                                       float width, float height, float depth) {
        return new ModelPart.Cube(0, 0, x, y, z, width, height, depth,
                0.0F, 0.0F, 0.0F, false, TEXTURE_WIDTH, TEXTURE_HEIGHT,
                EnumSet.allOf(Direction.class));
    }

    private static ModelPart.Cube perFaceCube(float x, float y, float z,
                                              float width, float height, float depth,
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

        for (int index = 0; index < cube.polygons.length; index++) {
            var polygon = cube.polygons[index];
            var direction = directionFromNormal(polygon.normal());
            var faceUv = faceUvs.get(direction);
            cube.polygons[index] = remapPolygon(polygon, direction, faceUv);
        }
        return cube;
    }

    private static ModelPart.Polygon remapPolygon(ModelPart.Polygon polygon,
                                                  Direction direction, float[] uv) {
        var vertices = polygon.vertices();
        var remapped = new ModelPart.Vertex[vertices.length];
        float minX = Float.MAX_VALUE;
        float minY = Float.MAX_VALUE;
        float minZ = Float.MAX_VALUE;
        float maxX = -Float.MAX_VALUE;
        float maxY = -Float.MAX_VALUE;
        float maxZ = -Float.MAX_VALUE;

        for (var vertex : vertices) {
            minX = Math.min(minX, vertex.x());
            minY = Math.min(minY, vertex.y());
            minZ = Math.min(minZ, vertex.z());
            maxX = Math.max(maxX, vertex.x());
            maxY = Math.max(maxY, vertex.y());
            maxZ = Math.max(maxZ, vertex.z());
        }

        for (int index = 0; index < vertices.length; index++) {
            var vertex = vertices[index];
            boolean lowX = closestTo(vertex.x(), minX, maxX);
            boolean lowY = closestTo(vertex.y(), minY, maxY);
            boolean lowZ = closestTo(vertex.z(), minZ, maxZ);
            int corner = blockbenchCorner(direction, lowX, lowY, lowZ);
            float u = (corner == 0 || corner == 2) ? uv[0] : uv[2];
            float v = (corner == 0 || corner == 1) ? uv[1] : uv[3];
            remapped[index] = vertex.remap(u / TEXTURE_WIDTH, v / TEXTURE_HEIGHT);
        }

        return new ModelPart.Polygon(remapped, polygon.normal());
    }

    private static boolean closestTo(float value, float minimum, float maximum) {
        return Math.abs(value - minimum) <= Math.abs(value - maximum);
    }

    private static int blockbenchCorner(Direction direction, boolean lowX, boolean lowY, boolean lowZ) {
        return switch (direction) {
            case EAST -> lowY ? (lowZ ? 1 : 0) : (lowZ ? 3 : 2);
            case WEST -> lowY ? (lowZ ? 0 : 1) : (lowZ ? 2 : 3);
            case DOWN -> lowZ ? (lowX ? 0 : 1) : (lowX ? 2 : 3);
            case UP -> lowZ ? (lowX ? 2 : 3) : (lowX ? 0 : 1);
            case SOUTH -> lowY ? (lowX ? 0 : 1) : (lowX ? 2 : 3);
            case NORTH -> lowY ? (lowX ? 1 : 0) : (lowX ? 3 : 2);
        };
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

    private static float[] uv(float[] values, int offset) {
        return new float[]{values[offset], values[offset + 1], values[offset + 2], values[offset + 3]};
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
