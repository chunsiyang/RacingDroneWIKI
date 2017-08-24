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

import com.RacingDroneWIKI.dao.dao.PropDao;
import com.RacingDroneWIKI.javaBean.Prop;

public class PropDaoImpl implements PropDao {
	private  java.sql.Connection connection;
	public PropDaoImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean addProp(Prop prop) {
		String sql="INSERT INTO `racingdronewiki`.`prop` (`prop_model`,"
				+ " `prop_img`, `prop_reference_price`, `prop_anufacturer`, "
				+ "`prop_blade_number`, `prop_size`, `prop_weight`, "
				+ "`prop_mounting_hole_spacing`, `prop_material`, `prop_extra_pictures`,"
				+ " `prop_caption`) VALUES ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		
		PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, prop.getModel());
	        pstmt.setString(2, prop.getImgUrl()); 
	        pstmt.setInt(3, prop.getReferencePrice());
	        pstmt.setString(4, prop.getAnufacturer());
	        pstmt.setInt(5, prop.getBladeNumber());
	        pstmt.setString(6,prop.getSize());
	        pstmt.setFloat(7, prop.getWeight());
	        pstmt.setFloat(8, prop.getMountingHoleSpacing());
	        pstmt.setString(9, prop.getMaterial());
	        pstmt.setObject(10, prop.getExtraPictures());
	        pstmt.setString(11, prop.getCaption()); 
	        pstmt.executeUpdate();
	        pstmt.close();
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
		String sql="UPDATE `racingdronewiki`.`prop` SET `prop_model`=?, "
				+ "`prop_img`=?, `prop_reference_price`=?, `prop_anufacturer`=?,"
				+ " `prop_blade_number`=?, `prop_size`=?, `prop_weight`=?,"
				+ " `prop_mounting_hole_spacing`=?, `prop_material`=?,"
				+ " `prop_extra_pictures`=?, `prop_caption`=? WHERE `prop_model`=?;";
		
		PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, prop.getModel());
	        pstmt.setString(2, prop.getImgUrl()); 
	        pstmt.setInt(3, prop.getReferencePrice());
	        pstmt.setString(4, prop.getAnufacturer());
	        pstmt.setInt(5, prop.getBladeNumber());
	        pstmt.setString(6,prop.getSize());
	        pstmt.setFloat(7, prop.getWeight());
	        pstmt.setFloat(8, prop.getMountingHoleSpacing());
	        pstmt.setString(9, prop.getMaterial());
	        pstmt.setObject(10, prop.getExtraPictures());
	        pstmt.setString(11, prop.getCaption()); 
	        pstmt.setString(12, prop.getModel());
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
		List<Prop> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.prop;";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Prop prop=new Prop(resSet.getString(1), resSet.getString(2),
						resSet.getInt(3), resSet.getString(4),
						null, resSet.getString(11),
						resSet.getInt(5), resSet.getString(6), 
						resSet.getFloat(7), resSet.getFloat(8),
						resSet.getString(9));
				Blob inBlob=resSet.getBlob(10);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();                //获取二进制流对象  
	                BufferedInputStream bis=new BufferedInputStream(is);    //带缓冲区的流对象  
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);          //一次性全部读到buff中  
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                prop.setExtraPictures(ls);
				}
				result.add(prop);
			} 
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return result;
	}

	@SuppressWarnings("unchecked")
	public List<Prop> findByModel(String model) {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<Prop> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.prop WHERE `ant_model`like '%"+model+"%';";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Prop prop=new Prop(resSet.getString(1), resSet.getString(2),
						resSet.getInt(3), resSet.getString(4),
						null, resSet.getString(11),
						resSet.getInt(5), resSet.getString(6), 
						resSet.getFloat(7), resSet.getFloat(8),
						resSet.getString(9));
				Blob inBlob=resSet.getBlob(10);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();                //获取二进制流对象  
	                BufferedInputStream bis=new BufferedInputStream(is);    //带缓冲区的流对象  
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);          //一次性全部读到buff中  
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                prop.setExtraPictures(ls);
				}
				result.add(prop);
			} 
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return result;
	}

}