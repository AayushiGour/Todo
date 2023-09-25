 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
	<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"  rel="stylesheet">
		<title>Todo List Page</title>
	</head>
	<body>
		
		<div class="container">
			<h1>Welcome to Todo List Page ${name}</h1>
			<hr>
			
			<table>
				<thead>
					<tr>
						<th>Id</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Completed</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.description}</td>
							<td>${todo.date}</td>
							<td>${todo.done}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<a href="add-todos" class="btn btn-success">Add Todos</a>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>