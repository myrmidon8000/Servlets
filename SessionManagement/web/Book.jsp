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

<jsp:setProperty name="book1" property="*"/>
<jsp:setProperty name="book1" property="*" />
<jsp:setProperty name="book1" property="*"/>
<a href="SessionServlet5">Click Here to go</a>
</body>
</html>