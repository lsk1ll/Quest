<%--
  Created by IntelliJ IDEA.
  User: asd
  Date: 30.08.2023
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:choose>
    <c:when test="${sessionScope.authorized == true}">
        <html>
        <head>
            <link rel="stylesheet" type="text/css" href="../../styles.css">
        </head>
        <body>
        <c:import url="/WEB-INF/view/header.jsp" />
        <p>
            Ты потерял память. Принять вызов НЛО?
        </p>
        <a href="/game/accept-challenge">Принять вызов</a>
        <a href="/game/deny-challenge">Отклонить вызов</a>
    </c:when>
    <c:otherwise>
        <c:redirect url="/" />
    </c:otherwise>
</c:choose>

