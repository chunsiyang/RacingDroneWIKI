package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.ImageTransmissionDao;
import com.RacingDroneWIKI.pojo.ImageTransmission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Image transmission service.图传数据库相关服务
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Service
public class ImageTransmissionService implements ImageTransmissionDao {
    /**
     * The Image transmission dao.
     */
    @Autowired
    private ImageTransmissionDao imageTransmissionDao;

    @Override
    public int addImageTransmission(ImageTransmission im) {
        int res = 0;
        res = imageTransmissionDao.addImageTransmission(im);
        return res;
    }

    @Override
    public int deleteImageTransmission(ImageTransmission im) {
        int res = 0;
        res = imageTransmissionDao.deleteImageTransmission(im);
        return res;
    }

    @Override
    public int updataImageTransmission(ImageTransmission im) {
        int res = 0;
        res = imageTransmissionDao.updataImageTransmission(im);
        return res;
    }

    @Override
    public List<ImageTransmission> findAll() {
        List<ImageTransmission> res;
        res = imageTransmissionDao.findAll();
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public List<ImageTransmission> findByModel(String model) {
        List<ImageTransmission> res;
        res = imageTransmissionDao.findByModel(model);
        if (res.isEmpty()) {
            return null;
        }
        return res;
    }

    @Override
    public ImageTransmission findDetail(String model) {
        ImageTransmission res;
        res = imageTransmissionDao.findDetail(model);
        return res;
    }
}