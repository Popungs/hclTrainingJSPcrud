<%@page import="com.dao.UserDao,com.bean.*,java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User Success</title>
</head>
<body>

<p>Record successfully saved!</p>

<%
User user = (User) request.getSession().getAttribute("sesname");

 out.println(user);

%>
<br/>
<%-- <jsp:include page="userform.html"></jsp:include> --%>
<a href="logOut.jsp">Click to logout!</a>
</body>
</html>