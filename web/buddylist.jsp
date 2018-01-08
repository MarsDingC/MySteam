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
</head>
<body>
<s:property value="loginuser.account"/>的好友列表<br>
<table border=1>
    <tr>
        <th>用户名</th>
        <th>用户ID</th>
    </tr>
    <s:iterator value="loginuser.buddyList" var="user">
        <tr>
            <td><a href="./wishAction?userId=${user.userId}&loginuserId=${loginuser.userId}">${user.account}</a></td>
            <td><s:property value="userId"/></td>
            <td>
                <a href="./cancelFollowAction?userId=${user.userId}&followUserId=${loginuser.userId}&loginuserId=${loginuser.userId}">取消关注</a>
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
