package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.CamDao;
import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.daoImpl.CamDaoImpl;
import com.RacingDroneWIKI.pojo.Cam;

public class CamDAOProxy implements CamDao {

    public boolean addCam(Cam cam) {
        CamDaoImpl antDI = new CamDaoImpl(DatabaseConnection.getConnection());
        boolean res = antDI.addCam(cam);
        DatabaseConnection.close();
        return res;
    }

    public boolean deleteCam(Cam cam) {
        // TODO: implement
        return false;
    }

    public boolean updataCam(Cam cam) {
        CamDaoImpl antDI = new CamDaoImpl(DatabaseConnection.getConnection());
        boolean res = antDI.updataCam(cam);
        DatabaseConnection.close();
        return res;
    }

    public List<Cam> findAll() {
        List<Cam> res;
        CamDaoImpl ant = new CamDaoImpl(DatabaseConnection.getConnection());
        res = ant.findAll();
        DatabaseConnection.close();
        return res;
    }

    public List<Cam> findByModel(String model) {
        List<Cam> res;
        CamDaoImpl ant = new CamDaoImpl(DatabaseConnection.getConnection());
        res = ant.findByModel(model);
        DatabaseConnection.close();
        return res;
    }

    public List<Cam> findAllUseAlone() {
        List<Cam> res;
        CamDaoImpl ant = new CamDaoImpl(DatabaseConnection.getConnection());
        res = ant.findAllUseAlone();
        DatabaseConnection.close();
        return res;
    }

    public List<Cam> findByModelUseAlone(String model) {
        List<Cam> res;
        CamDaoImpl ant = new CamDaoImpl(DatabaseConnection.getConnection());
        res = ant.findByModelUseAlone(model);
        DatabaseConnection.close();
        return res;
    }

}