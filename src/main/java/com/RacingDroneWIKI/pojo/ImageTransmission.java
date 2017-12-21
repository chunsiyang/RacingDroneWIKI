package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;

/**
 * The type Image transmission.图传
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class ImageTransmission extends Item implements Integratable {
    /**
     * 可单独使用
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
     * 内置摄像头
     */
    private Cam cam;
    /**
     * 频道数
     */
    private int frequencyQuantity;
    /**
     * SBUS支持
     */
    private boolean sbus;
    /**
     * 音频支持
     */
    private boolean audioSupport;
    /**
     * 内置收音器
     */
    private boolean integratedMic;
    /**
     * 功率可调
     */
    private boolean powerAdjustable;
    /**
     * 输出功率
     */
    private String outputPower;
    /**
     * 输入电压
     */
    private String inputVoltage;
    /**
     * 输出电压
     */
    private String outputVoltage;
    /**
     * 天线接头
     */
    private String antennaConnectors;
    /**
     * 视频带宽
     */
    private String videoBandWidth;
    /**
     * 音频带宽
     */
    private String audioCarrierFrequency;
    /**
     * 视频输入电平
     */
    private String videoInputLevel;
    /**
     * 音频输入水平
     */
    private String audioInputLevel;
    /**
     * 音频输入阻抗
     */
    private String audioInputImpedance;
    /**
     * 引脚定义图
     */
    private String pinDefinitionDiagram;
    /**
     * 频率表
     */
    private String frequencyTable;

    /**
     * Instantiates a new Image transmission.
     *
     * @param model                 the model
     * @param imgUrl                the img url
     * @param referencePrice        the reference price
     * @param anufacturer           the anufacturer
     * @param extraPictures         the extra pictures
     * @param caption               the caption
     * @param useAlone              the use alone
     * @param weight                the weight
     * @param length                the length
     * @param width                 the width
     * @param thickness             the thickness
     * @param cam                   the cam
     * @param frequencyQuantity     the frequency quantity
     * @param sbus                  the sbus
     * @param audioSupport          the audio support
     * @param integratedMic         the integrated mic
     * @param powerAdjustable       the power adjustable
     * @param outputPower           the output power
     * @param inputVoltage          the input voltage
     * @param outputVoltage         the output voltage
     * @param antennaConnectors     the antenna connectors
     * @param videoBandWidth        the video band width
     * @param audioCarrierFrequency the audio carrier frequency
     * @param videoInputLevel       the video input level
     * @param audioInputLevel       the audio input level
     * @param audioInputImpedance   the audio input impedance
     * @param pinDefinitionDiagram  the pin definition diagram
     * @param frequencyTable        the frequency table
     */
    public ImageTransmission(String model, String imgUrl, int referencePrice, String anufacturer,
                             LinkedList<String> extraPictures, String caption, boolean useAlone, float weight, float length, float width,
                             float thickness, Cam cam, int frequencyQuantity, boolean sbus, boolean audioSupport, boolean integratedMic,
                             boolean powerAdjustable, String outputPower, String inputVoltage, String outputVoltage,
                             String antennaConnectors, String videoBandWidth, String audioCarrierFrequency, String videoInputLevel,
                             String audioInputLevel, String audioInputImpedance, String pinDefinitionDiagram, String frequencyTable) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption,weight);
        this.useAlone = useAlone;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.cam = cam;
        this.frequencyQuantity = frequencyQuantity;
        this.sbus = sbus;
        this.audioSupport = audioSupport;
        this.integratedMic = integratedMic;
        this.powerAdjustable = powerAdjustable;
        this.outputPower = outputPower;
        this.inputVoltage = inputVoltage;
        this.outputVoltage = outputVoltage;
        this.antennaConnectors = antennaConnectors;
        this.videoBandWidth = videoBandWidth;
        this.audioCarrierFrequency = audioCarrierFrequency;
        this.videoInputLevel = videoInputLevel;
        this.audioInputLevel = audioInputLevel;
        this.audioInputImpedance = audioInputImpedance;
        this.pinDefinitionDiagram = pinDefinitionDiagram;
        this.frequencyTable = frequencyTable;
    }

    /**
     * Instantiates a new Image transmission.
     */
    public ImageTransmission() {
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
     * Gets cam.
     *
     * @return the cam
     */
    public Cam getCam() {
        return cam;
    }

    /**
     * Sets cam.
     *
     * @param cam the cam
     */
    public void setCam(Cam cam) {
        this.cam = cam;
    }

    /**
     * Gets frequency quantity.
     *
     * @return the frequency quantity
     */
    public int getFrequencyQuantity() {
        return frequencyQuantity;
    }

    /**
     * Sets frequency quantity.
     *
     * @param frequencyQuantity the frequency quantity
     */
    public void setFrequencyQuantity(String frequencyQuantity) {
        if (!frequencyQuantity.equals(""))
            this.frequencyQuantity = Integer.parseInt(frequencyQuantity);
    }

    /**
     * Is sbus boolean.
     *
     * @return the boolean
     */
    public boolean isSbus() {
        return sbus;
    }

    /**
     * Sets sbus.
     *
     * @param sbus the sbus
     */
    public void setSbus(boolean sbus) {
        this.sbus = sbus;
    }

    /**
     * Is audio support boolean.
     *
     * @return the boolean
     */
    public boolean isAudioSupport() {
        return audioSupport;
    }

    /**
     * Sets audio support.
     *
     * @param audioSupport the audio support
     */
    public void setAudioSupport(boolean audioSupport) {
        this.audioSupport = audioSupport;
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
     * Is power adjustable boolean.
     *
     * @return the boolean
     */
    public boolean isPowerAdjustable() {
        return powerAdjustable;
    }

    /**
     * Sets power adjustable.
     *
     * @param powerAdjustable the power adjustable
     */
    public void setPowerAdjustable(boolean powerAdjustable) {
        this.powerAdjustable = powerAdjustable;
    }

    /**
     * Gets output power.
     *
     * @return the output power
     */
    public String getOutputPower() {
        return outputPower;
    }

    /**
     * Sets output power.
     *
     * @param outputPower the output power
     */
    public void setOutputPower(String outputPower) {
        this.outputPower = outputPower;
    }

    /**
     * Gets input voltage.
     *
     * @return the input voltage
     */
    public String getInputVoltage() {
        return inputVoltage;
    }

    /**
     * Sets input voltage.
     *
     * @param inputVoltage the input voltage
     */
    public void setInputVoltage(String inputVoltage) {
        this.inputVoltage = inputVoltage;
    }

    /**
     * Gets output voltage.
     *
     * @return the output voltage
     */
    public String getOutputVoltage() {
        return outputVoltage;
    }

    /**
     * Sets output voltage.
     *
     * @param outputVoltage the output voltage
     */
    public void setOutputVoltage(String outputVoltage) {
        this.outputVoltage = outputVoltage;
    }

    /**
     * Gets antenna connectors.
     *
     * @return the antenna connectors
     */
    public String getAntennaConnectors() {
        return antennaConnectors;
    }

    /**
     * Sets antenna connectors.
     *
     * @param antennaConnectors the antenna connectors
     */
    public void setAntennaConnectors(String antennaConnectors) {
        this.antennaConnectors = antennaConnectors;
    }

    /**
     * Gets video band width.
     *
     * @return the video band width
     */
    public String getVideoBandWidth() {
        return videoBandWidth;
    }

    /**
     * Sets video band width.
     *
     * @param videoBandWidth the video band width
     */
    public void setVideoBandWidth(String videoBandWidth) {
        this.videoBandWidth = videoBandWidth;
    }

    /**
     * Gets audio carrier frequency.
     *
     * @return the audio carrier frequency
     */
    public String getAudioCarrierFrequency() {
        return audioCarrierFrequency;
    }

    /**
     * Sets audio carrier frequency.
     *
     * @param audioCarrierFrequency the audio carrier frequency
     */
    public void setAudioCarrierFrequency(String audioCarrierFrequency) {
        this.audioCarrierFrequency = audioCarrierFrequency;
    }

    /**
     * Gets video input level.
     *
     * @return the video input level
     */
    public String getVideoInputLevel() {
        return videoInputLevel;
    }

    /**
     * Sets video input level.
     *
     * @param videoInputLevel the video input level
     */
    public void setVideoInputLevel(String videoInputLevel) {
        this.videoInputLevel = videoInputLevel;
    }

    /**
     * Gets audio input impedance.
     *
     * @return the audio input impedance
     */
    public String getAudioInputImpedance() {
        return audioInputImpedance;
    }

    /**
     * Sets audio input impedance.
     *
     * @param audioInputImpedance the audio input impedance
     */
    public void setAudioInputImpedance(String audioInputImpedance) {
        this.audioInputImpedance = audioInputImpedance;
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

    /**
     * Gets frequency table.
     *
     * @return the frequency table
     */
    public String getFrequencyTable() {
        return frequencyTable;
    }

    /**
     * Sets frequency table.
     *
     * @param frequencyTable the frequency table
     */
    public void setFrequencyTable(String frequencyTable) {
        this.frequencyTable = frequencyTable;
    }

    /**
     * Gets audio input level.
     *
     * @return the audio input level
     */
    public String getAudioInputLevel() {
        return audioInputLevel;
    }

    /**
     * Sets audio input level.
     *
     * @param audioInputLevel the audio input level
     */
    public void setAudioInputLevel(String audioInputLevel) {
        this.audioInputLevel = audioInputLevel;
    }

}