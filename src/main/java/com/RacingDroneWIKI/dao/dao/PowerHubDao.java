package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.PowerHub;

/**
 * @author user
 */
public interface PowerHubDao {

    /**
     * @param ph
     * @return
     */
    boolean addPowerHub(PowerHub ph);

    /**
     * @param ph
     * @return
     */
    boolean deletPowerHub(PowerHub ph);

    /**
     * @param ph
     * @return
     */
    boolean updataPowerHub(PowerHub ph);

    /**
     * @return
     */
    List<PowerHub> findAll();

    /**
     * @param model
     * @return
     */
    List<PowerHub> findByModel(String model);

    /**
     * @return
     */
    List<PowerHub> findAllUseAlone();

    /**
     * @param model
     * @return
     */
    List<PowerHub> findByModelUseAlone(String model);
}