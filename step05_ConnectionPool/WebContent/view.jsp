<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% // jsp���� ��� ������ ������ ����
		String name = (String) session.getAttribute("ename");
	%>
	
	<%=name %>
	
</body>
</html>