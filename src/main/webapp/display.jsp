<%--
  Created by IntelliJ IDEA.
  User: kamil
  Date: 10/28/19
  Time: 5:48 PM
  To change this template use File | Settings | File Templates.
  isELIgonred sads are ${labelname} gonna be presented
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Result is : <%= request.getAttribute("result") %>
    Alternative : ${result}
    <form action="comeback">
        <input type="submit" value="Comeback to calculator">
    </form>
</body>
</html>
