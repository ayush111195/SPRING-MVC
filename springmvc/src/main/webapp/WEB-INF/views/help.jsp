<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String name=(String) request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");
LocalDateTime tim=(LocalDateTime)request.getAttribute("time");
%>
<h1 style="color:red"> student name<%=name%></h1>
<h1 style="color:black"> student id<%=id%></h1>
<h1 style="color:orange">time=<%=tim%></h1>

</body>
</html>