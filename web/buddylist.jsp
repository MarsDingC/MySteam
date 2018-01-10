<%--
  Created by IntelliJ IDEA.
  User: 92377
  Date: 2018/1/8
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>好友列表</title>
    <link rel="stylesheet" href="assets/css/dvlpr_main.css">
    <link rel="stylesheet" href="assets/css/form.css">
    <link rel="stylesheet" href="assets/css/button.css">
</head>
<body>
<%@include file="header_lib.jsp" %>

<div class="banner">
    <h1 align="center">好友中心</h1>
    <%--<hr style="height:1px;border:none;border-top:1px ridge #51ff08;"/>--%>
</div>
<br>
<br>
<div align="center">
<s:property value="#session.loginUser.account"/>的好友列表<br>
<table border=1>
    <tr>
        <th>用户名</th>
        <th>用户ID</th>
    </tr>
    <s:iterator value="#session.loginUser.buddyList" var="user">
        <tr>
            <td><a href="./wishAction?userId=${user.userId}">${user.account}</a></td>
            <td><s:property value="userId"/></td>
            <td>
                <a href="./cancelFollowAction?userId=${user.userId}&followUserId=${session.loginser.userId}">取消关注</a>
            </td>
        </tr>
    </s:iterator>
</table>
</div>
</body>
</html>
