<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>detail</title>
</head>
<body>
<div align="center">

<h2 align="center">사원 목록</h2>

<c:forEach items="${requestScope.detail}" var="data">
		 <div align="center">${data.ename}</div>  
	</c:forEach>

	<form action="insert" method="get">
		<input type="hidden" name="deptno" value="${requestScope.deptno }">
		<input type="text" name="ename" value="">
		<input type="submit" name="list" value="작성">
	</form>	
</div>
	
</body>
</html>