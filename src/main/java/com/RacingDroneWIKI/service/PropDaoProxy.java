package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.PropDao;
import com.RacingDroneWIKI.pojo.Prop;
import org.apache.ibatis.session.SqlSession;

public class PropDaoProxy implements PropDao {

	public int addProp(Prop prop) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PropDao propDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PropDao.class);
			res=propDao.addProp(prop);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deleteProp(Prop prop) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PropDao propDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PropDao.class);
			res=propDao.deleteProp(prop);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int updataProp(Prop prop) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PropDao propDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PropDao.class);
			res=propDao.updataProp(prop);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<Prop> findAll() {
		List<Prop> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PropDao propDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PropDao.class);
			res=propDao.findAll();
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

	public List<Prop> findByModel(String model) {
		List<Prop> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PropDao propDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PropDao.class);
			res=propDao.findByModel(model);
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
	public Prop findDetail(String model) {
		Prop res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			PropDao propDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.PropDao.class);
			res=propDao.findDetail(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}
}