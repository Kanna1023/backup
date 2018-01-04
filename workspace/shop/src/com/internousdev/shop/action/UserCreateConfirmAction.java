package com.internousdev.shop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String userName;
	private String userPassword;
	private String userMail;
	private String userAddress;
	private String gender;
	private String birth;

	public Map<String,Object>session;

	private String errorMassage;

	public String execute() {
		String result = SUCCESS;

		if(!(userName.equals(""))&&!(userPassword.equals(""))&&!(userMail.equals(""))&&!(userAddress.equals(""))&&!(gender.equals(""))&&!(birth.equals(""))) {
			session.put("userName",userName);
			session.put("userPassword", userPassword);
			session.put("userMail", userMail);
			session.put("userAddress", userAddress);
			session.put("gender", gender);
			session.put("birth", birth);
		}else {
			setErrorMassage("未入力の項目があります。");
			result = ERROR;
		}
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

	public String setErrormassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
}
