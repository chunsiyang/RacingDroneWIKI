package com.RacingDroneWIKI.dao;

import com.RacingDroneWIKI.pojo.Frame;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 机架DAO(Data Access Object) 数据访问对象
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Repository
public interface FrameDao {
    /**
     * @param fra
     * @return
     */
    int addFrame(Frame fra);

    /**
     * @param fra
     * @return
     */
    int deleteFrame(Frame fra);

    /**
     * @param fra
     * @return
     */
    int updataFrame(Frame fra);

    /**
     * @return
     */
    List<Frame> findAll();

    /**
     * @param model
     * @return
     */
    List<Frame> findByModel(String model);

    /**
     * @param model
     * @return
     */
    Frame findDetail(String model);
}