<jsp:useBean id="user" class="com.jm2181222.model.User" />
<jsp:setProperty property="*" name="user" />
<%-- <%= user %> --%>

<jsp:forward page="user-profile-quickly.jsp">
<jsp:param value="${user}" name="u"/>
</jsp:forward>
