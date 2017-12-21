package com.RacingDroneWIKI.pojo;

/**
 * The type Efficacy chart.力效表
 * @author ChunsiYang
 * @version SSM 3.0
 */
public class EfficacyChart {
    /**
     * 力效表ID
     */
    private int id;
    /**
     * 电机型号
     */
    private String motoModel;
    /**
     * 使用螺旋桨
     */
    private String prop;
    /**
     * 电压
     */
    private float voltages;
    /**
     * 半油门电流
     */
    private float halfLoadCurrency;
    /**
     * 半油门推力
     */
    private int halfPull;
    /**
     * 半油门功率
     */
    private float halfPower;
    /**
     * 半油门效率
     */
    private float halfEfficlency;
    /**
     * 温度
     */
    private int temperature;
    /**
     * 满油门电流
     */
    private float fullLoadCurrency;
    /**
     * 满油门推力
     */
    private int fullPull;
    /**
     * 满油门功率
     */
    private float fullPower;
    /**
     * 满油门效率
     */
    private float fullEfficlency;

    /**
     * Instantiates a new Efficacy chart.
     *
     * @param id               the id
     * @param motoModel        the moto model
     * @param prop             the prop
     * @param voltages         the voltages
     * @param halfLoadCurrency the half load currency
     * @param halfPull         the half pull
     * @param halfPower        the half power
     * @param halfEfficlency   the half efficlency
     * @param temperature      the temperature
     * @param fullLoadCurrency the full load currency
     * @param fullPull         the full pull
     * @param fullPower        the full power
     * @param fullEfficlency   the full efficlency
     */
    public EfficacyChart(int id, String motoModel, String prop, float voltages, float halfLoadCurrency, int halfPull,
                         float halfPower, float halfEfficlency, int temperature, float fullLoadCurrency, int fullPull,
                         float fullPower, float fullEfficlency) {
        super();
        this.id = id;
        this.motoModel = motoModel;
        this.prop = prop;
        this.voltages = voltages;
        this.halfLoadCurrency = halfLoadCurrency;
        this.halfPull = halfPull;
        this.halfPower = halfPower;
        this.halfEfficlency = halfEfficlency;
        this.temperature = temperature;
        this.fullLoadCurrency = fullLoadCurrency;
        this.fullPull = fullPull;
        this.fullPower = fullPower;
        this.fullEfficlency = fullEfficlency;
    }

    /**
     * Instantiates a new Efficacy chart.
     */
    public EfficacyChart() {
        super();
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets moto model.
     *
     * @return the moto model
     */
    public String getMotoModel() {
        return motoModel;
    }

    /**
     * Sets moto model.
     *
     * @param motoModel the moto model
     */
    public void setMotoModel(String motoModel) {
        this.motoModel = motoModel;
    }

    /**
     * Gets prop.
     *
     * @return the prop
     */
    public String getProp() {
        return prop;
    }

    /**
     * Sets prop.
     *
     * @param prop the prop
     */
    public void setProp(String prop) {
        this.prop = prop;
    }

    /**
     * Gets voltages.
     *
     * @return the voltages
     */
    public float getVoltages() {
        return voltages;
    }

    /**
     * Sets voltages.
     *
     * @param voltages the voltages
     */
    public void setVoltages(float voltages) {
        this.voltages = voltages;
    }

    /**
     * Gets half load currency.
     *
     * @return the half load currency
     */
    public float getHalfLoadCurrency() {
        return halfLoadCurrency;
    }

    /**
     * Sets half load currency.
     *
     * @param halfLoadCurrency the half load currency
     */
    public void setHalfLoadCurrency(float halfLoadCurrency) {
        this.halfLoadCurrency = halfLoadCurrency;
    }

    /**
     * Gets half pull.
     *
     * @return the half pull
     */
    public int getHalfPull() {
        return halfPull;
    }

    /**
     * Sets half pull.
     *
     * @param halfPull the half pull
     */
    public void setHalfPull(int halfPull) {
        this.halfPull = halfPull;
    }

    /**
     * Gets half power.
     *
     * @return the half power
     */
    public float getHalfPower() {
        return halfPower;
    }

    /**
     * Sets half power.
     *
     * @param halfPower the half power
     */
    public void setHalfPower(float halfPower) {
        this.halfPower = halfPower;
    }

    /**
     * Gets half efficlency.
     *
     * @return the half efficlency
     */
    public float getHalfEfficlency() {
        return halfEfficlency;
    }

    /**
     * Sets half efficlency.
     *
     * @param halfEfficlency the half efficlency
     */
    public void setHalfEfficlency(float halfEfficlency) {
        this.halfEfficlency = halfEfficlency;
    }

    /**
     * Gets temperature.
     *
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Sets temperature.
     *
     * @param temperature the temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * Gets full load currency.
     *
     * @return the full load currency
     */
    public float getFullLoadCurrency() {
        return fullLoadCurrency;
    }

    /**
     * Sets full load currency.
     *
     * @param fullLoadCurrency the full load currency
     */
    public void setFullLoadCurrency(float fullLoadCurrency) {
        this.fullLoadCurrency = fullLoadCurrency;
    }

    /**
     * Gets full pull.
     *
     * @return the full pull
     */
    public int getFullPull() {
        return fullPull;
    }

    /**
     * Sets full pull.
     *
     * @param fullPull the full pull
     */
    public void setFullPull(int fullPull) {
        this.fullPull = fullPull;
    }

    /**
     * Gets full power.
     *
     * @return the full power
     */
    public float getFullPower() {
        return fullPower;
    }

    /**
     * Sets full power.
     *
     * @param fullPower the full power
     */
    public void setFullPower(float fullPower) {
        this.fullPower = fullPower;
    }

    /**
     * Gets full efficlency.
     *
     * @return the full efficlency
     */
    public float getFullEfficlency() {
        return fullEfficlency;
    }

    /**
     * Sets full efficlency.
     *
     * @param fullEfficlency the full efficlency
     */
    public void setFullEfficlency(float fullEfficlency) {
        this.fullEfficlency = fullEfficlency;
    }

}