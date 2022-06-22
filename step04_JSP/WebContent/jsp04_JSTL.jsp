<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp04_JSTL.jsp</title>
</head>
<body>
	step01 : JSTL 단일 조건 <br/>
	<c:if test="${'a'== 'a'}">
		출력된다면 참
	</c:if>
	
	step02 : JSTL 다중조건 <br/>
	<%session.setAttribute("busan", "7층"); %>
	<c:choose>
		<c:when test="${sessionScope.busan == '6층'}">
			누나 잠이 오세요? ㅋㅋ<br/>
		</c:when>
		<c:when test="${sessionScope.busan == '7층'}">
			누나 잠이 오세요 지금? ㅋㅋ <br/>
		</c:when>
	</c:choose>
	
	step03 : null값 검증 <br/>
	<%
	request.setAttribute("data", null);
	%>
	
	<c:if test="${empty requestScope.data }">
		null값 입니다.
	</c:if>
	
	<c:if test="${not empty requestScope.data }">
		null값이 아닙니다.
	</c:if>
	
	

	
	
</body>
</html>