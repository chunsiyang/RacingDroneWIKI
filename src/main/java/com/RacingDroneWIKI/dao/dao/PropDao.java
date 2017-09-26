package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Prop;

/**
 * @author user
 *
 */
public interface PropDao {
	/**
	 * @param prop
	 * @return
	 */
	int addProp(Prop prop);

	/**
	 * @param prop
	 * @return
	 */
	int deleteProp(Prop prop);

	/**
	 * @param prop
	 * @return
	 */
	int updataProp(Prop prop);

	/**
	 * @return
	 */
	List<Prop> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<Prop> findByModel(String model);

	/**
	 * @param model
	 * @return
	 */
	Prop findDetail(String model);
}