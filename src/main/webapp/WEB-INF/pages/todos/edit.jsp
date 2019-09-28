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

		<div class="input-group mb-3">
			<div class="input-group-prepend">
		    	<span class="input-group-text">Tarefa</span>
			</div>
			<input type="text" value="${todo.tarefa}" class="form-control col-5" name="tarefa" id="tarefa">
			<select class="custom-select col-1" id="pronto" name="pronto">
			    
		    <c:if test="${todo.pronto == true}">
			    <option value="false">Pendente</option>
			    <option value="true" selected>Pronto</option>
		    </c:if>
		    <c:if test="${todo.pronto != true}">
			    <option value="false" selected>Pendente</option>
			    <option value="true">Pronto</option>
		    </c:if>	    
			</select>
			<div class="input-group-append">
		    	<input class="btn btn-outline-success" type="submit" value="Salvar">
		  </div>
		</div>				
		<input type="hidden" name="id" value="${todo.id}">
		<div><a href="<c:url value="/todos/list" />" class="btn btn-outline-primary">Voltar</a></div>
		<div><a href="<c:url value="/index" />" class="btn btn-link">Home</a></div>

	</form>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.3.1.slim.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.bundle.min.js" />"></script>
</body>
</html>