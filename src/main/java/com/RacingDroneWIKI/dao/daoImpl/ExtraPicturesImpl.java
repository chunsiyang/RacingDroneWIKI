package com.RacingDroneWIKI.dao.daoImpl;

import com.RacingDroneWIKI.dao.dao.ExtraPictures;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by asus-pc on 2017/9/19.
 */
public class ExtraPicturesImpl implements ExtraPictures {
    private java.sql.Connection connection;

    public ExtraPicturesImpl(Connection connection) {
        super();
        this.connection = connection;
    }

    @Override
    public boolean addExtPic(String model, LinkedList<String> expImg) {
        String sql = "insert into racingdronewiki.extra_pictures (item_model,img_url) values(?,?);";
        PreparedStatement pstmt;
        try {
            Iterator<String> expImgIt = expImg.iterator();
            while (expImgIt.hasNext()) {
                pstmt = (PreparedStatement) connection.prepareStatement(sql);
                pstmt.setString(1, model);
                pstmt.setString(2, expImgIt.next());
                pstmt.executeUpdate();
                pstmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public LinkedList<String> getExtPic(String model) {
        String sql = "SELECT img_url FROM racingdronewiki.extra_pictures where item_model='" + model + "';";
        PreparedStatement pstmt;
        ResultSet resSet;
        LinkedList<String> expImg = new LinkedList();
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                expImg.add(resSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expImg;
    }
}
