package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;


import com.RacingDroneWIKI.dao.dao.MotoDao;
import com.RacingDroneWIKI.pojo.Moto;
import org.apache.ibatis.session.SqlSession;

public class MotoDAOProxy implements MotoDao {

	public int addMoto(Moto moto) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			MotoDao motoDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.MotoDao.class);
			res=motoDao.addMoto(moto);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deleteMoto(Moto moto) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			MotoDao motoDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.MotoDao.class);
			res=motoDao.deleteMoto(moto);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int updataMoto(Moto moto) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			MotoDao motoDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.MotoDao.class);
			res=motoDao.updataMoto(moto);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<Moto> findAll() {
		List<Moto> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			MotoDao motoDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.MotoDao.class);
			res=motoDao.findAll();
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

	public List<Moto> findByModel(String model) {
		List<Moto> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			MotoDao motoDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.MotoDao.class);
			res=motoDao.findByModel(model);
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
	public Moto findDetail(String model) {
		Moto res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			MotoDao motoDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.MotoDao.class);
			res=motoDao.findDetail(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}
}