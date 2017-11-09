package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.CamDao;
import com.RacingDroneWIKI.pojo.Cam;
import org.apache.ibatis.session.SqlSession;

public class CamDAOProxy implements CamDao {

	public int addCam(Cam cam) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			CamDao camDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.CamDao.class);
			res=camDao.addCam(cam);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deleteCam(Cam cam) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			CamDao camDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.CamDao.class);
			res=camDao.deleteCam(cam);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int updataCam(Cam cam) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			CamDao camDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.CamDao.class);
			res=camDao.updataCam(cam);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<Cam> findAll() {
		List<Cam> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			CamDao camDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.CamDao.class);
			res=camDao.findAll();
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<Cam> findByModel(String model) {
		List<Cam> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			CamDao camDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.CamDao.class);
			res=camDao.findByModel(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	@Override
	public Cam findDetail(String model) {
		Cam res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			CamDao camDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.CamDao.class);
			res=camDao.findDetail(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

}