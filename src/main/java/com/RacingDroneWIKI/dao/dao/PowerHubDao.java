package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.PowerHub;

/**
 * @author user
 *
 */
public interface PowerHubDao {

	/**
	 * @param ph
	 * @return
	 */
	int addPowerHub(PowerHub ph);

	/**
	 * @param ph
	 * @return
	 */
	int deletPowerHub(PowerHub ph);

	/**
	 * @param ph
	 * @return
	 */
	int updataPowerHub(PowerHub ph);

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
	 * @param model
	 * @return
	 */
	PowerHub findDetail(String model);
}