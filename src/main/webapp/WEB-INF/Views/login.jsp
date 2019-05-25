<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	<title>Hola xd</title>
</head>


	<body>
	
	<h1> <font color="RED"> ${messageError}</font></h1>
	
	
	<form action="login.do" method="post">
		  <p>Nombre: <input type="text" name="name" size="40"></p>
		  <p>Password: <input type="password" name="password" size="40"></p>
		  <p>
		    <input type="submit" value="Enviar">
		    <input type="reset" value="Borrar">
		  </p>
	</form>

	
	</body>

</html>