package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.FrameDao;
import com.RacingDroneWIKI.pojo.Frame;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Frame service.机架数据库相关服务
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class FrameService implements FrameDao {
    /**
     * The Frame dao.
     */
    @Autowired
    private FrameDao frameDao;

    @Override
    public int addFrame(Frame fra) {
        int res = 0;
        res = frameDao.addFrame(fra);
        return res;
    }

    @Override
    public int deleteFrame(Frame fra) {
        int res = 0;
        res = frameDao.deleteFrame(fra);

        return res;
    }

    @Override
    public int updataFrame(Frame fra) {
        int res = 0;
        res = frameDao.updataFrame(fra);
        return res;
    }

    @Override
    public List<Frame> findAll() {
        List<Frame> res;
        res = frameDao.findAll();
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public List<Frame> findByModel(String model) {
        List<Frame> res;
        res = frameDao.findByModel(model);
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public Frame findDetail(String model) {
        Frame res;
        res = frameDao.findDetail(model);
        return res;
    }
}