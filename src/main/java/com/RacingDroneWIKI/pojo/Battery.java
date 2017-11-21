package com.RacingDroneWIKI.pojo;

import javax.persistence.criteria.CriteriaBuilder;
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

	public void setCapacity(String capacity)
	{
		if (!capacity.equals(""))
			this.capacity = Integer.parseInt(capacity);
	}

	public int getDischargeRate() {
		return dischargeRate;
	}

	public void setDischargeRate(String dischargeRate)
	{
		if (!dischargeRate.equals(""))
			this.dischargeRate = Integer.parseInt(dischargeRate);
	}

	public int getInstantaneousDischargeRate() {
		return instantaneousDischargeRate;
	}

	public void setInstantaneousDischargeRate(String instantaneousDischargeRate) {
		if (!instantaneousDischargeRate.equals(""))
			this.instantaneousDischargeRate = Integer.parseInt(instantaneousDischargeRate);
	}

	public int getMaxChargingRate() {
		return maxChargingRate;
	}

	public void setMaxChargingRate(String maxChargingRate)
	{
		if (!maxChargingRate.equals(""))
			this.maxChargingRate = Integer.parseInt(maxChargingRate);
	}

	public float getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage)
	{
		if (!voltage.equals(""))
			this.voltage = Float.parseFloat(voltage);
	}

	public float getRecommendedChargingCurrent() {
		return recommendedChargingCurrent;
	}

	public void setRecommendedChargingCurrent(String recommendedChargingCurrent) {
		if (!recommendedChargingCurrent.equals(""))
			this.recommendedChargingCurrent = Float.parseFloat(recommendedChargingCurrent);
	}

	public float getMaximumChargeCurrent() {
		return maximumChargeCurrent;
	}

	public void setMaximumChargeCurrent(String maximumChargeCurrent)
	{
		if (!maximumChargeCurrent.equals(""))
			this.maximumChargeCurrent = Float.parseFloat(maximumChargeCurrent);
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(String weight)
	{
		if (!weight.equals(""))
		this.weight = Float.parseFloat(weight);
	}

	public float getLength() {
		return length;
	}

	public void setLength(String length)
	{
		if (!length.equals(""))
		this.length = Float.parseFloat(length);
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(String width)
	{
		if (!width.equals(""))
		this.width = Float.parseFloat(width);
	}

	public float getThickness() {
		return thickness;
	}

	public void setThickness(String thickness)
	{
		if (!thickness.equals(""))
		this.thickness = Float.parseFloat(thickness);
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