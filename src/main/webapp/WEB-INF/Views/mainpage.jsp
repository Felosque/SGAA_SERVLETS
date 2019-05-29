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
	<link  href="/resources/css/mainpage.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
	<body style="background-color: #11CF0B;"class="body"  >
	
	<div id="titleDiv">
	<center><h1 class="form-signin-heading" id="tittle">SGAA</h1></center>
   	<center><h6 class="form-signin-heading" id="ptittle">Sistema de Gestión de Animales en Adopción</h6></center>
   	<br>
   	</div>
	<div class="container">
	
	<br>
	<center><h3>TUS MASCOTAS</h3></center>
	<br>
    <div class="btn-group" role="group" aria-label="Basic example" id="btnGroup">
		<center>
		<table id="tableBotons" >
	  		<tr>
			    <td>
				    <form action="AddPetServlet.do" method="get">
				    	<input class="btn btn-primary" type="submit" value="Añadir mascota">    
					</form>
				</td>
			    <td>
					<form action="SearchPetServlet.do" method="get">
			    		<input class="btn btn-secondary" type="submit" value="Buscar mascota">    
					</form>
				</td>			
			    <td>
					<form action="login.do" method="get">
			    		<input class="btn btn-primary" type="submit" value="Información fundación">    
					</form>
				</td>
	  		</tr>
		</table></center>
			
	</div>
	
	<div id="outer">
      <div id="inner"></div>
   	</div>
      
    <table class="table">
		<thead class="table table-striped table-dark">
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
	  	
		<% 
		String mails = (String)request.getAttribute("mail");
		PetsServices petServices = new PetsServices();
		IStackArray<PetDTO> pets = petServices.getAllPets(mails);
		for(int i = 0; i < pets.size(); i++){ 
		%>
	  		<tr>
		     	<th scope="row"><%= pets.get(i).getId() %></th>
	      		<td><%= pets.get(i).getName()%></td>
	     		<td><%= pets.get(i).getColor() %></td>
	     		<td><%= petServices.getBreed(pets.get(i).getBreed()) %></td>
	     		<td><%= pets.get(i).isState()%></td>
			    <td>
					<center><form action="#" method="post">
					  <input type="submit" name="" class="btn btn-success" value="Editar">
					  <input type="submit" name="" class="btn btn-danger" value="Eliminar">
					</form></center>
			    </td>
		    </tr>
		<%} %>

	  		
		</tbody>
	</table>
	<br><br><br><br><br><br>
	
	</body>
</html>