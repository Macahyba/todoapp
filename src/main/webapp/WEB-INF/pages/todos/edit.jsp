<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/main.css" />">

<meta charset="UTF-8">
<title>Editar Tarefa</title>
</head>
<body>

	<h2>Editar Tarefa</h2>
	<form action="<c:url value="/todos/update" />" method="post">
		<p>
			<label for="tarefa">Tarefa</label> <input type="text"
				value="${todo.tarefa}" name="tarefa" id="tarefa" size="100">
			<input type="hidden" name="id" value="${todo.id}">
			<input type="submit" value="Salvar">
		</p>
		<p>
			<a href="<c:url value="/index" />">Home</a>
		</p>


	</form>

</body>
</html>