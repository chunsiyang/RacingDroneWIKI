package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;

/**
 * The type Frame.机架
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class Frame extends Item {
    /**
     * 轴距
     */
    private int wheekBase;
    /**
     * 飞控安装孔距
     */
    private float fcMountingHoleSpacing;
    /**
     * 内置分电板
     */
    private PowerHub integratedPh;
    /**
     * 内置LED
     */
    private boolean integratedLed;
    /**
     * 摄像头可调角度
     */
    private String camraAdjustingAngle;
    /**
     * 主要材料
     */
    private String material;
    /**
     * 最大可用螺旋桨
     */
    private int maximumSupportProp;
    /**
     * 下板厚度
     */
    private float bottomThickness;
    /**
     * 顶板厚度
     */
    private float roofThickness;
    /**
     * 机臂厚度
     */
    private float armThickness;

    /**
     * Instantiates a new Frame.
     *
     * @param model                 the model
     * @param imgUrl                the img url
     * @param referencePrice        the reference price
     * @param anufacturer           the anufacturer
     * @param extraPictures         the extra pictures
     * @param caption               the caption
     * @param wheekBase             the wheek base
     * @param weight                the weight
     * @param fcMountingHoleSpacing the fc mounting hole spacing
     * @param integratedPh          the integrated ph
     * @param integratedLed         the integrated led
     * @param camraAdjustingAngle   the camra adjusting angle
     * @param material              the material
     * @param maximumSupportProp    the maximum support prop
     * @param bottomThickness       the bottom thickness
     * @param roofThickness         the roof thickness
     * @param armThickness          the arm thickness
     */
    public Frame(String model, String imgUrl, int referencePrice, String anufacturer, LinkedList<String> extraPictures,
                 String caption, int wheekBase, float weight, float fcMountingHoleSpacing, PowerHub integratedPh,
                 boolean integratedLed, String camraAdjustingAngle, String material, int maximumSupportProp,
                 float bottomThickness, float roofThickness, float armThickness) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption,weight);
        this.wheekBase = wheekBase;
        this.fcMountingHoleSpacing = fcMountingHoleSpacing;
        this.integratedPh = integratedPh;
        this.integratedLed = integratedLed;
        this.camraAdjustingAngle = camraAdjustingAngle;
        this.material = material;
        this.maximumSupportProp = maximumSupportProp;
        this.bottomThickness = bottomThickness;
        this.roofThickness = roofThickness;
        this.armThickness = armThickness;
    }

    /**
     * Instantiates a new Frame.
     */
    public Frame() {
        super();
    }

    /**
     * Gets wheek base.
     *
     * @return the wheek base
     */
    public int getWheekBase() {
        return wheekBase;
    }

    /**
     * Sets wheek base.
     *
     * @param wheekBase the wheek base
     */
    public void setWheekBase(String wheekBase) {
        if (!wheekBase.equals("")) {
            this.wheekBase = Integer.parseInt(wheekBase);
        }
    }
    /**
     * Gets fc mounting hole spacing.
     *
     * @return the fc mounting hole spacing
     */
    public float getFcMountingHoleSpacing() {
        return fcMountingHoleSpacing;
    }

    /**
     * Sets fc mounting hole spacing.
     *
     * @param fcMountingHoleSpacing the fc mounting hole spacing
     */
    public void setFcMountingHoleSpacing(String fcMountingHoleSpacing) {
        if (!fcMountingHoleSpacing.equals("")) {
            this.fcMountingHoleSpacing = Float.parseFloat(fcMountingHoleSpacing);
        }
    }

    /**
     * Gets integrated ph.
     *
     * @return the integrated ph
     */
    public PowerHub getIntegratedPh() {
        return integratedPh;
    }

    /**
     * Sets integrated ph.
     *
     * @param integratedPh the integrated ph
     */
    public void setIntegratedPh(PowerHub integratedPh) {
        this.integratedPh = integratedPh;
    }

    /**
     * Is integrated led boolean.
     *
     * @return the boolean
     */
    public boolean isIntegratedLed() {
        return integratedLed;
    }

    /**
     * Sets integrated led.
     *
     * @param integratedLed the integrated led
     */
    public void setIntegratedLed(boolean integratedLed) {
        this.integratedLed = integratedLed;
    }

    /**
     * Gets camra adjusting angle.
     *
     * @return the camra adjusting angle
     */
    public String getCamraAdjustingAngle() {
        return camraAdjustingAngle;
    }

    /**
     * Sets camra adjusting angle.
     *
     * @param camraAdjustingAngle the camra adjusting angle
     */
    public void setCamraAdjustingAngle(String camraAdjustingAngle) {
        this.camraAdjustingAngle = camraAdjustingAngle;
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

    /**
     * Gets maximum support prop.
     *
     * @return the maximum support prop
     */
    public int getMaximumSupportProp() {
        return maximumSupportProp;
    }

    /**
     * Sets maximum support prop.
     *
     * @param maximumSupportProp the maximum support prop
     */
    public void setMaximumSupportProp(String maximumSupportProp) {
        if (!maximumSupportProp.equals("")) {
            this.maximumSupportProp = Integer.parseInt(maximumSupportProp);
        }
    }

    /**
     * Gets bottom thickness.
     *
     * @return the bottom thickness
     */
    public float getBottomThickness() {
        return bottomThickness;
    }

    /**
     * Sets bottom thickness.
     *
     * @param bottomThickness the bottom thickness
     */
    public void setBottomThickness(String bottomThickness) {
        if (!bottomThickness.equals("")) {
            this.bottomThickness = Float.parseFloat(bottomThickness);
        }
    }

    /**
     * Gets roof thickness.
     *
     * @return the roof thickness
     */
    public float getRoofThickness() {
        return roofThickness;
    }

    /**
     * Sets roof thickness.
     *
     * @param roofThickness the roof thickness
     */
    public void setRoofThickness(String roofThickness) {
        if (!roofThickness.equals("")) {
            this.roofThickness = Float.parseFloat(roofThickness);
        }
    }

    /**
     * Gets arm thickness.
     *
     * @return the arm thickness
     */
    public float getArmThickness() {
        return armThickness;
    }

    /**
     * Sets arm thickness.
     *
     * @param armThickness the arm thickness
     */
    public void setArmThickness(String armThickness) {
        if (!armThickness.equals("")) {
            this.armThickness = Float.parseFloat(armThickness);
        }
    }

}