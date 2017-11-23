package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;

/**
 * The type Battery.电池
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class Battery extends Item {
    /**
     * 容量
     */
    private int capacity;
    /**
     * 放电倍率
     */
    private int dischargeRate;
    /**
     * 瞬时放电倍率
     */
    private int instantaneousDischargeRate;
    /**
     * 最大充电倍率
     */
    private int maxChargingRate;
    /**
     * 电压
     */
    private float voltage;
    /**
     * 推荐充电电流
     */
    private float recommendedChargingCurrent;
    /**
     * 最大充电电流
     */
    private float maximumChargeCurrent;
    /**
     * 重量
     */
    private float weight;
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
     * 插头类型
     */
    private String connector;
    /**
     * 电源线号
     */
    private int wireNumber;
    /**
     * 电源线长度
     */
    private int wireLength;

    /**
     * Instantiates a new Battery.
     */
    public Battery() {
        super();
    }

    /**
     * Instantiates a new Battery.
     *
     * @param model                      the model
     * @param imgUrl                     the img url
     * @param referencePrice             the reference price
     * @param anufacturer                the anufacturer
     * @param extraPictures              the extra pictures
     * @param caption                    the caption
     * @param capacity                   the capacity
     * @param dischargeRate              the discharge rate
     * @param instantaneousDischargeRate the instantaneous discharge rate
     * @param maxChargingRate            the max charging rate
     * @param voltage                    the voltage
     * @param recommendedChargingCurrent the recommended charging current
     * @param maximumChargeCurrent       the maximum charge current
     * @param weight                     the weight
     * @param length                     the length
     * @param width                      the width
     * @param thickness                  the thickness
     * @param connector                  the connector
     * @param wireNumber                 the wire number
     * @param wireLength                 the wire length
     */
    public Battery(String model, String imgUrl, int referencePrice, String anufacturer,
                   LinkedList<String> extraPictures, String caption, int capacity, int dischargeRate,
                   int instantaneousDischargeRate, int maxChargingRate, float voltage, float recommendedChargingCurrent,
                   float maximumChargeCurrent, float weight, float length, float width, float thickness, String connector,
                   int wireNumber, int wireLength) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption);
        this.capacity = capacity;
        this.dischargeRate = dischargeRate;
        this.instantaneousDischargeRate = instantaneousDischargeRate;
        this.maxChargingRate = maxChargingRate;
        this.voltage = voltage;
        this.recommendedChargingCurrent = recommendedChargingCurrent;
        this.maximumChargeCurrent = maximumChargeCurrent;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.connector = connector;
        this.wireNumber = wireNumber;
        this.wireLength = wireLength;
    }

    /**
     * Gets capacity.
     *
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets capacity.
     *
     * @param capacity the capacity
     */
    public void setCapacity(String capacity) {
        if (!capacity.equals(""))
            this.capacity = Integer.parseInt(capacity);
    }

    /**
     * Gets discharge rate.
     *
     * @return the discharge rate
     */
    public int getDischargeRate() {
        return dischargeRate;
    }

    /**
     * Sets discharge rate.
     *
     * @param dischargeRate the discharge rate
     */
    public void setDischargeRate(String dischargeRate) {
        if (!dischargeRate.equals(""))
            this.dischargeRate = Integer.parseInt(dischargeRate);
    }

    /**
     * Gets instantaneous discharge rate.
     *
     * @return the instantaneous discharge rate
     */
    public int getInstantaneousDischargeRate() {
        return instantaneousDischargeRate;
    }

    /**
     * Sets instantaneous discharge rate.
     *
     * @param instantaneousDischargeRate the instantaneous discharge rate
     */
    public void setInstantaneousDischargeRate(String instantaneousDischargeRate) {
        if (!instantaneousDischargeRate.equals(""))
            this.instantaneousDischargeRate = Integer.parseInt(instantaneousDischargeRate);
    }

    /**
     * Gets max charging rate.
     *
     * @return the max charging rate
     */
    public int getMaxChargingRate() {
        return maxChargingRate;
    }

    /**
     * Sets max charging rate.
     *
     * @param maxChargingRate the max charging rate
     */
    public void setMaxChargingRate(String maxChargingRate) {
        if (!maxChargingRate.equals(""))
            this.maxChargingRate = Integer.parseInt(maxChargingRate);
    }

    /**
     * Gets voltage.
     *
     * @return the voltage
     */
    public float getVoltage() {
        return voltage;
    }

    /**
     * Sets voltage.
     *
     * @param voltage the voltage
     */
    public void setVoltage(String voltage) {
        if (!voltage.equals(""))
            this.voltage = Float.parseFloat(voltage);
    }

    /**
     * Gets recommended charging current.
     *
     * @return the recommended charging current
     */
    public float getRecommendedChargingCurrent() {
        return recommendedChargingCurrent;
    }

    /**
     * Sets recommended charging current.
     *
     * @param recommendedChargingCurrent the recommended charging current
     */
    public void setRecommendedChargingCurrent(String recommendedChargingCurrent) {
        if (!recommendedChargingCurrent.equals(""))
            this.recommendedChargingCurrent = Float.parseFloat(recommendedChargingCurrent);
    }

    /**
     * Gets maximum charge current.
     *
     * @return the maximum charge current
     */
    public float getMaximumChargeCurrent() {
        return maximumChargeCurrent;
    }

    /**
     * Sets maximum charge current.
     *
     * @param maximumChargeCurrent the maximum charge current
     */
    public void setMaximumChargeCurrent(String maximumChargeCurrent) {
        if (!maximumChargeCurrent.equals(""))
            this.maximumChargeCurrent = Float.parseFloat(maximumChargeCurrent);
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(String weight) {
        if (!weight.equals(""))
            this.weight = Float.parseFloat(weight);
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
     * Gets connector.
     *
     * @return the connector
     */
    public String getConnector() {
        return connector;
    }

    /**
     * Sets connector.
     *
     * @param connector the connector
     */
    public void setConnector(String connector) {
        this.connector = connector;
    }

    /**
     * Gets wire number.
     *
     * @return the wire number
     */
    public int getWireNumber() {
        return wireNumber;
    }

    /**
     * Sets wire number.
     *
     * @param wireNumber the wire number
     */
    public void setWireNumber(int wireNumber) {
        this.wireNumber = wireNumber;
    }

    /**
     * Gets wire length.
     *
     * @return the wire length
     */
    public int getWireLength() {
        return wireLength;
    }

    /**
     * Sets wire length.
     *
     * @param wireLength the wire length
     */
    public void setWireLength(int wireLength) {
        this.wireLength = wireLength;
    }

}