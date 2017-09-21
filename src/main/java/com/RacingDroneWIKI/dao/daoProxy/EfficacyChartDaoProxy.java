package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.dao.EfficacyChartDao;
import com.RacingDroneWIKI.dao.daoImpl.EfficacyChartDaoImpl;
import com.RacingDroneWIKI.pojo.EfficacyChart;

public class EfficacyChartDaoProxy implements EfficacyChartDao {

	public boolean addEfficacyChart(EfficacyChart efct) {
		EfficacyChartDaoImpl antDI=new EfficacyChartDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.addEfficacyChart(efct);
		DatabaseConnection.close();
		return 	res;
	}

	public boolean deleteEfficacyChart(EfficacyChart efct) {
		// TODO: implement
		return false;
	}

	public boolean updataMoto(EfficacyChart efct) {
		EfficacyChartDaoImpl antDI=new EfficacyChartDaoImpl(DatabaseConnection.getConnection());
		boolean res=antDI.updataMoto(efct);
		DatabaseConnection.close();
		return 	res;
	}

	public List<EfficacyChart> findAll() {
		List<EfficacyChart> res;
		EfficacyChartDaoImpl ant=new EfficacyChartDaoImpl(DatabaseConnection.getConnection());
		res=ant.findAll();
		DatabaseConnection.close();
		return res;
	}

	public List<EfficacyChart> findByModel(String model) {
		List<EfficacyChart> res;
		EfficacyChartDaoImpl ant=new EfficacyChartDaoImpl(DatabaseConnection.getConnection());
		res=ant.findByModel(model);
		DatabaseConnection.close();
		return res;
	}

}