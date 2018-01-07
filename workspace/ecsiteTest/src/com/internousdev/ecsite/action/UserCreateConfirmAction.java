package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCheckDAO;
import com.opensymphony.xwork2.ActionSupport;



public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	//ログインIDのこと
	private String userId;

	private String password;

	private String familyName;

	private String firstName;

	private String familyNameKana;

	private String firstNameKana;

	private int sex;

	private String email;

	private Map<String,Object> session;

	private List<String> errorMessage = new ArrayList<>();
	private String blank = "未入力です。";
	private String duplicate = "登録済みです。";


	private UserCheckDAO checkDAO = new UserCheckDAO();

	public String execute() throws SQLException{

		String result = ERROR;
		int ErrorCount = 0;


		//ユーザーID(ログインID)
		if((checkDAO.checkCount(userId)>0)){
			errorMessage.add(duplicate);
			ErrorCount++;
		}
		if(userId.length()<1||userId.length()>8){
			errorMessage.add("ユーザーIDは1文字以上8文字以内で入力してください。");
			ErrorCount++;
		}
		if(userId.equals("")){
			errorMessage.add(blank);
			ErrorCount++;
		}
		if (!userId.matches("^[0-9a-zA-Z]+$")) {
			errorMessage.add("ユーザーIDは半角英数字で入力してください。");
			ErrorCount++;
		}
		//パスワード
		if(password.length()<1||password.length()>8){
			errorMessage.add("パスワードは1文字以上8文字以内で入力してください。");
			ErrorCount++;
		}
		if(password.equals("")){
			errorMessage.add(blank);
			ErrorCount++;
		}
		if (!userId.matches("^[0-9a-zA-Z]+$")) {
			errorMessage.add("ユーザーIDは半角英数字で入力してください。");
			ErrorCount++;
		}

		//姓
		if(familyName.equals("")) {
			errorMessage.add(blank);
			ErrorCount++;
		}
		if(familyName.length()<1 || familyName.length()>16){
			errorMessage.add("姓は1文字以上16文字以下で入力してください。");
			ErrorCount++;
		}
		if (!familyName.matches("^[a-zA-Zぁ-ゞ一-龠]+$")) {
			errorMessage.add("姓は半角英数、ひらがな、漢字で入力してください。");
			ErrorCount++;
		}
		//名前
		if(firstName.equals("")) {
			errorMessage.add(blank);
			ErrorCount++;
		}
		if(firstName.length()<1 || firstName.length()>16){
			errorMessage.add("姓は1文字以上16文字以下で入力してください。");
			ErrorCount++;
		}
		if (!firstName.matches("^[a-zA-Zぁ-ゞ一-龠]+$")) {
			errorMessage.add("名前は半角英数、ひらがな、漢字で入力してください。");
			ErrorCount++;
		}
		//姓ふりがな
		if(familyNameKana.equals("")) {
			errorMessage.add(blank);
			ErrorCount++;
		}
		if(familyNameKana.length()<1 || familyNameKana.length()>16){
			errorMessage.add("姓（ふりがな）は1文字以上16文字以下で入力してください。");
			ErrorCount++;
		}
		if (!familyNameKana.matches("^[ぁ-ゞ]+$")) {
			errorMessage.add("姓（ふりがな）はひらがなで入力してください。");
			ErrorCount++;
		}
		//名前ふりがな
		if(firstNameKana.equals("")) {
			errorMessage.add(blank);
			ErrorCount++;
		}
		if(firstNameKana.length()<1 || firstNameKana.length()>16){
			errorMessage.add("名前(ふりがな）は1文字以上16文字以下で入力してください。");
			ErrorCount++;
		}
		if (!firstNameKana.matches("^[ぁ-ゞ]+$")) {
			errorMessage.add("名前（ふりがな）はひらがなで入力してください。");
			ErrorCount++;
		}
		//メール
		if(email.equals("")){
			errorMessage.add(blank);
			ErrorCount++;
		}
		if(email.length()<18 || email.length()>32){
			errorMessage.add("メールアドレスは18文字以上32文字以下で入力してください。");
			ErrorCount++;
		}
		if (!email.matches("^[\\w!#%&'/=~`\\*\\+\\?\\{\\}\\^\\$\\-\\|]+(\\.[\\w!#%&'/=~`\\*\\+\\?\\{\\}\\^\\$\\-\\|]+)*@[\\w!#%&'/=~`\\*\\+\\?\\{\\}\\^\\$\\-\\|]+(\\.[\\w!#%&'/=~`\\*\\+\\?\\{\\}\\^\\$\\-\\|]+)*$")) {
			errorMessage.add("正しいメールアドレスの形式で入力してください。");
			ErrorCount++;
		}

		if(ErrorCount>0) {
		result = ERROR;
		}else{
		session.put("userId", userId);
		session.put("password", password);
		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("sex", sex);
		session.put("email", email);
		result = SUCCESS;
	}

	return result;

}


	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName= familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName= firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana= familyNameKana;
	}
	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana= firstNameKana;
	}
	public int getSex() {
		return sex;
	}

	public void set(int sex ) {
		this.sex= sex;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email= email;
	}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this. userId= userId;
	}
	public String getPassword() {
		return password;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
