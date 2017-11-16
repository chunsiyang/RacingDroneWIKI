package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.PowerHub;
import org.springframework.stereotype.Repository;

/**
 * @author user
 *
 */
@Repository
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