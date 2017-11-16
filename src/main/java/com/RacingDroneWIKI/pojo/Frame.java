package com.RacingDroneWIKI.pojo;

import java.util.*;

public class Frame extends Item {
	/**
	 * 轴距
	 */
	private int wheekbase;
	/**
	 * 重量
	 */
	private float weight;
	/**
	 * 飞控安装孔距
	 */
	private float fcMountingHoleSpacing;
	/**
	 * 内置分电板
	 */
	private PowerHub integratedPh;
	/**
	 * 内置LED
	 */
	private boolean integratedLed;
	/**
	 * 摄像头可调角度
	 */
	private String camraAdjustingAngle;
	/**
	 * 主要材料
	 */
	private String material;
	/**
	 * 最大可用螺旋桨
	 */
	private int maximumSupportProp;
	/**
	 * 下板厚度
	 */
	private float bottomThickness;
	/**
	 * 顶板厚度
	 */
	private float roofThickness;
	/**
	 * 机臂厚度
	 */
	private float armThickness;

	public int getWheekbase() {
		return wheekbase;
	}

	public void setWheekbase(int wheekbase) {
		this.wheekbase = wheekbase;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getFcMountingHoleSpacing() {
		return fcMountingHoleSpacing;
	}

	public void setFcMountingHoleSpacing(float fcMountingHoleSpacing) {
		this.fcMountingHoleSpacing = fcMountingHoleSpacing;
	}

	public PowerHub getIntegratedPh() {
		return integratedPh;
	}

	public void setIntegratedPh(PowerHub integratedPh) {
		this.integratedPh = integratedPh;
	}

	public boolean isIntegratedLed() {
		return integratedLed;
	}

	public void setIntegratedLed(boolean integratedLed) {
		this.integratedLed = integratedLed;
	}

	public String getCamraAdjustingAngle() {
		return camraAdjustingAngle;
	}

	public void setCamraAdjustingAngle(String camraAdjustingAngle) {
		this.camraAdjustingAngle = camraAdjustingAngle;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getMaximumSupportProp() {
		return maximumSupportProp;
	}

	public void setMaximumSupportProp(int maximumSupportProp) {
		this.maximumSupportProp = maximumSupportProp;
	}

	public float getBottomThickness() {
		return bottomThickness;
	}

	public void setBottomThickness(float bottomThickness) {
		this.bottomThickness = bottomThickness;
	}

	public float getRoofThickness() {
		return roofThickness;
	}

	public void setRoofThickness(float roofThickness) {
		this.roofThickness = roofThickness;
	}

	public float getArmThickness() {
		return armThickness;
	}

	public void setArmThickness(float armThickness) {
		this.armThickness = armThickness;
	}

	public Frame(String model, String imgUrl, int referencePrice, String anufacturer, LinkedList<String> extraPictures,
			String caption, int wheekbase, float weight, float fcMountingHoleSpacing, PowerHub integratedPh,
			boolean integratedLed, String camraAdjustingAngle, String material, int maximumSupportProp,
			float bottomThickness, float roofThickness, float armThickness) {
		super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption);
		this.wheekbase = wheekbase;
		this.weight = weight;
		this.fcMountingHoleSpacing = fcMountingHoleSpacing;
		this.integratedPh = integratedPh;
		this.integratedLed = integratedLed;
		this.camraAdjustingAngle = camraAdjustingAngle;
		this.material = material;
		this.maximumSupportProp = maximumSupportProp;
		this.bottomThickness = bottomThickness;
		this.roofThickness = roofThickness;
		this.armThickness = armThickness;
	}

	public Frame() {
		super();
	}

}