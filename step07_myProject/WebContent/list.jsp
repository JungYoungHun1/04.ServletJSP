<%@page import="dto.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>list.jsp</title>
</head>
<body>
<div align="center">
<h2>거주지 별 사원 목록 검색</h2>

	
	<form action="detail" method="get">
		<input type="text" name="loc" value="">
		<input type="submit" name="list" value="검색">
	</form>
	<h3>검색 목록</h3>
	<c:forEach items="${requestScope.list}" var="data">
		<div align="center">${data.loc}</div> 
	</c:forEach> 
	
</div>
</body>
</html>