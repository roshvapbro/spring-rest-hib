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
	<h1>Register</h1>
	</p>
	
	<form:form id="regForm" action="registerProcess" method="post" modelAttribute="student" >
	
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
                	<td><form:label path="age">Age</form:label></td>
                	<td><form:input path="age"/></td>
                </tr>
                 <tr>
                	<td><form:label path="gender">Gender</form:label></td>
                	<td><form:input path="gender"/></td>
                </tr>
                 <tr>
                	<td><form:label path="email">Email</form:label></td>
                	<td><form:input path="email"/></td>
                </tr>
                
                
                <tr>
                <td></td>	<td>Address</td>
                </tr>
                <tr>
                	<td><form:label path="address.street">Street</form:label></td>
                	<td><form:input path="address.street"/></td>
                </tr>
                 <tr>
                	<td><form:label path="address.city">City</form:label></td>
                	<td><form:input path="address.city"/></td>
                </tr>
                 <tr>
                	<td><form:label path="address.state">State</form:label></td>
                	<td><form:input path="address.state"/></td>
                </tr>
                
                
                
                   <tr>
                	<td><form:label path="studentCourses">Student's Courses</form:label></td>
               		<td><form:select path="studentCourses" multiple="multiple">
               		<form:option value="Core Java">Core Java</form:option>
               		<form:option value="Spring Core">Spring Core</form:option>
               		<form:option value="Spring MVC">Spring MVC</form:option>
               		<form:option value="Hibernate">Hibernate</form:option>
            		
               		
               		</form:select></td>
                </tr>
              
              	<tr>
                <td></td><td>Phone Numbers</td>
                </tr>
                <tr>
                 <td><form:label path="studentPhoneNumbers">Phone 1</form:label></td>
                <td><form:input path="studentPhoneNumbers"/></td>
                
                </tr>
                <tr>
                 <td><form:label path="studentPhoneNumbers">Phone 2</form:label></td>
                <td><form:input path="studentPhoneNumbers"/></td>
                
                </tr>
                <tr>
                <td><form:button>Register</form:button></td>
                </tr>
                
                </table>
	

	</form:form>


</body>
</html>