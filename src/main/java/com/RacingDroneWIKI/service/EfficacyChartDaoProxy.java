package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.EfficacyChartDao;
import com.RacingDroneWIKI.pojo.EfficacyChart;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EfficacyChartDaoProxy implements EfficacyChartDao {
	@Autowired
	EfficacyChartDao efficacyChartDao;
	public int addEfficacyChart(EfficacyChart efct) {
		int res=0;
		res=efficacyChartDao.addEfficacyChart(efct);
		return res;
	}

	public int deleteEfficacyChart(EfficacyChart efct) {
		int res=0;
		res=efficacyChartDao.deleteEfficacyChart(efct);
		return res;
	}

	public int updataEfficacyChart(EfficacyChart efct) {
		int res=0;
		res=efficacyChartDao.updataEfficacyChart(efct);
		return res;
	}

	public List<EfficacyChart> findByModel(String model) {
		List<EfficacyChart> res;
		res=efficacyChartDao.findByModel(model);
		if (res.isEmpty())
			return null;
		return res;
	}

}