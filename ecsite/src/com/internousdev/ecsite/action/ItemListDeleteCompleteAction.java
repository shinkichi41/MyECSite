package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport{

	private String message;
	ItemListDeleteCompleteDAO dao = new ItemListDeleteCompleteDAO();

	public String execute() throws SQLException{
		int res = dao.itemDelete();

		if(res > 0){
			setMessage("削除が完了しました");
		}else{
			setMessage("削除に失敗しました");
		}
		String result = SUCCESS;
		return result;
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}

}
