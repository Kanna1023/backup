package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.shop.dto.LoginDTO;
import com.internousdev.shop.util.DBConnector;

public class LoginDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private LoginDTO dto = new LoginDTO();

	public LoginDTO getLoginUserInfo(String name, String password) {
		String sql = "SELECT * FROM user where user_name=? AND user_pass=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				dto.setLoginUserName(rs.getString("user_name"));
				dto.setLoginUserPassword(rs.getString("user_pass"));

				if(!(rs.getString("user_pass").equals(null))) {
					dto.setLoginFlg(true);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

		return dto;
	}

}
