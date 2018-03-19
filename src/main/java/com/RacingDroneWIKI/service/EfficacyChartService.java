package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.EfficacyChartDao;
import com.RacingDroneWIKI.pojo.EfficacyChart;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Efficacy chart service.力效表数据库相关服务
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class EfficacyChartService implements EfficacyChartDao {
    /**
     * The Efficacy chart dao.
     */
    @Autowired
    private EfficacyChartDao efficacyChartDao;

    @Override
    public int addEfficacyChart(EfficacyChart efct) {
        int res = 0;
        res = efficacyChartDao.addEfficacyChart(efct);
        return res;
    }

    @Override
    public int deleteEfficacyChart(EfficacyChart efct) {
        int res = 0;
        res = efficacyChartDao.deleteEfficacyChart(efct);
        return res;
    }

    @Override
    public int updataEfficacyChart(EfficacyChart efct) {
        int res = 0;
        res = efficacyChartDao.updataEfficacyChart(efct);
        return res;
    }

    @Override
    public List<EfficacyChart> findByModel(String model) {
        List<EfficacyChart> res;
        res = efficacyChartDao.findByModel(model);
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

}