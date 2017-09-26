package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.FlightControlDao;
import com.RacingDroneWIKI.pojo.FlightControl;
import org.apache.ibatis.session.SqlSession;

public class FlightControlDaoProxy implements FlightControlDao {

	public int addFlightControl(FlightControl fc) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FlightControlDao flightControlDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.FlightControlDao.class);
			res=flightControlDao.addFlightControl(fc);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deleteFlightControl(FlightControl fc) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FlightControlDao flightControlDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.FlightControlDao.class);
			res=flightControlDao.deleteFlightControl(fc);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}


	public int updataFlightControl(FlightControl fc) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FlightControlDao flightControlDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.FlightControlDao.class);
			res=flightControlDao.updataFlightControl(fc);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<FlightControl> findAll() {
		List<FlightControl> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FlightControlDao flightControlDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.FlightControlDao.class);
			res=flightControlDao.findAll();
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<FlightControl> findByModel(String model) {
		List<FlightControl> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FlightControlDao flightControlDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.FlightControlDao.class);
			res=flightControlDao.findByModel(model);
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
	public FlightControl findDetail(String model) {
		FlightControl res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			FlightControlDao flightControlDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.FlightControlDao.class);
			res=flightControlDao.findDetail(model);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}
}