package com.RacingDroneWIKI.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.RacingDroneWIKI.dao.dao.FlightControlDao;
import com.RacingDroneWIKI.pojo.ElectroSpeedRegulator;
import com.RacingDroneWIKI.pojo.FlightControl;
import com.RacingDroneWIKI.pojo.ImageTransmission;
import com.RacingDroneWIKI.pojo.PowerHub;

public class FlightControlDaoImpl implements FlightControlDao {
	private  java.sql.Connection connection;
	public FlightControlDaoImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean addFlightControl(FlightControl fc) {
		String sql="INSERT INTO `racingdronewiki`.`flight_control`"
				+ " (`fc_model`, `fc_img`, `fc_reference_price`, "
				+ "`fc_anufacturer`, `fc_weight`, `fc_length`,"
				+ " `fc_width`, `fc_thickness`, `fc_mounting_hole_spacing`,"
				+ " `fc_mcu`, `fc_mpu`, `fc_sdcard`, `fc_boot_button`, `fc_osd`, "
				+ "`fc_buzzer`, `fc_max_pid_loop_frequancy`, `fc_max_gyro_updata`,"
				+ " `fc_esc`, `fc_power_hub`, `fc_image_transmission`,"
				+ " `fc_pin_definition_diagram`,`fc_caption`) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		 PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement) connection.prepareStatement(sql);
		        pstmt.setString(1, fc.getModel());
		        pstmt.setString(2, fc.getImgUrl()); 
		        pstmt.setInt(3, fc.getReferencePrice());
		        pstmt.setString(4, fc.getAnufacturer());
		        pstmt.setFloat(5, fc.getWeight());
		        pstmt.setFloat(6, fc.getLength());
		        pstmt.setFloat(7, fc.getWidth());
		        pstmt.setFloat(8, fc.getThickness());
		        pstmt.setFloat(9, fc.getMountingHoleSpacing());
		        pstmt.setString(10, fc.getMcu());
		        pstmt.setString(11, fc.getMpu());
		        pstmt.setBoolean(12, fc.isSdcard());
		        pstmt.setBoolean(13, fc.isBootButton());
		        pstmt.setBoolean(14, fc.isOsd());
		        pstmt.setBoolean(15, fc.isBuzzer());
		        pstmt.setInt(16, fc.getMaxPidLoopFrequancy());
		        pstmt.setInt(17, fc.getMaxGyroUpdata());
		        pstmt.setString(18, fc.getEsc().getModel());
		        pstmt.setString(19, fc.getPowerHub().getModel());
		        pstmt.setString(20, fc.getImageTransmission().getModel());
		        pstmt.setString(21,fc.getPinDefintionDiagram());     
		        pstmt.setObject(22, fc.getExtraPictures());
		        pstmt.executeUpdate();
		        pstmt.close();
				new ExtraPicturesImpl(connection).addExtPic(fc.getModel(),fc.getExtraPictures());
		    } catch (SQLException e) {
		        e.printStackTrace(); 
		    }
			return true;
	}

	public boolean deleteFlightControl(FlightControl fc) {
		// TODO: implement
		return false;
	}

	public boolean updataFlightControl(FlightControl fc) {
		String sql="UPDATE `racingdronewiki`.`flight_control` "
				+ "SET `fc_model`=?, `fc_img`=?, `fc_reference_price`=?,"
				+ " `fc_anufacturer`=?, `fc_weight`=?, `fc_length`=?, "
				+ "`fc_width`=?, `fc_thickness`=?, `fc_mounting_hole_spacing`=?,"
				+ " `fc_mcu`=?, `fc_mpu`=?, `fc_sdcard`=?, `fc_boot_button`=?,"
				+ " `fc_osd`=?, `fc_buzzer`=?, `fc_max_pid_loop_frequancy`=?, "
				+ "`fc_max_gyro_updata`=?, `fc_esc`=?, `fc_power_hub`=?, "
				+ "`fc_image_transmission`=?, `fc_pin_definition_diagram`=? ,"
				+ "`fc_caption`=?"
				+ " WHERE `fc_model`=?;";
		PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, fc.getModel());
	        pstmt.setString(2, fc.getImgUrl()); 
	        pstmt.setInt(3, fc.getReferencePrice());
	        pstmt.setString(4, fc.getAnufacturer());
	        pstmt.setFloat(5, fc.getWeight());
	        pstmt.setFloat(6, fc.getLength());
	        pstmt.setFloat(7, fc.getWidth());
	        pstmt.setFloat(8, fc.getThickness());
	        pstmt.setFloat(9, fc.getMountingHoleSpacing());
	        pstmt.setString(10, fc.getMcu());
	        pstmt.setString(11, fc.getMpu());
	        pstmt.setBoolean(12, fc.isSdcard());
	        pstmt.setBoolean(13, fc.isBootButton());
	        pstmt.setBoolean(14, fc.isOsd());
	        pstmt.setBoolean(15, fc.isBuzzer());
	        pstmt.setInt(16, fc.getMaxPidLoopFrequancy());
	        pstmt.setInt(17, fc.getMaxGyroUpdata());
	        pstmt.setString(18, fc.getEsc().getModel());
	        pstmt.setString(19, fc.getPowerHub().getModel());
	        pstmt.setString(20, fc.getImageTransmission().getModel());
	        pstmt.setString(21,fc.getPinDefintionDiagram());
	        pstmt.setString(22, fc.getCaption());
	        pstmt.setString(23, fc.getModel());
	        pstmt.executeUpdate();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<FlightControl> findAll() {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<FlightControl> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.flight_control;";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				FlightControl fc=new FlightControl();
				fc.setModel(resSet.getString(1));
				fc.setImgUrl(resSet.getString(2));
				fc.setReferencePrice(resSet.getInt(3));
				fc.setAnufacturer(resSet.getString(4));
				fc.setWeight(resSet.getFloat(5));
				fc.setLength(resSet.getFloat(6));
				fc.setWidth(resSet.getFloat(7));
				fc.setThickness(resSet.getFloat(8));
				fc.setMountingHoleSpacing(resSet.getFloat(9));
				fc.setMcu(resSet.getString(10));
				fc.setMpu(resSet.getString(11));
				fc.setSdcard(resSet.getBoolean(12));
				fc.setBootButton(resSet.getBoolean(13));
				fc.setOsd(resSet.getBoolean(14));
				fc.setBuzzer(resSet.getBoolean(15));
				fc.setMaxPidLoopFrequancy(resSet.getInt(16));
				fc.setMaxGyroUpdata(resSet.getInt(17));
				if(resSet.getString(18)==null)
					fc.setEsc(null);
				else
				{
					ElectroSpeedRegulator esc = new ElectroSpeedRegulatorDaoImpl(connection).
							findByModel(resSet.getString(18)).get(0);
					fc.setEsc(esc);
				}
				if(resSet.getString(19)==null)
					fc.setPowerHub(null);
				else
				{
					PowerHub pb=new PowerHubDaoImpl(connection).findByModel(resSet.getString(19)).get(0);
					fc.setPowerHub(pb);
				}
				if(resSet.getString(20)==null)
					fc.setImageTransmission(null);
				else
				{
					ImageTransmission im =new ImageTransmissionDaoImpl(connection).findByModel(resSet.getString(20)).get(0);
					fc.setImageTransmission(im);
				}
				fc.setPinDefintionDiagram(resSet.getString(21));
				fc.setExtraPictures(null);
				fc.setCaption(resSet.getString(22));
				LinkedList<String > expImg= new ExtraPicturesImpl(connection).getExtPic(fc.getModel());
				fc.setExtraPictures(expImg);
				result.add(fc);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<FlightControl> findByModel(String model) {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<FlightControl> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.flight_control WHERE `fc_model`like '%"+model+"%';";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				FlightControl fc=new FlightControl();
				fc.setModel(resSet.getString(1));
				fc.setImgUrl(resSet.getString(2));
				fc.setReferencePrice(resSet.getInt(3));
				fc.setAnufacturer(resSet.getString(4));
				fc.setWeight(resSet.getFloat(5));
				fc.setLength(resSet.getFloat(6));
				fc.setWidth(resSet.getFloat(7));
				fc.setThickness(resSet.getFloat(8));
				fc.setMountingHoleSpacing(resSet.getFloat(9));
				fc.setMcu(resSet.getString(10));
				fc.setMpu(resSet.getString(11));
				fc.setSdcard(resSet.getBoolean(12));
				fc.setBootButton(resSet.getBoolean(13));
				fc.setOsd(resSet.getBoolean(14));
				fc.setBuzzer(resSet.getBoolean(15));
				fc.setMaxPidLoopFrequancy(resSet.getInt(16));
				fc.setMaxGyroUpdata(resSet.getInt(17));
				if(resSet.getString(18)==null)
					fc.setEsc(null);
				else
				{
					ElectroSpeedRegulator esc = new ElectroSpeedRegulatorDaoImpl(connection).
							findByModel(resSet.getString(18)).get(0);
					fc.setEsc(esc);
				}
				if(resSet.getString(19)==null)
					fc.setPowerHub(null);
				else
				{
					PowerHub pb=new PowerHubDaoImpl(connection).findByModel(resSet.getString(19)).get(0);
					fc.setPowerHub(pb);
				}
				if(resSet.getString(20)==null)
					fc.setImageTransmission(null);
				else
				{
					ImageTransmission im =new ImageTransmissionDaoImpl(connection).findByModel(resSet.getString(20)).get(0);
					fc.setImageTransmission(im);
				}
				fc.setPinDefintionDiagram(resSet.getString(21));
				fc.setExtraPictures(null);
				fc.setCaption(resSet.getString(22));
				LinkedList<String > expImg= new ExtraPicturesImpl(connection).getExtPic(fc.getModel());
				fc.setExtraPictures(expImg);
				result.add(fc);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

}