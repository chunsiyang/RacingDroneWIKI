package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;

/**
 * The type Prop.桨叶
 * @author ChunsiYang
 * @version SSM 3.0
 */
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
     * 安装孔距
     */
    private float mountingHoleSpacing;
    /**
     * 材料
     */
    private String material;

    /**
     * Instantiates a new Prop.
     *
     * @param model               the model
     * @param imgUrl              the img url
     * @param referencePrice      the reference price
     * @param anufacturer         the anufacturer
     * @param extraPictures       the extra pictures
     * @param caption             the caption
     * @param bladeNumber         the blade number
     * @param size                the size
     * @param weight              the weight
     * @param mountingHoleSpacing the mounting hole spacing
     * @param material            the material
     */
    public Prop(String model, String imgUrl, int referencePrice, String anufacturer, LinkedList<String> extraPictures,
                String caption, int bladeNumber, String size, float weight, float mountingHoleSpacing, String material) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption,weight);
        this.bladeNumber = bladeNumber;
        this.size = size;
        this.mountingHoleSpacing = mountingHoleSpacing;
        this.material = material;
    }

    /**
     * Instantiates a new Prop.
     */
    public Prop() {
        super();
    }

    /**
     * Gets blade number.
     *
     * @return the blade number
     */
    public int getBladeNumber() {
        return bladeNumber;
    }

    /**
     * Sets blade number.
     *
     * @param bladeNumber the blade number
     */
    public void setBladeNumber(String bladeNumber) {
        if (!bladeNumber.equals("")) {
            this.bladeNumber = Integer.parseInt(bladeNumber);
        }
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(String size) {
        this.size = size;
    }
    /**
     * Gets mounting hole spacing.
     *
     * @return the mounting hole spacing
     */
    public float getMountingHoleSpacing() {
        return mountingHoleSpacing;
    }

    /**
     * Sets mounting hole spacing.
     *
     * @param mountingHoleSpacing the mounting hole spacing
     */
    public void setMountingHoleSpacing(String mountingHoleSpacing) {
        if (!mountingHoleSpacing.equals("")) {
            this.mountingHoleSpacing = Float.parseFloat(mountingHoleSpacing);
        }
    }

    /**
     * Gets material.
     *
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets material.
     *
     * @param material the material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

}