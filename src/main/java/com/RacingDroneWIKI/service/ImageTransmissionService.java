package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.ImageTransmissionDao;
import com.RacingDroneWIKI.pojo.ImageTransmission;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageTransmissionService implements ImageTransmissionDao {
	@Autowired
	ImageTransmissionDao imageTransmissionDao;
	public int addImageTransmission(ImageTransmission im) {
		int res=0;
		res=imageTransmissionDao.addImageTransmission(im);
		return res;
	}

	public int deleteImageTransmission(ImageTransmission im) {
		int res=0;
		res=imageTransmissionDao.deleteImageTransmission(im);
		return res;
	}

	public int updataImageTransmission(ImageTransmission im) {
		int res=0;
		res=imageTransmissionDao.updataImageTransmission(im);
		return res;
	}

	public List<ImageTransmission> findAll() {
		List<ImageTransmission> res;
		res=imageTransmissionDao.findAll();
		if(res.isEmpty())
			return null;
		return res;
	}

	public List<ImageTransmission> findByModel(String model) {
		List<ImageTransmission> res;
		res=imageTransmissionDao.findByModel(model);
		if(res.isEmpty())
			return null;
		return res;
	}

	@Override
	public ImageTransmission findDetail(String model) {
		ImageTransmission res;
		res=imageTransmissionDao.findDetail(model);
		return res;
	}
}