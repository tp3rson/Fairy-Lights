package me.paulf.fairylights.client.model.light;

public class OilLanternModel extends LightModel {
    public OilLanternModel() {
        this.unlit.setTextureOffset(10, 6);
        this.unlit.addCuboid(-1, -0.5F, -1, 2, 2, 2, -0.05F); // point
        this.unlit.setTextureOffset(0, 8);
        this.unlit.addCuboid(-1.5F, -1, -1.5F, 3, 1, 3); // top
        this.unlit.setTextureOffset(16, 18);
        this.unlit.addCuboid(-3, -10.5F, -3, 6, 2, 6); // base
        this.unlit.setTextureOffset(0, 12);
        this.unlit.addCuboid(-1.5F, -9.5F, -1.5F, 3, 2, 3); // connection
        this.unlit.setTextureOffset(38, 7);
        this.unlit.addCuboid(-0.5F, -9, -3.5F, 1, 9, 1); // support 1
        this.unlit.setTextureOffset(42, 7);
        this.unlit.addCuboid(-0.5F, -9, 2.5F, 1, 9, 1); // support 2
        this.unlit.setTextureOffset(38, 0);
        this.unlit.addCuboid(-0.5F, -0.5F, -3, 1, 1, 6); // rod
        final BulbBuilder bulb = this.createBulb();
        bulb.setUV(0, 17);
        bulb.addCuboid(-2, -7.5F, -2, 4, 6, 4); // glass
        bulb.setUV(6, 0);
        bulb.addCuboid(-1, -1.5F, -1, 2, 1, 2); // glass top
    }
}