package com.RacingDroneWIKI.service;

import java.util.*;


import com.RacingDroneWIKI.dao.MotoDao;
import com.RacingDroneWIKI.pojo.Moto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class MotoService implements MotoDao {
	@Autowired
	MotoDao motoDao;
	public int addMoto(Moto moto) {
		int res=0;
		res=motoDao.addMoto(moto);
		return res;
	}

	public int deleteMoto(Moto moto) {
		int res=0;
		res=motoDao.deleteMoto(moto);
		return res;
	}

	public int updataMoto(Moto moto) {
		int res=0;
		res=motoDao.updataMoto(moto);
		return res;
	}

	public List<Moto> findAll() {
		List<Moto> res;
		res=motoDao.findAll();
		if(res.isEmpty())
			return null;
		return res;
	}

	public List<Moto> findByModel(String model) {
		List<Moto> res;
		res=motoDao.findByModel(model);
			if(res.isEmpty())
				return null;
		return res;
	}


	public Moto findDetail(String model) {
		Moto res;
		res=motoDao.findDetail(model);
		return res;
	}
}