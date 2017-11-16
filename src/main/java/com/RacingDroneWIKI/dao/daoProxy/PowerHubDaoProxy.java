package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.dao.PowerHubDao;
import com.RacingDroneWIKI.dao.daoImpl.PowerHubDaoImpl;
import com.RacingDroneWIKI.pojo.PowerHub;

public class PowerHubDaoProxy implements PowerHubDao {

    public boolean addPowerHub(PowerHub ph) {
        PowerHubDaoImpl antDI = new PowerHubDaoImpl(DatabaseConnection.getConnection());
        boolean res = antDI.addPowerHub(ph);
        DatabaseConnection.close();
        return res;
    }

    public boolean deletPowerHub(PowerHub ph) {
        // TODO: implement
        return false;
    }

    public boolean updataPowerHub(PowerHub ph) {
        PowerHubDaoImpl antDI = new PowerHubDaoImpl(DatabaseConnection.getConnection());
        boolean res = antDI.updataPowerHub(ph);
        DatabaseConnection.close();
        return res;
    }

    public List<PowerHub> findAll() {
        List<PowerHub> res;
        PowerHubDaoImpl ant = new PowerHubDaoImpl(DatabaseConnection.getConnection());
        res = ant.findAll();
        DatabaseConnection.close();
        return res;
    }

    public List<PowerHub> findByModel(String model) {
        List<PowerHub> res;
        PowerHubDaoImpl ant = new PowerHubDaoImpl(DatabaseConnection.getConnection());
        res = ant.findByModel(model);
        DatabaseConnection.close();
        return res;
    }

    public List<PowerHub> findAllUseAlone() {
        List<PowerHub> res;
        PowerHubDaoImpl ant = new PowerHubDaoImpl(DatabaseConnection.getConnection());
        res = ant.findAllUseAlone();
        DatabaseConnection.close();
        return res;
    }

    public List<PowerHub> findByModelUseAlone(String model) {
        List<PowerHub> res;
        PowerHubDaoImpl ant = new PowerHubDaoImpl(DatabaseConnection.getConnection());
        res = ant.findByModelUseAlone(model);
        DatabaseConnection.close();
        return res;
    }

}