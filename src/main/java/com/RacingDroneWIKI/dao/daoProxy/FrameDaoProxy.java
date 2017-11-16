package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.dao.FrameDao;
import com.RacingDroneWIKI.dao.daoImpl.FrameDaoImpl;
import com.RacingDroneWIKI.pojo.Frame;

public class FrameDaoProxy implements FrameDao {

    public boolean addFrame(Frame fra) {
        FrameDaoImpl antDI = new FrameDaoImpl(DatabaseConnection.getConnection());
        boolean res = antDI.addFrame(fra);
        DatabaseConnection.close();
        return res;
    }

    public boolean deleteFrame(Frame fra) {
        // TODO: implement
        return false;
    }

    public boolean updataFrame(Frame fra) {
        FrameDaoImpl antDI = new FrameDaoImpl(DatabaseConnection.getConnection());
        boolean res = antDI.updataFrame(fra);
        DatabaseConnection.close();
        return res;
    }

    public List<Frame> findAll() {
        List<Frame> res;
        FrameDaoImpl ant = new FrameDaoImpl(DatabaseConnection.getConnection());
        res = ant.findAll();
        DatabaseConnection.close();
        return res;
    }

    public List<Frame> findByModel(String model) {
        List<Frame> res;
        FrameDaoImpl ant = new FrameDaoImpl(DatabaseConnection.getConnection());
        res = ant.findByModel(model);
        DatabaseConnection.close();
        return res;
    }

}