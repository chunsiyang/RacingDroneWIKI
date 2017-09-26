package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.AntennaDao;

import com.RacingDroneWIKI.pojo.Antenna;
import org.apache.ibatis.session.SqlSession;

public class AntennaDaoProxy implements AntennaDao {

	public int addAntenna(Antenna ant) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			AntennaDao antennaDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.AntennaDao.class);
			res=antennaDao.addAntenna(ant);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deleteAntenna(Antenna ant) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			AntennaDao antennaDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.AntennaDao.class);
			res=antennaDao.deleteAntenna(ant);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int updatAantenna(Antenna ant) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			AntennaDao antennaDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.AntennaDao.class);
			res=antennaDao.updatAantenna(ant);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public Antenna findDetail(String model) {
		Antenna res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			AntennaDao antennaDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.AntennaDao.class);
			res=antennaDao.findDetail(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}
	public List<Antenna> findAll() {
		List<Antenna> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			AntennaDao antennaDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.AntennaDao.class);
			res=antennaDao.findAll();
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<Antenna> findByModel(String model) {
		List<Antenna> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			AntennaDao antennaDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.AntennaDao.class);
			res=antennaDao.findByModel(model);
			if(res.isEmpty())
				return null;
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

}