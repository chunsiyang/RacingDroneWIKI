package com.RacingDroneWIKI.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.RacingDroneWIKI.dao.dao.PropDao;
import com.RacingDroneWIKI.pojo.Prop;

public class PropDaoImpl implements PropDao {
    private java.sql.Connection connection;

    public PropDaoImpl(Connection connection) {
        super();
        this.connection = connection;
    }

    public boolean addProp(Prop prop) {
        String sql = "INSERT INTO `racingdronewiki`.`prop` (`prop_model`,"
                + " `prop_img`, `prop_reference_price`, `prop_anufacturer`, "
                + "`prop_blade_number`, `prop_size`, `prop_weight`, "
                + "`prop_mounting_hole_spacing`, `prop_material`, "
                + " `prop_caption`) VALUES ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            pstmt.setString(1, prop.getModel());
            pstmt.setString(2, prop.getImgUrl());
            pstmt.setInt(3, prop.getReferencePrice());
            pstmt.setString(4, prop.getAnufacturer());
            pstmt.setInt(5, prop.getBladeNumber());
            pstmt.setString(6, prop.getSize());
            pstmt.setFloat(7, prop.getWeight());
            pstmt.setFloat(8, prop.getMountingHoleSpacing());
            pstmt.setString(9, prop.getMaterial());
            pstmt.setString(10, prop.getCaption());
            pstmt.executeUpdate();
            pstmt.close();
            new ExtraPicturesImpl(connection).addExtPic(prop.getModel(), prop.getExtraPictures());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean deleteProp(Prop prop) {
        // TODO: implement
        return false;
    }

    public boolean updataProp(Prop prop) {
        String sql = "UPDATE `racingdronewiki`.`prop` SET `prop_model`=?, "
                + "`prop_img`=?, `prop_reference_price`=?, `prop_anufacturer`=?,"
                + " `prop_blade_number`=?, `prop_size`=?, `prop_weight`=?,"
                + " `prop_mounting_hole_spacing`=?, `prop_material`=?,"
                + " `prop_caption`=? WHERE `prop_model`=?;";

        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            pstmt.setString(1, prop.getModel());
            pstmt.setString(2, prop.getImgUrl());
            pstmt.setInt(3, prop.getReferencePrice());
            pstmt.setString(4, prop.getAnufacturer());
            pstmt.setInt(5, prop.getBladeNumber());
            pstmt.setString(6, prop.getSize());
            pstmt.setFloat(7, prop.getWeight());
            pstmt.setFloat(8, prop.getMountingHoleSpacing());
            pstmt.setString(9, prop.getMaterial());
            pstmt.setString(10, prop.getCaption());
            pstmt.setString(11, prop.getModel());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public List<Prop> findAll() {
        PreparedStatement pstmt;
        ResultSet resSet;
        List<Prop> result = new LinkedList<>();
        String sql = "SELECT * FROM racingdronewiki.prop;";
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                Prop prop = new Prop(resSet.getString(1), resSet.getString(2),
                        resSet.getInt(3), resSet.getString(4),
                        null, resSet.getString(10),
                        resSet.getInt(5), resSet.getString(6),
                        resSet.getFloat(7), resSet.getFloat(8),
                        resSet.getString(9));
                LinkedList<String> expImg = new ExtraPicturesImpl(connection).getExtPic(prop.getModel());
                prop.setExtraPictures(expImg);
                result.add(prop);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!result.iterator().hasNext())
            return null;
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Prop> findByModel(String model) {
        PreparedStatement pstmt;
        ResultSet resSet;
        List<Prop> result = new LinkedList<>();
        String sql = "SELECT * FROM racingdronewiki.prop WHERE `prop_model`like '%" + model + "%';";
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                Prop prop = new Prop(resSet.getString(1), resSet.getString(2),
                        resSet.getInt(3), resSet.getString(4),
                        null, resSet.getString(10),
                        resSet.getInt(5), resSet.getString(6),
                        resSet.getFloat(7), resSet.getFloat(8),
                        resSet.getString(9));
                LinkedList<String> expImg = new ExtraPicturesImpl(connection).getExtPic(prop.getModel());
                prop.setExtraPictures(expImg);
                result.add(prop);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!result.iterator().hasNext())
            return null;
        return result;
    }

}