<%--
  Created by IntelliJ IDEA.
  User: asd
  Date: 01.09.2023
  Time: 19:35
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
<p>Ты принял вызов. Поднимаешься на мостик к капитану?</p>
<a href="http://localhost:8080/game/accept-climb">Подняться на мостик</a>
<a href="http://localhost:8080/game/deny-climb">Отказаться подниматься на мостик</a>
</body>
</html>
