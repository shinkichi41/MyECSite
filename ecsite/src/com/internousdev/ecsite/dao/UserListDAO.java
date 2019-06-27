package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	public List<UserInfoDTO> getUser() throws SQLException{
		List<UserInfoDTO> userInfo = new ArrayList<UserInfoDTO>();
		String sql = "SELECT * FROM login_user_transaction ORDER BY id";
		try{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while(rs.next()){
		UserInfoDTO dto = new UserInfoDTO();
		dto.setId(rs.getString("id"));
		dto.setLoginId(rs.getString("login_id"));
		dto.setLoginPass(rs.getString("login_pass"));
		dto.setUserName(rs.getString("user_name"));
		dto.setInsert_date(rs.getString("insert_date"));
		dto.setUpdated_date(rs.getString("updated_date"));
		dto.setAdmin_flg(rs.getString("admin_flg"));
		userInfo.add(dto);
		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		con.close();
	}
	return userInfo;
	}
}
