<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	<title>Bienvenido!</title>
</head>


	<body>
	
	<p>
	¡Bienvenido! ${name}
	
	
	<form action="EditServlet.do" method="post">
		    <input type="submit" value="Menu Principal">    
	</form>
	
	<form action="login.do" method="post">
		    <input type="submit" value="Editar mascota">    
	</form>
	
	<form action="login.do" method="post">
		    <input type="submit" value="Añadir mascota">    
	</form>
	
	<form action="login.do" method="post">
		    <input type="submit" value="Eliminar mascota">    
	</form>
	
	<form action="login.do" method="post">
		    <input type="submit" value="Buscar mascota">    
	</form>
	
	<form action="login.do" method="post">
		    <input type="submit" value="Información fundación">    
	</form>
	</p>
	
	</body>

</html>