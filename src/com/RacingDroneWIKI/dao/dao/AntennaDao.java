package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.javaBean.Antenna;

/**
 * @author user
 *
 */
public interface AntennaDao {
	/**
	 * @param ant
	 * @return
	 */
	boolean addAntenna(Antenna ant);

	/**
	 * @param ant
	 * @return
	 */
	boolean deleteAntenna(Antenna ant);

	/**
	 * @param ant
	 * @return
	 */
	boolean updatAantenna(Antenna ant);

	/**
	 * @return
	 */
	List<Antenna> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<Antenna> findByModel(String model);

}