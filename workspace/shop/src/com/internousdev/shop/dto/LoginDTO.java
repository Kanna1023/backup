package com.internousdev.shop.dto;

public class LoginDTO {

	private String loginUserName;
	private String loginUserPassword;

	private boolean loginFlg = false;


	public String getLoginUserName() {
		return loginUserName;
	}
	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}

	public String getLoginUserPassword() {
		return loginUserPassword;
	}
	public void setLoginUserPassword(String loginUserPassword) {
		this.loginUserPassword = loginUserPassword;
	}

	public boolean getLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}
}
