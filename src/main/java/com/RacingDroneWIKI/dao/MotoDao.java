package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Moto;
import org.springframework.stereotype.Repository;

/**
 * 电机DAO(Data Access Object) 数据访问对象
 *
 * @author ChunsiYang
 * @version SSM 3.0
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