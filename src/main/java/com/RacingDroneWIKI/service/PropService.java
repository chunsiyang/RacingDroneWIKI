package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.PropDao;
import com.RacingDroneWIKI.pojo.Prop;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropService implements PropDao {
	@Autowired
	PropDao propDao;
	public int addProp(Prop prop) {
		int res=0;
		res=propDao.addProp(prop);
		return res;
	}

	public int deleteProp(Prop prop) {
		int res=0;
		res=propDao.deleteProp(prop);
		return res;
	}

	public int updataProp(Prop prop) {
		int res=0;
		res=propDao.updataProp(prop);
		return res;
	}

	public List<Prop> findAll() {
		List<Prop> res;
		res=propDao.findAll();
		if(res.isEmpty())
			return null;
		return res;
	}

	public List<Prop> findByModel(String model) {
		List<Prop> res;
		res=propDao.findByModel(model);
		if(res.isEmpty())
			return null;
		return res;
	}

	@Override
	public Prop findDetail(String model) {
		Prop res;
		res=propDao.findDetail(model);
		return res;
	}
}