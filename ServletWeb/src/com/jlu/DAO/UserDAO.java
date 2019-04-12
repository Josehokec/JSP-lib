package com.jlu.DAO;

import com.jlu.bean.UserBean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {     //与user相关的都写在这里面
	static public List<UserBean> getAllUsers() {
		List<UserBean> userList = new ArrayList<UserBean>();
		
		Connection conn = DBUtils.getConnection();   //static method
		//Exception
		try {
			Statement stm = conn.createStatement();
			String sql = "select * from users";
			
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()){    //遍历
				UserBean user = new UserBean();
				user.setUserName(rs.getString("username"));
				user.setPassWord(rs.getString("password"));
				user.setId(rs.getInt("id"));
				user.setAddress(rs.getString("address"));
				user.setEmail(rs.getString("email"));
				user.setPhoneNum(rs.getString("phone_num"));
				userList.add(user);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userList;
	}
	
	public boolean changeUser(UserBean user){   //改
		//...
		return true;
	}
	
	public boolean deleteUser(UserBean user){  //删
		//...
		return true;
	}
	
	public boolean insertUser(UserBean user){  //增
		Connection conn = DBUtils.getConnection();
		String sql = "insert into users(id, username, passsword, phone_num, email, address)"
				+ " values(?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, user.getId());
			stm.setString(2, user.getUserName());
			stm.setString(3, user.getPassWord());
			stm.setString(4, user.getPhoneNum());
			stm.setString(5, user.getEmail());
			stm.setString(6, user.getAddress());
			int i = stm.executeUpdate();
			if (i == 1) {
				return true;
			}	
			else{
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}				
	}
	
	public boolean loginCheck(String userName, String passWord) {  //查
		Connection conn = DBUtils.getConnection();
		try {
			String sql = "select * from users where username=? and password=?";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, userName);
			stm.setString(2, passWord);
			
			
			ResultSet rs = stm.executeQuery();
			
			if(rs.next()){
				return true;
			}else{
				return false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	public static UserBean getUserById(int userid){
		UserBean user = new UserBean();
		
		Connection conn = DBUtils.getConnection();
		try {
			String sql = "select * from users where id=?";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, userid);
			
			ResultSet rs = stm.executeQuery();
			if(rs.next()){
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("username"));
				user.setPassWord(rs.getString("password"));
				user.setPhoneNum(rs.getString("phone_num"));
				user.setEmail(rs.getString("email"));
				user.setAddress(rs.getString("address"));
			}
				
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		
		return user;
	}
}

