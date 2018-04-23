package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;

/**
 * The type Flight control.飞控
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class FlightControl extends Item {
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
     * 安装孔距
     */
    private float mountingHoleSpacing;
    /**
     * mcu
     */
    private String mcu;
    /**
     * mpu
     */
    private String mpu;
    /**
     * SD卡支持
     */
    private boolean sdcard;
    /**
     * BOOT按键
     */
    private boolean bootButton;
    /**
     * 内置OSD
     */
    private boolean osd;
    /**
     * 内置蜂鸣器
     */
    private boolean buzzer;
    /**
     * 最大PID刷新率
     */
    private int maxPidLoopFrequancy;
    /**
     * 最大陀螺仪刷新率
     */
    private int maxGyroUpdata;
    /**
     * 内置电子调速器00
     */
    private ElectroSpeedRegulator esc;
    /**
     * 内置分电板
     */
    private PowerHub powerHub;
    /**
     * 内置图传
     */
    private ImageTransmission imageTransmission;
    /**
     * 阵脚定义图
     */
    private String pinDefintionDiagram;

    /**
     * Instantiates a new Flight control.
     *
     * @param model               the model
     * @param imgUrl              the img url
     * @param referencePrice      the reference price
     * @param anufacturer         the anufacturer
     * @param extraPictures       the extra pictures
     * @param caption             the caption
     * @param weight              the weight
     * @param length              the length
     * @param width               the width
     * @param thickness           the thickness
     * @param mountingHoleSpacing the mounting hole spacing
     * @param mcu                 the mcu
     * @param mpu                 the mpu
     * @param sdcard              the sdcard
     * @param bootButton          the boot button
     * @param osd                 the osd
     * @param buzzer              the buzzer
     * @param maxPidLoopFrequancy the max pid loop frequancy
     * @param maxGyroUpdata       the max gyro updata
     * @param esc                 the esc
     * @param powerHub            the power hub
     * @param imageTransmission   the image transmission
     * @param pinDefintionDiagram the pin defintion diagram
     */
    public FlightControl(String model, String imgUrl, int referencePrice, String anufacturer,
                         LinkedList<String> extraPictures, String caption, float weight, float length, float width, float thickness,
                         float mountingHoleSpacing, String mcu, String mpu, boolean sdcard, boolean bootButton, boolean osd,
                         boolean buzzer, int maxPidLoopFrequancy, int maxGyroUpdata, ElectroSpeedRegulator esc, PowerHub powerHub,
                         ImageTransmission imageTransmission, String pinDefintionDiagram) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption,weight);
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.mountingHoleSpacing = mountingHoleSpacing;
        this.mcu = mcu;
        this.mpu = mpu;
        this.sdcard = sdcard;
        this.bootButton = bootButton;
        this.osd = osd;
        this.buzzer = buzzer;
        this.maxPidLoopFrequancy = maxPidLoopFrequancy;
        this.maxGyroUpdata = maxGyroUpdata;
        this.esc = esc;
        this.powerHub = powerHub;
        this.imageTransmission = imageTransmission;
        this.pinDefintionDiagram = pinDefintionDiagram;
    }

    /**
     * Instantiates a new Flight control.
     */
    public FlightControl() {
        super();
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
        if (!length.equals("")) {
            this.length = Float.parseFloat(length);
        }
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
        if (!width.equals("")) {
            this.width = Float.parseFloat(width);
        }
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
        if (!thickness.equals("")) {
            this.thickness = Float.parseFloat(thickness);
        }
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
     * Gets mcu.
     *
     * @return the mcu
     */
    public String getMcu() {
        return mcu;
    }

    /**
     * Sets mcu.
     *
     * @param mcu the mcu
     */
    public void setMcu(String mcu) {
        this.mcu = mcu;
    }

    /**
     * Gets mpu.
     *
     * @return the mpu
     */
    public String getMpu() {
        return mpu;
    }

    /**
     * Sets mpu.
     *
     * @param mpu the mpu
     */
    public void setMpu(String mpu) {
        this.mpu = mpu;
    }

    /**
     * Is sdcard boolean.
     *
     * @return the boolean
     */
    public boolean isSdcard() {
        return sdcard;
    }

    /**
     * Sets sdcard.
     *
     * @param sdcard the sdcard
     */
    public void setSdcard(boolean sdcard) {
        this.sdcard = sdcard;
    }

    /**
     * Is boot button boolean.
     *
     * @return the boolean
     */
    public boolean isBootButton() {
        return bootButton;
    }

    /**
     * Sets boot button.
     *
     * @param bootButton the boot button
     */
    public void setBootButton(boolean bootButton) {
        this.bootButton = bootButton;
    }

    /**
     * Is osd boolean.
     *
     * @return the boolean
     */
    public boolean isOsd() {
        return osd;
    }

    /**
     * Sets osd.
     *
     * @param osd the osd
     */
    public void setOsd(boolean osd) {
        this.osd = osd;
    }

    /**
     * Is buzzer boolean.
     *
     * @return the boolean
     */
    public boolean isBuzzer() {
        return buzzer;
    }

    /**
     * Sets buzzer.
     *
     * @param buzzer the buzzer
     */
    public void setBuzzer(boolean buzzer) {
        this.buzzer = buzzer;
    }

    /**
     * Gets max pid loop frequancy.
     *
     * @return the max pid loop frequancy
     */
    public int getMaxPidLoopFrequancy() {
        return maxPidLoopFrequancy;
    }

    /**
     * Sets max pid loop frequancy.
     *
     * @param maxPidLoopFrequancy the max pid loop frequancy
     */
    public void setMaxPidLoopFrequancy(String maxPidLoopFrequancy) {
        if (!maxPidLoopFrequancy.equals("")) {
            this.maxPidLoopFrequancy = Integer.parseInt(maxPidLoopFrequancy);
        }
    }

    /**
     * Gets max gyro updata.
     *
     * @return the max gyro updata
     */
    public int getMaxGyroUpdata() {
        return maxGyroUpdata;
    }

    /**
     * Sets max gyro updata.
     *
     * @param maxGyroUpdata the max gyro updata
     */
    public void setMaxGyroUpdata(String maxGyroUpdata) {
        if (!maxGyroUpdata.equals("")) {
            this.maxGyroUpdata = Integer.parseInt(maxGyroUpdata);
        }
    }

    /**
     * Gets esc.
     *
     * @return the esc
     */
    public ElectroSpeedRegulator getEsc() {
        return esc;
    }

    /**
     * Sets esc.
     *
     * @param esc the esc
     */
    public void setEsc(ElectroSpeedRegulator esc) {
        this.esc = esc;
    }

    /**
     * Gets power hub.
     *
     * @return the power hub
     */
    public PowerHub getPowerHub() {
        return powerHub;
    }

    /**
     * Sets power hub.
     *
     * @param powerHub the power hub
     */
    public void setPowerHub(PowerHub powerHub) {
        this.powerHub = powerHub;
    }

    /**
     * Gets image transmission.
     *
     * @return the image transmission
     */
    public ImageTransmission getImageTransmission() {
        return imageTransmission;
    }

    /**
     * Sets image transmission.
     *
     * @param imageTransmission the image transmission
     */
    public void setImageTransmission(ImageTransmission imageTransmission) {
        this.imageTransmission = imageTransmission;
    }

    /**
     * Gets pin defintion diagram.
     *
     * @return the pin defintion diagram
     */
    public String getPinDefintionDiagram() {
        return pinDefintionDiagram;
    }

    /**
     * Sets pin defintion diagram.
     *
     * @param pinDefintionDiagram the pin defintion diagram
     */
    public void setPinDefintionDiagram(String pinDefintionDiagram) {
        this.pinDefintionDiagram = pinDefintionDiagram;
    }

}