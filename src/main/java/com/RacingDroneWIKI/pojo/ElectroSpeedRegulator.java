package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;

/**
 * The type Electro speed regulator.电子调速器
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class ElectroSpeedRegulator extends Item implements Integratable {
    /**
     * 可单独使用
     */
    private boolean useAlone;
    /**
     * 支持锂电池电芯片数
     */
    private String noOfCells;
    /**
     * 持续工作电流
     */
    private int persistentCurrent;
    /**
     * 瞬时工作电流
     */
    private int instantaneousCurrent;
    /**
     * 固件
     */
    private String firmware;
    /**
     * 主控制芯片
     */
    private String controlChip;
    /**
     * 长度
     */
    private float length;
    /**
     * 宽度
     */
    private float width;
    /**
     * 厚度
     */
    private float thickness;
    /**
     * 四合一
     */
    private boolean fourInone;
    /**
     * PWM输入模式
     */
    private boolean pwmMode;
    /**
     * oneshot125输入模式
     */
    private boolean oneshot125;
    /**
     * oneshot42输入模式
     */
    private boolean oneshot42;
    /**
     * mutishot输入模式
     */
    private boolean mutishot;
    /**
     * dshot输入模式
     */
    private boolean dshot;

    /**
     * Instantiates a new Electro speed regulator.
     *
     * @param model                the model
     * @param imgUrl               the img url
     * @param referencePrice       the reference price
     * @param anufacturer          the anufacturer
     * @param extraPictures        the extra pictures
     * @param caption              the caption
     * @param useAlone             the use alone
     * @param noOfCells            the no of cells
     * @param persistentCurrent    the persistent current
     * @param instantaneousCurrent the instantaneous current
     * @param firmware             the firmware
     * @param controlChip          the control chip
     * @param weight               the weight
     * @param length               the length
     * @param width                the width
     * @param thickness            the thickness
     * @param fourInone            the four inone
     * @param pwmMode              the pwm mode
     * @param oneshot125           the oneshot 125
     * @param oneshot42            the oneshot 42
     * @param mutishot             the mutishot
     * @param dshot                the dshot
     */
    public ElectroSpeedRegulator(String model, String imgUrl, int referencePrice, String anufacturer,
                                 LinkedList<String> extraPictures, String caption, boolean useAlone, String noOfCells, int persistentCurrent,
                                 int instantaneousCurrent, String firmware, String controlChip, float weight, float length, float width,
                                 float thickness, boolean fourInone, boolean pwmMode, boolean oneshot125, boolean oneshot42,
                                 boolean mutishot, boolean dshot) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption,weight);
        this.useAlone = useAlone;
        this.noOfCells = noOfCells;
        this.persistentCurrent = persistentCurrent;
        this.instantaneousCurrent = instantaneousCurrent;
        this.firmware = firmware;
        this.controlChip = controlChip;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.fourInone = fourInone;
        this.pwmMode = pwmMode;
        this.oneshot125 = oneshot125;
        this.oneshot42 = oneshot42;
        this.mutishot = mutishot;
        this.dshot = dshot;
    }

    /**
     * Instantiates a new Electro speed regulator.
     */
    public ElectroSpeedRegulator() {
        super();
    }

    /**
     * Is use alone boolean.
     *
     * @return the boolean
     */
    public boolean isUseAlone() {
        return useAlone;
    }

    /**
     * Sets use alone.
     *
     * @param useAlone the use alone
     */
    public void setUseAlone(boolean useAlone) {
        this.useAlone = useAlone;
    }

    /**
     * Gets no of cells.
     *
     * @return the no of cells
     */
    public String getNoOfCells() {
        return noOfCells;
    }

    /**
     * Sets no of cells.
     *
     * @param noOfCells the no of cells
     */
    public void setNoOfCells(String noOfCells) {
        this.noOfCells = noOfCells;
    }

    /**
     * Gets persistent current.
     *
     * @return the persistent current
     */
    public int getPersistentCurrent() {
        return persistentCurrent;
    }

    /**
     * Sets persistent current.
     *
     * @param persistentCurrent the persistent current
     */
    public void setPersistentCurrent(String persistentCurrent) {
        if (!persistentCurrent.equals(""))
            this.persistentCurrent = Integer.parseInt(persistentCurrent);
    }

    /**
     * Gets instantaneous current.
     *
     * @return the instantaneous current
     */
    public int getInstantaneousCurrent() {
        return instantaneousCurrent;
    }

    /**
     * Sets instantaneous current.
     *
     * @param instantaneousCurrent the instantaneous current
     */
    public void setInstantaneousCurrent(String instantaneousCurrent) {
        if (!instantaneousCurrent.equals(""))
            this.instantaneousCurrent = Integer.parseInt(instantaneousCurrent);
    }

    /**
     * Gets firmware.
     *
     * @return the firmware
     */
    public String getFirmware() {
        return firmware;
    }

    /**
     * Sets firmware.
     *
     * @param firmware the firmware
     */
    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    /**
     * Gets control chip.
     *
     * @return the control chip
     */
    public String getControlChip() {
        return controlChip;
    }

    /**
     * Sets control chip.
     *
     * @param controlChip the control chip
     */
    public void setControlChip(String controlChip) {
        this.controlChip = controlChip;
    }

    /**
     * Gets length.
     *
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * Sets length.
     *
     * @param length the length
     */
    public void setLength(String length) {
        if (!length.equals(""))
            this.length = Float.parseFloat(length);
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(String width) {
        if (!width.equals(""))
            this.width = Float.parseFloat(width);
    }

    /**
     * Gets thickness.
     *
     * @return the thickness
     */
    public float getThickness() {
        return thickness;
    }

    /**
     * Sets thickness.
     *
     * @param thickness the thickness
     */
    public void setThickness(String thickness) {
        if (!thickness.equals(""))
            this.thickness = Float.parseFloat(thickness);
    }

    /**
     * Is four inone boolean.
     *
     * @return the boolean
     */
    public boolean isFourInone() {
        return fourInone;
    }

    /**
     * Sets four inone.
     *
     * @param fourInone the four inone
     */
    public void setFourInone(boolean fourInone) {
        this.fourInone = fourInone;
    }

    /**
     * Is pwm mode boolean.
     *
     * @return the boolean
     */
    public boolean isPwmMode() {
        return pwmMode;
    }

    /**
     * Sets pwm mode.
     *
     * @param pwmMode the pwm mode
     */
    public void setPwmMode(boolean pwmMode) {
        this.pwmMode = pwmMode;
    }

    /**
     * Is oneshot 125 boolean.
     *
     * @return the boolean
     */
    public boolean isOneshot125() {
        return oneshot125;
    }

    /**
     * Sets oneshot 125.
     *
     * @param oneshot125 the oneshot 125
     */
    public void setOneshot125(boolean oneshot125) {
        this.oneshot125 = oneshot125;
    }

    /**
     * Is oneshot 42 boolean.
     *
     * @return the boolean
     */
    public boolean isOneshot42() {
        return oneshot42;
    }

    /**
     * Sets oneshot 42.
     *
     * @param oneshot42 the oneshot 42
     */
    public void setOneshot42(boolean oneshot42) {
        this.oneshot42 = oneshot42;
    }

    /**
     * Is mutishot boolean.
     *
     * @return the boolean
     */
    public boolean isMutishot() {
        return mutishot;
    }

    /**
     * Sets mutishot.
     *
     * @param mutishot the mutishot
     */
    public void setMutishot(boolean mutishot) {
        this.mutishot = mutishot;
    }

    /**
     * Is dshot boolean.
     *
     * @return the boolean
     */
    public boolean isDshot() {
        return dshot;
    }

    /**
     * Sets dshot.
     *
     * @param dshot the dshot
     */
    public void setDshot(boolean dshot) {
        this.dshot = dshot;
    }

}