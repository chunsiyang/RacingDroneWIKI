package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.PowerHubDao;
import com.RacingDroneWIKI.pojo.PowerHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Power hub service.分电板数据库相关服务
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class PowerHubService implements PowerHubDao {
    /**
     * The Power hub dao.
     */
    @Autowired
    private PowerHubDao powerHubDao;

    @Override
    public int addPowerHub(PowerHub ph) {
        int res = 0;
        res = powerHubDao.addPowerHub(ph);
        return res;
    }

    @Override
    public int deletPowerHub(PowerHub ph) {
        int res = 0;
        res = powerHubDao.deletPowerHub(ph);
        return res;
    }

    @Override
    public int updataPowerHub(PowerHub ph) {
        int res = 0;
        res = powerHubDao.updataPowerHub(ph);
        return res;
    }

    @Override
    public List<PowerHub> findAll() {
        List<PowerHub> res;
        res = powerHubDao.findAll();
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public List<PowerHub> findByModel(String model) {
        List<PowerHub> res;
        res = powerHubDao.findByModel(model);
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public PowerHub findDetail(String model) {
        PowerHub res;
        res = powerHubDao.findDetail(model);
        return res;
    }
}