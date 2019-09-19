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
<title>Page List Todo</title>
</head>
<body>
	<div class="container-fluid">
		<h2>Page List Todo</h2>
		<h3>
			<a href="<c:url value="/todos/form" />">Criar nova tarefa</a>
		</h3>

		<table class="table">
			<tr>
				<th>Tarefa</th>
				<th>Status</th>
				<th colspan="2">Ação</th>
			</tr>

			<c:forEach var="todo" items="${listaTodos}">
				<tr>
					<td>${todo.tarefa}</td>
					<td>${todo.pronto}</td>
					<td><a href="<c:url value="/todos/edit/${todo.id}" />">Edit</a></td>
					<td><a href="<c:url value="/todos/delete/${todo.id}" />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<p>
			<a href="<c:url value="/index" />">Home</a>
		</p>

	</div>
</body>
</html>