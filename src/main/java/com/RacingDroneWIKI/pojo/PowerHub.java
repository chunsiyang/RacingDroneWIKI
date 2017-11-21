package com.RacingDroneWIKI.pojo;

import java.util.*;

public class PowerHub extends Item implements Integratable{
	/**
	 * 可单独使用
	 */
	private boolean useAlone;
	/**
	 * 安装孔间距
	 */
	private float mountingHoleSpacing;
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
	 * 5V供电
	 */
	private boolean bec5v;
	/**
	 * 9V供电
	 */
	private boolean bec9v;
	/**
	 * 12V供电
	 */
	private boolean bec12v;
	/**
	 * 最大电流
	 */
	private int maxCurrent;
	/**
	 * 引脚定义图
	 */
	private String pinDefinitionDiagram;

	public boolean isUseAlone() {
		return useAlone;
	}

	public void setUseAlone(boolean useAlone) {
		this.useAlone = useAlone;
	}

	public float getMountingHoleSpacing() {
		return mountingHoleSpacing;
	}

	public void setMountingHoleSpacing(String mountingHoleSpacing)
	{
		if (!mountingHoleSpacing.equals(""))
			this.mountingHoleSpacing = Float.parseFloat(mountingHoleSpacing);
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

	public void setThickness(String thickness)
	{
		if (!thickness.equals(""))
		this.thickness =Float.parseFloat(thickness);
	}

	public boolean isBec5v() {
		return bec5v;
	}

	public void setBec5v(boolean bec5v) {
		this.bec5v = bec5v;
	}

	public boolean isBec9v() {
		return bec9v;
	}

	public void setBec9v(boolean bec9v) {
		this.bec9v = bec9v;
	}

	public boolean isBec12v() {
		return bec12v;
	}

	public void setBec12v(boolean bec12v) {
		this.bec12v = bec12v;
	}

	public int getMaxCurrent() {
		return maxCurrent;
	}

	public void setMaxCurrent(String maxCurrent)
	{
		if (!maxCurrent.equals(""))
		this.maxCurrent = Integer.parseInt(maxCurrent);
	}

	public String getPinDefinitionDiagram() {
		return pinDefinitionDiagram;
	}

	public void setPinDefinitionDiagram(String pinDefinitionDiagram) {
		this.pinDefinitionDiagram = pinDefinitionDiagram;
	}

	public PowerHub(String model, String imgUrl, int referencePrice, String anufacturer,
			LinkedList<String> extraPictures, String caption, boolean useAlone, float mountingHoleSpacing, float weight,
			float length, float width, float thickness, boolean bec5v, boolean bec9v, boolean bec12v, int maxCurrent,
			String pinDefinitionDiagram) {
		super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption);
		this.useAlone = useAlone;
		this.mountingHoleSpacing = mountingHoleSpacing;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.thickness = thickness;
		this.bec5v = bec5v;
		this.bec9v = bec9v;
		this.bec12v = bec12v;
		this.maxCurrent = maxCurrent;
		this.pinDefinitionDiagram = pinDefinitionDiagram;
	}

	public PowerHub() {
		super();
	}

}