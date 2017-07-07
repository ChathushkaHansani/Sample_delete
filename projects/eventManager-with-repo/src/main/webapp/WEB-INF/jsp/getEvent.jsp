<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Event Id</th>
			<th>Event Name</th>
			<th>Event Type</th>
		</tr>
		<c:forEach items="${events}" var="event">
			<tr>
				<td>${event.id}</td>
				<td>${event.eventName}</td>
				<td>${event.eventType}</td>
				<td>
					<table>
						<tr>
							<th>Activity Id</th>
							<th>Activity name</th>
						</tr>
						<c:forEach items="${event.activities}" var="activity">
							<tr>
								<td>${activity.id}</td>
								<td>${activity.activityName}</td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>