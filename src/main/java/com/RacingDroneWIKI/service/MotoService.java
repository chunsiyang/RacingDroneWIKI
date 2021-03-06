package com.RacingDroneWIKI.service;

import java.util.*;


import com.RacingDroneWIKI.dao.MotoDao;
import com.RacingDroneWIKI.pojo.Moto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Moto service.电机数据库相关服务
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service()
public class MotoService implements MotoDao {
    /**
     * The Moto dao.
     */
    @Autowired
    private MotoDao motoDao;

    @Override
    public int addMoto(Moto moto) {
        int res = 0;
        res = motoDao.addMoto(moto);
        return res;
    }

    @Override
    public int deleteMoto(Moto moto) {
        int res = 0;
        res = motoDao.deleteMoto(moto);
        return res;
    }

    @Override
    public int updataMoto(Moto moto) {
        int res = 0;
        res = motoDao.updataMoto(moto);
        return res;
    }

    @Override
    public List<Moto> findAll() {
        List<Moto> res;
        res = motoDao.findAll();
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public List<Moto> findByModel(String model) {
        List<Moto> res;
        res = motoDao.findByModel(model);
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }


    @Override
    public Moto findDetail(String model) {
        Moto res;
        res = motoDao.findDetail(model);
        return res;
    }
}