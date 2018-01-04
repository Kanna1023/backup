package com.internousdev.shop.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.BuyItemDAO;
import com.internousdev.shop.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	public List<BuyItemDTO>dtoList = new ArrayList<BuyItemDTO>();
	public Map<String,Object>session;

	public String execute() {
		String result = "login";

		//LoginActionでsesion.putしたものをkeyとして利用
		if(session.containsKey("idPro")) {

		BuyItemDAO dao = new BuyItemDAO();
		dtoList = dao.select();
		if(dtoList.size()>0) {
			session.put("proDTOList",dtoList);
		}
		return SUCCESS;
		}
		return result;
	}

	public void setSession(Map<String,Object>session) {
		this.session = session;
	}
}

