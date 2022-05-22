<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Game Page</title>
</head>
<body>
<center>
<form:form action="${pageContext.request.contextPath }/result" modelAttribute="player" method="POST"> 
<label>Lets Play! Select your choice</label>
<br><br>
<form:radiobutton path="choice" value="Stone" label="Stone"/>
<form:radiobutton path="choice" value="Paper" label="Paper"/>
<form:radiobutton path="choice" value="Scissors" label="Scissors"/>
<br><br>
<input type="Submit" value="Submit" ></input>
</form:form>
</center>
</body>
</html>