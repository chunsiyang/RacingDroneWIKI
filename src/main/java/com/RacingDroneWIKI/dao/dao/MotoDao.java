package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Moto;

/**
 * @author user
 */
public interface MotoDao {
    /**
     * @param moto
     * @return
     */
    boolean addMoto(Moto moto);

    /**
     * @param moto
     * @return
     */
    boolean deleteMoto(Moto moto);

    /**
     * @param moto
     * @return
     */
    boolean updataMoto(Moto moto);

    /**
     * @return
     */
    List<Moto> findAll();

    /**
     * @param model
     * @return
     */
    List<Moto> findByModel(String model);

}