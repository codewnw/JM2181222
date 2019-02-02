<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<%@ include file="header.html" %>
	<form action="user-profile-expression-lang.jsp" method="post">
		<table align="center" border="1px">
			<tr>
				<th colspan="2">Registration form</th>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" placeholder="Enter your name" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="number"  required placeholder="Enter your age" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" required placeholder="Enter your email" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" checked="checked" value="Male" /> Male &nbsp;<input
					type="radio" name="gender" value="Female" /> Female</td>
			</tr>
			<tr>
			<tr>
				<td>Courses</td>
				<td>
				<input type="checkbox" name="courses" value="M1" /> Core Java &nbsp;
				<input type="checkbox" name="courses" value="M2" /> Advance Java &nbsp;
				<input type="checkbox" name="courses" value="M3" /> Java Frameworks
				</td>
			</tr>
			<tr>
				<td>Country</td>
				<td>
				<select name="country">
				<option value="">--SELECT--</option>
				<option value="India">India</option>
				<option value="USA">USA</option>
				<option value="UK">UK</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>Feedback</td>
				<td>
				<textarea name="feedback" rows="5" cols="50"></textarea>
				</td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
	<%@ include file="footer.html" %>
</body>
</html>