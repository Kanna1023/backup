package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {

	private DBConnector db = new DBConnector();

	private Connection con = db.getConnection();

	private LoginDTO dto = new LoginDTO();

	/**
	 * ログインユーザ情報取得メソッド
	 *
	 * @param loginUserId
	 * @param loginPassword
	 * @return LoginDTO
	 */
	public LoginDTO getLoginUserInfo(String lId, String lPassword) {

		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, lId);
			ps.setString(2, lPassword);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				dto.setLoginUserId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
//				dto.setUserName(rs.getString("user_name"));

				if(!(rs.getString("login_id").equals(null))) {
					dto.setLoginFlg(true);
				}
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return dto;
	}

	public LoginDTO getLoginDTO() {
		return dto;
	}
}
