package com.RacingDroneWIKI.javaBean;

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
	private int internalRestance;
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
			int internalRestance, List<EfficacyChart> efficacyChart) {
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
		this.internalRestance = internalRestance;
		this.efficacyChart = efficacyChart;
	}

	public float getStatorDiameter() {
		return statorDiameter;
	}

	public void setStatorDiameter(float statorDiameter) {
		this.statorDiameter = statorDiameter;
	}

	public void setStatorLength(float statorLength) {
		this.statorLength = statorLength;
	}

	public float getShaftDiameter() {
		return shaftDiameter;
	}

	public void setShaftDiameter(float shaftDiameter) {
		this.shaftDiameter = shaftDiameter;
	}

	public float getIdleCurrent() {
		return idleCurrent;
	}

	public void setIdleCurrent(float idleCurrent) {
		this.idleCurrent = idleCurrent;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
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

	public void setMaxThrust(int maxThrust) {
		this.maxThrust = maxThrust;
	}

	public int getKv() {
		return kv;
	}

	public void setKv(int kv) {
		this.kv = kv;
	}

	public String getPropeller() {
		return propeller;
	}

	public void setPropeller(String propeller) {
		this.propeller = propeller;
	}

	public int getInternalRestance() {
		return internalRestance;
	}

	public void setInternalRestance(int internalRestance) {
		this.internalRestance = internalRestance;
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