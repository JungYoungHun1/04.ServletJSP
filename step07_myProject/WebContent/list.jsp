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
<h2>������ �� ��� ��� �˻�</h2>

	
	<form action="detail" method="get">
		<input type="text" name="loc" value="">
		<input type="submit" name="list" value="�˻�">
	</form>
	<h3>�˻� ���</h3>
	<c:forEach items="${requestScope.list}" var="data">
		<div align="center">${data.loc}</div> 
	</c:forEach> 
	
</div>
</body>
</html>