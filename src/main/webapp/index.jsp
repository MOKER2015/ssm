<%@ page import="com.test.model.QtUser" %>
<%--
  Created by IntelliJ IDEA.
  User: MOKER
  Date: 2016/5/13
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页面</title>
  <style>
    #index{
      position:absolute;/*层漂浮*/
      top:50%;
      left:50%;
      width:300px;
      height:300px;
      margin-top:-150px;/*注意这里必须是DIV高度的一半*/
      margin-left:-150px;/*这里是DIV宽度的一半*/
    }
  </style>
</head>
<body>
<div id="index">
登录成功!<br><br>
<%
  QtUser user=(QtUser)session.getAttribute("user");
%>
用户名:<%=user.getName()%><br>
地  址:<%=user.getAddress()%><br>
</div>
</body>
</html>
