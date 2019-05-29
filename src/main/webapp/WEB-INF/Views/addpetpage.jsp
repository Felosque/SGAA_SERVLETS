<%@page import="sgaa.server.dto.BreedDTO"%>
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
<title>Pet</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form action="AddPetServlet.do">
			<div class="form-group img">
				<center>
					<img id="img" src="../resources/img/SGAA.jpg" alt="">
				</center>
			</div>
			<div class="form-group">
				<label for="text">Nombre:</label> <input type="text"
					class="form-control" id="name">
			</div>
			<div class="form-group">
				<label for="text">Color:</label> <input type="text"
					class="form-control" id="color">
			</div>
			<div class="form-group">
				<label for="Date">Fecha de nacimiento:</label> <input type="Date"
					class="form-control" id="birthdate">
			</div>
			<div class="form-group">
				<label for="pwd">Raza:</label> <select class="form-control"
					id="breed">
					<% 
					PetsServices petServices = new PetsServices();
					IStackArray<BreedDTO> breeds = (IStackArray<BreedDTO>) request.getAttribute("breeds");;
					for(int i = 0; i < breeds.size(); i++){ 
		%>
					<option ><%= breeds.get(i).getBreed() + " - "+ breeds.get(i).getSpecies()%></option>
		<%} %>
				</select>
			</div>
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Descripción:</label>
				<textarea class="form-control" id="description" rows="3"></textarea>
			</div>

			<button action="login.do" method="post" type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>