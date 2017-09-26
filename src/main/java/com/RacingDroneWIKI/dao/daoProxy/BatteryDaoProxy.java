package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.BatteryDao;
import com.RacingDroneWIKI.pojo.Battery;
import org.apache.ibatis.session.SqlSession;

public class BatteryDaoProxy implements BatteryDao {



	public int addBattery(Battery battery) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			BatteryDao batteryDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.BatteryDao.class);
			res=batteryDao.addBattery(battery);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deleteBattery(Battery battery) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			BatteryDao batteryDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.BatteryDao.class);
			res=batteryDao.deleteBattery(battery);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int updataBattery(Battery battery) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			BatteryDao batteryDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.BatteryDao.class);
			res=batteryDao.updataBattery(battery);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<Battery> findAll() {
		List<Battery> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			BatteryDao batteryDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.BatteryDao.class);
			res=batteryDao.findAll();
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<Battery> findByModel(String model) {
		List<Battery> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			BatteryDao batteryDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.BatteryDao.class);
			res=batteryDao.findByModel(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public Battery findDetail(String model) {
		Battery res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			BatteryDao batteryDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.BatteryDao.class);
			res=batteryDao.findDetail(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}
}