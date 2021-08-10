<%--
  Created by IntelliJ IDEA.
  User: hanseul
  Date: 2021/08/05
  Time: 5:43 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    String calculation = request.getParameter("calculation");
    int result = 0;


        if (calculation.equals("+")) {
            result = num1+num2;
        } else if (calculation.equals("-")) {
            result = num1-num2;
        } else if (calculation.equals("*")) {
            result = num1*num2;
        } else if (calculation.equals("/")) {
            result = num1/num2;
        } else if (calculation.equals("%")) {
            result = num1%num2;
        }
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1> <%= num1 %> </h1>
    <h1> <%= num2 %> </h1>
    <h1> <%= result%></h1>

    <h1><%= num1%><%= calculation%><%= num2%>=<%= result%></h1>

    <a href="calcInput.jsp"><input type="button" value="돌아가기"></a>
</body>
</html>
