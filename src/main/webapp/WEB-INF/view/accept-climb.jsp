<%--
  Created by IntelliJ IDEA.
  User: asd
  Date: 01.09.2023
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../styles.css">
</head>
<body>
<c:import url="/WEB-INF/view/header.jsp" />
<p>Ты поднялся на мостик.</p>
<p>Ты кто?</p>
<a href="http://localhost:8080/game/say-true">Рассказать правду о себе</a>
<a href="http://localhost:8080/game/say-false">Солгать о себе</a>
</body>
</html>
