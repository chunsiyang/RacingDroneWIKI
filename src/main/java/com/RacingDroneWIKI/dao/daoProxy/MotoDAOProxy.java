package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.dao.MotoDao;
import com.RacingDroneWIKI.dao.daoImpl.MotoDaoImpl;
import com.RacingDroneWIKI.pojo.Moto;

public class MotoDAOProxy implements MotoDao {

    public boolean addMoto(Moto moto) {
        MotoDaoImpl antDI = new MotoDaoImpl(DatabaseConnection.getConnection());
        boolean res = antDI.addMoto(moto);
        DatabaseConnection.close();
        return res;
    }

    public boolean deleteMoto(Moto moto) {
        // TODO: implement
        return false;
    }

    public boolean updataMoto(Moto moto) {
        MotoDaoImpl antDI = new MotoDaoImpl(DatabaseConnection.getConnection());
        boolean res = antDI.updataMoto(moto);
        DatabaseConnection.close();
        return res;
    }

    public List<Moto> findAll() {
        List<Moto> res;
        MotoDaoImpl ant = new MotoDaoImpl(DatabaseConnection.getConnection());
        res = ant.findAll();
        DatabaseConnection.close();
        return res;
    }

    public List<Moto> findByModel(String model) {
        List<Moto> res;
        MotoDaoImpl ant = new MotoDaoImpl(DatabaseConnection.getConnection());
        res = ant.findByModel(model);
        DatabaseConnection.close();
        return res;
    }

}