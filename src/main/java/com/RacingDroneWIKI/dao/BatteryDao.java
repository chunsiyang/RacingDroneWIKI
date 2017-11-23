package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Battery;
import org.springframework.stereotype.Repository;

/**
 * 电池DAO(Data Access Object) 数据访问对象
 * @author ChunsiYang
 * @version SSM 3.0
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