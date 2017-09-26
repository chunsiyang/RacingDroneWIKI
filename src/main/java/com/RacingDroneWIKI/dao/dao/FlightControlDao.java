package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.FlightControl;

/**
 * @author user
 *
 */
public interface FlightControlDao {
	/**
	 * @param fc
	 * @return
	 */
	int addFlightControl(FlightControl fc);

	/**
	 * @param fc
	 * @return
	 */
	int deleteFlightControl(FlightControl fc);

	/**
	 * @param fc
	 * @return
	 */
	int updataFlightControl(FlightControl fc);

	/**
	 * @return
	 */
	List<FlightControl> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<FlightControl> findByModel(String model);

	/**
	 * @param model
	 * @return
	 */
	FlightControl findDetail(String model);
}