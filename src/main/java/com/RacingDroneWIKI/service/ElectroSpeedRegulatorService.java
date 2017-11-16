package com.RacingDroneWIKI.service;

import java.util.*;


import com.RacingDroneWIKI.dao.ElectroSpeedRegulatorDao;
import com.RacingDroneWIKI.pojo.ElectroSpeedRegulator;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectroSpeedRegulatorService implements ElectroSpeedRegulatorDao {

	@Autowired
	ElectroSpeedRegulatorDao electroSpeedRegulatorDao;
	public int addElectroSpeedRegulato(ElectroSpeedRegulator esc) {
		int res=0;
		res=electroSpeedRegulatorDao.addElectroSpeedRegulato(esc);
		return res;
	}

	public int deleteElectroSpeedRegulato(ElectroSpeedRegulator esc) {
		int res=0;
		res=electroSpeedRegulatorDao.deleteElectroSpeedRegulato(esc);
		return res;
	}

	public int updataElectroSpeedRegulato(ElectroSpeedRegulator esc) {
		int res=0;
		res=electroSpeedRegulatorDao.updataElectroSpeedRegulato(esc);
		return res;
	}

	public List<ElectroSpeedRegulator> findAll() {
		List<ElectroSpeedRegulator> res;
		SqlSession sqlSession=null;
		res=electroSpeedRegulatorDao.findAll();
		if(res.isEmpty())
			return null;
		return res;
	}

	public List<ElectroSpeedRegulator> findByModel(String model) {
		List<ElectroSpeedRegulator> res;
		res=electroSpeedRegulatorDao.findByModel(model);
		if(res.isEmpty())
			return null;
		return res;
	}

	public ElectroSpeedRegulator findDetail(String model) {
		ElectroSpeedRegulator res;
		res=electroSpeedRegulatorDao.findDetail(model);
		return res;
	}
}