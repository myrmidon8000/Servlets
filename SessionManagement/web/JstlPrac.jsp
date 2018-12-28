<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql" %>
    <%@page import="java.util.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jstl Practice</title>
</head>
<body>


<sql:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:xe" user="hr" password="hr" scope="session"/>
<sql:query var="query"
sql="select first_name,salary from employees"
dataSource="${ds}" 
scope="session" 
startRow="1" maxRows="10" ></sql:query>
<c:forEach items="${query.rows }" var="row">
<c:out value="${ row.first_name}"></c:out>
<c:out value="${ row.salary}"></c:out><br><hr>
</c:forEach>

<c:forEach var="i" items="${arrlist}"><br>
<c:out value="${i}"></c:out>
</c:forEach>
<br>
<c:forEach var="x" begin="1" end="20" step="2">
<c:out value="${x}"></c:out>
</c:forEach>
</body>
</html>