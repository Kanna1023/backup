package com.internousdev.shop.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.BuyItemDAO;
import com.internousdev.shop.dao.LoginDAO;
import com.internousdev.shop.dto.BuyItemDTO;
import com.internousdev.shop.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String userName;
	private String userPassword;

	private Map<String,Object>session;

	private LoginDAO dao = new LoginDAO();
	private LoginDTO dto = new LoginDTO();

	private BuyItemDAO buyDao = new BuyItemDAO();

	public String execute() {
		String result = ERROR;

		//ログイン実行
		dto = dao.getLoginUserInfo(userName, userPassword);
		session.put("loginUser", dto);

		//ログイン情報を比較
		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;

		//アイテム情報取得
		List<BuyItemDTO>dtoList = new ArrayList<BuyItemDTO>();
		dtoList = buyDao.select();

		session.put("loginPassword", dto.getLoginUserPassword());
			if(dtoList.size()>0) {
				session.put("proDTOList",dtoList);

				return result;
			}
		}
		return result;
	}

	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserPassword(){
		return userPassword;
	}
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}
	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

