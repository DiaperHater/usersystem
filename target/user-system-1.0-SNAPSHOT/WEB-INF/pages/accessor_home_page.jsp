<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: elizaveta
  Date: 25.06.2018
  Time: 1:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User page</title>
</head>
<body>
    ${user}
    <spring:form modelAttribute="user" method="post" action="/user-system/vacationRequest">
        <spring:button>Order vacation request</spring:button>
    </spring:form>


    <spring:form modelAttribute="user" method="get" action="/user-system/login">
        <spring:button>logOut</spring:button>
    </spring:form>
</body>
</html>
