<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/main.css" />">

<meta charset="UTF-8">
<title>Adicionar Tarefa</title>
</head>
<body>
	<div class="container-fluid">

		<h2>Adicionar Tarefa</h2>
		<form action="<c:url value="/todos/add" />" method="post">
			<p>
				<label for="tarefa">Tarefa</label> <input type="text" name="tarefa"
					id="tarefa" size="100"> <input type="submit" value="Salvar">
			</p>
			<p>
				<a href="<c:url value="/index" />">Home</a>
			</p>


		</form>
	</div>
</body>
</html>