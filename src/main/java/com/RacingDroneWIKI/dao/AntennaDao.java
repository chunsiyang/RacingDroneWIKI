package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Antenna;
import org.springframework.stereotype.Repository;

/**
 * @author user
 *
 */
@Repository
public interface AntennaDao {
	/**
	 * @param ant
	 * @return
	 */
	int addAntenna(Antenna ant);

	/**
	 * @param ant
	 * @return
	 */
	int deleteAntenna(Antenna ant);

	/**
	 * @param ant
	 * @return
	 */
	int updatAantenna(Antenna ant);

	/**
	 * @return
	 */
	List<Antenna> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<Antenna> findByModel(String model);
	/**
	 * @param model
	 * @return
	 */
	Antenna findDetail(String model);
}