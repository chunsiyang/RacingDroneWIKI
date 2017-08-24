package com.RacingDroneWIKI.dao.daoImpl;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.RacingDroneWIKI.dao.dao.ElectroSpeedRegulatorDao;
import com.RacingDroneWIKI.javaBean.ElectroSpeedRegulator;


public class ElectroSpeedRegulatorDaoImpl implements ElectroSpeedRegulatorDao {
	private  java.sql.Connection connection;
	public ElectroSpeedRegulatorDaoImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean addElectroSpeedRegulato(ElectroSpeedRegulator esc) {
		String sql="INSERT INTO `racingdronewiki`.`electro_speed_regulator`"
				+ " (`esc_model`, `esc_use_alone`, `esc_img`,"
				+ " `esc_reference_price`, `esc_anufacturer`, "
				+ "`esc_no_of_cells`, `esc_persistent_current`,"
				+ " `esc_instantaneous_current`, `esc_firmware`,"
				+ " `esc_control_chip`, `esc_weight`, `esc_length`,"
				+ " `esc_width`, `esc_thickness`, `esc_4in1`, `esc_pwm`,"
				+ " `esc_oneshot125`, `esc_oneshot42`, `esc_mutishot`,"
				+ " `esc_dshot`, `esc_extra_pictures`, `esc_caption`)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, esc.getModel());
	        pstmt.setBoolean(2, esc.isUseAlone());
	        pstmt.setString(3, esc.getImgUrl()); 
	        pstmt.setInt(4, esc.getReferencePrice());
	        pstmt.setString(5, esc.getAnufacturer());
	        pstmt.setString(6, esc.getNoOfCells());
	        pstmt.setInt(7, esc.getPersistentCurrent());
	        pstmt.setInt(8, esc.getInstantaneousCurrent());
	        pstmt.setString(9, esc.getFirmware());
	        pstmt.setString(10, esc.getControlChip());
	        pstmt.setFloat(11, esc.getWeight());
	        pstmt.setFloat(12, esc.getLength());
	        pstmt.setFloat(13, esc.getWidth());
	        pstmt.setFloat(14, esc.getThickness());
	        pstmt.setBoolean(15, esc.isFourInone());
	        pstmt.setBoolean(16, esc.isPwmMode());
	        pstmt.setBoolean(17, esc.isOneshot125());
	        pstmt.setBoolean(18, esc.isOneshot42());
	        pstmt.setBoolean(19, esc.isMutishot());
	        pstmt.setBoolean(20, esc.isDshot());       
	        pstmt.setObject(21, esc.getExtraPictures());
	        pstmt.setString(22, esc.getCaption()); 
	        pstmt.executeUpdate();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return true;
	}

	public boolean deleteElectroSpeedRegulato(ElectroSpeedRegulator esc) {
		// TODO: implement
		return false;
	}

	public boolean updataElectroSpeedRegulato(ElectroSpeedRegulator esc) {
		String sql="UPDATE `racingdronewiki`.`electro_speed_regulator`"
				+ " SET `esc_model`=?, `esc_use_alone`=?, `esc_img`=?,"
				+ " `esc_reference_price`=?, `esc_anufacturer`=?,"
				+ " `esc_no_of_cells`=?, `esc_persistent_current`=?,"
				+ " `esc_instantaneous_current`=?, `esc_firmware`=?, "
				+ "`esc_control_chip`=?, `esc_weight`=?, `esc_length`=?,"
				+ " `esc_width`=?, `esc_thickness`=?, `esc_4in1`=?, `esc_pwm`=?, "
				+ "`esc_oneshot125`=?, `esc_oneshot42`=?, `esc_mutishot`=? , "
				+ "`esc_dshot`=?, `esc_extra_pictures`=?, `esc_caption`=?"
				+ " WHERE `esc_model`=?;";
		PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, esc.getModel());
	        pstmt.setBoolean(2, esc.isUseAlone());
	        pstmt.setString(3, esc.getImgUrl()); 
	        pstmt.setInt(4, esc.getReferencePrice());
	        pstmt.setString(5, esc.getAnufacturer());
	        pstmt.setString(6, esc.getNoOfCells());
	        pstmt.setInt(7, esc.getPersistentCurrent());
	        pstmt.setInt(8, esc.getInstantaneousCurrent());
	        pstmt.setString(9, esc.getFirmware());
	        pstmt.setString(10, esc.getControlChip());
	        pstmt.setFloat(11, esc.getWeight());
	        pstmt.setFloat(12, esc.getLength());
	        pstmt.setFloat(13, esc.getWidth());
	        pstmt.setFloat(14, esc.getThickness());
	        pstmt.setBoolean(15, esc.isFourInone());
	        pstmt.setBoolean(16, esc.isPwmMode());
	        pstmt.setBoolean(17, esc.isOneshot125());
	        pstmt.setBoolean(18, esc.isOneshot42());
	        pstmt.setBoolean(19, esc.isMutishot());
	        pstmt.setBoolean(20, esc.isDshot());       
	        pstmt.setObject(21, esc.getExtraPictures());
	        pstmt.setString(22, esc.getCaption()); 
	        pstmt.setString(23, esc.getModel());
	        pstmt.executeUpdate();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<ElectroSpeedRegulator> findAll() {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<ElectroSpeedRegulator> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.electro_speed_regulator;";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				ElectroSpeedRegulator esc= new ElectroSpeedRegulator
						(resSet.getString(1), resSet.getString(3), 
								resSet.getInt(4), resSet.getString(5), 
								null,
								resSet.getString(22), resSet.getBoolean(2), 
								resSet.getString(6), resSet.getInt(7),
								resSet.getInt(8), resSet.getString(9), 
								resSet.getString(10), resSet.getFloat(11), 
								resSet.getFloat(12), resSet.getFloat(13), 
								resSet.getFloat(14), resSet.getBoolean(15), 
								resSet.getBoolean(16), resSet.getBoolean(17),
								resSet.getBoolean(18),resSet.getBoolean(19),
								resSet.getBoolean(20));
				Blob inBlob=resSet.getBlob(21);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();                //获取二进制流对象  
	                BufferedInputStream bis=new BufferedInputStream(is);    //带缓冲区的流对象  
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);          //一次性全部读到buff中  
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                esc.setExtraPictures(ls);
				}
				result.add(esc);
			} 
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return result;
	}

	@SuppressWarnings("unchecked")
	public List<ElectroSpeedRegulator> findByModel(String model) {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<ElectroSpeedRegulator> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.electro_speed_regulator WHERE `esc_model`like '%"+model+"%';";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				ElectroSpeedRegulator esc= new ElectroSpeedRegulator
						(resSet.getString(1), resSet.getString(3), 
								resSet.getInt(4), resSet.getString(5), 
								null,
								resSet.getString(22), resSet.getBoolean(2), 
								resSet.getString(6), resSet.getInt(7),
								resSet.getInt(8), resSet.getString(9), 
								resSet.getString(10), resSet.getFloat(11), 
								resSet.getFloat(12), resSet.getFloat(13), 
								resSet.getFloat(14), resSet.getBoolean(15), 
								resSet.getBoolean(16), resSet.getBoolean(17),
								resSet.getBoolean(18),resSet.getBoolean(19),
								resSet.getBoolean(20));
				Blob inBlob=resSet.getBlob(12);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();                //获取二进制流对象  
	                BufferedInputStream bis=new BufferedInputStream(is);    //带缓冲区的流对象  
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);          //一次性全部读到buff中  
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                esc.setExtraPictures(ls);
				}
				result.add(esc);
			} 
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return result;
	}

}