package com.jlu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlu.DAO.UserDAO;
import com.jlu.bean.UserBean;

@WebServlet("/UserManage")
public class UserManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
    public UserManage() {
        super();      
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userid=0;
		String uid;
		uid= request.getParameter("user_id");
		if(uid!=null){
			userid= Integer.parseInt(uid);
		}
		UserBean user = new UserBean();
		user = UserDAO.getUserById(userid);
		
		request.setAttribute("userInfo",user);
		request.setAttribute("userId",userid);
		request.getRequestDispatcher("users/userinfo.jsp").forward(request, response);
		
	}

}
