<%--
  Created by IntelliJ IDEA.
  User: bastienwcs
  Date: 23/05/18
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<p style="color: red; font-weight: bold; font-size: 1.2em;">
    <%= request.getAttribute("helloParam") %>
</p>
</body>
</html>
