package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.EfficacyChart;
import org.springframework.stereotype.Repository;

/**
 * @author user
 *
 */
@Repository
public interface EfficacyChartDao {
	/**
	 * @param efct
	 * @return
	 */
	int addEfficacyChart(EfficacyChart efct);

	/**
	 * @param efct
	 * @return
	 */
	int deleteEfficacyChart(EfficacyChart efct);

	/**
	 * @param efct
	 * @return
	 */
	int updataEfficacyChart(EfficacyChart efct);

	/**
	 * @param model
	 * @return
	 */
	List<EfficacyChart> findByModel(String model);

}