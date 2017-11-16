package com.RacingDroneWIKI.dao.daoProxy;

import java.util.*;

import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.dao.ElectroSpeedRegulatorDao;
import com.RacingDroneWIKI.dao.daoImpl.ElectroSpeedRegulatorDaoImpl;
import com.RacingDroneWIKI.pojo.ElectroSpeedRegulator;

public class ElectroSpeedRegulatorDaoProxy implements ElectroSpeedRegulatorDao {

    public boolean addElectroSpeedRegulato(ElectroSpeedRegulator esc) {
        ElectroSpeedRegulatorDaoImpl antDI = new ElectroSpeedRegulatorDaoImpl(DatabaseConnection.getConnection());
        boolean res = antDI.addElectroSpeedRegulato(esc);
        DatabaseConnection.close();
        return res;
    }

    public boolean deleteElectroSpeedRegulato(ElectroSpeedRegulator esc) {
        // TODO: implement
        return false;
    }

    public boolean updataElectroSpeedRegulato(ElectroSpeedRegulator esc) {
        ElectroSpeedRegulatorDaoImpl antDI = new ElectroSpeedRegulatorDaoImpl(DatabaseConnection.getConnection());
        boolean res = antDI.updataElectroSpeedRegulato(esc);
        DatabaseConnection.close();
        return res;
    }

    public List<ElectroSpeedRegulator> findAll() {
        List<ElectroSpeedRegulator> res;
        ElectroSpeedRegulatorDaoImpl ant = new ElectroSpeedRegulatorDaoImpl(DatabaseConnection.getConnection());
        res = ant.findAll();
        DatabaseConnection.close();
        return res;
    }

    public List<ElectroSpeedRegulator> findByModel(String model) {
        List<ElectroSpeedRegulator> res;
        ElectroSpeedRegulatorDaoImpl ant = new ElectroSpeedRegulatorDaoImpl(DatabaseConnection.getConnection());
        res = ant.findByModel(model);
        DatabaseConnection.close();
        return res;
    }

    public List<ElectroSpeedRegulator> findAllUseAlone() {
        List<ElectroSpeedRegulator> res;
        ElectroSpeedRegulatorDaoImpl ant = new ElectroSpeedRegulatorDaoImpl(DatabaseConnection.getConnection());
        res = ant.findAllUseAlone();
        DatabaseConnection.close();
        return res;
    }

    public List<ElectroSpeedRegulator> findByModelUseAlone(String model) {
        List<ElectroSpeedRegulator> res;
        ElectroSpeedRegulatorDaoImpl ant = new ElectroSpeedRegulatorDaoImpl(DatabaseConnection.getConnection());
        res = ant.findByModelUseAlone(model);
        DatabaseConnection.close();
        return res;
    }

}