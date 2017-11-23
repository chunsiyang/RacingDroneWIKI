package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.PowerHubDao;
import com.RacingDroneWIKI.pojo.PowerHub;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PowerHubService implements PowerHubDao {
	@Autowired
	PowerHubDao powerHubDao;
	public int addPowerHub(PowerHub ph) {
		int res=0;
		res=powerHubDao.addPowerHub(ph);
		return res;
	}

	public int deletPowerHub(PowerHub ph) {
		int res=0;
		res=powerHubDao.deletPowerHub(ph);
		return res;
	}

	public int updataPowerHub(PowerHub ph) {
		int res=0;
		res=powerHubDao.updataPowerHub(ph);
		return res;
	}

	public List<PowerHub> findAll() {
		List<PowerHub> res;
		res=powerHubDao.findAll();
		if(res.isEmpty())
			return null;
		return res;
	}

	public List<PowerHub> findByModel(String model) {
		List<PowerHub> res;
		res=powerHubDao.findByModel(model);
		if (res.isEmpty())
			return null;
		return res;
	}

	@Override
	public PowerHub findDetail(String model) {
		PowerHub res;
		res=powerHubDao.findDetail(model);
		return res;
	}
}