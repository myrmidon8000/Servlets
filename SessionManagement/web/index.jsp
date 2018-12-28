<%@ page language="java" contentType ="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/custom.tld"  prefix="custom" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="JstlServlet" method="POST">
Book Id:<input type="text" name="id"><br><br>
Book Name:<input type="text" name="name"><br><br>
Author Name:<input type="text" name="authorname"><br><br>
<input type="submit" value="Submit"><br>
<a href="Records.jsp">Add Records here</a>
</form> 
<custom:greet>Hello All</custom:greet>
<custom:greet>Yup</custom:greet>
</body>
</html>