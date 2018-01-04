package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.shop.util.DBConnector;
import com.internousdev.shop.util.DateUtil;

public class UserCreateCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO user(user_name,user_pass,user_email,user_address,user_gender,user_born,user_date) VALUES(?,?,?,?,?,?,?)";

	public void create(String name,String pass, String mail,String address,String gender, String born)throws SQLException{
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pass);
			ps.setString(3, mail);
			ps.setString(4, address);
			ps.setString(5, gender);
			ps.setString(6, born);
			ps.setString(7, dateUtil.getDate());
			ps.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

}
