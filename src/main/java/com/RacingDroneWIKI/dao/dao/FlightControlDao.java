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
	boolean addFlightControl(FlightControl fc);

	/**
	 * @param fc
	 * @return
	 */
	boolean deleteFlightControl(FlightControl fc);

	/**
	 * @param fc
	 * @return
	 */
	boolean updataFlightControl(FlightControl fc);

	/**
	 * @return
	 */
	List<FlightControl> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<FlightControl> findByModel(String model);

}