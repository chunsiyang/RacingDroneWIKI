package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.ElectroSpeedRegulator;

/**
 * @author user
 * 
 */

public interface ElectroSpeedRegulatorDao {
	/**
	 * @param esc
	 * @return
	 */
	boolean addElectroSpeedRegulato(ElectroSpeedRegulator esc);

	/**
	 * @param esc
	 * @return
	 */
	boolean deleteElectroSpeedRegulato(ElectroSpeedRegulator esc);

	/**
	 * @param esc
	 * @return
	 */
	boolean updataElectroSpeedRegulato(ElectroSpeedRegulator esc);

	/**
	 * @return
	 */
	List<ElectroSpeedRegulator> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<ElectroSpeedRegulator> findByModel(String model);
	/**
	 * @return
	 */
	List<ElectroSpeedRegulator> findAllUseAlone();

	/**
	 * @param model
	 * @return
	 */
	List<ElectroSpeedRegulator> findByModelUseAlone(String model);

}