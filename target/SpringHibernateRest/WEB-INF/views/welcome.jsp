<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome</title>
        </head>
        <body>
    <div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>Thank you for registering! Here's the review of your details:</h3>
                </td>
            </tr>
              <tr>
                <td><a href="<c:url value='/studentslist'/>">List Students</a>
</td>
            </tr>
            <tr>
                <td>User Name:</td>
                <td>${student.username}</td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td>${student.email}</td>
            </tr>
     
 
        </table>
    </div>
</body>
</html>
