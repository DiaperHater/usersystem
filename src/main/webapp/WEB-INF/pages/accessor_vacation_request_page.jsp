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

    <spring:form modelAttribute="vacationDates" method="post" action="/user-system/submitVacationRequest">
        set From date in mm/dd/yyyy format:<spring:input path="from"/><br>
        set To date in mm/dd/yyyy format:<spring:input path="to"/>

        <spring:button>submit</spring:button>
    </spring:form>

</body>
</html>
