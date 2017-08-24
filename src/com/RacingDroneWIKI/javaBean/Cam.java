package com.RacingDroneWIKI.javaBean;

import java.util.*;

public class Cam extends Item {
	/**
	 * 是否可单独使用
	 */
	private boolean useAlone;
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
	 * 图像传感器
	 */
	private String imageSensor;
	/**
	 * 水平分辨率
	 */
	private int horizontalResolustion;
	/**
	 * 镜头视场
	 */
	private int lensFov;
	/**
	 * 信号制式
	 */
	private String signalSystem;
	/**
	 * 结成OSD
	 */
	private boolean integratedOsd;
	/**
	 * 集成MIC
	 */
	private boolean integratedMic;
	/**
	 * 信噪比
	 */
	private String snRatio;
	/**
	 * 电子快门速度
	 */
	private String electronicShutterSpeed;
	/**
	 * 自动增益
	 */
	private boolean autoGainControl;
	/**
	 * 背光补偿
	 */
	private boolean backLightCompensation;
	/**
	 * 最低照度
	 */
	private String minIllumination;
	/**
	 * 宽动态
	 */
	private String wdr;
	/**
	 * 数字降噪
	 */
	private String dnr;
	/**
	 * 日夜切换
	 */
	private String dayNight;
	/**
	 * 输入电压
	 */
	private String inputVoltages;
	/**
	 * 外壳材料
	 */
	private String housingMasterial;

	public boolean isUseAlone() {
		return useAlone;
	}

	public void setUseAlone(boolean useAlone) {
		this.useAlone = useAlone;
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

	public String getImageSensor() {
		return imageSensor;
	}

	public void setImageSensor(String imageSensor) {
		this.imageSensor = imageSensor;
	}

	public int getHorizontalResolustion() {
		return horizontalResolustion;
	}

	public void setHorizontalResolustion(int horizontalResolustion) {
		this.horizontalResolustion = horizontalResolustion;
	}

	public int getLensFov() {
		return lensFov;
	}

	public void setLensFov(int lensFov) {
		this.lensFov = lensFov;
	}

	public String getSignalSystem() {
		return signalSystem;
	}

	public void setSignalSystem(String signalSystem) {
		this.signalSystem = signalSystem;
	}

	public boolean isIntegratedOsd() {
		return integratedOsd;
	}

	public void setIntegratedOsd(boolean integratedOsd) {
		this.integratedOsd = integratedOsd;
	}

	public boolean isIntegratedMic() {
		return integratedMic;
	}

	public void setIntegratedMic(boolean integratedMic) {
		this.integratedMic = integratedMic;
	}

	public String getSnRatio() {
		return snRatio;
	}

	public void setSnRatio(String snRatio) {
		this.snRatio = snRatio;
	}

	public String getElectronicShutterSpeed() {
		return electronicShutterSpeed;
	}

	public void setElectronicShutterSpeed(String electronicShutterSpeed) {
		this.electronicShutterSpeed = electronicShutterSpeed;
	}

	public boolean isAutoGainControl() {
		return autoGainControl;
	}

	public void setAutoGainControl(boolean autoGainControl) {
		this.autoGainControl = autoGainControl;
	}

	public boolean isBackLightCompensation() {
		return backLightCompensation;
	}

	public void setBackLightCompensation(boolean backLightCompensation) {
		this.backLightCompensation = backLightCompensation;
	}

	public String getMinIllumination() {
		return minIllumination;
	}

	public void setMinIllumination(String minIllumination) {
		this.minIllumination = minIllumination;
	}

	public String getWdr() {
		return wdr;
	}

	public void setWdr(String wdr) {
		this.wdr = wdr;
	}

	public String getDnr() {
		return dnr;
	}

	public void setDnr(String dnr) {
		this.dnr = dnr;
	}

	public String getDayNight() {
		return dayNight;
	}

	public void setDayNight(String dayNight) {
		this.dayNight = dayNight;
	}

	public String getInputVoltages() {
		return inputVoltages;
	}

	public void setInputVoltages(String inputVoltages) {
		this.inputVoltages = inputVoltages;
	}

	public String getHousingMasterial() {
		return housingMasterial;
	}

	public void setHousingMasterial(String housingMasterial) {
		this.housingMasterial = housingMasterial;
	}

	public Cam(String model, String imgUrl, int referencePrice, String anufacturer, LinkedList<String> extraPictures,
			String caption, boolean useAlone, float weight, float length, float width, float thickness,
			String imageSensor, int horizontalResolustion, int lensFov, String signalSystem, boolean integratedOsd,
			boolean integratedMic, String snRatio, String electronicShutterSpeed, boolean autoGainControl,
			boolean backLightCompensation, String minIllumination, String wdr, String dnr, String dayNight,
			String inputVoltages, String housingMasterial) {
		super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption);
		this.useAlone = useAlone;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.thickness = thickness;
		this.imageSensor = imageSensor;
		this.horizontalResolustion = horizontalResolustion;
		this.lensFov = lensFov;
		this.signalSystem = signalSystem;
		this.integratedOsd = integratedOsd;
		this.integratedMic = integratedMic;
		this.snRatio = snRatio;
		this.electronicShutterSpeed = electronicShutterSpeed;
		this.autoGainControl = autoGainControl;
		this.backLightCompensation = backLightCompensation;
		this.minIllumination = minIllumination;
		this.wdr = wdr;
		this.dnr = dnr;
		this.dayNight = dayNight;
		this.inputVoltages = inputVoltages;
		this.housingMasterial = housingMasterial;
	}

	public Cam() {
		super();
	}

}