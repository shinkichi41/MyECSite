package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private List<UserInfoDTO> userInfo = new ArrayList<UserInfoDTO>();

	public String execute() throws SQLException{
		UserListDAO dao = new UserListDAO();
		userInfo = dao.getUser();

		if(!(userInfo.size() > 0)){
			userInfo = null;
		}

		String result = SUCCESS;
		return result;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public List<UserInfoDTO> getUserInfo(){
		return userInfo;
	}

	public void setUserInfo(List<UserInfoDTO> userInfo){
		this.userInfo = userInfo;
	}

}
