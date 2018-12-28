<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" import="model.Product" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql" %>
    <%@page import="java.util.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Records</title>
</head>
<body>
<c:out value="${records.prodid}"></c:out>
<sql:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:xe" user="hr" password="hr" scope="session"/>
<sql:update var="query" sql="insert into product values('${records.prodid }','${records.prodname}','${records.rate}')" 
dataSource="${ds}" scope="session" ></sql:update>
<h3> 1 Row affected</h3>
</body>
</html>