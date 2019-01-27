<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.jm2181222.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process User Registration</title>
</head>
<body>
	Hi,
	<%=request.getParameter("name")%>

	<%
		String name = request.getParameter("name");
		if (name.isEmpty()) {
			response.sendRedirect("user-registration.jsp");
		}else{
			int age = Integer.parseInt(request.getParameter("age"));
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String[] courses = request.getParameterValues("courses");
			String country = request.getParameter("country");
			String feedback = request.getParameter("feedback");

			User user = new User(name, age, email, gender, courses, country, feedback);
			request.setAttribute("u", user);
			RequestDispatcher rd = request.getRequestDispatcher("user-profile.jsp");
			rd.forward(request, response);
		}
		
	%>
	<br />
	
</body>
</html>