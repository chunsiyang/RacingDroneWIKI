package com.RacingDroneWIKI.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.RacingDroneWIKI.dao.dao.EfficacyChartDao;
import com.RacingDroneWIKI.javaBean.EfficacyChart;

public class EfficacyChartDaoImpl implements EfficacyChartDao {
	private  java.sql.Connection connection;
	public EfficacyChartDaoImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean addEfficacyChart(EfficacyChart efct) {
		String sql = "INSERT INTO `racingdronewiki`.`efficacy_chart` "
				+ "(`moto_model`, `efct_prop`, `efct_voltages`, "
				+ "`efct_half_load_currency`, `efct_half_pull`, "
				+ "`efct_half_power`, `efct_half_efficlency`, "
				+ "`efct_temperature`, `efct_full_load_currency`, "
				+ "`efct_full_pull`, `efct_full_power`, "
				+ "`efct_full_efficlency`) VALUES "
				+ "(?, ?, ?, ?, ?, ?, ?, ?,?, ? ,?, ?);";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, efct.getMotoModel());
	        pstmt.setString(2, efct.getProp()); 
	        pstmt.setFloat(3, efct.getVoltages());
	        pstmt.setFloat(4, efct.getHalfLoadCurrency());
	        pstmt.setInt(5, efct.getHalfPull());
	        pstmt.setFloat(6, efct.getHalfPower());
	        pstmt.setFloat(7, efct.getHalfEfficlency());
	        pstmt.setFloat(8, efct.getTemperature());
	        pstmt.setFloat(9, efct.getFullLoadCurrency());
	        pstmt.setInt(10, efct.getFullPull());
	        pstmt.setFloat(11, efct.getFullPower());
	        pstmt.setFloat(12, efct.getFullEfficlency());
	        pstmt.executeUpdate();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return true;
	}

	public boolean deleteEfficacyChart(EfficacyChart efct) {
		// TODO: implement
		return false;
	}

	public boolean updataMoto(EfficacyChart efct) {
		String sql="UPDATE `racingdronewiki`.`efficacy_chart` "
				+ "SET `moto_model`=?, `efct_prop`=?, "
				+ "`efct_voltages`=?, `efct_half_load_currency`=?,"
				+ " `efct_half_pull`=?, `efct_half_power`=?, "
				+ "`efct_half_efficlency`=?, `efct_temperature`=?,"
				+ " `efct_full_load_currency`=?, `efct_full_pull`=?,"
				+ " `efct_full_power`=?, `efct_full_efficlency`=?"
				+ " WHERE `efct_id`=?;";
		PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) connection.prepareStatement(sql);
	        pstmt.setString(1, efct.getMotoModel());
	        pstmt.setString(2, efct.getProp()); 
	        pstmt.setFloat(3, efct.getVoltages());
	        pstmt.setFloat(4, efct.getHalfLoadCurrency());
	        pstmt.setInt(5, efct.getHalfPull());
	        pstmt.setFloat(6, efct.getHalfPower());
	        pstmt.setFloat(7, efct.getHalfEfficlency());
	        pstmt.setFloat(8, efct.getTemperature());
	        pstmt.setFloat(9, efct.getFullLoadCurrency());
	        pstmt.setInt(10, efct.getFullPull());
	        pstmt.setFloat(11, efct.getFullPower());
	        pstmt.setFloat(12, efct.getFullEfficlency());
	        pstmt.setInt(13, efct.getId());
	        pstmt.executeUpdate();
	        pstmt.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return true;
	}

	public List<EfficacyChart> findAll() {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<EfficacyChart> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.efficacy_chart;";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				EfficacyChart eff=new EfficacyChart(resSet.getInt(1), 
						resSet.getString(2), resSet.getString(3), resSet.getFloat(4), 
						resSet.getFloat(5), resSet.getInt(6), 
						resSet.getFloat(7), resSet.getFloat(8),
						resSet.getInt(9), resSet.getFloat(10), 
						resSet.getInt(11), resSet.getFloat(12), 
						resSet.getFloat(13));
				result.add(eff);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

	public List<EfficacyChart> findByModel(String model) {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<EfficacyChart> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.efficacy_chart WHERE `efct_id`like '%"+model+"%';";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				EfficacyChart eff=new EfficacyChart(resSet.getInt(1), 
						resSet.getString(2), resSet.getString(3), resSet.getFloat(4), 
						resSet.getFloat(5), resSet.getInt(6), 
						resSet.getFloat(7), resSet.getFloat(8),
						resSet.getInt(9), resSet.getFloat(10), 
						resSet.getInt(11), resSet.getFloat(12), 
						resSet.getFloat(13));
				result.add(eff);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(!result.iterator().hasNext())
			return null;
		return result;
	}

}