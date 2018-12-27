<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean  id="book1" class="model.Book" scope="session"></jsp:useBean>
<h1>Book Details</h1>
<h3> Book Id:  <jsp:getProperty property="id" name="book1"/></h3>
<h3> Book Name:  <jsp:getProperty property="name" name="book1"/></h3>
<h3> Author Name:  <jsp:getProperty property="authorname" name="book1"/></h3>
</body>
</html>