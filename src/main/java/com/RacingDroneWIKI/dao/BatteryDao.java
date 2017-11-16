package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Battery;
import org.springframework.stereotype.Repository;

/**
 * @author user
 *
 */
@Repository
public interface BatteryDao {
	/**
	 * @param battery
	 * @return
	 */
	int addBattery(Battery battery);

	/**
	 * @param battery
	 * @return
	 */
	int deleteBattery(Battery battery);

	/**
	 * @param battery
	 * @return
	 */
	int updataBattery(Battery battery);

	/**
	 * @return
	 */
	List<Battery> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<Battery> findByModel(String model);

	Battery findDetail(String model);
}