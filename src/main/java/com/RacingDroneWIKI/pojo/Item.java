package com.RacingDroneWIKI.pojo;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * The type Item.模型父类
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class Item implements  Serializable {
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
     * 重量
     */
    private float weight;
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

    /**
     * Instantiates a new Item.
     *
     * @param model          the model
     * @param imgUrl         the img url
     * @param referencePrice the reference price
     * @param anufacturer    the anufacturer
     * @param extraPictures  the extra pictures
     * @param caption        the caption
     */
    public Item(String model, String imgUrl, int referencePrice, String anufacturer, LinkedList<String> extraPictures,
                String caption,float weight) {
        super();
        this.model = model;
        this.imgUrl = imgUrl;
        this.referencePrice = referencePrice;
        this.anufacturer = anufacturer;
        this.extraPictures = extraPictures;
        this.caption = caption;
        this.weight=weight;
    }

    /**
     * Instantiates a new Item.
     */
    public Item() {}
    public float getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = "".equals(weight) ?0:Float.parseFloat(weight);
    }
    /**
     * Gets model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets model.
     *
     * @param model the model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets img url.
     *
     * @return the img url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * Sets img url.
     *
     * @param imgUrl the img url
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * Gets reference price.
     *
     * @return the reference price
     */
    public int getReferencePrice() {
        return referencePrice;
    }

    /**
     * Sets reference price.
     *
     * @param referencePrice the reference price
     */
    public void setReferencePrice(String referencePrice) {
        if (!"".equals(referencePrice)) {
            this.referencePrice = Integer.parseInt(referencePrice);
        }
    }

    /**
     * Gets anufacturer.
     *
     * @return the anufacturer
     */
    public String getAnufacturer() {
        return anufacturer;
    }

    /**
     * Sets anufacturer.
     *
     * @param anufacturer the anufacturer
     */
    public void setAnufacturer(String anufacturer) {
        this.anufacturer = anufacturer;
    }

    /**
     * Gets extra pictures.
     *
     * @return the extra pictures
     */
    public LinkedList<String> getExtraPictures() {
        return extraPictures;
    }

    /**
     * Sets extra pictures.
     *
     * @param extraPictures the extra pictures
     */
    public void setExtraPictures(LinkedList<String> extraPictures) {
        this.extraPictures = extraPictures;
    }

    /**
     * Gets caption.
     *
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets caption.
     *
     * @param caption the caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

}