package com.RacingDroneWIKI.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.RacingDroneWIKI.dao.dao.CamDao;
import com.RacingDroneWIKI.pojo.Cam;

public class CamDaoImpl implements CamDao {
    private java.sql.Connection connection;

    public CamDaoImpl(Connection connection) {
        super();
        this.connection = connection;
    }

    public boolean addCam(Cam cam) {
        String sql = "INSERT INTO `racingdronewiki`.`camera` " + "(`cam_model`, `cam_use_alone`, "
                + "`cam_img`, `cam_reference_price`," + " `cam_anufacturer`, `cam_weight`, "
                + "`cam_length`, `cam_width`, `cam_thickness`," + " `cam_image_sensor`, `cam_horizontal_resolution`,"
                + " `cam_lens_fov`, `cam_signal_system`, `cam_integrated_osd`,"
                + " `cam_integrated_mic`, `cam_s_n_ratio`, "
                + "`cam_electronic_shutter_speed`, `cam_auto_gain_control`,"
                + " `cam_back_light_compensation`, `cam_min_illumination`, "
                + "`cam_w_d_r`, `cam_d_n_r`, `cam_day_night`, `cam_input_voltages`, "
                + "`cam_housing_material`, `cam_caption`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            pstmt.setString(1, cam.getModel());
            pstmt.setBoolean(2, cam.isUseAlone());
            pstmt.setString(3, cam.getImgUrl());
            pstmt.setInt(4, cam.getReferencePrice());
            pstmt.setString(5, cam.getAnufacturer());
            pstmt.setFloat(6, cam.getWeight());
            pstmt.setFloat(7, cam.getLength());
            pstmt.setFloat(8, cam.getWidth());
            pstmt.setFloat(9, cam.getThickness());
            pstmt.setString(10, cam.getImageSensor());
            pstmt.setInt(11, cam.getHorizontalResolustion());
            pstmt.setInt(12, cam.getLensFov());
            pstmt.setString(13, cam.getSignalSystem());
            pstmt.setBoolean(14, cam.isIntegratedOsd());
            pstmt.setBoolean(15, cam.isIntegratedMic());
            pstmt.setString(16, cam.getSnRatio());
            pstmt.setString(17, cam.getElectronicShutterSpeed());
            pstmt.setBoolean(18, cam.isAutoGainControl());
            pstmt.setBoolean(19, cam.isBackLightCompensation());
            pstmt.setString(20, cam.getMinIllumination());
            pstmt.setString(21, cam.getWdr());
            pstmt.setString(22, cam.getDnr());
            pstmt.setString(23, cam.getDayNight());
            pstmt.setString(24, cam.getInputVoltages());
            pstmt.setString(25, cam.getHousingMasterial());
            pstmt.setString(26, cam.getCaption());
            pstmt.executeUpdate();
            pstmt.close();
            new ExtraPicturesImpl(connection).addExtPic(cam.getModel(), cam.getExtraPictures());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean deleteCam(Cam cam) {
        // TODO: implement
        return false;
    }

    public boolean updataCam(Cam cam) {
        String sql = "UPDATE `racingdronewiki`.`camera` SET `" + "cam_model`=?, `cam_use_alone`=?,`cam_img`=?,"
                + " `cam_reference_price`=?, `cam_anufacturer`=?, " + "`cam_weight`=?, `cam_length`=?, `cam_width`=?, "
                + "`cam_thickness`=?, `cam_image_sensor`=?, " + "`cam_horizontal_resolution`=?, `cam_lens_fov`=?, "
                + "`cam_signal_system`=?, `cam_integrated_osd`=?," + " `cam_integrated_mic`=?, `cam_s_n_ratio`=?, "
                + "`cam_electronic_shutter_speed`=?, `cam_auto_gain_control`=?,"
                + " `cam_back_light_compensation`=?, `cam_min_illumination`=?, "
                + "`cam_w_d_r`=?, `cam_d_n_r`=?, `cam_day_night`=?,"
                + " `cam_input_voltages`=?, `cam_housing_material`=?, "
                + " `cam_caption`=? WHERE " + "`cam_model`=?;";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            pstmt.setString(1, cam.getModel());
            pstmt.setBoolean(2, cam.isUseAlone());
            pstmt.setString(3, cam.getImgUrl());
            pstmt.setInt(4, cam.getReferencePrice());
            pstmt.setString(5, cam.getAnufacturer());
            pstmt.setFloat(6, cam.getWeight());
            pstmt.setFloat(7, cam.getLength());
            pstmt.setFloat(8, cam.getWidth());
            pstmt.setFloat(9, cam.getThickness());
            pstmt.setString(10, cam.getImageSensor());
            pstmt.setInt(11, cam.getHorizontalResolustion());
            pstmt.setInt(12, cam.getLensFov());
            pstmt.setString(13, cam.getSignalSystem());
            pstmt.setBoolean(14, cam.isIntegratedOsd());
            pstmt.setBoolean(15, cam.isIntegratedMic());
            pstmt.setString(16, cam.getSnRatio());
            pstmt.setString(17, cam.getElectronicShutterSpeed());
            pstmt.setBoolean(18, cam.isAutoGainControl());
            pstmt.setBoolean(19, cam.isBackLightCompensation());
            pstmt.setString(20, cam.getMinIllumination());
            pstmt.setString(21, cam.getWdr());
            pstmt.setString(22, cam.getDnr());
            pstmt.setString(23, cam.getDayNight());
            pstmt.setString(24, cam.getInputVoltages());
            pstmt.setString(25, cam.getHousingMasterial());
            pstmt.setString(26, cam.getCaption());
            pstmt.setString(27, cam.getModel());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public List<Cam> findAll() {
        PreparedStatement pstmt;
        ResultSet resSet;
        List<Cam> result = new LinkedList<>();
        String sql = "SELECT * FROM racingdronewiki.camera;";
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                Cam cam = new Cam(resSet.getString(1), resSet.getString(3), resSet.getInt(4), resSet.getString(5),
                        null, resSet.getString(26), resSet.getBoolean(2),
                        resSet.getFloat(6), resSet.getFloat(7), resSet.getFloat(8), resSet.getFloat(9),
                        resSet.getString(10), resSet.getInt(11), resSet.getInt(12), resSet.getString(13),
                        resSet.getBoolean(14), resSet.getBoolean(15), resSet.getString(16), resSet.getString(17),
                        resSet.getBoolean(18), resSet.getBoolean(19), resSet.getString(20), resSet.getString(21),
                        resSet.getString(22), resSet.getString(23), resSet.getString(24), resSet.getString(25));
                LinkedList<String> expImg = new ExtraPicturesImpl(connection).getExtPic(cam.getModel());
                cam.setExtraPictures(expImg);
                result.add(cam);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!result.iterator().hasNext())
            return null;
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Cam> findAllUseAlone() {
        PreparedStatement pstmt;
        ResultSet resSet;
        List<Cam> result = new LinkedList<>();
        String sql = "SELECT * FROM racingdronewiki.camera WHERE cam_use_alone =1 ;";
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                Cam cam = new Cam(resSet.getString(1), resSet.getString(3), resSet.getInt(4), resSet.getString(5),
                        null, resSet.getString(26), resSet.getBoolean(2),
                        resSet.getFloat(6), resSet.getFloat(7), resSet.getFloat(8), resSet.getFloat(9),
                        resSet.getString(10), resSet.getInt(11), resSet.getInt(12), resSet.getString(13),
                        resSet.getBoolean(14), resSet.getBoolean(15), resSet.getString(16), resSet.getString(17),
                        resSet.getBoolean(18), resSet.getBoolean(19), resSet.getString(20), resSet.getString(21),
                        resSet.getString(22), resSet.getString(23), resSet.getString(24), resSet.getString(25));
                LinkedList<String> expImg = new ExtraPicturesImpl(connection).getExtPic(cam.getModel());
                cam.setExtraPictures(expImg);
                result.add(cam);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!result.iterator().hasNext())
            return null;
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Cam> findByModel(String model) {
        PreparedStatement pstmt;
        ResultSet resSet;
        List<Cam> result = new LinkedList<>();
        String sql = "SELECT * FROM racingdronewiki.camera WHERE `cam_model`like '%" + model + "%';";
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                Cam cam = new Cam(resSet.getString(1), resSet.getString(3), resSet.getInt(4), resSet.getString(5),
                        null, resSet.getString(26), resSet.getBoolean(2),
                        resSet.getFloat(6), resSet.getFloat(7), resSet.getFloat(8), resSet.getFloat(9),
                        resSet.getString(10), resSet.getInt(11), resSet.getInt(12), resSet.getString(13),
                        resSet.getBoolean(14), resSet.getBoolean(15), resSet.getString(16), resSet.getString(17),
                        resSet.getBoolean(18), resSet.getBoolean(19), resSet.getString(20), resSet.getString(21),
                        resSet.getString(22), resSet.getString(23), resSet.getString(24), resSet.getString(25));
                LinkedList<String> expImg = new ExtraPicturesImpl(connection).getExtPic(cam.getModel());
                cam.setExtraPictures(expImg);
                result.add(cam);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!result.iterator().hasNext())
            return null;
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<Cam> findByModelUseAlone(String model) {
        PreparedStatement pstmt;
        ResultSet resSet;
        List<Cam> result = new LinkedList<>();
        String sql = "SELECT * FROM racingdronewiki.camera WHERE `cam_model`like '%" + model + "%'AND cam_use_alone =1 ;";
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                Cam cam = new Cam(resSet.getString(1), resSet.getString(3), resSet.getInt(4), resSet.getString(5),
                        null, resSet.getString(26), resSet.getBoolean(2),
                        resSet.getFloat(6), resSet.getFloat(7), resSet.getFloat(8), resSet.getFloat(9),
                        resSet.getString(10), resSet.getInt(11), resSet.getInt(12), resSet.getString(13),
                        resSet.getBoolean(14), resSet.getBoolean(15), resSet.getString(16), resSet.getString(17),
                        resSet.getBoolean(18), resSet.getBoolean(19), resSet.getString(20), resSet.getString(21),
                        resSet.getString(22), resSet.getString(23), resSet.getString(24), resSet.getString(25));
                LinkedList<String> expImg = new ExtraPicturesImpl(connection).getExtPic(cam.getModel());
                cam.setExtraPictures(expImg);
                result.add(cam);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!result.iterator().hasNext())
            return null;
        return result;
    }

}