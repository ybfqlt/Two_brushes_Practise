<%--
  Created by IntelliJ IDEA.
  User: ltt
  Date: 19-12-7
  Time: 下午10:31
  To change this template use File | Settings | File Templates.
--%>
﻿
<%@ page pageEncoding="UTF-8" isErrorPage="false" isELIgnored="false" errorPage="error.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

    boolean flag = (boolean) session.getAttribute("login");
    if (!flag) {
        request.getSession().setAttribute("mes", "请从入口登陆。");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
%>
<html>

<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
欢迎 ${name}! <br>
a目录：<br>
<a href="a/a.jsp">a/a.jsp</a><br>
b目录：<br>
<a href="b/b.jsp">b/b.jsp</a><br>
</body>
</html>
