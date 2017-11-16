package com.RacingDroneWIKI.dao.dao;

import java.util.*;

import com.RacingDroneWIKI.pojo.ImageTransmission;

/**
 * @author user
 */

/**
 * @author user
 *
 */
public interface ImageTransmissionDao {
    /**
     * @param im
     * @return
     */
    boolean addImageTransmission(ImageTransmission im);

    /**
     * @param im
     * @return
     */
    boolean deleteImageTransmission(ImageTransmission im);

    /**
     * @param im
     * @return
     */
    boolean updataImageTransmission(ImageTransmission im);

    /**
     * @return
     */
    List<ImageTransmission> findAll();

    /**
     * @param model
     * @return
     */
    List<ImageTransmission> findByModel(String model);

    /**
     * @return
     */
    List<ImageTransmission> findAllUseAlone();

    /**
     * @param model
     * @return
     */
    List<ImageTransmission> findByModelUseAlone(String model);

}