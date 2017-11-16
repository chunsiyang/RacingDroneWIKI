package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Battery;

/**
 * @author user
 */
public interface BatteryDao {
    /**
     * @param battery
     * @return
     */
    boolean addBattery(Battery battery);

    /**
     * @param battery
     * @return
     */
    boolean deleteBattery(Battery battery);

    /**
     * @param battery
     * @return
     */
    boolean updataBattery(Battery battery);

    /**
     * @return
     */
    List<Battery> findAll();

    /**
     * @param model
     * @return
     */
    List<Battery> findByModel(String model);

}