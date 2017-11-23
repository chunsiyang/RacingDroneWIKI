package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.EfficacyChart;
import org.springframework.stereotype.Repository;

/**
 * 力效表DAO(Data Access Object) 数据访问对象
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Repository
public interface EfficacyChartDao {
    /**
     * @param efct
     * @return
     */
    int addEfficacyChart(EfficacyChart efct);

    /**
     * @param efct
     * @return
     */
    int deleteEfficacyChart(EfficacyChart efct);

    /**
     * @param efct
     * @return
     */
    int updataEfficacyChart(EfficacyChart efct);

    /**
     * @param model
     * @return
     */
    List<EfficacyChart> findByModel(String model);

}