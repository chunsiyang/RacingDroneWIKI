package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.dao.ImageTransmissionDao;
import com.RacingDroneWIKI.dao.daoImpl.ImageTransmissionDaoImpl;
import com.RacingDroneWIKI.javaBean.ImageTransmission;

public class ImageTransmissionDaoProxy implements ImageTransmissionDao {

	public boolean addImageTransmission(ImageTransmission im) {
		ImageTransmissionDaoImpl antDI=new ImageTransmissionDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.addImageTransmission(im);
		DatabaseConnection.close();
		return 	res;
	}

	public boolean deleteImageTransmission(ImageTransmission im) {
		// TODO: implement
		return false;
	}

	public boolean updataImageTransmission(ImageTransmission im) {
		ImageTransmissionDaoImpl antDI=new ImageTransmissionDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.updataImageTransmission(im);
		DatabaseConnection.close();
		return 	res;
	}

	public List<ImageTransmission> findAll() {
		List<ImageTransmission> res;
		ImageTransmissionDaoImpl ant=new ImageTransmissionDaoImpl(DatabaseConnection.getConnection());
		res=ant.findAll();
		DatabaseConnection.close();
		return res;
	}

	public List<ImageTransmission> findByModel(String model) {
		List<ImageTransmission> res;
		ImageTransmissionDaoImpl ant=new ImageTransmissionDaoImpl(DatabaseConnection.getConnection());
		res=ant.findByModel(model);
		DatabaseConnection.close();
		return res;
	}
	public List<ImageTransmission> findAllUseAlone() {
		List<ImageTransmission> res;
		ImageTransmissionDaoImpl ant=new ImageTransmissionDaoImpl(DatabaseConnection.getConnection());
		res=ant.findAllUseAlone();
		DatabaseConnection.close();
		return res;
	}

	public List<ImageTransmission> findByModelUseAlone(String model) {
		List<ImageTransmission> res;
		ImageTransmissionDaoImpl ant=new ImageTransmissionDaoImpl(DatabaseConnection.getConnection());
		res=ant.findByModelUseAlone(model);
		DatabaseConnection.close();
		return res;
	}

}