package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.dao.PropDao;
import com.RacingDroneWIKI.dao.daoImpl.PropDaoImpl;
import com.RacingDroneWIKI.javaBean.Prop;

public class PropDaoProxy implements PropDao {

	public boolean addProp(Prop prop) {
		PropDaoImpl antDI=new PropDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.addProp(prop);
		DatabaseConnection.close();
		return 	res;
	}

	public boolean deleteProp(Prop prop) {
		// TODO: implement
		return false;
	}

	public boolean updataProp(Prop prop) {
		PropDaoImpl antDI=new PropDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.updataProp(prop);
		DatabaseConnection.close();
		return 	res;
	}

	public List<Prop> findAll() {
		List<Prop> res;
		PropDaoImpl ant=new PropDaoImpl(DatabaseConnection.getConnection());
		res=ant.findAll();
		DatabaseConnection.close();
		return res;
	}

	public List<Prop> findByModel(String model) {
		List<Prop> res;
		PropDaoImpl ant=new PropDaoImpl(DatabaseConnection.getConnection());
		res=ant.findByModel(model);
		DatabaseConnection.close();
		return res;
	}

}