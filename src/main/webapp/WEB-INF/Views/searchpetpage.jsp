<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<link rel="shortcut icon" href="/resources/img/SGAA.ico">
	<title>Login</title>
	<link  href="/resources/css/login.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
      <form class="form-signin" role="form" action="SearchPetServlet.do" method="post">
      	<div class="form-logo img">
      		<img  id="img" src="/resources/img/SGAA.jpg" alt="Logo del SGAA" >
      	</div>
        <input type="text" class="form-control emailt" placeholder="Ingrese el ID de la mascota" name="id" id="id" required autofocus>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit" value="Buscar">Buscar</button>
      </form>
    </div>
</body>
</html>