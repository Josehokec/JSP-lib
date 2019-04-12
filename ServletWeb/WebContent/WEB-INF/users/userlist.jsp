<%@page import="java.util.List"%>
<%@page import="com.jlu.bean.UserBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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

<form name="form1" action="../UserManage" method="post">
	<input type="hidden" name="user_id"/>

<jsp:useBean id="users" class="com.jlu.bean.Users">
</jsp:useBean>

<table border="1">
	<tr>
		<td>ID</td>
		<td>User Name</td>
		<td>Password</td>
		<td>PhoneNumber</td>
		<td>Email</td>
		<td>Address</td>
		<td>操作</td>
	</tr>

	<c:forEach items="${users.userList}" var="u">
		<tr>
			<td>${u.id} </td>
			<td>${u.userName} </td>	
			<td>${u.passWord} </td>	
			<td>${u.phoneNum} </td>	
			<td>${u.email} </td>	
			<td>${u.address} </td>
			<td>
				<!--  --> <input type="button" onclick="midify(${u.id})"/>
			</td>
		</tr>
	</c:forEach>
</table>
</form>