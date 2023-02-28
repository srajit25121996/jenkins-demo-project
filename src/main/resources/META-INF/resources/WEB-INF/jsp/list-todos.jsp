<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Todo List</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">


</head>
<body>
	<h1>Display List</h1>
	<hr>
	<div class="container">


		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Description</th>
					<th>Start Date</th>
					<th>End Date</th>
					<th>Status</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${todoList}" var="todos">
					<tr>
						<td>${todos.id}</td>
						<td>${todos.description}</td>
						<td>${todos.startDate}</td>
						<td>${todos.endDate}</td>
						<td>${todos.status}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a href="/add-todo" class="btn btn-success">Add Todo</a>
	</div>


	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>


</body>
</html>