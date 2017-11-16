package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.Cam;

/**
 * @author user
 */
public interface CamDao {
    /**
     * @param cam
     * @return
     */
    boolean addCam(Cam cam);

    /**
     * @param cam
     * @return
     */
    boolean deleteCam(Cam cam);

    /**
     * @param cam
     * @return
     */
    boolean updataCam(Cam cam);

    /**
     * @return
     */
    List<Cam> findAll();

    /**
     * @return
     */
    List<Cam> findAllUseAlone();

    /**
     * @param model
     * @return
     */
    List<Cam> findByModel(String model);

    /**
     * @param model
     * @return
     */
    List<Cam> findByModelUseAlone(String model);
}