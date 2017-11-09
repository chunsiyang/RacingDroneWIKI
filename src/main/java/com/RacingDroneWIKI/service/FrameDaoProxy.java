package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.FrameDao;
import com.RacingDroneWIKI.pojo.Frame;
import org.apache.ibatis.session.SqlSession;

public class FrameDaoProxy implements FrameDao {

	public int addFrame(Frame fra) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FrameDao frameDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.FrameDao.class);
			res=frameDao.addFrame(fra);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deleteFrame(Frame fra) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FrameDao frameDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.FrameDao.class);
			res=frameDao.deleteFrame(fra);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int updataFrame(Frame fra) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FrameDao frameDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.FrameDao.class);
			res=frameDao.updataFrame(fra);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<Frame> findAll() {
		List<Frame> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FrameDao frameDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.FrameDao.class);
			res=frameDao.findAll();
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

	public List<Frame> findByModel(String model) {
		List<Frame> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FrameDao frameDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.FrameDao.class);
			res=frameDao.findByModel(model);
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
	public Frame findDetail(String model) {
		Frame res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FrameDao frameDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.FrameDao.class);
			res=frameDao.findDetail(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}
}