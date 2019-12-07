<%--
  Created by IntelliJ IDEA.
  User: ltt
  Date: 19-12-7
  Time: 下午9:56
  To change this template use File | Settings | File Templates.
--%>
﻿
<%@ page pageEncoding="UTF-8" isErrorPage="true" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
        body {
            font-size: 30px
        }

        input {
            font-size: 30px
        }

        div {
            color: red;
            text-align: center
        }
    </style>
</head>
<body>
<br>
<div>出错了!</div>
<div>哎呀，操作出错了哟</div>
<br>
<div>${mes}</div>
<div><a href="index.jsp">回首页</a></div>
</body>
</html>