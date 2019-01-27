<%@ page errorPage="my-error-page.jsp" %>
<!-- Scriptlet Tag -->
<%
	int i = 10 + j + sum(2, 3);
	String str = "Atul";
	out.print(str);
	
	int k = 10/0;
%>

<!-- Expression Tag -->
<%=i + 10 + j%>

<!-- Declaration Tag  -->
<%!int j = 100;

	public int sum(int i, int j) {
		return i + j;
	}%>