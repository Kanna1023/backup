package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン認証処理
 * Login.jspからログインID、ログインパスワードを受け取り
 * DBへ問い合わせを行います。
 *
 * @author internous
 * @param loginUserId
 * @param loginPassword
 *
 * @return result
 */
public class LoginAction extends ActionSupport implements SessionAware{

	/**
	 * ログインID
	 */
	private String id;

	/**
	 * ログインパスワード
	 */
	private String password;

	/**
	 * ログイン情報を格納
	 */
	//public Map<String,Object>session;　なら下のgetは不要
	private Map<String, Object> session;

	/**
	 * ログイン情報取得DAO
	 */
	private LoginDAO dao = new LoginDAO();

	/**
	 * ログイン情報格納IDTO
	 */
	private LoginDTO dto = new LoginDTO();

	/**
	 * アイテム情報を取得
	 */
	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	/**
	 * 実行メソッド
	 */
	public String execute() {

		String result = ERROR;

		// ログイン実行
		dto = dao.getLoginUserInfo(id, password);

		session.put("loginUser", dto);

		// ログイン情報を比較
		if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;

			// アイテム情報を取得
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			session.put("login_user_id",	dto.getLoginUserId());
			session.put("id", buyItemDTO.getIdd());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());

			return result;
		}

		return result;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}
	

	
	public Map<String, Object> getSession(){
		return session;
	}
	
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
