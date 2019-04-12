<%@page import="com.jlu.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form action="UpdateUser">
	<table>
		<tr>
			<td>id</td>
			<td>${userInfo.id}</td>			
		</tr>
		<tr>
			<td>User Name</td>
			<td>
				<input type="text" name="userName" value="${userInfo.userName}"/>	
			</td>		
		</tr>
		<tr>
			<td>Password</td>
			<td>
				<input type="text" name="password" value="${userInfo.passWord}"/>	
			</td>		
		</tr>		
		<tr>
			<td>Phone Number</td>
			<td>
				<input type="text" name="phone_num" value="${userInfo.phoneNum}"/>	
			</td>		
		</tr>
		<tr>
			<td>Email</td>
			<td>
				<input type="text" name="email" value="${userInfo.email}"/>	
			</td>		
		</tr>
		<tr>
			<td>Address</td>
			<td>
				<input type="text" name="address" value="${userInfo.address}"/>	
			</td>		
		</tr>
	</table>
	
	<input type="submit"/>
	
</form>