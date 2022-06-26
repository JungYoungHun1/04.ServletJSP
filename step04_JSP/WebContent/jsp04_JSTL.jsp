<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.ArrayList"  %>
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
	<hr>
	step04 : JSTL의 반복 <br/>
	<%
	ArrayList<String> arr = new ArrayList();
	arr.add("str1");
	arr.add("str2");
	arr.add("str3");
	arr.add("str4");
	arr.add("str5");
	
	session.setAttribute("arr",arr);
	%>
	
	<c:forEach begin="1" end="5"  var="num">
		${num} <br/>
	</c:forEach>
	<hr>
	<c:forEach begin="1" end="5" step="2"  var="num">
		${num} <br/>
	</c:forEach>
	
	반복에 대한 상태 파악을 위해 count, index <br/>
	<table id="arrayList" border = "1">
		<tr>
			<th>index</th>
			<th>var</th>
			<th>count</th>
		</tr>
		<c:forEach begin="1" end="5" var="myVar" varStatus="LoopStatus">
			<tr>
				<td>${LoopStatus.index }</td>
				<td>${myVar }</td>
				<td>${LoopStatus.count }</td>
			</tr>
		</c:forEach>
	</table>
	
	반복에 대한 상태 파악을 위해 count, index 2 <br/>
	<table id="arrayList" border = "1">
		<tr>
			<th>no</th>
			<th>var</th>
		</tr>
		<c:forEach var="myVar" items="${sessionScope.arr }" varStatus="LoopStatus">
			<tr>
				<td>${LoopStatus.index }</td>
				<td>${myVar }</td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>