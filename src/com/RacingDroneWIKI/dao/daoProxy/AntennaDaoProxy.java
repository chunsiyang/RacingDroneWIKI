package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.AntennaDao;
import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.daoImpl.AntennaDaoImpl;
import com.RacingDroneWIKI.javaBean.Antenna;

public class AntennaDaoProxy implements AntennaDao {

	public boolean addAntenna(Antenna ant) {
		AntennaDaoImpl antDI=new AntennaDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.addAntenna(ant);
		DatabaseConnection.close();
		return 	res;
	}

	public boolean deleteAntenna(Antenna ant) {
		// TODO: implement
		return false;
	}

	public boolean updatAantenna(Antenna ant) {
		AntennaDaoImpl antDI=new AntennaDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.updatAantenna(ant);
		DatabaseConnection.close();
		return 	res;
	}

	public List<Antenna> findAll() {
		List<Antenna> res;
		AntennaDaoImpl ant=new AntennaDaoImpl(DatabaseConnection.getConnection());
		res=ant.findAll();
		DatabaseConnection.close();
		return res;
	}

	public List<Antenna> findByModel(String model) {
		List<Antenna> res;
		AntennaDaoImpl ant=new AntennaDaoImpl(DatabaseConnection.getConnection());
		res=ant.findByModel(model);
		DatabaseConnection.close();
		return res;
	}

}