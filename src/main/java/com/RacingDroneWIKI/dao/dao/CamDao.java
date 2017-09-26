package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Cam;

/**
 * @author user
 *
 */
public interface CamDao {
	/**
	 * @param cam
	 * @return
	 */
	int addCam(Cam cam);

	/**
	 * @param cam
	 * @return
	 */
	int deleteCam(Cam cam);

	/**
	 * @param cam
	 * @return
	 */
	int updataCam(Cam cam);

	/**
	 * @return
	 */
	List<Cam> findAll();
	/**
	 * @return
	 */
	List<Cam> findByModel(String model);


	/**
	 * @param model
	 * @return
	 */
	Cam findDetail(String model);
}