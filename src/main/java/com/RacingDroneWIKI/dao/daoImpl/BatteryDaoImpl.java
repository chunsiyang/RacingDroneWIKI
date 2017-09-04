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

import com.RacingDroneWIKI.dao.dao.BatteryDao;
import com.RacingDroneWIKI.javaBean.Battery;

public class BatteryDaoImpl implements BatteryDao {
	private  java.sql.Connection connection;
	public BatteryDaoImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean addBattery(Battery battery) {
		String sql = "INSERT INTO `racingdronewiki`.`battery` "
				+ "(`bat_model`, `bat_img`, `bat_reference_price`, "
				+ "`bat_anufacturer`, `bat_capacity`, `bat_discharge_rate`,"
				+ " `bat_instantaneous_discharge_rate`, `bat_max_charging_rate`,"
				+ " `bat_voltage`, `bat_recommended_charging_current`, "
				+ "`bat_maximum_charge_current`, `bat_weight`, `bat_length`, "
				+ "`bat_width`, `bat_thickness`, `bat_connector`, `bat_wire_number`, "
				+ "`bat_wire_length`, `bat_extra_pictures`, `bat_caption`) "
				+ "VALUES (?,? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, battery.getModel());
	        pstmt.setString(2, battery.getImgUrl()); 
	        pstmt.setInt(3, battery.getReferencePrice());
	        pstmt.setString(4, battery.getAnufacturer());
	        pstmt.setInt(5, battery.getCapacity());
	        pstmt.setInt(6, battery.getDischargeRate());
	        pstmt.setInt(7, battery.getInstantaneousDischargeRate());
	        pstmt.setInt(8, battery.getMaxChargingRate());
	        pstmt.setFloat(9, battery.getVoltage());
	        pstmt.setFloat(10, battery.getRecommendedChargingCurrent());
	        pstmt.setFloat(11, battery.getMaximumChargeCurrent());
	        pstmt.setFloat(12, battery.getWeight());
	        pstmt.setFloat(13, battery.getLength());
	        pstmt.setFloat(14, battery.getWidth());
	        pstmt.setFloat(15, battery.getThickness());
	        pstmt.setString(16, battery.getConnector());
	        pstmt.setInt(17, battery.getWireNumber());
	        pstmt.setInt(18, battery.getWireLength());
	        pstmt.setObject(19, battery.getExtraPictures());
	        pstmt.setString(20, battery.getCaption()); 
	        pstmt.executeUpdate();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return true;
	}

	public boolean deleteBattery(Battery battery) {
		// TODO: implement
		return false;
	}

	public boolean updataBattery(Battery battery) {
		String sql="UPDATE `racingdronewiki`.`battery` SET `bat_model`=?, `bat_img`=?, "
				+ "`bat_reference_price`=?, `bat_anufacturer`=?, `bat_capacity`=?, "
				+ "`bat_discharge_rate`=?, `bat_instantaneous_discharge_rate`=?,"
				+ " `bat_max_charging_rate`=?, `bat_voltage`=?, "
				+ "`bat_recommended_charging_current`=?, `bat_maximum_charge_current`=?,"
				+ " `bat_weight`=?, `bat_length`=?, `bat_width`=?, `bat_thickness`=?,"
				+ " `bat_connector`=?, `bat_wire_number`=?, `bat_wire_length`=?, "
				+ "`bat_extra_pictures`=?, `bat_caption`=? WHERE `bat_model`=?;";
		 PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement) connection.prepareStatement(sql);
		        pstmt.setString(1, battery.getModel());
		        pstmt.setString(2, battery.getImgUrl()); 
		        pstmt.setInt(3, battery.getReferencePrice());
		        pstmt.setString(4, battery.getAnufacturer());
		        pstmt.setInt(5, battery.getCapacity());
		        pstmt.setInt(6, battery.getDischargeRate());
		        pstmt.setInt(7, battery.getInstantaneousDischargeRate());
		        pstmt.setInt(8, battery.getMaxChargingRate());
		        pstmt.setFloat(9, battery.getVoltage());
		        pstmt.setFloat(10, battery.getRecommendedChargingCurrent());
		        pstmt.setFloat(11, battery.getMaximumChargeCurrent());
		        pstmt.setFloat(12, battery.getWeight());
		        pstmt.setFloat(13, battery.getLength());
		        pstmt.setFloat(14, battery.getWidth());
		        pstmt.setFloat(15, battery.getThickness());
		        pstmt.setString(16, battery.getConnector());
		        pstmt.setInt(17, battery.getWireNumber());
		        pstmt.setInt(18, battery.getWireLength());
		        pstmt.setObject(19, battery.getExtraPictures());
		        pstmt.setString(20, battery.getCaption()); 
		        pstmt.setString(21, battery.getModel());
		        pstmt.executeUpdate();
		        pstmt.close();
		    } catch (SQLException e) {
		        e.printStackTrace(); 
		    }
			return true;
	}

	@SuppressWarnings("unchecked")
	public List<Battery> findAll() {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<Battery> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.battery;";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Battery bat=new Battery(resSet.getString(1),
						resSet.getString(2),  resSet.getInt(3), 
						resSet.getString(4), null, 
						resSet.getString(20), resSet.getInt(5), resSet.getInt(6),
						resSet.getInt(7), 
						resSet.getInt(8), resSet.getFloat(9),
						resSet.getFloat(10),
						resSet.getFloat(11), resSet.getFloat(12), 
						resSet.getFloat(13), resSet.getFloat(14), resSet.getFloat(15), 
						resSet.getString(16), resSet.getInt(17), resSet.getInt(18));
				Blob inBlob=resSet.getBlob(19);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();
	                BufferedInputStream bis=new BufferedInputStream(is);
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                bat.setExtraPictures(ls);
				}
				result.add(bat);
			} 
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<Battery> findByModel(String model) {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<Battery> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.battery WHERE `bat_model`like '%"+model+"%';";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Battery bat=new Battery(resSet.getString(1),
						resSet.getString(2),  resSet.getInt(3), 
						resSet.getString(4), (LinkedList<String>)resSet.getObject(19), 
						resSet.getString(20), resSet.getInt(5), resSet.getInt(6),
						resSet.getInt(7), 
						resSet.getInt(8), resSet.getFloat(9),
						resSet.getFloat(10),
						resSet.getFloat(11), resSet.getFloat(12), 
						resSet.getFloat(13), resSet.getFloat(14), resSet.getFloat(15), 
						resSet.getString(16), resSet.getInt(17), resSet.getInt(18));
				Blob inBlob=resSet.getBlob(19);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();
	                BufferedInputStream bis=new BufferedInputStream(is);
	                byte[] buff=new byte[(int) inBlob.length()];
	                bis.read(buff, 0, buff.length);
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                bat.setExtraPictures(ls);
				}
				result.add(bat);
			} 
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

}