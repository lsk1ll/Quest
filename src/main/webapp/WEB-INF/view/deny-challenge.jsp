<%--
  Created by IntelliJ IDEA.
  User: asd
  Date: 31.08.2023
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../styles.css">
</head>
<body>
<c:import url="/WEB-INF/view/header.jsp" />
<p>
    <c:out value="ник: ${sessionScope.name}" />
    <br>
    Ты отклонил вызов.</p>
<h2>Поражение</h2>
<a href="http://localhost:8080/game">начать заново</a>
</body>
</html>
