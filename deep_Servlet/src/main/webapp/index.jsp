<%@ page pageEncoding="UTF-8" isErrorPage="false" errorPage="error.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<form action="login" method="post">
    name：<input type="text" name="name"><br>
    password：<input type="password" name="password"><br>
    <input type="submit" value="发送">
</form>
</body>
</html>