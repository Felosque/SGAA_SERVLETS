<%@page import="sgaa.server.dto.PetDTO"%>
<%@page import="services.PetsServices"%>
<%@page import="sgaa.server.dataStructure.Stack.IStackArray"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<p>ESTA ES LA PAGINA PRINCIPAL</p>
		
		<c:forEach items="${petsList}" var="objeto">
		     <tr>
		     	<td><c:out value="${objeto.getName()}"/></td>
		     </tr>
		</c:forEach>

	</body>
</html>