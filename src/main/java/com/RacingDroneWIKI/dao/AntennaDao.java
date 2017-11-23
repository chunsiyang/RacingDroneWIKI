package com.RacingDroneWIKI.dao;

import com.RacingDroneWIKI.pojo.Antenna;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 天线数据库DAO(Data Access Object) 数据访问对象
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Repository
public interface AntennaDao {
    /**
     * @param ant
     * @return
     */
    int addAntenna(Antenna ant);

    /**
     * @param ant
     * @return
     */
    int deleteAntenna(Antenna ant);

    /**
     * @param ant
     * @return
     */
    int updatAantenna(Antenna ant);

    /**
     * @return
     */
    List<Antenna> findAll();

    /**
     * @param model
     * @return
     */
    List<Antenna> findByModel(String model);

    /**
     * @param model
     * @return
     */
    Antenna findDetail(String model);
}