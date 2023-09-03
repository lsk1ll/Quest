<%--
  Created by IntelliJ IDEA.
  User: asd
  Date: 01.09.2023
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../../styles.css">
</head>
<body>
<p>
    <c:out value="ник: ${sessionScope.name}" />
    <br>
</p>
</body>
</html>
