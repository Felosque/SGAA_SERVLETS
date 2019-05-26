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
	<link rel="stylesheet" href="../resources/css/login.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
	<body class="body">
	<div class="container">
      <div class="form-logo img">
        <img  id="img" src="../resources/img/SGAA.jpg" alt="" >
      </div>
      
      <div class="btn-group" role="group" aria-label="Basic example">
 		<form action="EditServlet.do" method="post">
		    <input class="btn btn-secondary" type="submit" value="Menu Principal">    
	</form>
	
	<form  action="EditServlet.do" method="post">
		    <input class="btn btn-primary" type="submit" value="Editar mascota">    
	</form>
	
	<form action="AddPetServlet.do" method="post">
		    <input class="btn btn-secondary" type="submit" value="Añadir mascota">    
	</form>
	
	<form action="DeletePetServlet.do" method="post">
		    <input class="btn btn-primary" type="submit" value="Eliminar mascota">    
	</form>
	
	<form action="SerchPetServlet.do" method="post">
		    <input class="btn btn-secondary" type="submit" value="Buscar mascota">    
	</form>
	
	<form action="login.do" method="post">
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
		<c:forEach items="${petsList}" var="objeto">
		     <tr>
		     	<th scope="row"><c:out value="${objeto.getId()}"/></th>
      		<td><c:out value="${objeto.getName()}"/></td>
     		<td><c:out value="${objeto.getName()}"/></td>
     		<td><c:out value="${objeto.getName()}"/></td>
     		<td><c:out value="${objeto.getName()}"/></td>
      <td>
        <center>        <form action="#" method="post">
          <input type="submit" name="" class="btn btn-success" value="Editar">
          <input type="submit" name="" class="btn btn-danger" value="Eliminar">
        </form></center>
      </td>
		     </tr>
		</c:forEach>

	</body>
</html>