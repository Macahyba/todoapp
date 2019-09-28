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

		<div class="input-group mb-3">
			<div class="input-group-prepend">
		    	<span class="input-group-text">Tarefa</span>
			</div>
			<input type="text" class="form-control col-5" name="tarefa" id="tarefa">
			<div class="input-group-append">
		    	<input class="btn btn-outline-success" type="submit" value="Salvar">
		  </div>
		</div>				
		
		<a href="<c:url value="/index" />" class="btn btn-link">Home</a>

		</form>
	</div>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.3.1.slim.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.bundle.min.js" />"></script>
</body>
</html>