package com.internousdev.shop.action;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String userName;
	private String userPassword;
	private String userMail;
	private String userAddress;
	private String gender;
	private String birth;

	public Map<String,Object>session;
	private UserCreateCompleteDAO dao = new UserCreateCompleteDAO();

	public String execute()throws SQLException{
		dao.create(session.get("userName").toString(),
				session.get("userPassword").toString(),
				session.get("userMail").toString(),
				session.get("userAddress").toString(),
				session.get("gender").toString(),
				session.get("birth").toString());
		String result = SUCCESS;
		return result;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setSession(Map<String,Object>session) {
		this.session = session;
	}
}
