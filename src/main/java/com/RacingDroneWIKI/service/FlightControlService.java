package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.FlightControlDao;
import com.RacingDroneWIKI.pojo.FlightControl;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Flight control service.飞控数据库相关服务
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class FlightControlService implements FlightControlDao {
    /**
     * The Flight control dao.
     */
    @Autowired
    private FlightControlDao flightControlDao;

    @Override
    public int addFlightControl(FlightControl fc) {
        int res = 0;
        res = flightControlDao.addFlightControl(fc);
        return res;
    }

    @Override
    public int deleteFlightControl(FlightControl fc) {
        int res = 0;
        res = flightControlDao.deleteFlightControl(fc);
        return res;
    }


    @Override
    public int updataFlightControl(FlightControl fc) {
        int res = 0;
        res = flightControlDao.updataFlightControl(fc);
        return res;
    }

    @Override
    public List<FlightControl> findAll() {
        List<FlightControl> res;
        res = flightControlDao.findAll();
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public List<FlightControl> findByModel(String model) {
        List<FlightControl> res;
        res = flightControlDao.findByModel(model);
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public FlightControl findDetail(String model) {
        FlightControl res;
        res = flightControlDao.findDetail(model);
        return res;
    }
}