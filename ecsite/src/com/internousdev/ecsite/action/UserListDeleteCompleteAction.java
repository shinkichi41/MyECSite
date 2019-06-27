package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport{

	private String message;
	UserListDeleteCompleteDAO dao = new UserListDeleteCompleteDAO();

	public String execute() throws SQLException{
		String result = ERROR;
		int res = dao.deleteUser();

		if(res > 0){
			setMessage("削除が完了しました");
		}else{
			setMessage("削除に失敗しました");
		}
		result = SUCCESS;
		return result;
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}

}
