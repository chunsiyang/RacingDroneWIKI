package com.RacingDroneWIKI.javaBean;

import java.util.LinkedList;

public class Antenna extends Item {
	/**
	 * 重量
	 */
	private float weight;
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

	public String getConnectors() {
		return connectors;
	}

	public void setConnectors(String connectors) {
		this.connectors = connectors;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public float getGain() {
		return gain;
	}

	public void setGain(float gain) {
		this.gain = gain;
	}

	public float getAxialRatic() {
		return axialRatic;
	}

	public void setAxialRatic(float axialRatic) {
		this.axialRatic = axialRatic;
	}

	public String getPolarization() {
		return polarization;
	}

	public void setPolarization(String polarization) {
		this.polarization = polarization;
	}

	public Antenna() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Antenna(String model, String imgUrl, int referencePrice, String anufacturer,
			LinkedList<String> extraPictures, String caption, float weight, float length, String connectors,
			String frequency, float gain, float axialRatic, String polarization) {
		super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption);
		this.weight = weight;
		this.length = length;
		this.connectors = connectors;
		this.frequency = frequency;
		this.gain = gain;
		this.axialRatic = axialRatic;
		this.polarization = polarization;
	}

}