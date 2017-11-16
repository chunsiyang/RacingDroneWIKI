package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.AntennaDao;

import com.RacingDroneWIKI.pojo.Antenna;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AntennaService implements AntennaDao {
	@Autowired
	AntennaDao antennaDao;
	public int addAntenna(Antenna ant) {
		int res=0;
		res=antennaDao.addAntenna(ant);
		return res;
	}

	public int deleteAntenna(Antenna ant) {
		int res=0;
		res=antennaDao.deleteAntenna(ant);
		return res;
	}

	public int updatAantenna(Antenna ant) {
		int res=0;
		res=antennaDao.updatAantenna(ant);
		return res;
	}

	public Antenna findDetail(String model) {
		Antenna res;
		res=antennaDao.findDetail(model);
		return res;
	}
	public List<Antenna> findAll() {
		List<Antenna> res;
		res=antennaDao.findAll();
		if (res.isEmpty())
			return null;
		return res;
	}

	public List<Antenna> findByModel(String model) {
		List<Antenna> res;
		res=antennaDao.findByModel(model);
		if(res.isEmpty())
			return null;
		return res;
	}

}