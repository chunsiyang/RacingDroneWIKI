package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.PowerHubDao;
import com.RacingDroneWIKI.pojo.PowerHub;
import org.apache.ibatis.session.SqlSession;

public class PowerHubDaoProxy implements PowerHubDao {

	public int addPowerHub(PowerHub ph) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PowerHubDao powerHubDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PowerHubDao.class);
			res=powerHubDao.addPowerHub(ph);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deletPowerHub(PowerHub ph) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PowerHubDao powerHubDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PowerHubDao.class);
			res=powerHubDao.deletPowerHub(ph);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int updataPowerHub(PowerHub ph) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PowerHubDao powerHubDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PowerHubDao.class);
			res=powerHubDao.updataPowerHub(ph);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<PowerHub> findAll() {
		List<PowerHub> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PowerHubDao powerHubDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PowerHubDao.class);
			res=powerHubDao.findAll();
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<PowerHub> findByModel(String model) {
		List<PowerHub> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PowerHubDao powerHubDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PowerHubDao.class);
			res=powerHubDao.findByModel(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	@Override
	public PowerHub findDetail(String model) {
		PowerHub res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PowerHubDao powerHubDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PowerHubDao.class);
			res=powerHubDao.findDetail(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}
}