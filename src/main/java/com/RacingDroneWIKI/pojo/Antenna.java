package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;

/**
 * The type Antenna. 天线
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class Antenna extends Item {
    /**
     * 长度
     */
    private float length;
    /**
     * 天线插头
     */
    private String connectors;
    /**
     * 天线频率
     */
    private String frequency;
    /**
     * 增益
     */
    private float gain;
    /**
     * 轴比
     */
    private float axialRatic;
    /**
     * 极化方式
     */
    private String polarization;


    /**
     * Instantiates a new Antenna.
     */
    public Antenna() {
        super();
        // TODO 自动生成的构造函数存根
    }


    /**
     * Instantiates a new Antenna.
     *
     * @param model          the model
     * @param imgUrl         the img url
     * @param referencePrice the reference price
     * @param anufacturer    the anufacturer
     * @param extraPictures  the extra pictures
     * @param caption        the caption
     * @param weight         the weight
     * @param length         the length
     * @param connectors     the connectors
     * @param frequency      the frequency
     * @param gain           the gain
     * @param axialRatic     the axial ratic
     * @param polarization   the polarization
     */
    public Antenna(String model, String imgUrl, int referencePrice, String anufacturer,
                   LinkedList<String> extraPictures, String caption, float weight, float length, String connectors,
                   String frequency, float gain, float axialRatic, String polarization) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption,weight);
        this.length = length;
        this.connectors = connectors;
        this.frequency = frequency;
        this.gain = gain;
        this.axialRatic = axialRatic;
        this.polarization = polarization;
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
     * Gets connectors.
     *
     * @return the connectors
     */
    public String getConnectors() {
        return connectors;
    }

    /**
     * Sets connectors.
     *
     * @param connectors the connectors
     */
    public void setConnectors(String connectors) {
        this.connectors = connectors;
    }

    /**
     * Gets frequency.
     *
     * @return the frequency
     */
    public String getFrequency() {
        return frequency;
    }

	/*public void setGain(float gain) {
		this.gain = gain;
	}*/

    /**
     * Sets frequency.
     *
     * @param frequency the frequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * Gets gain.
     *
     * @return the gain
     */
    public float getGain() {
        return gain;
    }

	/*public void setAxialRatic(float axialRatic) {
		this.axialRatic = axialRatic;
	}*/

    /**
     * Sets gain.
     *
     * @param gain the gain
     */
    public void setGain(String gain) {
        if (!gain.equals(""))
            this.gain = Float.parseFloat(gain);
    }

    /**
     * Gets axial ratic.
     *
     * @return the axial ratic
     */
    public float getAxialRatic() {
        return axialRatic;
    }

    /**
     * Sets axial ratic.
     *
     * @param axialRatic the axial ratic
     */
    public void setAxialRatic(String axialRatic) {
        if (!axialRatic.equals(""))
            this.axialRatic = Float.parseFloat(axialRatic);
    }

    /**
     * Gets polarization.
     *
     * @return the polarization
     */
    public String getPolarization() {
        return polarization;
    }

    /**
     * Sets polarization.
     *
     * @param polarization the polarization
     */
    public void setPolarization(String polarization) {
        this.polarization = polarization;
    }

}