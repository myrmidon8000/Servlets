<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"     import ="model.User " %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="PreRegister">Register</a>
<br><br>
<a href="Header">Header</a>
<a href="Count">Hits Counter</a>

<form action="LoginServlet" method="POST">
User name:<input type="text" name="username"><br><br>
Password:<input type="text" name="password"><br><br>
<input type="submit" value="Submit">
</form> 
</body>
</html>