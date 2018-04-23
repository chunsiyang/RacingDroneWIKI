package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;

/**
 * The type Power hub.分电板
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class PowerHub extends Item implements Integratable {
    /**
     * 可单独使用
     */
    private boolean useAlone;
    /**
     * 安装孔间距
     */
    private float mountingHoleSpacing;
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
     * 5V供电
     */
    private boolean bec5v;
    /**
     * 9V供电
     */
    private boolean bec9v;
    /**
     * 12V供电
     */
    private boolean bec12v;
    /**
     * 最大电流
     */
    private int maxCurrent;
    /**
     * 引脚定义图
     */
    private String pinDefinitionDiagram;

    /**
     * Instantiates a new Power hub.
     *
     * @param model                the model
     * @param imgUrl               the img url
     * @param referencePrice       the reference price
     * @param anufacturer          the anufacturer
     * @param extraPictures        the extra pictures
     * @param caption              the caption
     * @param useAlone             the use alone
     * @param mountingHoleSpacing  the mounting hole spacing
     * @param weight               the weight
     * @param length               the length
     * @param width                the width
     * @param thickness            the thickness
     * @param bec5v                the bec 5 v
     * @param bec9v                the bec 9 v
     * @param bec12v               the bec 12 v
     * @param maxCurrent           the max current
     * @param pinDefinitionDiagram the pin definition diagram
     */
    public PowerHub(String model, String imgUrl, int referencePrice, String anufacturer,
                    LinkedList<String> extraPictures, String caption, boolean useAlone, float mountingHoleSpacing, float weight,
                    float length, float width, float thickness, boolean bec5v, boolean bec9v, boolean bec12v, int maxCurrent,
                    String pinDefinitionDiagram) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption,weight);
        this.useAlone = useAlone;
        this.mountingHoleSpacing = mountingHoleSpacing;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.bec5v = bec5v;
        this.bec9v = bec9v;
        this.bec12v = bec12v;
        this.maxCurrent = maxCurrent;
        this.pinDefinitionDiagram = pinDefinitionDiagram;
    }

    /**
     * Instantiates a new Power hub.
     */
    public PowerHub() {
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
        if (!mountingHoleSpacing.equals(""))
            this.mountingHoleSpacing = Float.parseFloat(mountingHoleSpacing);
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
     * Is bec 5 v boolean.
     *
     * @return the boolean
     */
    public boolean isBec5v() {
        return bec5v;
    }

    /**
     * Sets bec 5 v.
     *
     * @param bec5v the bec 5 v
     */
    public void setBec5v(boolean bec5v) {
        this.bec5v = bec5v;
    }

    /**
     * Is bec 9 v boolean.
     *
     * @return the boolean
     */
    public boolean isBec9v() {
        return bec9v;
    }

    /**
     * Sets bec 9 v.
     *
     * @param bec9v the bec 9 v
     */
    public void setBec9v(boolean bec9v) {
        this.bec9v = bec9v;
    }

    /**
     * Is bec 12 v boolean.
     *
     * @return the boolean
     */
    public boolean isBec12v() {
        return bec12v;
    }

    /**
     * Sets bec 12 v.
     *
     * @param bec12v the bec 12 v
     */
    public void setBec12v(boolean bec12v) {
        this.bec12v = bec12v;
    }

    /**
     * Gets max current.
     *
     * @return the max current
     */
    public int getMaxCurrent() {
        return maxCurrent;
    }

    /**
     * Sets max current.
     *
     * @param maxCurrent the max current
     */
    public void setMaxCurrent(String maxCurrent) {
        if (!maxCurrent.equals(""))
            this.maxCurrent = Integer.parseInt(maxCurrent);
    }

    /**
     * Gets pin definition diagram.
     *
     * @return the pin definition diagram
     */
    public String getPinDefinitionDiagram() {
        return pinDefinitionDiagram;
    }

    /**
     * Sets pin definition diagram.
     *
     * @param pinDefinitionDiagram the pin definition diagram
     */
    public void setPinDefinitionDiagram(String pinDefinitionDiagram) {
        this.pinDefinitionDiagram = pinDefinitionDiagram;
    }

}