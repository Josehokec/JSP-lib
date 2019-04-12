<%@page import="java.util.List"%>
<%@page import="com.jlu.bean.UserBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User List</title>

<script>
	function midify(userid){
		form1.user_id.value = userid;
		form1.submit();
	}
</script>

</head>
<body>

<form name="form1" action="../UserManage" method="post">
	<input type="hidden" name="user_id"/>
<jsp:useBean id="userDao" class="com.jlu.DAO.UserDAO">
</jsp:useBean>
<table border="1">
<tr>
	<td>ID</td><td>User Name</td><td>Password</td><td>PhoneNumber</td><td>Email</td><td>Address</td>
	<td>操作</td>
	
</tr>
<%
	List<UserBean> userList = userDao.getAllUsers();
	for(UserBean u:userList){
%>
	<tr>
		<td><%= u.getId() %></td>
		<td><%= u.getUserName() %></td>	
		<td><%= u.getPassWord() %></td>	
		<td><%= u.getPhoneNum() %></td>	
		<td><%= u.getEmail() %></td>	
		<td><%= u.getAddress() %></td>
		<td>
			<input type="button" onclick="midify(<%= u.getId()%>)"/>
		</td>
	</tr>
<%		
	}
%>
</table>

</form>

</body>
</html>