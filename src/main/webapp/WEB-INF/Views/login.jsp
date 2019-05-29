<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<link rel="shortcut icon" href="/resources/img/SGAA.ico">
	<title>Loguearse SGAA</title>
	<link  href="/resources/css/login.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
	<body class="body">
	
	<center><h1 class="form-signin-heading" id="tittle">SGAA</h1></center>
        <center><h6 class="form-signin-heading" id="ptittle">Sistema De Gestión de Adopción de Mascotas</h6></center>
	
	<div class="container">
      <form class="form-signin" role="form" action="login.do" method="post">
        <input type="text" class="form-control emailt" placeholder="Ingrese su usuario" name="name" required autofocus>
        <br>
        <input type="password" class="form-control" placeholder="Ingrese su Password" name="password" required>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit" value="Enviar">Sign in</button>
        <button class="btn btn-lg btn-primary btn-block" type="reset" value="Borrar">Borrar</button>
      <br>
     	<center><p> <font color="RED"> ${messageError}</font></p> </center>
      </form>
    </div>
	</body>

</html>