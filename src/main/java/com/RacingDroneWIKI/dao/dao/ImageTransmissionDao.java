package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.ImageTransmission;

/**
 * @author user
 *
 */
/**
 * @author user
 *
 */
public interface ImageTransmissionDao {
	/**
	 * @param im
	 * @return
	 */
	int addImageTransmission(ImageTransmission im);

	/**
	 * @param im
	 * @return
	 */
	int deleteImageTransmission(ImageTransmission im);

	/**
	 * @param im
	 * @return
	 */
	int updataImageTransmission(ImageTransmission im);

	/**
	 * @return
	 */
	List<ImageTransmission> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<ImageTransmission> findByModel(String model);
	/**
	 * @param model
	 * @return
	 */
	ImageTransmission findDetail(String model);

}