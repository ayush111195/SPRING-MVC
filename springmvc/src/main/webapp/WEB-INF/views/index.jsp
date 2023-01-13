<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<h1 style="color:pink">this is home page </h1>
<h1 style="color:blue">called by home controller</h1>
<h1 style="color:red">url/home</h1>
<% 
 String name=(String)request.getAttribute("name");
 Integer id=(Integer)request.getAttribute("id");
 List<String> friends=(List<String>)request.getAttribute("f");
%>
<h1 style="color:red">name is <%=name%></h1>
<h1 style="color:yellow"> id is <%=id%></h1>

</body>
</html>