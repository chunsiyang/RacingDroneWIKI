package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.javaBean.Cam;

/**
 * @author user
 *
 */
public interface CamDao {
	/**
	 * @param cam
	 * @return
	 */
	boolean addCam(Cam cam);

	/**
	 * @param cam
	 * @return
	 */
	boolean deleteCam(Cam cam);

	/**
	 * @param cam
	 * @return
	 */
	boolean updataCam(Cam cam);

	/**
	 * @return
	 */
	List<Cam> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<Cam> findByModel(String model);

}