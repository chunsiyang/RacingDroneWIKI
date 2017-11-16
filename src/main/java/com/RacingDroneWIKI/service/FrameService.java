package com.RacingDroneWIKI.service;

import java.util.*;

import com.RacingDroneWIKI.dao.FrameDao;
import com.RacingDroneWIKI.pojo.Frame;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrameService implements FrameDao {
	@Autowired
	FrameDao frameDao;
	public int addFrame(Frame fra) {
		int res=0;
		res=frameDao.addFrame(fra);
		return res;
	}

	public int deleteFrame(Frame fra) {
		int res=0;
		res=frameDao.deleteFrame(fra);

		return res;
	}

	public int updataFrame(Frame fra) {
		int res=0;
		res=frameDao.updataFrame(fra);
		return res;
	}

	public List<Frame> findAll() {
		List<Frame> res;
		res=frameDao.findAll();
		if(res.isEmpty())
			return null;
		return res;
	}

	public List<Frame> findByModel(String model) {
		List<Frame> res;
		res=frameDao.findByModel(model);
		if(res.isEmpty())
			return null;
		return res;
	}

	public Frame findDetail(String model) {
		Frame res;
		res=frameDao.findDetail(model);
		return res;
	}
}