<%--
  Created by IntelliJ IDEA.
  User: bastienwcs
  Date: 23/05/18
  Time: 08:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form action="simple-hello" method="post">
    <p>
        <label for="firstname">First Name : </label>
        <input type="text" id="firstname" name="firstname"/>
    </p>
    <p>
        <label for="lastname">Last Name : </label>
        <input type="text" id="lastname" name="lastname"/>
    </p>
    <p>
        <label for="datehour">Hours : </label>
        <input type="number" id="datehour" name="datehour"/>
    </p>
    <p>
        <input type="submit"/>
    </p>
</form>
</body>
</html>
