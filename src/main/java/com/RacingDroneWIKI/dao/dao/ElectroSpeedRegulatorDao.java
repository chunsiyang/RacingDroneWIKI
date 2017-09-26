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
	int addElectroSpeedRegulato(ElectroSpeedRegulator esc);

	/**
	 * @param esc
	 * @return
	 */
	int deleteElectroSpeedRegulato(ElectroSpeedRegulator esc);

	/**
	 * @param esc
	 * @return
	 */
	int updataElectroSpeedRegulato(ElectroSpeedRegulator esc);

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
	 * @param model
	 * @return
	 */
	ElectroSpeedRegulator findDetail(String model);
}