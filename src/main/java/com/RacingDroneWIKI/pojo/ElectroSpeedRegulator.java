package com.RacingDroneWIKI.pojo;

import java.util.*;

public class ElectroSpeedRegulator extends Item implements Integratable{
	/**
	 * 可单独使用
	 */
	private boolean useAlone;
	/**
	 * 支持锂电池电芯片数
	 */
	private String noOfCells;
	/**
	 * 持续工作电流
	 */
	private int persistentCurrent;
	/**
	 * 瞬时工作电流
	 */
	private int instantaneousCurrent;
	/**
	 * 固件
	 */
	private String firmware;
	/**
	 * 主控制芯片
	 */
	private String controlChip;
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
	 * 四合一
	 */
	private boolean fourInone;
	/**
	 * PWM输入模式
	 */
	private boolean pwmMode;
	/**
	 * oneshot125输入模式
	 */
	private boolean oneshot125;
	/**
	 * oneshot42输入模式
	 */
	private boolean oneshot42;
	/**
	 * mutishot输入模式
	 */
	private boolean mutishot;
	/**
	 * dshot输入模式
	 */
	private boolean dshot;

	public boolean isUseAlone() {
		return useAlone;
	}

	public void setUseAlone(boolean useAlone) {
		this.useAlone = useAlone;
	}

	public String getNoOfCells() {
		return noOfCells;
	}

	public void setNoOfCells(String noOfCells) {
		this.noOfCells = noOfCells;
	}

	public int getPersistentCurrent() {
		return persistentCurrent;
	}

	public void setPersistentCurrent(String persistentCurrent)
	{
		if (!persistentCurrent.equals(""))
		this.persistentCurrent = Integer.parseInt(persistentCurrent);
	}

	public int getInstantaneousCurrent() {
		return instantaneousCurrent;
	}

	public void setInstantaneousCurrent(String instantaneousCurrent)
	{
		if (!instantaneousCurrent.equals(""))
		this.instantaneousCurrent = Integer.parseInt(instantaneousCurrent);
	}

	public String getFirmware() {
		return firmware;
	}

	public void setFirmware(String firmware) {
		this.firmware = firmware;
	}

	public String getControlChip() {
		return controlChip;
	}

	public void setControlChip(String controlChip) {
		this.controlChip = controlChip;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
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

	public void setThickness(String thickness) {
		if (!thickness.equals(""))
		this.thickness = Float.parseFloat(thickness);
	}

	public boolean isFourInone() {
		return fourInone;
	}

	public void setFourInone(boolean fourInone) {
		this.fourInone = fourInone;
	}

	public boolean isPwmMode() {
		return pwmMode;
	}

	public void setPwmMode(boolean pwmMode) {
		this.pwmMode = pwmMode;
	}

	public boolean isOneshot125() {
		return oneshot125;
	}

	public void setOneshot125(boolean oneshot125) {
		this.oneshot125 = oneshot125;
	}

	public boolean isOneshot42() {
		return oneshot42;
	}

	public void setOneshot42(boolean oneshot42) {
		this.oneshot42 = oneshot42;
	}

	public boolean isMutishot() {
		return mutishot;
	}

	public void setMutishot(boolean mutishot) {
		this.mutishot = mutishot;
	}

	public boolean isDshot() {
		return dshot;
	}

	public void setDshot(boolean dshot) {
		this.dshot = dshot;
	}

	public ElectroSpeedRegulator(String model, String imgUrl, int referencePrice, String anufacturer,
			LinkedList<String> extraPictures, String caption, boolean useAlone, String noOfCells, int persistentCurrent,
			int instantaneousCurrent, String firmware, String controlChip, float weight, float length, float width,
			float thickness, boolean fourInone, boolean pwmMode, boolean oneshot125, boolean oneshot42,
			boolean mutishot, boolean dshot) {
		super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption);
		this.useAlone = useAlone;
		this.noOfCells = noOfCells;
		this.persistentCurrent = persistentCurrent;
		this.instantaneousCurrent = instantaneousCurrent;
		this.firmware = firmware;
		this.controlChip = controlChip;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.thickness = thickness;
		this.fourInone = fourInone;
		this.pwmMode = pwmMode;
		this.oneshot125 = oneshot125;
		this.oneshot42 = oneshot42;
		this.mutishot = mutishot;
		this.dshot = dshot;
	}

	public ElectroSpeedRegulator() {
		super();
	}

}