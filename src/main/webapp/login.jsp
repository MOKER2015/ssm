<%--
  Created by IntelliJ IDEA.
  User: MOKER
  Date: 2016/5/13
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>登录页面</title>
  <style>
    #login{
      position:absolute;/*层漂浮*/
      top:50%;
      left:50%;
      width:300px;
      height:300px;
      margin-top:-150px;/*注意这里必须是DIV高度的一半*/
      margin-left:-150px;/*这里是DIV宽度的一半*/
    }
  </style>
  <script language="javascript">
    <!--
    function check() { //验证用户名字段是否为空
      username= document.form1.username.value;
      if (username == "")
      { alert("请输入用户名");
        document.form1.username.focus();
        return false;
      } else{
        //验证密码字段是否为空
        password = document.form1.password.value;
        if (password == "") {
          alert("请输入登陆密码");
          document.form1.password.focus();
          return false; }
      }
    }
    -->
  </script>
</head>
<body>
<form name="form1" method="post" action="/index/login">
  <div id="login" >
    用户名：<input name="name" type="text" >
    <br/>
    <br/>
    密  码： <input name="password" type="text" >
    <br/>
    <br/>
    &nbsp;&nbsp;<input type="submit" name="Submit" value="登录" onClick="return check()">
    &nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="Submit2" value="重填">
  </div>
</form>
</body>
</html>
