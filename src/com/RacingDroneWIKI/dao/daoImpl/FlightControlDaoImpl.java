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

import com.RacingDroneWIKI.dao.dao.FlightControlDao;
import com.RacingDroneWIKI.dao.daoProxy.ElectroSpeedRegulatorDaoProxy;
import com.RacingDroneWIKI.dao.daoProxy.ImageTransmissionDaoProxy;
import com.RacingDroneWIKI.dao.daoProxy.PowerHubDaoProxy;
import com.RacingDroneWIKI.javaBean.ElectroSpeedRegulator;
import com.RacingDroneWIKI.javaBean.FlightControl;
import com.RacingDroneWIKI.javaBean.ImageTransmission;
import com.RacingDroneWIKI.javaBean.PowerHub;

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
				+ " `fc_pin_definition_diagram`, `fc_extra_pictures`, `fc_caption`) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
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
		        pstmt.setString(23, fc.getCaption()); 
		        pstmt.executeUpdate();
		        pstmt.close();
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
				+ "`fc_extra_pictures`=?, `fc_caption`=?"
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
	        pstmt.setObject(22, fc.getExtraPictures());
	        pstmt.setString(23, fc.getCaption()); 
	        pstmt.setString(24, fc.getModel());
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
				ElectroSpeedRegulator esc = new ElectroSpeedRegulatorDaoProxy().
						findByModel(resSet.getString(18)).get(0);
				if(esc==null)
					fc.setEsc(null);
				else
					fc.setEsc(esc);
				PowerHub pb=new PowerHubDaoProxy().findByModel(resSet.getString(19)).get(0);
				if(pb==null)
					fc.setPowerHub(null);
				else
					fc.setPowerHub(pb);
				ImageTransmission im =new ImageTransmissionDaoProxy().findByModel(resSet.getString(20)).get(0);
				if(im==null)
					fc.setImageTransmission(null);
				else
					fc.setImageTransmission(im);
				fc.setPinDefintionDiagram(resSet.getString(21));
				fc.setExtraPictures(null);
				fc.setCaption(resSet.getString(23));	
				Blob inBlob=resSet.getBlob(22);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();                //获取二进制流对象  
	                BufferedInputStream bis=new BufferedInputStream(is);    //带缓冲区的流对象  
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);          //一次性全部读到buff中  
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                fc.setExtraPictures(ls);
				}
				result.add(fc);
			} 
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

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
				ElectroSpeedRegulator esc = new ElectroSpeedRegulatorDaoProxy().
						findByModel(resSet.getString(18)).get(0);
				if(esc==null)
					fc.setEsc(null);
				else
					fc.setEsc(esc);
				PowerHub pb=new PowerHubDaoProxy().findByModel(resSet.getString(19)).get(0);
				if(pb==null)
					fc.setPowerHub(null);
				else
					fc.setPowerHub(pb);
				ImageTransmission im =new ImageTransmissionDaoProxy().findByModel(resSet.getString(20)).get(0);
				if(im==null)
					fc.setImageTransmission(null);
				else
					fc.setImageTransmission(im);
				fc.setPinDefintionDiagram(resSet.getString(21));
				fc.setExtraPictures(null);
				fc.setCaption(resSet.getString(23));		
				Blob inBlob=resSet.getBlob(22);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();                //获取二进制流对象  
	                BufferedInputStream bis=new BufferedInputStream(is);    //带缓冲区的流对象  
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);          //一次性全部读到buff中  
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                fc.setExtraPictures(ls);
				}
				result.add(fc);
			} 
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

		return result;
	}

}