<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
</head>
<body>

	<h1>幼儿园管理系统</h1>

	<form action="login" method="post">
		用户名:<input type="text" name="text" id="name" /> 
		<br /> 
		密码:<input type="password" name="password"> 
		<br /> 
		<input type="submit" value="登录"> <a href="register.jsp">注册</a>
	</form>

</body>
</html>