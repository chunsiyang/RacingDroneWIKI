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

import com.RacingDroneWIKI.dao.dao.AntennaDao;
import com.RacingDroneWIKI.javaBean.Antenna;


public class AntennaDaoImpl implements AntennaDao {
	private  java.sql.Connection connection;
	public AntennaDaoImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean addAntenna(Antenna ant) {
	    String sql = "INSERT INTO `racingdronewiki`.`antenna` "
	    		+ "(`ant_model`, `ant_img`, `ant_reference_price`, `ant_anufacturer`,"
	    		+ " `ant_weight`, `ant_length`, `ant_connectors`, `ant_frequency`, "
	    		+ "`ant_gain`, `ant_axial_ratic`, `ant_polarization`, `ant_extra_pictures`,"
	    		+ " `ant_caption`) "
	    		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, ant.getModel());
	        pstmt.setString(2, ant.getImgUrl()); 
	        pstmt.setInt(3, ant.getReferencePrice());
	        pstmt.setString(4, ant.getAnufacturer());
	        pstmt.setFloat(5, ant.getWeight());
	        pstmt.setFloat(6, ant.getLength());
	        pstmt.setString(7, ant.getConnectors());
	        pstmt.setString(8, ant.getFrequency());
	        pstmt.setFloat(9, ant.getGain());
	        pstmt.setFloat(10, ant.getAxialRatic());
	        pstmt.setString(11, ant.getPolarization());
	        pstmt.setObject(12, ant.getExtraPictures());
	        pstmt.setString(13, ant.getCaption()); 
	        pstmt.executeUpdate();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return true;
	}

	public boolean deleteAntenna(Antenna ant) {
		// TODO: implement
		return false;
	}

	public boolean updatAantenna(Antenna ant) {
	    String sql="UPDATE `racingdronewiki`.`antenna` "
	    		+ "SET `ant_model`=?, "
	    		+ "`ant_img`=?, `ant_reference_price`=?,"
	    		+ " `ant_anufacturer`=?, `ant_weight`=?, "
	    		+ "`ant_length`=?, `ant_connectors`=?, "
	    		+ "`ant_frequency`=?, `ant_gain`=?, "
	    		+ "`ant_axial_ratic`=?, "
	    		+ "`ant_polarization`=?, "
	    		+ "`ant_extra_pictures`=?, "
	    		+ "`ant_caption`=? WHERE "
	    		+ "`ant_model`=?;";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, ant.getModel());
	        pstmt.setString(2, ant.getImgUrl()); 
	        pstmt.setInt(3, ant.getReferencePrice());
	        pstmt.setString(4, ant.getAnufacturer());
	        pstmt.setFloat(5, ant.getWeight());
	        pstmt.setFloat(6, ant.getLength());
	        pstmt.setString(7, ant.getConnectors());
	        pstmt.setString(8, ant.getFrequency());
	        pstmt.setFloat(9, ant.getGain());
	        pstmt.setFloat(10, ant.getAxialRatic());
	        pstmt.setString(11, ant.getPolarization());
	        pstmt.setObject(12, ant.getExtraPictures());
	        pstmt.setString(13, ant.getCaption()); 
	        pstmt.setString(14, ant.getModel());
	        pstmt.executeUpdate();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<Antenna> findAll() {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<Antenna> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.antenna;";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Antenna ant=new Antenna(resSet.getString(1),
						resSet.getString(2), resSet.getInt(3), 
						resSet.getString(4),
						null, 
						resSet.getString(13), 
						resSet.getFloat(5), resSet.getFloat(6), 
						resSet.getString(7), resSet.getString(8),
						resSet.getFloat(9), resSet.getFloat(10),
						resSet.getString(11));
				Blob inBlob=resSet.getBlob(12);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();
	                BufferedInputStream bis=new BufferedInputStream(is);
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                ant.setExtraPictures(ls);
				}
				result.add(ant);
			} 
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<Antenna> findByModel(String model) {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<Antenna> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.antenna WHERE `ant_model`like '%"+model+"%';";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Antenna ant=new Antenna(resSet.getString(1),
						resSet.getString(2), resSet.getInt(3), 
						resSet.getString(4), null, resSet.getString(13), 
						resSet.getFloat(5), resSet.getFloat(6), 
						resSet.getString(7), resSet.getString(8),
						resSet.getFloat(9), resSet.getFloat(10),
						resSet.getString(11));
				Blob inBlob=resSet.getBlob(12);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();
	                BufferedInputStream bis=new BufferedInputStream(is);
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                ant.setExtraPictures(ls);
				}
				result.add(ant);
			} 
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

}