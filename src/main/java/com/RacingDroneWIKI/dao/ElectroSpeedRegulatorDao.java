package com.RacingDroneWIKI.dao;

import com.RacingDroneWIKI.pojo.ElectroSpeedRegulator;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 电子调速器DAO(Data Access Object) 数据访问对象
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Repository
public interface ElectroSpeedRegulatorDao {
    /**
     * @param esc
     * @return
     */
    int addElectroSpeedRegulato(ElectroSpeedRegulator esc);

    /**
     * @param esc
     * @return
     */
    int deleteElectroSpeedRegulato(ElectroSpeedRegulator esc);

    /**
     * @param esc
     * @return
     */
    int updataElectroSpeedRegulato(ElectroSpeedRegulator esc);

    /**
     * @return
     */
    List<ElectroSpeedRegulator> findAll();

    /**
     * @param model
     * @return
     */
    List<ElectroSpeedRegulator> findByModel(String model);

    /**
     * @param model
     * @return
     */
    ElectroSpeedRegulator findDetail(String model);
}