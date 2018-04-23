package com.RacingDroneWIKI.service;

import com.RacingDroneWIKI.dao.AntennaDao;
import com.RacingDroneWIKI.pojo.Antenna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Antenna service.天线数据库相关服务
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class AntennaService implements AntennaDao {
    /**
     * The Antenna dao.
     */
    @Autowired
    private AntennaDao antennaDao;

    public int addAntenna(Antenna ant) {
        int res = 0;
        res = antennaDao.addAntenna(ant);
        return res;
    }

    public int deleteAntenna(Antenna ant) {
        int res = 0;
        res = antennaDao.deleteAntenna(ant);
        return res;
    }

    public int updatAantenna(Antenna ant) {
        int res = 0;
        res = antennaDao.updatAantenna(ant);
        return res;
    }

    public Antenna findDetail(String model) {
        Antenna res;
        res = antennaDao.findDetail(model);
        return res;
    }

    public List<Antenna> findAll() {
        List<Antenna> res;
        res = antennaDao.findAll();
        if (res.isEmpty())
            return null;
        return res;
    }

    public List<Antenna> findByModel(String model) {
        List<Antenna> res;
        res = antennaDao.findByModel(model);
        if (res.isEmpty())
            return null;
        return res;
    }

}