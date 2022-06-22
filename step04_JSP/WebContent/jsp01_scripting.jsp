<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jsp01</title>
</head>
<body>
	<!--  html �ּ�  -->
	<%-- jsp �ּ� --%>

	<h2>step01 - scripting</h2>
	<%! String name = "busan"; %>
	<%= name %> <br/>
	<% out.println(name); %> <br/>

	<%int age = 29; %>
	<%= age %>
	
	<h2>step02 - EL �ױ�</h2>
	
	<table border="1">
		<tr>
			<td>2+3</td>
			<td>${2+3}</td>
		</tr>
		<tr>
			<td>2>3</td>
			<td>${2>3}</td>
		</tr>
		<tr>
			<td>'a' == 'a'</td>
			<td>${a == a }</td>
		</tr>
		<tr>
			<td>a != a</td>
			<td>${a != a}</td>
		</tr>
		
	</table>
	
	<% // jsp���� ��� ������ ������ ����
		request.setAttribute("reqData", "��û ��ü ������");
		String data = (String) request.getAttribute("reqData");
	%>
	${requestScope.reqData } <br/>
	 <%=data %>
</body>
</html>