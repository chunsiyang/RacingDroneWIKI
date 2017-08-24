package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.javaBean.Prop;

/**
 * @author user
 *
 */
public interface PropDao {
	/**
	 * @param prop
	 * @return
	 */
	boolean addProp(Prop prop);

	/**
	 * @param prop
	 * @return
	 */
	boolean deleteProp(Prop prop);

	/**
	 * @param prop
	 * @return
	 */
	boolean updataProp(Prop prop);

	/**
	 * @return
	 */
	List<Prop> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<Prop> findByModel(String model);

}