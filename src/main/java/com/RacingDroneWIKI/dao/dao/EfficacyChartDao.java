package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.javaBean.EfficacyChart;

/**
 * @author user
 *
 */
public interface EfficacyChartDao {
	/**
	 * @param efct
	 * @return
	 */
	boolean addEfficacyChart(EfficacyChart efct);

	/**
	 * @param efct
	 * @return
	 */
	boolean deleteEfficacyChart(EfficacyChart efct);

	/**
	 * @param efct
	 * @return
	 */
	boolean updataMoto(EfficacyChart efct);

	/**
	 * @return
	 */
	List<EfficacyChart> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<EfficacyChart> findByModel(String model);

}