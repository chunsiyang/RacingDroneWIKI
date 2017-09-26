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
	int addFrame(Frame fra);

	/**
	 * @param fra
	 * @return
	 */
	int deleteFrame(Frame fra);

	/**
	 * @param fra
	 * @return
	 */
	int updataFrame(Frame fra);

	/**
	 * @return
	 */
	List<Frame> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<Frame> findByModel(String model);

	/**
	 * @param model
	 * @return
	 */
	Frame findDetail(String model);
}