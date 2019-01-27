<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.jm2181222.model.User" %>
	<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
</head>
<body>

<% User user = (User)request.getAttribute("u"); %>
	<table border="1px">
		<tr>
			<td>Name</td>
			<td>${requestScope.u.name}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td><%= user.getAge() %></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><%= user.getEmail() %></td>
		</tr>
		<tr>
			<td>Courses</td>
			<td><%= user.getCourses() %></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><%= user.getGender() %></td>
		</tr>
		<tr>
			<td>Country</td>
			<td><%= user.getCountry() %></td>
		</tr>
		<tr>
			<td>Feedback</td>
			<td><%= user.getFeedback() %></td>
		</tr>
			
	</table>
<% out.print(user); %>
<%= application.getInitParameter("institute") %>
</body>
</html>