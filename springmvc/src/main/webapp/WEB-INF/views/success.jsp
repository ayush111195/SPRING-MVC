<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %> <!--  active karne ke leye expression lanquage ko -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  <h1> welcome,${Name}</h1>
<h1>email is${email}</h1>
<h1>pass is ${pass}</h1>-->

<!-- 2nd method   -->
<h1 style="color:red"> welcome,${user.userName}</h1>
<h1 style="color:yellow">email is${user.userEmail}</h1>
<h1 style="color:green">pass is ${user.userPassword}</h1>
<hr>
<h1 style="color:pearl">${ty}</h1>
</body>
</html>