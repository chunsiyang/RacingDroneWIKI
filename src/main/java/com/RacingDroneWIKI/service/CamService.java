package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.CamDao;
import com.RacingDroneWIKI.pojo.Cam;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Cam service.摄像头相关服务
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class CamService implements CamDao {
    /**
     * The Cam dao.
     */
    @Autowired
    private CamDao camDao;

    public int addCam(Cam cam) {
        int res = 0;
        res = camDao.addCam(cam);
        return res;
    }

    public int deleteCam(Cam cam) {
        int res = 0;
        res = camDao.deleteCam(cam);
        return res;
    }

    public int updataCam(Cam cam) {
        int res = 0;
        res = camDao.updataCam(cam);
        return res;
    }

    public List<Cam> findAll() {
        List<Cam> res;
        res = camDao.findAll();
        if (res.isEmpty())
            return null;
        return res;
    }

    public List<Cam> findByModel(String model) {
        List<Cam> res;
        res = camDao.findByModel(model);
        if (res.isEmpty())
            return null;
        return res;
    }

    @Override
    public Cam findDetail(String model) {
        Cam res;
        res = camDao.findDetail(model);
        return res;
    }

}