package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.BatteryDao;
import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.daoImpl.BatteryDaoImpl;
import com.RacingDroneWIKI.pojo.Battery;

public class BatteryDaoProxy implements BatteryDao {

	public boolean addBattery(Battery battery) {
		BatteryDaoImpl antDI=new BatteryDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.addBattery(battery);
		DatabaseConnection.close();
		return 	res;
	}

	public boolean deleteBattery(Battery battery) {
		// TODO: implement
		return false;
	}

	public boolean updataBattery(Battery battery) {
		BatteryDaoImpl antDI=new BatteryDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.updataBattery(battery);
		DatabaseConnection.close();
		return 	res;
	}

	public List<Battery> findAll() {
		List<Battery> res;
		BatteryDaoImpl ant=new BatteryDaoImpl(DatabaseConnection.getConnection());
		res=ant.findAll();
		DatabaseConnection.close();
		return res;
	}

	public List<Battery> findByModel(String model) {
		List<Battery> res;
		BatteryDaoImpl ant=new BatteryDaoImpl(DatabaseConnection.getConnection());
		res=ant.findByModel(model);
		DatabaseConnection.close();
		return res;
	}

}