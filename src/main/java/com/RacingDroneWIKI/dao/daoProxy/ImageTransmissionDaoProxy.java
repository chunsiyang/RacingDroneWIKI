package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.ImageTransmissionDao;
import com.RacingDroneWIKI.pojo.ImageTransmission;
import org.apache.ibatis.session.SqlSession;

public class ImageTransmissionDaoProxy implements ImageTransmissionDao {

	public int addImageTransmission(ImageTransmission im) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ImageTransmissionDao imageTransmissionDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ImageTransmissionDao.class);
			res=imageTransmissionDao.addImageTransmission(im);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deleteImageTransmission(ImageTransmission im) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ImageTransmissionDao imageTransmissionDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ImageTransmissionDao.class);
			res=imageTransmissionDao.deleteImageTransmission(im);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int updataImageTransmission(ImageTransmission im) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ImageTransmissionDao imageTransmissionDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ImageTransmissionDao.class);
			res=imageTransmissionDao.updataImageTransmission(im);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<ImageTransmission> findAll() {
		List<ImageTransmission> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ImageTransmissionDao imageTransmissionDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ImageTransmissionDao.class);
			res=imageTransmissionDao.findAll();
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<ImageTransmission> findByModel(String model) {
		List<ImageTransmission> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ImageTransmissionDao imageTransmissionDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ImageTransmissionDao.class);
			res=imageTransmissionDao.findByModel(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	@Override
	public ImageTransmission findDetail(String model) {
		ImageTransmission res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ImageTransmissionDao imageTransmissionDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ImageTransmissionDao.class);
			res=imageTransmissionDao.findDetail(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}
}