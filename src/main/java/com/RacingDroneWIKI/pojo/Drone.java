package com.RacingDroneWIKI.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Drone 竞速无人机
 *
 * @author ChunsiYang
 * @version SSM 3.1
 */
public class Drone {
    private Moto moto;
    private ElectroSpeedRegulator electroSpeedRegulator;
    private Battery battery;
    private Prop prop;
    private Cam cam;
    private ImageTransmission imageTransmission;
    private Antenna antenna;
    private FlightControl flightControl;
    private PowerHub powerHub;
    private Frame frame;
    private float totalWeight=0;
    private float totalPrice=0;
    private float maximumThrust=0;
    private float thrustWeightRatio=0;
    private Map<String,String> notification=new HashMap<>();


    public Map<String, String> getNotification() {
        return notification;
    }

    public void setNotification(Map<String, String> notification) {
        this.notification = notification;
    }

    /**
     * Instantiates a new Drone.
     */
    public Drone() {
    }

    public Drone(Moto moto, ElectroSpeedRegulator electroSpeedRegulator,
                 Battery battery, Prop prop, Cam cam, ImageTransmission imageTransmission,
                 Antenna antenna, FlightControl flightControl, PowerHub powerHub, Frame frame,
                 float totalWeight, float totalPrice, float maximumThrust, float thrustWeightRatio,
                 Map<String,String> notification) {
        this.moto = moto;
        this.electroSpeedRegulator = electroSpeedRegulator;
        this.battery = battery;
        this.prop = prop;
        this.cam = cam;
        this.imageTransmission = imageTransmission;
        this.antenna = antenna;
        this.flightControl = flightControl;
        this.powerHub = powerHub;
        this.frame = frame;
        this.totalWeight = totalWeight;
        this.totalPrice = totalPrice;
        this.maximumThrust = maximumThrust;
        this.thrustWeightRatio = thrustWeightRatio;
        this.notification=notification;
    }

    /**
     * Gets total weight.
     *
     * @return the total weight
     */
    public float getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets total weight.
     *
     * @param totalWeight the total weight
     */
    public void setTotalWeight(float totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     * Gets total price.
     *
     * @return the total price
     */
    public float getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets total price.
     *
     * @param totalPrice the total price
     */
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * Gets maximum thrust.
     *
     * @return the maximum thrust
     */
    public float getMaximumThrust() {
        return maximumThrust;
    }

    /**
     * Sets maximum thrust.
     *
     * @param maximumThrust the maximum thrust
     */
    public void setMaximumThrust(float maximumThrust) {
        this.maximumThrust = maximumThrust;
    }

    /**
     * Gets thrust weight ratio.
     *
     * @return the thrust weight ratio
     */
    public float getThrustWeightRatio() {
        return thrustWeightRatio;
    }

    /**
     * Sets thrust weight ratio.
     *
     * @param thrustWeightRatio the thrust weight ratio
     */
    public void setThrustWeightRatio(float thrustWeightRatio) {
        this.thrustWeightRatio = thrustWeightRatio;
    }

    /**
     * Gets moto.
     *
     * @return the moto
     */
    public Moto getMoto() {
        return moto;
    }

    /**
     * Sets moto.
     *
     * @param moto the moto
     */
    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    /**
     * Gets electro speed regulator.
     *
     * @return the electro speed regulator
     */
    public ElectroSpeedRegulator getElectroSpeedRegulator() {
        return electroSpeedRegulator;
    }

    /**
     * Sets electro speed regulator.
     *
     * @param electroSpeedRegulator the electro speed regulator
     */
    public void setElectroSpeedRegulator(ElectroSpeedRegulator electroSpeedRegulator) {
        this.electroSpeedRegulator = electroSpeedRegulator;
    }

    /**
     * Gets battery.
     *
     * @return the battery
     */
    public Battery getBattery() {
        return battery;
    }

    /**
     * Sets battery.
     *
     * @param battery the battery
     */
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    /**
     * Gets prop.
     *
     * @return the prop
     */
    public Prop getProp() {
        return prop;
    }

    /**
     * Sets prop.
     *
     * @param prop the prop
     */
    public void setProp(Prop prop) {
        this.prop = prop;
    }

    /**
     * Gets cam.
     *
     * @return the cam
     */
    public Cam getCam() {
        return cam;
    }

    /**
     * Sets cam.
     *
     * @param cam the cam
     */
    public void setCam(Cam cam) {
        this.cam = cam;
    }

    /**
     * Gets image transmission.
     *
     * @return the image transmission
     */
    public ImageTransmission getImageTransmission() {
        return imageTransmission;
    }

    /**
     * Sets image transmission.
     *
     * @param imageTransmission the image transmission
     */
    public void setImageTransmission(ImageTransmission imageTransmission) {
        this.imageTransmission = imageTransmission;
    }

    /**
     * Gets antenna.
     *
     * @return the antenna
     */
    public Antenna getAntenna() {
        return antenna;
    }

    /**
     * Sets antenna.
     *
     * @param antenna the antenna
     */
    public void setAntenna(Antenna antenna) {
        this.antenna = antenna;
    }

    /**
     * Gets flight control.
     *
     * @return the flight control
     */
    public FlightControl getFlightControl() {
        return flightControl;
    }

    /**
     * Sets flight control.
     *
     * @param flightControl the flight control
     */
    public void setFlightControl(FlightControl flightControl) {
        this.flightControl = flightControl;
    }

    /**
     * Gets power hub.
     *
     * @return the power hub
     */
    public PowerHub getPowerHub() {
        return powerHub;
    }

    /**
     * Sets power hub.
     *
     * @param powerHub the power hub
     */
    public void setPowerHub(PowerHub powerHub) {
        this.powerHub = powerHub;
    }

    /**
     * Gets frame.
     *
     * @return the frame
     */
    public Frame getFrame() {
        return frame;
    }

    /**
     * Sets frame.
     *
     * @param frame the frame
     */
    public void setFrame(Frame frame) {
        this.frame = frame;
    }
}
