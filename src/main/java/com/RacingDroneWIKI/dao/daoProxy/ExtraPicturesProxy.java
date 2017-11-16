package com.RacingDroneWIKI.dao.daoProxy;

import com.RacingDroneWIKI.dao.dao.DatabaseConnection;
import com.RacingDroneWIKI.dao.dao.ExtraPictures;
import com.RacingDroneWIKI.dao.daoImpl.ExtraPicturesImpl;

import java.util.LinkedList;

/**
 * Created by asus-pc on 2017/9/19.
 */
public class ExtraPicturesProxy implements ExtraPictures {
    @Override
    public LinkedList<String> getExtPic(String model) {
        ExtraPicturesImpl extraPictures = new ExtraPicturesImpl(DatabaseConnection.getConnection());
        LinkedList<String> res = extraPictures.getExtPic(model);
        DatabaseConnection.close();
        return res;
    }

    @Override
    public boolean addExtPic(String model, LinkedList<String> expImg) {
        ExtraPicturesImpl extraPictures = new ExtraPicturesImpl(DatabaseConnection.getConnection());
        boolean res = extraPictures.addExtPic(model, expImg);
        DatabaseConnection.close();
        return res;
    }
}
