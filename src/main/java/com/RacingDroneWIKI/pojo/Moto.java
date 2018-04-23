package com.RacingDroneWIKI.pojo;

import java.util.LinkedList;
import java.util.List;

/**
 * The type Moto.电机
 * @author ChunsiYang
 * @version SSM 3.0
 */
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
    private List<EfficacyChart> efficacyChart;

    /**
     * Instantiates a new Moto.
     *
     * @param model              the model
     * @param imgUrl             the img url
     * @param referencePrice     the reference price
     * @param anufacturer        the anufacturer
     * @param extraPictures      the extra pictures
     * @param caption            the caption
     * @param statorLength       the stator length
     * @param shaftDiameter      the shaft diameter
     * @param idleCurrent        the idle current
     * @param weight             the weight
     * @param diameter           the diameter
     * @param length             the length
     * @param noOfCells          the no of cells
     * @param maxThrust          the max thrust
     * @param kv                 the kv
     * @param propeller          the propeller
     * @param statorDiameter     the stator diameter
     * @param internalReslstance the internal reslstance
     * @param efficacyChart      the efficacy chart
     */
    public Moto(String model, String imgUrl, int referencePrice, String anufacturer, LinkedList<String> extraPictures,
                String caption, float statorLength, float shaftDiameter, float idleCurrent, float weight, float diameter,
                float length, String noOfCells, int maxThrust, int kv, String propeller, float statorDiameter,
                int internalReslstance, List<EfficacyChart> efficacyChart) {
        super(model, imgUrl, referencePrice, anufacturer, extraPictures, caption,weight);
        this.statorLength = statorLength;
        this.shaftDiameter = shaftDiameter;
        this.idleCurrent = idleCurrent;
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

    /**
     * Instantiates a new Moto.
     */
    public Moto() {
        super();
    }

    /**
     * Gets stator length.
     *
     * @return the stator length
     */
    public float getStatorLength() {
        return statorLength;
    }

    /**
     * Sets stator length.
     *
     * @param statorLength the stator length
     */
    public void setStatorLength(String statorLength) {
        if (!statorLength.equals("")) {
            this.statorLength = Float.parseFloat(statorLength);
        }
    }

    /**
     * Gets stator diameter.
     *
     * @return the stator diameter
     */
    public float getStatorDiameter() {
        return statorDiameter;
    }

    /**
     * Sets stator diameter.
     *
     * @param statorDiameter the stator diameter
     */
    public void setStatorDiameter(String statorDiameter) {
        if (!statorDiameter.equals("")) {
            this.statorDiameter = Float.parseFloat(statorDiameter);
        }
    }

    /**
     * Gets shaft diameter.
     *
     * @return the shaft diameter
     */
    public float getShaftDiameter() {
        return shaftDiameter;
    }

    /**
     * Sets shaft diameter.
     *
     * @param shaftDiameter the shaft diameter
     */
    public void setShaftDiameter(String shaftDiameter) {
        if (!shaftDiameter.equals("")) {
            this.shaftDiameter = Float.parseFloat(shaftDiameter);
        }
    }

    /**
     * Gets idle current.
     *
     * @return the idle current
     */
    public float getIdleCurrent() {
        return idleCurrent;
    }

    /**
     * Sets idle current.
     *
     * @param idleCurrent the idle current
     */
    public void setIdleCurrent(String idleCurrent) {
        if (!idleCurrent.equals("")) {
            this.idleCurrent = Float.parseFloat(idleCurrent);
        }
    }


    /**
     * Gets diameter.
     *
     * @return the diameter
     */
    public float getDiameter() {
        return diameter;
    }

    /**
     * Sets diameter.
     *
     * @param diameter the diameter
     */
    public void setDiameter(String diameter) {
        if (!diameter.equals("")) {
            this.diameter = Float.parseFloat(diameter);
        }
    }

    /**
     * Gets length.
     *
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * Sets length.
     *
     * @param length the length
     */
    public void setLength(String length) {
        if (!length.equals("")) {
            this.length = Float.parseFloat(length);
        }
    }

    /**
     * Gets no of cells.
     *
     * @return the no of cells
     */
    public String getNoOfCells() {
        return noOfCells;
    }

    /**
     * Sets no of cells.
     *
     * @param noOfCells the no of cells
     */
    public void setNoOfCells(String noOfCells) {
        this.noOfCells = noOfCells;
    }

    /**
     * Gets max thrust.
     *
     * @return the max thrust
     */
    public int getMaxThrust() {
        return maxThrust;
    }

    /**
     * Sets max thrust.
     *
     * @param maxThrust the max thrust
     */
    public void setMaxThrust(String maxThrust) {
        if (!maxThrust.equals("")) {
            this.maxThrust = Integer.parseInt(maxThrust);
        }
    }

    /**
     * Gets kv.
     *
     * @return the kv
     */
    public int getKv() {
        return kv;
    }

    /**
     * Sets kv.
     *
     * @param kv the kv
     */
    public void setKv(String kv) {
        if (!kv.equals("")) {
            this.kv = Integer.parseInt(kv);
        }
    }

    /**
     * Gets propeller.
     *
     * @return the propeller
     */
    public String getPropeller() {
        return propeller;
    }

    /**
     * Sets propeller.
     *
     * @param propeller the propeller
     */
    public void setPropeller(String propeller) {
        this.propeller = propeller;
    }

    /**
     * Gets internal reslstance.
     *
     * @return the internal reslstance
     */
    public int getInternalReslstance() {
        return internalReslstance;
    }

    /**
     * Sets internal reslstance.
     *
     * @param internalReslstance the internal reslstance
     */
    public void setInternalReslstance(String internalReslstance) {
        if (!internalReslstance.equals("")) {
            this.internalReslstance = Integer.parseInt(internalReslstance);
        }
    }

    /**
     * Gets efficacy chart.
     *
     * @return the efficacy chart
     */
    public List<EfficacyChart> getEfficacyChart() {
        return efficacyChart;
    }

    /**
     * Sets efficacy chart.
     *
     * @param efficacyChart the efficacy chart
     */
    public void setEfficacyChart(List<EfficacyChart> efficacyChart) {
        this.efficacyChart = efficacyChart;
    }

}