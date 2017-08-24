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

import com.RacingDroneWIKI.dao.dao.MotoDao;
import com.RacingDroneWIKI.dao.daoProxy.EfficacyChartDaoProxy;
import com.RacingDroneWIKI.javaBean.Moto;

public class MotoDaoImpl implements MotoDao {
	private java.sql.Connection connection;

	public MotoDaoImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean addMoto(Moto moto) {
		String sql = "INSERT INTO `racingdronewiki`.`motor` " 
				+ "(`moto_model`, `moto_img`, "
				+ "`moto_reference_price`, " 
				+ "`moto_anufacturer`, " 
				+ "`moto_stator_length`, "
				+ "`moto_shaft_diameter`, " 
				+ "`moto_idle_current`, `moto_weight`, "
				+ "`moto_diameter`, `moto_length`, `moto_no_of_cells`,"
				+ " `moto_max_thrust`, `moto_kv`, `moto_propeller`,"
				+ " `moto_stator_diameter`, `moto_internal_reslstance`, "
				+ "`moto_extra_pictures`, `moto_caption`)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ? , ?, ?, ?, "
				+ "?, ?, ?, ?, ? ?, ?);";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			pstmt.setString(1, moto.getModel());
			pstmt.setString(2, moto.getImgUrl());
			pstmt.setInt(3, moto.getReferencePrice());
			pstmt.setString(4, moto.getAnufacturer());
			pstmt.setFloat(5, moto.getStatorLength());
			pstmt.setFloat(6, moto.getShaftDiameter());
			pstmt.setFloat(7, moto.getIdleCurrent());
			pstmt.setFloat(8, moto.getWeight());
			pstmt.setFloat(9, moto.getDiameter());
			pstmt.setFloat(10, moto.getLength());
			pstmt.setString(11, moto.getNoOfCells());
			pstmt.setInt(12, moto.getMaxThrust());
			pstmt.setInt(13, moto.getKv());
			pstmt.setString(14, moto.getPropeller());
			pstmt.setFloat(15, moto.getStatorDiameter());
			pstmt.setInt(16, moto.getInternalRestance());
			pstmt.setObject(17, moto.getExtraPictures());
			pstmt.setString(18, moto.getCaption());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean deleteMoto(Moto moto) {
		// TODO: implement
		return false;
	}

	public boolean updataMoto(Moto moto) {
		String sql = "UPDATE `racingdronewiki`."
				+ "`motor` SET `moto_model`=?,"
				+ " `moto_img`=?, `moto_reference_price`=?,"
				+ " `moto_anufacturer`=?, `moto_stator_length`=?, "
				+ "`moto_shaft_diameter`=?, `moto_idle_current`=?, "
				+ "`moto_weight`=?, `moto_diameter`=?, `moto_length`=?,"
				+ " `moto_no_of_cells`=?, `moto_max_thrust`=?, `moto_kv`=?,"
				+ " `moto_propeller`=?, `moto_stator_diameter`=?, "
				+ "`moto_internal_reslstance`=?, `moto_extra_pictures`=?,"
				+ " `moto_caption`=? WHERE `moto_model`=?;";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			pstmt.setString(1, moto.getModel());
			pstmt.setString(2, moto.getImgUrl());
			pstmt.setInt(3, moto.getReferencePrice());
			pstmt.setString(4, moto.getAnufacturer());
			pstmt.setFloat(5, moto.getStatorLength());
			pstmt.setFloat(6, moto.getShaftDiameter());
			pstmt.setFloat(7, moto.getIdleCurrent());
			pstmt.setFloat(8, moto.getWeight());
			pstmt.setFloat(9, moto.getDiameter());
			pstmt.setFloat(10, moto.getLength());
			pstmt.setString(11, moto.getNoOfCells());
			pstmt.setInt(12, moto.getMaxThrust());
			pstmt.setInt(13, moto.getKv());
			pstmt.setString(14, moto.getPropeller());
			pstmt.setFloat(15, moto.getStatorDiameter());
			pstmt.setInt(16, moto.getInternalRestance());
			pstmt.setObject(17, moto.getExtraPictures());
			pstmt.setString(18, moto.getCaption());
			pstmt.setString(19, moto.getModel());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<Moto> findAll() {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<Moto> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.motor;";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Moto moto=new Moto(resSet.getString(1), resSet.getString(2), resSet.getInt(3),
						resSet.getString(4), null, resSet.getString(18), 
						resSet.getFloat(5), resSet.getFloat(6), resSet.getFloat(7), 
						resSet.getFloat(8), resSet.getFloat(9), resSet.getFloat(10), resSet.getString(11), 
						resSet.getInt(12),resSet.getInt(13), resSet.getString(14), resSet.getFloat(15),
						resSet.getInt(16),
						null);
				Blob inBlob=resSet.getBlob(12);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();                //��ȡ������������  
	                BufferedInputStream bis=new BufferedInputStream(is);    //����������������  
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);          //һ����ȫ������buff��  
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                moto.setExtraPictures(ls);
				}
				EfficacyChartDaoProxy ecPro=new EfficacyChartDaoProxy();
				moto.setEfficacyChart(ecPro.findByModel(moto.getModel()));
				result.add(moto);
			} 
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	@SuppressWarnings("unchecked")
	public List<Moto> findByModel(String model) {
		PreparedStatement pstmt;
		ResultSet resSet;
		List<Moto> result=new LinkedList<>();
		String sql="SELECT * FROM racingdronewiki.motor WHERE `moto_model`like '%"+model+"%';";
		try {
			pstmt = (PreparedStatement) connection.prepareStatement(sql);
			resSet=pstmt.executeQuery();
			while(resSet.next())
			{
				Moto moto=new Moto(resSet.getString(1), resSet.getString(2), resSet.getInt(3),
						resSet.getString(4), null, resSet.getString(18), 
						resSet.getFloat(5), resSet.getFloat(6), resSet.getFloat(7), 
						resSet.getFloat(8), resSet.getFloat(9), resSet.getFloat(10), resSet.getString(11), 
						resSet.getInt(12),resSet.getInt(13), resSet.getString(14), resSet.getFloat(15),
						resSet.getInt(16),
						null);
				Blob inBlob=resSet.getBlob(17);
				if(inBlob!=null)
				{
					InputStream is=inBlob.getBinaryStream();                //��ȡ������������  
	                BufferedInputStream bis=new BufferedInputStream(is);    //����������������  
	                byte[] buff=new byte[(int) inBlob.length()]; 
	                bis.read(buff, 0, buff.length);          //һ����ȫ������buff��  
	                ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(buff));  
	                LinkedList<String> ls=(LinkedList<String>) in.readObject();
	                moto.setExtraPictures(ls);
				}
				EfficacyChartDaoProxy ecPro=new EfficacyChartDaoProxy();
				moto.setEfficacyChart(ecPro.findByModel(moto.getModel()));
				result.add(moto);
			} 
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

		return result;
	}

}