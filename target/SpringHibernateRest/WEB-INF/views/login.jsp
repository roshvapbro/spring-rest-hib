<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>

<jsp:include page="header.jsp"></jsp:include>
<%-- <%@include file="header.jsp" %> --%>

</head>

<body>

	<p>
	<h1>Login</h1>
	</p>
	
	<form:form id="loginForm" action="loginProcess" method="post" modelAttribute="login" >
	
	<table>
                <tr>
                    <td><form:label path="username">Name</form:label></td>
                    <td><form:input path="username"/></td>
                </tr>
                <tr>
                	<td><form:label path="password">Password</form:label></td>
                	<td><form:input path="password"/></td>
                </tr>
                 
                <tr>
                <td><form:button>Login</form:button></td>
                </tr>
                
                </table>
	

	</form:form>


</body>
</html>