package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;


import com.RacingDroneWIKI.dao.dao.ElectroSpeedRegulatorDao;
import com.RacingDroneWIKI.pojo.ElectroSpeedRegulator;
import org.apache.ibatis.session.SqlSession;

public class ElectroSpeedRegulatorDaoProxy implements ElectroSpeedRegulatorDao {

	public int addElectroSpeedRegulato(ElectroSpeedRegulator esc) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ElectroSpeedRegulatorDao electroSpeedRegulatorDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ElectroSpeedRegulatorDao.class);
			res=electroSpeedRegulatorDao.addElectroSpeedRegulato(esc);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deleteElectroSpeedRegulato(ElectroSpeedRegulator esc) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ElectroSpeedRegulatorDao electroSpeedRegulatorDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ElectroSpeedRegulatorDao.class);
			res=electroSpeedRegulatorDao.deleteElectroSpeedRegulato(esc);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int updataElectroSpeedRegulato(ElectroSpeedRegulator esc) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ElectroSpeedRegulatorDao electroSpeedRegulatorDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ElectroSpeedRegulatorDao.class);
			res=electroSpeedRegulatorDao.updataElectroSpeedRegulato(esc);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<ElectroSpeedRegulator> findAll() {
		List<ElectroSpeedRegulator> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ElectroSpeedRegulatorDao electroSpeedRegulatorDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ElectroSpeedRegulatorDao.class);
			res=electroSpeedRegulatorDao.findAll();
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<ElectroSpeedRegulator> findByModel(String model) {
		List<ElectroSpeedRegulator> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ElectroSpeedRegulatorDao electroSpeedRegulatorDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ElectroSpeedRegulatorDao.class);
			res=electroSpeedRegulatorDao.findByModel(model);
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

	@Override
	public ElectroSpeedRegulator findDetail(String model) {
		ElectroSpeedRegulator res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			ElectroSpeedRegulatorDao electroSpeedRegulatorDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.ElectroSpeedRegulatorDao.class);
			res=electroSpeedRegulatorDao.findDetail(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}
}