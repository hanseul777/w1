<%@ page import="org.zerock.w1.service.StoreService" %>
<%--
  Created by IntelliJ IDEA.
  User: hanseul
  Date: 2021/08/06
  Time: 6:22 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD</title>
</head>
<body>

<h1>ADD</h1>
<form action="addResult.jsp" method="post">
    <div>
        <input type="text" name="name" value="맛집">
    </div>
    <div>
        <input type="text" name="area" value="종각">
    </div>
    <div>
        <input type="text" name="desc" value="설명">