package com.RacingDroneWIKI.service;

import java.util.*;


import com.RacingDroneWIKI.dao.ElectroSpeedRegulatorDao;
import com.RacingDroneWIKI.pojo.ElectroSpeedRegulator;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Electro speed regulator service.电子调速器数据库相关服务
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class ElectroSpeedRegulatorService implements ElectroSpeedRegulatorDao {

    /**
     * The Electro speed regulator dao.
     */
    @Autowired
    private ElectroSpeedRegulatorDao electroSpeedRegulatorDao;

    @Override
    public int addElectroSpeedRegulato(ElectroSpeedRegulator esc) {
        int res = 0;
        res = electroSpeedRegulatorDao.addElectroSpeedRegulato(esc);
        return res;
    }

    @Override
    public int deleteElectroSpeedRegulato(ElectroSpeedRegulator esc) {
        int res = 0;
        res = electroSpeedRegulatorDao.deleteElectroSpeedRegulato(esc);
        return res;
    }

    @Override
    public int updataElectroSpeedRegulato(ElectroSpeedRegulator esc) {
        int res = 0;
        res = electroSpeedRegulatorDao.updataElectroSpeedRegulato(esc);
        return res;
    }

    @Override
    public List<ElectroSpeedRegulator> findAll() {
        List<ElectroSpeedRegulator> res;
        SqlSession sqlSession = null;
        res = electroSpeedRegulatorDao.findAll();
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public List<ElectroSpeedRegulator> findByModel(String model) {
        List<ElectroSpeedRegulator> res;
        res = electroSpeedRegulatorDao.findByModel(model);
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public ElectroSpeedRegulator findDetail(String model) {
        ElectroSpeedRegulator res;
        res = electroSpeedRegulatorDao.findDetail(model);
        return res;
    }
}