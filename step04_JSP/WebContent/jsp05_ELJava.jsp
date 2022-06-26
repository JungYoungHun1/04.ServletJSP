<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.domain.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jsp04_ELJava.jsp</title>
</head>
<body>
   <h3>String 데이터 출력</h3>
   <%
      session.setAttribute("sessionData","hi");
      request.setAttribute("requestData", "hello");
   %>
   ${sessionScope.sessionData } <br/>
   ${requestScope.requestData }
   
   <h3>DTO 데이터 출력</h3>
   <%
   	Student student1 = new Student("김윤호", 26);
   	Student student2 = new Student("김도헌", 25);
   	session.setAttribute("stu1", student1);
   	session.setAttribute("stu2", student2);
   %>
   
   ${sessionScope.stu1.name} <br/>
   ${sessionScope.stu2}
   
   <h3>ArrayList 데이터 출력</h3>
   <%
   ArrayList array = new ArrayList();
   array.add(student1);
   array.add(student2);
   
   session.setAttribute("arr", array);
   
   %>
   ${sessionScope.arr } <br/>
   ${sessionScope.arr.get(1).age }
   ${sessionScope.arr[1].age }
   
   
</body>
</html>