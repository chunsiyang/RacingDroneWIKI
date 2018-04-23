package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;

/**
 * The type Cam.摄像头
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class Cam extends Item implements Integratable {
    /**
     * 是否可单独使用
     */
    private boolean useAlone;
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
     * 图像传感器
     */
    private String imageSensor;
    /**
     * 水平分辨率
     */
    private int horizontalResolustion;
    /**
     * 镜头视场
     */
    private int lensFov;
    /**
     * 信号制式
     */
    private String signalSystem;
    /**
     * 结成OSD
     */
    private boolean integratedOsd;
    /**
     * 集成MIC
     */
    private boolean integratedMic;
    /**
     * 信噪比
     */
    private String snRatio;
    /**
     * 电子快门速度
     */
    private String electronicShutterSpeed;
    /**
     * 自动增益
     */
    private boolean autoGainControl;
    /**
     * 背光补偿
     */
    private boolean backLightCompensation;
    /**
     * 最低照度
     */
    private String minIllumination;
    /**
     * 宽动态
     */
    private String wdr;
    /**
     * 数字降噪
     */
    private String dnr;
    /**
     * 日夜切换
     */
    private String dayNight;
    /**
     * 输入电压
     */
    private String inputVoltages;
    /**
     * 外壳材料
     */
    private String housingMasterial;

    /**
     * Instantiates a new Cam.
     *
     * @param model                  the model
     * @param imgUrl                 the img url
     * @param referencePrice         the reference price
     * @param anufacturer            the anufacturer
     * @param extraPictures          the extra pictures
     * @param caption                the caption
     * @param useAlone               the use alone
     * @param weight                 the weight
     * @param length                 the length
     * @param width                  the width
     * @param thickness              the thickness
     * @param imageSensor            the image sensor
     * @param horizontalResolustion  the horizontal resolustion
     * @param lensFov                the lens fov
     * @param signalSystem           the signal system
     * @param integratedOsd          the integrated osd
     * @param integratedMic          the integrated mic
     * @param snRatio                the sn ratio
     * @param electronicShutterSpeed the electronic shutter speed
     * @param autoGainControl        the auto gain control
     * @param backLightCompensation  the back light compensation
     * @param minIllumination        the min illumination
     * @param wdr                    the wdr
     * @param dnr                    the dnr
     * @param dayNight               the day night
     * @param inputVoltages          the input voltages
     * @param housingMasterial       the housing masterial
     */
    public Cam(String model, String imgUrl, int referencePrice, String anufacturer, LinkedList<String> extraPictures,
               String caption, boolean useAlone, float weight, float length, float width, float thickness,
               String imageSensor, int horizontalResolustion, int lensFov, String signalSystem, boolean integratedOsd,
               boolean integratedMic, String snRatio, String electronicShutterSpeed, boolean autoGainControl,
               boolean backLightCompensation, String minIllumination, String wdr, String dnr, String dayNight,
               String inputVoltages, String housingMasterial) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption,weight);
        this.useAlone = useAlone;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.imageSensor = imageSensor;
        this.horizontalResolustion = horizontalResolustion;
        this.lensFov = lensFov;
        this.signalSystem = signalSystem;
        this.integratedOsd = integratedOsd;
        this.integratedMic = integratedMic;
        this.snRatio = snRatio;
        this.electronicShutterSpeed = electronicShutterSpeed;
        this.autoGainControl = autoGainControl;
        this.backLightCompensation = backLightCompensation;
        this.minIllumination = minIllumination;
        this.wdr = wdr;
        this.dnr = dnr;
        this.dayNight = dayNight;
        this.inputVoltages = inputVoltages;
        this.housingMasterial = housingMasterial;
    }

    /**
     * Instantiates a new Cam.
     */
    public Cam() {
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
     * Gets image sensor.
     *
     * @return the image sensor
     */
    public String getImageSensor() {
        return imageSensor;
    }

    /**
     * Sets image sensor.
     *
     * @param imageSensor the image sensor
     */
    public void setImageSensor(String imageSensor) {
        this.imageSensor = imageSensor;
    }

    /**
     * Gets horizontal resolustion.
     *
     * @return the horizontal resolustion
     */
    public int getHorizontalResolustion() {
        return horizontalResolustion;
    }

    /**
     * Sets horizontal resolustion.
     *
     * @param horizontalResolustion the horizontal resolustion
     */
    public void setHorizontalResolustion(String horizontalResolustion) {
        if (!horizontalResolustion.equals("")) {
            this.horizontalResolustion = Integer.parseInt(horizontalResolustion);
        }
    }

    /**
     * Gets lens fov.
     *
     * @return the lens fov
     */
    public int getLensFov() {
        return lensFov;
    }

    /**
     * Sets lens fov.
     *
     * @param lensFov the lens fov
     */
    public void setLensFov(String lensFov) {
        if (!lensFov.equals("")) {
            this.lensFov = Integer.parseInt(lensFov);
        }
    }

    /**
     * Gets signal system.
     *
     * @return the signal system
     */
    public String getSignalSystem() {
        return signalSystem;
    }

    /**
     * Sets signal system.
     *
     * @param signalSystem the signal system
     */
    public void setSignalSystem(String signalSystem) {
        this.signalSystem = signalSystem;
    }

    /**
     * Is integrated osd boolean.
     *
     * @return the boolean
     */
    public boolean isIntegratedOsd() {
        return integratedOsd;
    }

    /**
     * Sets integrated osd.
     *
     * @param integratedOsd the integrated osd
     */
    public void setIntegratedOsd(boolean integratedOsd) {
        this.integratedOsd = integratedOsd;
    }

    /**
     * Is integrated mic boolean.
     *
     * @return the boolean
     */
    public boolean isIntegratedMic() {
        return integratedMic;
    }

    /**
     * Sets integrated mic.
     *
     * @param integratedMic the integrated mic
     */
    public void setIntegratedMic(boolean integratedMic) {
        this.integratedMic = integratedMic;
    }

    /**
     * Gets sn ratio.
     *
     * @return the sn ratio
     */
    public String getSnRatio() {
        return snRatio;
    }

    /**
     * Sets sn ratio.
     *
     * @param snRatio the sn ratio
     */
    public void setSnRatio(String snRatio) {
        this.snRatio = snRatio;
    }

    /**
     * Gets electronic shutter speed.
     *
     * @return the electronic shutter speed
     */
    public String getElectronicShutterSpeed() {
        return electronicShutterSpeed;
    }

    /**
     * Sets electronic shutter speed.
     *
     * @param electronicShutterSpeed the electronic shutter speed
     */
    public void setElectronicShutterSpeed(String electronicShutterSpeed) {
        this.electronicShutterSpeed = electronicShutterSpeed;
    }

    /**
     * Is auto gain control boolean.
     *
     * @return the boolean
     */
    public boolean isAutoGainControl() {
        return autoGainControl;
    }

    /**
     * Sets auto gain control.
     *
     * @param autoGainControl the auto gain control
     */
    public void setAutoGainControl(boolean autoGainControl) {
        this.autoGainControl = autoGainControl;
    }

    /**
     * Is back light compensation boolean.
     *
     * @return the boolean
     */
    public boolean isBackLightCompensation() {
        return backLightCompensation;
    }

    /**
     * Sets back light compensation.
     *
     * @param backLightCompensation the back light compensation
     */
    public void setBackLightCompensation(boolean backLightCompensation) {
        this.backLightCompensation = backLightCompensation;
    }

    /**
     * Gets min illumination.
     *
     * @return the min illumination
     */
    public String getMinIllumination() {
        return minIllumination;
    }

    /**
     * Sets min illumination.
     *
     * @param minIllumination the min illumination
     */
    public void setMinIllumination(String minIllumination) {
        this.minIllumination = minIllumination;
    }

    /**
     * Gets wdr.
     *
     * @return the wdr
     */
    public String getWdr() {
        return wdr;
    }

    /**
     * Sets wdr.
     *
     * @param wdr the wdr
     */
    public void setWdr(String wdr) {
        this.wdr = wdr;
    }

    /**
     * Gets dnr.
     *
     * @return the dnr
     */
    public String getDnr() {
        return dnr;
    }

    /**
     * Sets dnr.
     *
     * @param dnr the dnr
     */
    public void setDnr(String dnr) {
        this.dnr = dnr;
    }

    /**
     * Gets day night.
     *
     * @return the day night
     */
    public String getDayNight() {
        return dayNight;
    }

    /**
     * Sets day night.
     *
     * @param dayNight the day night
     */
    public void setDayNight(String dayNight) {
        this.dayNight = dayNight;
    }

    /**
     * Gets input voltages.
     *
     * @return the input voltages
     */
    public String getInputVoltages() {
        return inputVoltages;
    }

    /**
     * Sets input voltages.
     *
     * @param inputVoltages the input voltages
     */
    public void setInputVoltages(String inputVoltages) {
        this.inputVoltages = inputVoltages;
    }

    /**
     * Gets housing masterial.
     *
     * @return the housing masterial
     */
    public String getHousingMasterial() {
        return housingMasterial;
    }

    /**
     * Sets housing masterial.
     *
     * @param housingMasterial the housing masterial
     */
    public void setHousingMasterial(String housingMasterial) {
        this.housingMasterial = housingMasterial;
    }

}