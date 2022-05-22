<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style type="text/css">
.error{
color:red;
font-style:italic;
}
</style>
</head>
<body>
<center>
<form:form action="${pageContext.request.contextPath}/game" modelAttribute="player" method="POST">
<label>Enter your name</label>
<form:input path="playerName"></form:input>
<form:errors path="PlayerName" cssClass="error"></form:errors>
<input type="submit" label="Click to play!"></input>
</form:form>
</center>
</body>
</html>