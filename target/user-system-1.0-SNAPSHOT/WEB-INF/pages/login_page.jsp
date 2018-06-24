<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: elizaveta
  Date: 24.06.2018
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login to Evil.corp</title>
</head>
<body>
    <spring:form modelAttribute="userToAuth" method="post" action="/user-system/checkUser">
        Please login:
        <spring:input path="name"/>
        <spring:input path="password"/>
        <spring:button>login</spring:button>

    </spring:form>
</body>
</html>
