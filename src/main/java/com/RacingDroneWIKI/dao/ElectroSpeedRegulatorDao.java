package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.ElectroSpeedRegulator;
import org.springframework.stereotype.Repository;

/**
 * @author user
 * 
 */
@Repository
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