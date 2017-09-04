package com.RacingDroneWIKI.javaBean;

import java.util.*;

public class FlightControl extends Item {
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
	 * 安装孔距
	 */
	private float mountingHoleSpacing;
	/**
	 * mcu
	 */
	private String mcu;
	/**
	 * mpu
	 */
	private String mpu;
	/**
	 * SD卡支持
	 */
	private boolean sdcard;
	/**
	 * BOOT按键
	 */
	private boolean bootButton;
	/**
	 * 内置OSD
	 */
	private boolean osd;
	/**
	 * 内置蜂鸣器
	 */
	private boolean buzzer;
	/**
	 * 最大PID刷新率
	 */
	private int maxPidLoopFrequancy;
	/**
	 * 最大陀螺仪刷新率
	 */
	private int maxGyroUpdata;
	/**
	 * 内置电子调速器00
	 */
	private ElectroSpeedRegulator esc;
	/**
	 * 内置分电板
	 */
	private PowerHub powerHub;
	/**
	 * 内置图传
	 */
	private ImageTransmission imageTransmission;
	/**
	 * 阵脚定义图
	 */
	private String pinDefintionDiagram;

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

	public float getMountingHoleSpacing() {
		return mountingHoleSpacing;
	}

	public void setMountingHoleSpacing(float mountingHoleSpacing) {
		this.mountingHoleSpacing = mountingHoleSpacing;
	}

	public String getMcu() {
		return mcu;
	}

	public void setMcu(String mcu) {
		this.mcu = mcu;
	}

	public String getMpu() {
		return mpu;
	}

	public void setMpu(String mpu) {
		this.mpu = mpu;
	}

	public boolean isSdcard() {
		return sdcard;
	}

	public void setSdcard(boolean sdcard) {
		this.sdcard = sdcard;
	}

	public boolean isBootButton() {
		return bootButton;
	}

	public void setBootButton(boolean bootButton) {
		this.bootButton = bootButton;
	}

	public boolean isOsd() {
		return osd;
	}

	public void setOsd(boolean osd) {
		this.osd = osd;
	}

	public boolean isBuzzer() {
		return buzzer;
	}

	public void setBuzzer(boolean buzzer) {
		this.buzzer = buzzer;
	}

	public int getMaxPidLoopFrequancy() {
		return maxPidLoopFrequancy;
	}

	public void setMaxPidLoopFrequancy(int maxPidLoopFrequancy) {
		this.maxPidLoopFrequancy = maxPidLoopFrequancy;
	}

	public int getMaxGyroUpdata() {
		return maxGyroUpdata;
	}

	public void setMaxGyroUpdata(int maxGyroUpdata) {
		this.maxGyroUpdata = maxGyroUpdata;
	}

	public ElectroSpeedRegulator getEsc() {
		return esc;
	}

	public void setEsc(ElectroSpeedRegulator esc) {
		this.esc = esc;
	}

	public PowerHub getPowerHub() {
		return powerHub;
	}

	public void setPowerHub(PowerHub powerHub) {
		this.powerHub = powerHub;
	}

	public ImageTransmission getImageTransmission() {
		return imageTransmission;
	}

	public void setImageTransmission(ImageTransmission imageTransmission) {
		this.imageTransmission = imageTransmission;
	}

	public String getPinDefintionDiagram() {
		return pinDefintionDiagram;
	}

	public void setPinDefintionDiagram(String pinDefintionDiagram) {
		this.pinDefintionDiagram = pinDefintionDiagram;
	}

	public FlightControl(String model, String imgUrl, int referencePrice, String anufacturer,
			LinkedList<String> extraPictures, String caption, float weight, float length, float width, float thickness,
			float mountingHoleSpacing, String mcu, String mpu, boolean sdcard, boolean bootButton, boolean osd,
			boolean buzzer, int maxPidLoopFrequancy, int maxGyroUpdata, ElectroSpeedRegulator esc, PowerHub powerHub,
			ImageTransmission imageTransmission, String pinDefintionDiagram) {
		super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption);
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.thickness = thickness;
		this.mountingHoleSpacing = mountingHoleSpacing;
		this.mcu = mcu;
		this.mpu = mpu;
		this.sdcard = sdcard;
		this.bootButton = bootButton;
		this.osd = osd;
		this.buzzer = buzzer;
		this.maxPidLoopFrequancy = maxPidLoopFrequancy;
		this.maxGyroUpdata = maxGyroUpdata;
		this.esc = esc;
		this.powerHub = powerHub;
		this.imageTransmission = imageTransmission;
		this.pinDefintionDiagram = pinDefintionDiagram;
	}

	public FlightControl() {
		super();
	}

}