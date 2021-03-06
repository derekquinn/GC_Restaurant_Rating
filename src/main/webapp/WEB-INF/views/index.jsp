<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Restaurant Rating | Home</title>
</head>
<body>

	<h1>Restaurant Offerings</h1>
		<table >
		
			<thead>
				<tr>
					<th>Restaurant</th><th>Rating</th>
				</tr>
			</thead>

				<c:forEach var="restaurant" items="${ restaurant }">
				<tr>
					<td>${ restaurant.name}</td>
					<td>${ restaurant.rating }</td>
					<td>  <a href="/upvote/${ restaurant.id }">Upvote</a></td>
					
				</tr>
				</c:forEach>

</body>
</html>