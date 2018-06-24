<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: elizaveta
  Date: 25.06.2018
  Time: 2:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vacation request page</title>
</head>
<body>

    <spring:form modelAttribute="user" method="post" action="/user-system/userInfo">
        <spring:input path="${user.vacation.}"
    </spring:form>

</body>
</html>
