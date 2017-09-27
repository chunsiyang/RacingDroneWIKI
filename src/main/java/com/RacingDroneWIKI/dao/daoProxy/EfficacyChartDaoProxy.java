package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.EfficacyChartDao;
import com.RacingDroneWIKI.pojo.EfficacyChart;
import org.apache.ibatis.session.SqlSession;

public class EfficacyChartDaoProxy implements EfficacyChartDao {

	public int addEfficacyChart(EfficacyChart efct) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			EfficacyChartDao efficacyChartDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.EfficacyChartDao.class);
			res=efficacyChartDao.addEfficacyChart(efct);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int deleteEfficacyChart(EfficacyChart efct) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			EfficacyChartDao efficacyChartDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.EfficacyChartDao.class);
			res=efficacyChartDao.deleteEfficacyChart(efct);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public int updataEfficacyChart(EfficacyChart efct) {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			EfficacyChartDao efficacyChartDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.EfficacyChartDao.class);
			res=efficacyChartDao.updataEfficacyChart(efct);
		}
		finally {
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return res;
	}

	public List<EfficacyChart> findByModel(String model) {
		List<EfficacyChart> res;
		SqlSession sqlSession=null;
		try {
			sqlSession=SqlSessionFactoryUtils.openSqlSession();
			EfficacyChartDao efficacyChartDao=sqlSession.getMapper(com.RacingDroneWIKI.dao.dao.EfficacyChartDao.class);
			res=efficacyChartDao.findByModel(model);
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