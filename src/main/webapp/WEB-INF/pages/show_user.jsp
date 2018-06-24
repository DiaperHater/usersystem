<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: elizaveta
  Date: 24.06.2018
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user info</title>
</head>
<body>
    ${userFromServer.name} access level = ${userFromServer.accessLevel}.

    <spring:form modelAttribute="userFromServer" method="get" action="/user-system/users/validate">
        <spring:button>get to validate again</spring:button>
    </spring:form>
</body>
</html>
