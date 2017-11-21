package com.RacingDroneWIKI.pojo;

import java.util.*;

public class Moto extends Item {
	/**
	 * 定子长度
	 */
	private float statorLength;
	/**
	 * 轴径
	 */
	private float shaftDiameter;
	/**
	 * 空载电流
	 */
	private float idleCurrent;
	/**
	 * 重量
	 */
	private float weight;
	/**
	 * 直径
	 */
	private float diameter;
	/**
	 * 长度
	 */
	private float length;
	/**
	 * 支持锂电池节数
	 */
	private String noOfCells;
	/**
	 * 最大推力
	 */
	private int maxThrust;
	/**
	 * KV值
	 */
	private int kv;
	/**
	 * 支持螺旋桨
	 */
	private String propeller;
	/**
	 * 定子直径
	 */
	private float statorDiameter;
	/**
	 * 内阻
	 */
	private int internalReslstance;
	/**
	 * 力效表
	 */
	private List<EfficacyChart> efficacyChart ;

	public float getStatorLength() {
		return statorLength;
	}

	public Moto(String model, String imgUrl, int referencePrice, String anufacturer, LinkedList<String> extraPictures,
				String caption, float statorLength, float shaftDiameter, float idleCurrent, float weight, float diameter,
				float length, String noOfCells, int maxThrust, int kv, String propeller, float statorDiameter,
				int internalReslstance, List<EfficacyChart> efficacyChart) {
		super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption);
		this.statorLength = statorLength;
		this.shaftDiameter = shaftDiameter;
		this.idleCurrent = idleCurrent;
		this.weight = weight;
		this.diameter = diameter;
		this.length = length;
		this.noOfCells = noOfCells;
		this.maxThrust = maxThrust;
		this.kv = kv;
		this.propeller = propeller;
		this.statorDiameter = statorDiameter;
		this.internalReslstance = internalReslstance;
		this.efficacyChart = efficacyChart;
	}

	public float getStatorDiameter() {
		return statorDiameter;
	}

	public void setStatorDiameter(String statorDiameter)
	{
		if (!statorDiameter.equals(""))
		this.statorDiameter =Float.parseFloat(statorDiameter);
	}

	public void setStatorLength(String statorLength) {
		if (!statorLength.equals(""))
		this.statorLength = Float.parseFloat(statorLength);
	}

	public float getShaftDiameter() {
		return shaftDiameter;
	}

	public void setShaftDiameter(String shaftDiameter) {
		if (!shaftDiameter.equals(""))
		this.shaftDiameter = Float.parseFloat(shaftDiameter);
	}

	public float getIdleCurrent() {
		return idleCurrent;
	}

	public void setIdleCurrent(String idleCurrent) {
		if (!idleCurrent.equals(""))
		this.idleCurrent = Float.parseFloat(idleCurrent);
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		if (!weight.equals(""))
		this.weight = Float.parseFloat(weight);
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		if (!diameter.equals(""))
		this.diameter = Float.parseFloat(diameter);
	}

	public float getLength() {
		return length;
	}

	public void setLength(String length) {
		if (!length.equals(""))
		this.length = Float.parseFloat(length);
	}

	public String getNoOfCells() {
		return noOfCells;
	}

	public void setNoOfCells(String noOfCells) {
		this.noOfCells = noOfCells;
	}

	public int getMaxThrust() {
		return maxThrust;
	}

	public void setMaxThrust(String maxThrust) {
		if (!maxThrust.equals(""))
		this.maxThrust = Integer.parseInt(maxThrust);
	}

	public int getKv() {
		return kv;
	}

	public void setKv(String kv) {
		if (!kv.equals(""))
		this.kv = Integer.parseInt(kv);
	}

	public String getPropeller() {
		return propeller;
	}

	public void setPropeller(String propeller) {
		this.propeller = propeller;
	}

	public int getInternalReslstance() {
		return internalReslstance;
	}

	public void setInternalReslstance(String internalReslstance) {
		if (!internalReslstance.equals(""))
		this.internalReslstance = Integer.parseInt(internalReslstance);
	}

	public List<EfficacyChart> getEfficacyChart() {
		return efficacyChart;
	}

	public void setEfficacyChart(List<EfficacyChart> efficacyChart) {
		this.efficacyChart = efficacyChart;
	}
	public Moto() {
		super();
	}

}