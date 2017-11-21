package com.RacingDroneWIKI.pojo;

import java.util.*;

public class Item {
	/**
	 * 型号
	 */
	private String model;
	/**
	 * 主图片url
	 */
	private String imgUrl;
	/**
	 * 参考价格
	 */
	private int referencePrice;
	/**
	 * 制造商
	 */
	private String anufacturer;
	/**
	 * 额外图片
	 */
	private LinkedList<String> extraPictures;
	/**
	 * 其他文字描述
	 */
	private String caption;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(String referencePrice) {
		if(!referencePrice.equals(""))
		this.referencePrice = Integer.parseInt(referencePrice);
	}

	public String getAnufacturer() {
		return anufacturer;
	}

	public void setAnufacturer(String anufacturer) {
		this.anufacturer = anufacturer;
	}

	public LinkedList<String> getExtraPictures() {
		return extraPictures;
	}

	public void setExtraPictures(LinkedList<String> extraPictures) {
		this.extraPictures = extraPictures;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Item(String model, String imgUrl, int referencePrice, String anufacturer, LinkedList<String> extraPictures,
			String caption) {
		super();
		this.model = model;
		this.imgUrl = imgUrl;
		this.referencePrice = referencePrice;
		this.anufacturer = anufacturer;
		this.extraPictures = extraPictures;
		this.caption = caption;
	}

	public Item() {
		super();
	}

}