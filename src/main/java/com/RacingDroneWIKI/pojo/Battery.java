package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;

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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDischargeRate() {
        return dischargeRate;
    }

    public void setDischargeRate(int dischargeRate) {
        this.dischargeRate = dischargeRate;
    }

    public int getInstantaneousDischargeRate() {
        return instantaneousDischargeRate;
    }

    public void setInstantaneousDischargeRate(int instantaneousDischargeRate) {
        this.instantaneousDischargeRate = instantaneousDischargeRate;
    }

    public int getMaxChargingRate() {
        return maxChargingRate;
    }

    public void setMaxChargingRate(int maxChargingRate) {
        this.maxChargingRate = maxChargingRate;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public float getRecommendedChargingCurrent() {
        return recommendedChargingCurrent;
    }

    public void setRecommendedChargingCurrent(float recommendedChargingCurrent) {
        this.recommendedChargingCurrent = recommendedChargingCurrent;
    }

    public float getMaximumChargeCurrent() {
        return maximumChargeCurrent;
    }

    public void setMaximumChargeCurrent(float maximumChargeCurrent) {
        this.maximumChargeCurrent = maximumChargeCurrent;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public String getConnector() {
        return connector;
    }

    public Battery() {
        super();
    }

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

    public void setConnector(String connector) {
        this.connector = connector;
    }

    public int getWireNumber() {
        return wireNumber;
    }

    public void setWireNumber(int wireNumber) {
        this.wireNumber = wireNumber;
    }

    public int getWireLength() {
        return wireLength;
    }

    public void setWireLength(int wireLength) {
        this.wireLength = wireLength;
    }

}