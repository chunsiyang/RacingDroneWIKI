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

import com.RacingDroneWIKI.dao.dao.FrameDao;
import com.RacingDroneWIKI.dao.daoProxy.PowerHubDaoProxy;
import com.RacingDroneWIKI.javaBean.Frame;
import com.RacingDroneWIKI.javaBean.PowerHub;

public class FrameDaoImpl implements FrameDao {
	private  java.sql.Connection connection;
	public FrameDaoImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean addFrame(Frame fra) {
		String sql="INSERT INTO `racingdronewiki`.`frame` "
				+ "(`fra_model`, `fra_img`, `fra_reference_price`,"
				+ " `fra_anufacturer`, `fra_wheelbase`, `fra_weight`, "
				+ "`fra_fc_mounting_hole_spacing`, `fra_integrated_ph`,"
				+ " `fra_integrated_led`, `fra_camra_adjusting_angle`, "
				+ "`fra_material`, `fra_maximum_support_prop`,"
				+ " `fra_bottom_thickness`, `fra_roof_thickness`, "
				+ "`fra_arm_thickness`, `fra_extra_pictures`,"
				+ " `fra_caption`) VALUES (?, ?, ?, ?, ?, ?,"
				+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		 PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement) connection.prepareStatement(sql);
		        pstmt.setString(1, fra.getModel());
		        pstmt.setString(2, fra.getImgUrl()); 
		        pstmt.setInt(3, fra.getReferencePrice());
		        pstmt.setString(4, fra.getAnufacturer());
		        pstmt.setInt(5, fra.getWheekbase());
		        pstmt.setFloat(6, fra.getWeight());
		        pstmt.setFloat(7, fra.getFcMountingHoleSpacing());
		        pstmt.setString(8, fra.getIntegratedPh().getModel());
		        pstmt.setBoolean(9, fra.isIntegratedLed());
		        pstmt.setString(10, fra.getCamraAdjustingAngle());
		        pstmt.setString(11, fra.getMaterial());
		        pstmt.setInt(12, fra.getMaximumSupportProp());
		        pstmt.setFloat(13, fra.getBottomThickness());
		        pstmt.setFloat(14,fra.getRoofThickness());
		        pstmt.setFloat(15, fra.getArmThikness());
		        pstmt.setObject(16, fra.getExtraPictures());
		        pstmt.setString(17, fra.getCaption()); 
		        pstmt.executeUpdate();
		        pstmt.close();
		    } catch (SQLException e) {
		        e.printStackTrace(); 
		    }
			return true;
	}

	public boolean deleteFrame(Frame fra) {
		// TODO: implement
		return false;
	}

	public boolean updataFrame(Frame fra) {
		String sql="UPDATE `racingdronewiki`.`frame` SET `fra_model`=?, "
				+ "`fra_img`=?, `fra_reference_price`=?, `fra_anufacturer`=?, "
				+ "`fra_wheelbase`=?, `fra_weight`=?, `fra_fc_mounting_hole_spacing`=?,"
				+ " `fra_integrated_ph`=?, `fra_integrated_led`=?, "
				+ "`fra_camra_adjusting_angle`=?, `fra_material`=?,"
				+ " `fra_maximum_support_prop`=?, `fra_bottom_thickness`=?, "
				+ "`fra_roof_thickness`=?, `fra_arm_thickness`=?, `fra_extra_pictures`=?,"
				+ " `fra_caption`=? WHERE `fra_model`=?;";
		PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, fra.getModel());
	        pstmt.setString(2, fra.getImgUrl()); 
	        pstmt.setInt(3, fra.getReferencePrice());
	        pstmt.setString(4, fra.getAnufacturer());
	        pstmt.setInt(5, fra.getWheekbase());
	        pstmt.setFloat(6, fra.getWeight());
	        pstmt.setFloat(7, fra.getFcMountingHoleSpacing());
	        pstmt.setString(8, fra.getIntegratedPh().getModel());
	        pstmt.setBoolean(9, fra.isIntegratedLed());
	        pstmt.setString(10, fra.getCamraAdjustingAngle());
	        pstmt.setString(11, fra.getMaterial());
	        pstmt.setInt(12, fra.getMaximumSupportProp());
	        pstmt.setFloat(13, fra.getBottomThickness());
	        pstmt.setFloat(14,fra.getRoofThickness());
	        pstmt.setFloat(15, fra.getArmThikness());
	        pstmt.setObject(16, fra.getExtraPictures());
	        pstmt.setString(17, fra.getCaption()); 
	        pstmt.setString(18, fra.getModel());
	        pstmt.executeUpdate();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<Frame> findAll() {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<Frame> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.frame;";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Frame fra=new Frame(resSet.getString(1), resSet.getString(2), 
						resSet.getInt(3), resSet.getString(4), 
						null,
						resSet.getString(17),resSet.getInt(5),
						resSet.getFloat(6), resSet.getFloat(7), null, 
						resSet.getBoolean(9), resSet.getString(10),
						resSet.getString(11), resSet.getInt(12),
						resSet.getFloat(13), resSet.getFloat(14),
						resSet.getFloat(15));
				if(resSet.getString(8)==null)
					fra.setIntegratedPh(null);
				else
				{
					PowerHub ph=new PowerHubDaoImpl(connection).findByModel(resSet.getString(8)).get(0);
					fra.setIntegratedPh(ph);
				}
				Blob inBlob=resSet.getBlob(16);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();                //获取二进制流对象  
	                BufferedInputStream bis=new BufferedInputStream(is);    //带缓冲区的流对象  
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);          //一次性全部读到buff中  
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                fra.setExtraPictures(ls);
				}
				result.add(fra);
			} 
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<Frame> findByModel(String model) {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<Frame> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.frame WHERE `fra_model`like '%"+model+"%';";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Frame fra=new Frame(resSet.getString(1), resSet.getString(2), 
						resSet.getInt(3), resSet.getString(4), 
						null,
						resSet.getString(17),resSet.getInt(5),
						resSet.getFloat(6), resSet.getFloat(7), null, 
						resSet.getBoolean(9), resSet.getString(10),
						resSet.getString(11), resSet.getInt(12),
						resSet.getFloat(13), resSet.getFloat(14),
						resSet.getFloat(15));
				if(resSet.getString(8)==null)
					fra.setIntegratedPh(null);
				else{
					PowerHub pb=new PowerHubDaoImpl(connection).findByModel(resSet.getString(8)).get(0);
					fra.setIntegratedPh(pb);
				}
				Blob inBlob=resSet.getBlob(16);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();                //获取二进制流对象  
	                BufferedInputStream bis=new BufferedInputStream(is);    //带缓冲区的流对象  
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);          //一次性全部读到buff中  
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                fra.setExtraPictures(ls);
				}
				result.add(fra);
			} 
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

}