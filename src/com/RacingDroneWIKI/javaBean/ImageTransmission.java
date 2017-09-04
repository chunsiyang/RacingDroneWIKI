package com.RacingDroneWIKI.javaBean;

import java.util.*;

public class ImageTransmission extends Item implements Integratable{
	/**
	 * 可单独使用
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
	 * 内置摄像头
	 */
	private Cam cam;
	/**
	 * 频道数
	 */
	private int frequencyQuantity;
	/**
	 * SBUS支持
	 */
	private boolean sbus;
	/**
	 * 音频支持
	 */
	private boolean audioSupport;
	/**
	 * 内置收音器
	 */
	private boolean integratedMic;
	/**
	 * 功率可调
	 */
	private boolean powerAdjustable;
	/**
	 * 输出功率
	 */
	private String outputPower;
	/**
	 * 输入电压
	 */
	private String inputVoltage;
	/**
	 * 输出电压
	 */
	private String outputVoltage;
	/**
	 * 天线接头
	 */
	private String antennaConnectors;
	/**
	 * 视频带宽
	 */
	private String videoBandWidth;
	/**
	 * 音频带宽
	 */
	private String audioCarrierFrequency;
	/**
	 * 视频输入电平
	 */
	private String videoInputLevel;
	/**
	 * 音频输入水平
	 */
	private String audioInputLevel;
	/**
	 * 音频输入阻抗
	 */
	private String audioInputImpedance;
	/**
	 * 引脚定义图
	 */
	private String pinDefinitionDiagram;
	/**
	 * 频率表
	 */
	private String frequencyTable;

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

	public Cam getCam() {
		return cam;
	}

	public void setCam(Cam cam) {
		this.cam = cam;
	}

	public int getFrequencyQuantity() {
		return frequencyQuantity;
	}

	public void setFrequencyQuantity(int frequencyQuantity) {
		this.frequencyQuantity = frequencyQuantity;
	}

	public boolean isSbus() {
		return sbus;
	}

	public void setSbus(boolean sbus) {
		this.sbus = sbus;
	}

	public boolean isAudioSupport() {
		return audioSupport;
	}

	public void setAudioSupport(boolean audioSupport) {
		this.audioSupport = audioSupport;
	}

	public boolean isIntegratedMic() {
		return integratedMic;
	}

	public void setIntegratedMic(boolean integratedMic) {
		this.integratedMic = integratedMic;
	}

	public boolean isPowerAdjustable() {
		return powerAdjustable;
	}

	public void setPowerAdjustable(boolean powerAdjustable) {
		this.powerAdjustable = powerAdjustable;
	}

	public String getOutputPower() {
		return outputPower;
	}

	public void setOutputPower(String outputPower) {
		this.outputPower = outputPower;
	}

	public String getInputVoltage() {
		return inputVoltage;
	}

	public void setInputVoltage(String inputVoltage) {
		this.inputVoltage = inputVoltage;
	}

	public String getOutputVoltage() {
		return outputVoltage;
	}

	public void setOutputVoltage(String outputVoltage) {
		this.outputVoltage = outputVoltage;
	}

	public String getAntennaConnectors() {
		return antennaConnectors;
	}

	public void setAntennaConnectors(String antennaConnectors) {
		this.antennaConnectors = antennaConnectors;
	}

	public String getVideoBandWidth() {
		return videoBandWidth;
	}

	public void setVideoBandWidth(String videoBandWidth) {
		this.videoBandWidth = videoBandWidth;
	}

	public String getAudioCarrierFrequency() {
		return audioCarrierFrequency;
	}

	public void setAudioCarrierFrequency(String audioCarrierFrequency) {
		this.audioCarrierFrequency = audioCarrierFrequency;
	}

	public String getVideoInputLevel() {
		return videoInputLevel;
	}

	public void setVideoInputLevel(String videoInputLevel) {
		this.videoInputLevel = videoInputLevel;
	}

	public String getAudioInputImpedance() {
		return audioInputImpedance;
	}

	public void setAudioInputImpedance(String audioInputImpedance) {
		this.audioInputImpedance = audioInputImpedance;
	}

	public String getPinDefinitionDiagram() {
		return pinDefinitionDiagram;
	}

	public void setPinDefinitionDiagram(String pinDefinitionDiagram) {
		this.pinDefinitionDiagram = pinDefinitionDiagram;
	}

	public String getFrequencyTable() {
		return frequencyTable;
	}

	public void setFrequencyTable(String frequencyTable) {
		this.frequencyTable = frequencyTable;
	}

	public String getAudioInputLevel() {
		return audioInputLevel;
	}

	public void setAudioInputLevel(String audioInputLevel) {
		this.audioInputLevel = audioInputLevel;
	}

	

	public ImageTransmission(String model, String imgUrl, int referencePrice, String anufacturer,
			LinkedList<String> extraPictures, String caption, boolean useAlone, float weight, float length, float width,
			float thickness, Cam cam, int frequencyQuantity, boolean sbus, boolean audioSupport, boolean integratedMic,
			boolean powerAdjustable, String outputPower, String inputVoltage, String outputVoltage,
			String antennaConnectors, String videoBandWidth, String audioCarrierFrequency, String videoInputLevel,
			String audioInputLevel, String audioInputImpedance, String pinDefinitionDiagram, String frequencyTable) {
		super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption);
		this.useAlone = useAlone;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.thickness = thickness;
		this.cam = cam;
		this.frequencyQuantity = frequencyQuantity;
		this.sbus = sbus;
		this.audioSupport = audioSupport;
		this.integratedMic = integratedMic;
		this.powerAdjustable = powerAdjustable;
		this.outputPower = outputPower;
		this.inputVoltage = inputVoltage;
		this.outputVoltage = outputVoltage;
		this.antennaConnectors = antennaConnectors;
		this.videoBandWidth = videoBandWidth;
		this.audioCarrierFrequency = audioCarrierFrequency;
		this.videoInputLevel = videoInputLevel;
		this.audioInputLevel = audioInputLevel;
		this.audioInputImpedance = audioInputImpedance;
		this.pinDefinitionDiagram = pinDefinitionDiagram;
		this.frequencyTable = frequencyTable;
	}

	public ImageTransmission() {
		super();
	}

}