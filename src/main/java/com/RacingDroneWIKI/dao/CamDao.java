package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Cam;
import org.springframework.stereotype.Repository;

/**
 * 摄像头DAO(Data Access Object) 数据访问对象
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Repository
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