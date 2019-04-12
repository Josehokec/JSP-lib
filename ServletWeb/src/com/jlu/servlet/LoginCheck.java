package com.jlu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlu.DAO.UserDAO;

@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);    //goGet same doPost
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName;
		String password;
		
		userName = request.getParameter("username");    //��ҳ��   ��ҪУ��
		password = request.getParameter("password");
		
		UserDAO userDao = new UserDAO();   //�õ����ݷ��ʵķ���
		
		if(userDao.loginCheck(userName, password)){   //����û��������������ݿ�����
			request.getRequestDispatcher("welcome.html").forward(request, response);
		}else{
			response.sendRedirect("error.html");
		}
	}

}
