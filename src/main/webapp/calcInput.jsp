<%--
  Created by IntelliJ IDEA.
  User: hanseul
  Date: 2021/08/05
  Time: 5:43 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="calcResult.jsp" method="post">

    <input name="num1">

    <select name="calculation">
        <option> + </option>
        <option> - </option>
        <option> * </option>
        <option> / </option>
        <option> % </option>
    </select>

    <input name="num2">

    <button> 계산하기 </button>

</form>
</body>
</html>
