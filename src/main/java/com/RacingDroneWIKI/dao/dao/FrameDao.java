package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Frame;

/**
 * @author user
 *
 */
/**
 * @author user
 *
 */
public interface FrameDao {
	/**
	 * @param fra
	 * @return
	 */
	boolean addFrame(Frame fra);

	/**
	 * @param fra
	 * @return
	 */
	boolean deleteFrame(Frame fra);

	/**
	 * @param fra
	 * @return
	 */
	boolean updataFrame(Frame fra);

	/**
	 * @return
	 */
	List<Frame> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<Frame> findByModel(String model);

}