package com.RacingDroneWIKI.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.RacingDroneWIKI.dao.dao.ImageTransmissionDao;
import com.RacingDroneWIKI.pojo.ImageTransmission;

public class ImageTransmissionDaoImpl implements ImageTransmissionDao {
    private java.sql.Connection connection;

    public ImageTransmissionDaoImpl(Connection connection) {
        super();
        this.connection = connection;
    }

    public boolean addImageTransmission(ImageTransmission im) {
        String sql = "INSERT INTO `racingdronewiki`.`image_transmission`"
                + " (`it_model`, `it_use_alone`, `it_img`, `it_reference_price`, "
                + "`it_anufacturer`, `it_weight`, `it_length`, `it_width`, "
                + "`it_thickness`, `it_cam`, `it_frequency_quantity`, `it_sbus`,"
                + " `it_audio_support`, `it_integrated_mic`, `it_power_adjustable`,"
                + " `it_output_power`, `it_input_voltage`, `it_output_voltage`, "
                + "`it_antenna_connectors`, `it_video_band_width`, `it_audio_carrier_frequency`,"
                + " `it_video_input_level`, `it_audio_input_level`, `it_audio_input_impedance`, "
                + "`it_pin_definition_diagram`, `it_frequency_table`, `it_caption`)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            pstmt.setString(1, im.getModel());
            pstmt.setBoolean(2, im.isUseAlone());
            pstmt.setString(3, im.getImgUrl());
            pstmt.setInt(4, im.getReferencePrice());
            pstmt.setString(5, im.getAnufacturer());
            pstmt.setFloat(6, im.getWeight());
            pstmt.setFloat(7, im.getLength());
            pstmt.setFloat(8, im.getWidth());
            pstmt.setFloat(9, im.getThickness());
            pstmt.setString(10, im.getCam().getModel());
            pstmt.setInt(11, im.getFrequencyQuantity());
            pstmt.setBoolean(12, im.isSbus());
            pstmt.setBoolean(13, im.isAudioSupport());
            pstmt.setBoolean(14, im.isIntegratedMic());
            pstmt.setBoolean(15, im.isPowerAdjustable());
            pstmt.setString(16, im.getOutputPower());
            pstmt.setString(17, im.getInputVoltage());
            pstmt.setString(18, im.getOutputVoltage());
            pstmt.setString(19, im.getAntennaConnectors());
            pstmt.setString(20, im.getVideoBandWidth());
            pstmt.setString(21, im.getAudioCarrierFrequency());
            pstmt.setString(22, im.getVideoInputLevel());
            pstmt.setString(23, im.getAudioInputLevel());
            pstmt.setString(24, im.getAudioInputImpedance());
            pstmt.setString(25, im.getPinDefinitionDiagram());
            pstmt.setString(26, im.getFrequencyTable());
            pstmt.setString(27, im.getCaption());
            pstmt.executeUpdate();
            pstmt.close();
            new ExtraPicturesImpl(connection).addExtPic(im.getModel(), im.getExtraPictures());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean deleteImageTransmission(ImageTransmission im) {
        // TODO: implement
        return false;
    }

    public boolean updataImageTransmission(ImageTransmission im) {
        String sql = "UPDATE `racingdronewiki`.`image_transmission` SET "
                + "`it_model`=?, `it_use_alone`=?, `it	_img`=?,"
                + " `it_reference_price`=?, `it_anufacturer`=?, "
                + "`it_weight`=?, `it_length`=?, `it_width`=?, "
                + "`it_thickness`=?, `it_cam`=?, `it_frequency_quantity`=?,"
                + " `it_sbus`=?, `it_audio_support`=?, `it_integrated_mic`=?, "
                + "`it_power_adjustable`=?, `it_output_power`=?, `it_input_voltage`=?,"
                + " `it_output_voltage`=?, `it_antenna_connectors`=?, `it_video_band_width`=?, "
                + "`it_audio_carrier_frequency`=?, `it_video_input_level`=?, "
                + "`it_audio_input_level`=?, `it_audio_input_impedance`=?, "
                + "`it_pin_definition_diagram`=?, `it_frequency_table`=?, "
                + " `it_caption`=? WHERE `it_model`=?;";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            pstmt.setString(1, im.getModel());
            pstmt.setBoolean(2, im.isUseAlone());
            pstmt.setString(3, im.getImgUrl());
            pstmt.setInt(4, im.getReferencePrice());
            pstmt.setString(5, im.getAnufacturer());
            pstmt.setFloat(6, im.getWeight());
            pstmt.setFloat(7, im.getLength());
            pstmt.setFloat(8, im.getWidth());
            pstmt.setFloat(9, im.getThickness());
            pstmt.setString(10, im.getCam().getModel());
            pstmt.setInt(11, im.getFrequencyQuantity());
            pstmt.setBoolean(12, im.isSbus());
            pstmt.setBoolean(13, im.isAudioSupport());
            pstmt.setBoolean(14, im.isIntegratedMic());
            pstmt.setBoolean(15, im.isPowerAdjustable());
            pstmt.setString(16, im.getOutputPower());
            pstmt.setString(17, im.getInputVoltage());
            pstmt.setString(18, im.getOutputVoltage());
            pstmt.setString(19, im.getAntennaConnectors());
            pstmt.setString(20, im.getVideoBandWidth());
            pstmt.setString(21, im.getAudioCarrierFrequency());
            pstmt.setString(22, im.getVideoInputLevel());
            pstmt.setString(23, im.getAudioInputLevel());
            pstmt.setString(24, im.getAudioInputImpedance());
            pstmt.setString(25, im.getPinDefinitionDiagram());
            pstmt.setObject(26, im.getExtraPictures());
            pstmt.setString(27, im.getCaption());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public List<ImageTransmission> findAll() {
        PreparedStatement pstmt;
        ResultSet resSet;
        List<ImageTransmission> result = new LinkedList<>();
        String sql = "SELECT * FROM racingdronewiki.image_transmission;";
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                ImageTransmission im = new ImageTransmission(resSet.getString(1), resSet.getString(3),
                        resSet.getInt(4), resSet.getString(5),
                        null, resSet.getString(27),
                        resSet.getBoolean(2), resSet.getFloat(6), resSet.getFloat(7),
                        resSet.getFloat(8), resSet.getFloat(9), null,
                        resSet.getInt(11), resSet.getBoolean(12),
                        resSet.getBoolean(13), resSet.getBoolean(14),
                        resSet.getBoolean(15), resSet.getString(16),
                        resSet.getString(17), resSet.getString(18),
                        resSet.getString(19), resSet.getString(20),
                        resSet.getString(21), resSet.getString(22),
                        resSet.getString(23), resSet.getString(24),
                        resSet.getString(25), resSet.getString(26));
                LinkedList<String> expImg = new ExtraPicturesImpl(connection).getExtPic(im.getModel());
                im.setExtraPictures(expImg);
                if (resSet.getString(10) == null)
                    im.setCam(null);
                else
                    im.setCam(new CamDaoImpl(connection).findByModel(resSet.getString(10)).get(0));
                result.add(im);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!result.iterator().hasNext())
            return null;
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<ImageTransmission> findByModel(String model) {
        PreparedStatement pstmt;
        ResultSet resSet;
        List<ImageTransmission> result = new LinkedList<>();
        String sql = "SELECT * FROM racingdronewiki.image_transmission WHERE `it_model`like '%" + model + "%';";
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                ImageTransmission im = new ImageTransmission(resSet.getString(1), resSet.getString(3),
                        resSet.getInt(4), resSet.getString(5),
                        null, resSet.getString(27),
                        resSet.getBoolean(2), resSet.getFloat(6), resSet.getFloat(7),
                        resSet.getFloat(8), resSet.getFloat(9), null,
                        resSet.getInt(11), resSet.getBoolean(12),
                        resSet.getBoolean(13), resSet.getBoolean(14),
                        resSet.getBoolean(15), resSet.getString(16),
                        resSet.getString(17), resSet.getString(18),
                        resSet.getString(19), resSet.getString(20),
                        resSet.getString(21), resSet.getString(22),
                        resSet.getString(23), resSet.getString(24),
                        resSet.getString(25), resSet.getString(26));
                LinkedList<String> expImg = new ExtraPicturesImpl(connection).getExtPic(im.getModel());
                im.setExtraPictures(expImg);
                if (resSet.getString(10) == null)
                    im.setCam(null);
                else
                    im.setCam(new CamDaoImpl(connection).findByModel(resSet.getString(10)).get(0));
                result.add(im);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!result.iterator().hasNext())
            return null;
        return result;
    }

    public List<ImageTransmission> findAllUseAlone() {
        PreparedStatement pstmt;
        ResultSet resSet;
        List<ImageTransmission> result = new LinkedList<>();
        String sql = "SELECT * FROM racingdronewiki.image_transmission WHERE it_use_alone=1;";
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                ImageTransmission im = new ImageTransmission(resSet.getString(1), resSet.getString(3),
                        resSet.getInt(4), resSet.getString(5),
                        null, resSet.getString(27),
                        resSet.getBoolean(2), resSet.getFloat(6), resSet.getFloat(7),
                        resSet.getFloat(8), resSet.getFloat(9), null,
                        resSet.getInt(11), resSet.getBoolean(12),
                        resSet.getBoolean(13), resSet.getBoolean(14),
                        resSet.getBoolean(15), resSet.getString(16),
                        resSet.getString(17), resSet.getString(18),
                        resSet.getString(19), resSet.getString(20),
                        resSet.getString(21), resSet.getString(22),
                        resSet.getString(23), resSet.getString(24),
                        resSet.getString(25), resSet.getString(26));
                LinkedList<String> expImg = new ExtraPicturesImpl(connection).getExtPic(im.getModel());
                im.setExtraPictures(expImg);
                if (resSet.getString(10) == null)
                    im.setCam(null);
                else
                    im.setCam(new CamDaoImpl(connection).findByModel(resSet.getString(10)).get(0));
                result.add(im);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!result.iterator().hasNext())
            return null;
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<ImageTransmission> findByModelUseAlone(String model) {
        PreparedStatement pstmt;
        ResultSet resSet;
        List<ImageTransmission> result = new LinkedList<>();
        String sql = "SELECT * FROM racingdronewiki.image_transmission WHERE `it_model`like '%" + model + "%'AND it_use_alone=1;";
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(sql);
            resSet = pstmt.executeQuery();
            while (resSet.next()) {
                ImageTransmission im = new ImageTransmission(resSet.getString(1), resSet.getString(3),
                        resSet.getInt(4), resSet.getString(5),
                        null, resSet.getString(27),
                        resSet.getBoolean(2), resSet.getFloat(6), resSet.getFloat(7),
                        resSet.getFloat(8), resSet.getFloat(9), null,
                        resSet.getInt(11), resSet.getBoolean(12),
                        resSet.getBoolean(13), resSet.getBoolean(14),
                        resSet.getBoolean(15), resSet.getString(16),
                        resSet.getString(17), resSet.getString(18),
                        resSet.getString(19), resSet.getString(20),
                        resSet.getString(21), resSet.getString(22),
                        resSet.getString(23), resSet.getString(24),
                        resSet.getString(25), resSet.getString(26));
                LinkedList<String> expImg = new ExtraPicturesImpl(connection).getExtPic(im.getModel());
                im.setExtraPictures(expImg);
                if (resSet.getString(10) == null)
                    im.setCam(null);
                else
                    im.setCam(new CamDaoImpl(connection).findByModel(resSet.getString(10)).get(0));
                result.add(im);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!result.iterator().hasNext())
            return null;
        return result;
    }

}