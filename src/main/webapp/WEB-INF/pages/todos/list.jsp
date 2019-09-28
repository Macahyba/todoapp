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
			<a href="<c:url value="/todos/form" />" class="btn btn-sm btn-link">Criar nova tarefa</a>
		</h3>

		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>Tarefa</th>
					<th>Status</th>
					<th colspan="2">Ação</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="todo" items="${listaTodos}">
					<tr>
						<td>${todo.tarefa}</td>
						<td>${todo.prontoPretty()}</td>
						<td><a href="<c:url value="/todos/edit/${todo.id}" />" class="btn btn-sm btn-outline-primary">Edit</a></td>
						<td><a href="<c:url value="/todos/delete/${todo.id}" />" class="btn btn-sm btn-outline-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<p>
			<a href="<c:url value="/index" />" class="btn btn-sm btn-link">Home</a>
		</p>

	</div>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-3.3.1.slim.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/bootstrap.bundle.min.js" />"></script>
</body>
</html>