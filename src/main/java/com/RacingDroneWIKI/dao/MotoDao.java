package com.RacingDroneWIKI.dao;
import java.util.*;

import com.RacingDroneWIKI.pojo.Moto;
import org.springframework.stereotype.Repository;

/**
 * @author user
 *
 */
@Repository
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