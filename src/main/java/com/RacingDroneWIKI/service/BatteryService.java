package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.BatteryDao;
import com.RacingDroneWIKI.pojo.Battery;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;

@Service
public class BatteryService implements BatteryDao {
	@Autowired
	BatteryDao batteryDao;
	public int addBattery(Battery battery) {
		int res=0;
		res=batteryDao.addBattery(battery);
		return res;
	}

	public int deleteBattery(Battery battery) {
		int res=0;
		res=batteryDao.deleteBattery(battery);
		return res;
	}

	public int updataBattery(Battery battery) {
		int res=0;
		res=batteryDao.updataBattery(battery);
		return res;
	}

	public List<Battery> findAll() {
		List<Battery> res;
		res=batteryDao.findAll();
		if(res.isEmpty())
			return null;
		return res;
	}

	public List<Battery> findByModel(String model) {
		List<Battery> res;
		res=batteryDao.findByModel(model);
		if (res.isEmpty())
			return null;
		return res;
	}

	public Battery findDetail(String model) {
		Battery res;
		res=batteryDao.findDetail(model);
		return res;
	}
}