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
	
				<c:forEach var="straunts" items="${ straunts }">
				<tr>
					<td>${ straunts.name}</td>
					<td>${ straunts.rating }</td>
					
				</tr>
				</c:forEach>

</body>
</html>