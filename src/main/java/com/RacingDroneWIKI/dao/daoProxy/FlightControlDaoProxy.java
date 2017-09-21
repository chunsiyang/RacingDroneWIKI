package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.dao.FlightControlDao;
import com.RacingDroneWIKI.dao.daoImpl.FlightControlDaoImpl;
import com.RacingDroneWIKI.pojo.FlightControl;

public class FlightControlDaoProxy implements FlightControlDao {

	public boolean addFlightControl(FlightControl fc) {
		FlightControlDaoImpl antDI=new FlightControlDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.addFlightControl(fc);
		DatabaseConnection.close();
		return 	res;
	}

	public boolean deleteFlightControl(FlightControl fc) {
		// TODO: implement
		return false;
	}

	public boolean updataFlightControl(FlightControl fc) {
		FlightControlDaoImpl antDI=new FlightControlDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.updataFlightControl(fc);
		DatabaseConnection.close();
		return 	res;
	}

	public List<FlightControl> findAll() {
		List<FlightControl> res;
		FlightControlDaoImpl ant=new FlightControlDaoImpl(DatabaseConnection.getConnection());
		res=ant.findAll();
		DatabaseConnection.close();
		return res;
	}

	public List<FlightControl> findByModel(String model) {
		List<FlightControl> res;
		FlightControlDaoImpl ant=new FlightControlDaoImpl(DatabaseConnection.getConnection());
		res=ant.findByModel(model);
		DatabaseConnection.close();
		return res;
	}

}