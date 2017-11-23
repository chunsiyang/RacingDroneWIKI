package com.RacingDroneWIKI.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.FlightControl;
import org.springframework.stereotype.Repository;

/**
 * 飞控DAO(Data Access Object) 数据访问对象
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Repository
public interface FlightControlDao {
    /**
     * @param fc
     * @return
     */
    int addFlightControl(FlightControl fc);

    /**
     * @param fc
     * @return
     */
    int deleteFlightControl(FlightControl fc);

    /**
     * @param fc
     * @return
     */
    int updataFlightControl(FlightControl fc);

    /**
     * @return
     */
    List<FlightControl> findAll();

    /**
     * @param model
     * @return
     */
    List<FlightControl> findByModel(String model);

    /**
     * @param model
     * @return
     */
    FlightControl findDetail(String model);
}