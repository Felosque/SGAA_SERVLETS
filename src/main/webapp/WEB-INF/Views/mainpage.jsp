<%@page import="sgaa.server.dto.PetDTO"%>
<%@page import="services.PetsServices"%>
<%@page import="sgaa.server.dataStructure.Stack.IStackArray"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<link rel="shortcut icon" href="../resources/img/SGAA.ico">
	<title>Menu Principal</title>
	<link rel="stylesheet" href="/resources/css/login.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
	<body style="background-color: #eee;" class="body" >
	<div class="container">
	¡Bienvenido! ${mail}
      <div class="form-logo img">
        <img  id="img" src="/resources/img/SGAA.jpg" alt="" >
      </div>
      
      <div class="btn-group" role="group" aria-label="Basic example">
	
	<form action="AddPetServlet.do" method="get">
		    <input class="btn btn-primary" type="submit" value="Añadir mascota">    
	</form>
	
	<form action="SearchPetServlet.do" method="get">
		    <input class="btn btn-secondary" type="submit" value="Buscar mascota">    
	</form>
	
	<form action="login.do" method="get">
		    <input class="btn btn-primary" type="submit" value="Información fundación">    
	</form>
	</div>
      
    <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Nombre</th>
      <th scope="col">Color</th>
      <th scope="col">Raza</th>
      <th scope="col">Estado</th>
      <th><center>Acciones</center> </th>
    </tr>
  </thead>
  <tbody>
  
  		<h2>${petsList.size()}</h2>
		<c:forEach items="${petsList}" var="objeto">
		     <tr>
	     	<th scope="row">1</th>
      		<td><c:out value="${objeto.getName()}"/></td>
     		<td><c:out value="${objeto.getcolor()}"/></td>
     		<td><c:out value="${objeto.getBreed()}"/></td>
     		<td><c:out value="${objeto.getState()}"/></td>
      <td>
        <center>        <form action="#" method="post">
          <input type="submit" name="" class="btn btn-success" value="Editar">
          <input type="submit" name="" class="btn btn-danger" value="Eliminar">
        </form></center>
      </td>
		     </tr>
		</c:forEach>
	</tbody>
	
	</body>
</html>