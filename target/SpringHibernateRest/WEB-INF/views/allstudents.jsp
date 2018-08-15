<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>StudentsList</title>
</head>
<body>
    <h2>List of Students</h2>
  <p>  ${title}</p>
    
    <table>
        <tr>
            <td>NAME</td><td><td></td>
        </tr>
        
        
        <c:forEach items="${students}" var="student">
            <tr>
            <td><c:out value="${student.username}"></c:out></td>
            <td><a href="<c:url value='/edit-${student}-student' />">Edit</a></td>
            <td><a href="<c:url value='/delete-${student.n}-student' />">delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/new' />">Add New Student</a>
</body>
</html>