package com.RacingDroneWIKI.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.RacingDroneWIKI.dao.dao.AntennaDao;
import com.RacingDroneWIKI.pojo.Antenna;


public class AntennaDaoImpl implements AntennaDao {
	private  java.sql.Connection connection;
	public AntennaDaoImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public int addAntenna(Antenna ant) {
	    String sql = "INSERT INTO `racingdronewiki`.`antenna` "
	    		+ "(`model`, `img`, `reference_price`, `anufacturer`,"
	    		+ " `weight`, `length`, `connectors`, `frequency`, "
	    		+ "`gain`, `axial_ratic`, `polarization`,"
	    		+ " `caption`) "
	    		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
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
	        pstmt.setString(12, ant.getCaption());
	        pstmt.executeUpdate();
	        pstmt.close();
	        new ExtraPicturesImpl(connection).addExtPic(ant.getModel(),ant.getExtraPictures());
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return 0;
	}

	public int deleteAntenna(Antenna ant) {
		// TODO: implement
		return 0;
	}

	@Override
	public Antenna findDetail(String model) {
		return null;
	}

	public int updatAantenna(Antenna ant) {
	    String sql="UPDATE `racingdronewiki`.`antenna` "
	    		+ "SET `model`=?, "
	    		+ "`img`=?, `reference_price`=?,"
	    		+ " `anufacturer`=?, `weight`=?, "
	    		+ "`length`=?, `connectors`=?, "
	    		+ "`frequency`=?, `gain`=?, "
	    		+ "`axial_ratic`=?, "
	    		+ "`polarization`=?, "
	    		+ "`extra_pictures`=?, "
	    		+ "`caption`=? WHERE "
	    		+ "`model`=?;";
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
	        pstmt.setString(12, ant.getCaption());
	        pstmt.setString(13, ant.getModel());
	        pstmt.executeUpdate();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return 0;
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
						resSet.getString(12),
						resSet.getFloat(5), resSet.getFloat(6), 
						resSet.getString(7), resSet.getString(8),
						resSet.getFloat(9), resSet.getFloat(10),
						resSet.getString(11));
				LinkedList<String > expImg= new ExtraPicturesImpl(connection).getExtPic(ant.getModel());
				ant.setExtraPictures(expImg);
				result.add(ant);
			} 
		} catch (SQLException e) {
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
		String sql="SELECT * FROM racingdronewiki.antenna WHERE `model`like '%"+model+"%';";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Antenna ant=new Antenna(resSet.getString(1),
						resSet.getString(2), resSet.getInt(3), 
						resSet.getString(4), null, resSet.getString(12),
						resSet.getFloat(5), resSet.getFloat(6), 
						resSet.getString(7), resSet.getString(8),
						resSet.getFloat(9), resSet.getFloat(10),
						resSet.getString(11));
				LinkedList<String > expImg= new ExtraPicturesImpl(connection).getExtPic(ant.getModel());
				ant.setExtraPictures(expImg);
				result.add(ant);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

}