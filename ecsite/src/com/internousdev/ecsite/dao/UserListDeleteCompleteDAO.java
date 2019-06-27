package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserListDeleteCompleteDAO {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	public int deleteUser() throws SQLException{

		String sql = "DELETE FROM login_user_transaction WHERE admin_flg != 1";
		int result = 0;
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}

}
