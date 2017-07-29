<%--
  Created by IntelliJ IDEA.
  User: dll
  Date: 2017/7/26
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="project">
        ${project.id}
        ${project.projectName}

    </c:forEach>
</body>
</html>
