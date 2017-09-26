package com.RacingDroneWIKI.dao.dao;
import java.util.*;

import com.RacingDroneWIKI.pojo.Moto;

/**
 * @author user
 *
 */
public interface MotoDao {
	/**
	 * @param moto
	 * @return
	 */
	int addMoto(Moto moto);

	/**
	 * @param moto
	 * @return
	 */
	int deleteMoto(Moto moto);

	/**
	 * @param moto
	 * @return
	 */
	int updataMoto(Moto moto);

	/**
	 * @return
	 */
	List<Moto> findAll();

	/**
	 * @param model
	 * @return
	 */
	List<Moto> findByModel(String model);

	/**
	 * @param model
	 * @return
	 */
	Moto findDetail(String model);
}