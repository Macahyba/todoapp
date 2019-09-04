<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet"
	<c:url value="/resources/css/bootstrap.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/main.css" />">
</head>
<body>
	<div class="container-fluid">
		<h2>Todo App</h2>
		<a href="todos/list">Todos</a>
		<br />
		<a href="todos/form">Criar nova tarefa</a>
	</div>
</body>
</html>