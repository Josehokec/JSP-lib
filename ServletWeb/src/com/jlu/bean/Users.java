package com.jlu.bean;

import java.util.*;

import com.jlu.DAO.UserDAO;

public class Users {
	private List<UserBean> userList;
	
	public Users(){
		this.userList = new ArrayList<UserBean>();
	}

	public List<UserBean> getUserList() {
		userList = UserDAO.getAllUsers();
		return userList;
	}

	public void setUserList(List<UserBean> userList) {
		this.userList = userList;
	}
}
