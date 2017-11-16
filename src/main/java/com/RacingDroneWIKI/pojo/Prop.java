package com.RacingDroneWIKI.pojo;

import java.util.*;

public class Prop extends Item {
    /**
     * 叶片数
     */
    private int bladeNumber;
    /**
     * 尺寸
     */
    private String size;
    /**
     * 重量
     */
    private float weight;
    /**
     * 安装孔距
     */
    private float mountingHoleSpacing;
    /**
     * 材料
     */
    private String material;

    public int getBladeNumber() {
        return bladeNumber;
    }

    public void setBladeNumber(int bladeNumber) {
        this.bladeNumber = bladeNumber;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getMountingHoleSpacing() {
        return mountingHoleSpacing;
    }

    public void setMountingHoleSpacing(float mountingHoleSpacing) {
        this.mountingHoleSpacing = mountingHoleSpacing;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Prop(String model, String imgUrl, int referencePrice, String anufacturer, LinkedList<String> extraPictures,
                String caption, int bladeNumber, String size, float weight, float mountingHoleSpacing, String material) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption);
        this.bladeNumber = bladeNumber;
        this.size = size;
        this.weight = weight;
        this.mountingHoleSpacing = mountingHoleSpacing;
        this.material = material;
    }

    public Prop() {
        super();
    }

}