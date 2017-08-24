package com.RacingDroneWIKI.javaBean;

public class EfficacyChart {
	/**
	 * 力效表ID
	 */
	private int id;
	/**
	 * 电机型号
	 */
	private String motoModel;
	/**
	 * 使用螺旋桨
	 */
	private String prop;
	/**
	 * 电压
	 */
	private float voltages;
	/**
	 * 半油门电流
	 */
	private float halfLoadCurrency;
	/**
	 * 半油门推力
	 */
	private int halfPull;
	/**
	 * 半油门功率
	 */
	private float halfPower;
	/**
	 * 半油门效率
	 */
	private float halfEfficlency;
	/**
	 * 温度
	 */
	private int temperature;
	/**
	 * 满油门电流
	 */
	private float fullLoadCurrency;
	/**
	 * 满油门推力
	 */
	private int fullPull;
	/**
	 * 满油门功率
	 */
	private float fullPower;
	/**
	 * 满油门效率
	 */
	private float fullEfficlency;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMotoModel() {
		return motoModel;
	}

	public void setMotoModel(String motoModel) {
		this.motoModel = motoModel;
	}

	public String getProp() {
		return prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}

	public float getVoltages() {
		return voltages;
	}

	public void setVoltages(int voltages) {
		this.voltages = voltages;
	}

	public float getHalfLoadCurrency() {
		return halfLoadCurrency;
	}

	public void setHalfLoadCurrency(float halfLoadCurrency) {
		this.halfLoadCurrency = halfLoadCurrency;
	}

	public int getHalfPull() {
		return halfPull;
	}

	public void setHalfPull(int halfPull) {
		this.halfPull = halfPull;
	}

	public float getHalfPower() {
		return halfPower;
	}

	public void setHalfPower(float halfPower) {
		this.halfPower = halfPower;
	}

	public float getHalfEfficlency() {
		return halfEfficlency;
	}

	public void setHalfEfficlency(float halfEfficlency) {
		this.halfEfficlency = halfEfficlency;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public float getFullLoadCurrency() {
		return fullLoadCurrency;
	}

	public void setFullLoadCurrency(float fullLoadCurrency) {
		this.fullLoadCurrency = fullLoadCurrency;
	}

	public int getFullPull() {
		return fullPull;
	}

	public void setFullPull(int fullPull) {
		this.fullPull = fullPull;
	}

	public float getFullPower() {
		return fullPower;
	}

	public void setFullPower(float fullPower) {
		this.fullPower = fullPower;
	}

	public float getFullEfficlency() {
		return fullEfficlency;
	}

	public void setFullEfficlency(float fullEfficlency) {
		this.fullEfficlency = fullEfficlency;
	}

	public EfficacyChart(int id, String motoModel, String prop, float voltages, float halfLoadCurrency, int halfPull,
			float halfPower, float halfEfficlency, int temperature, float fullLoadCurrency, int fullPull,
			float fullPower, float fullEfficlency) {
		super();
		this.id = id;
		this.motoModel = motoModel;
		this.prop = prop;
		this.voltages = voltages;
		this.halfLoadCurrency = halfLoadCurrency;
		this.halfPull = halfPull;
		this.halfPower = halfPower;
		this.halfEfficlency = halfEfficlency;
		this.temperature = temperature;
		this.fullLoadCurrency = fullLoadCurrency;
		this.fullPull = fullPull;
		this.fullPower = fullPower;
		this.fullEfficlency = fullEfficlency;
	}

	public EfficacyChart() {
		super();
	}

}