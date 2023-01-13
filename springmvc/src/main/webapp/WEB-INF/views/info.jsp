<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored ="false" %> <!-- expreson language bydefult ignore hoti h  --> 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:tan">This is info page</h1>

<h1 style="color:ruby">contact=${contact}</h1>
<h1 style="color:indigo">name=${name}</h1>
<hr>

<c:forEach var="item" items ="${emp}">

<h1 style="color:mint">${item}</h1>

</c:forEach>

</body>
</html>