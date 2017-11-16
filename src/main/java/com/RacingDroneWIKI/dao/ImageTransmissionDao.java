package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.ImageTransmission;
import org.springframework.stereotype.Repository;

/**
 * @author user
 *
 */
/**
 * @author user
 *
 */
@Repository
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