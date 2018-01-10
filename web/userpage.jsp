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
    <title>个人主页</title>
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
    ${user.account}的愿望单如下，${session.loginUser.account}<br>
    <table border=1>
        <s:iterator value="user.wishList" var="game">
            <tr>
                <td>
                    <div style="width: 100px;height: 100px">

                    </div>
                </td>
                <td><a href="./test_mars.jsp">${game.gameName}</a></td>
                <td>${game.price}</td>
                <td><a href="./test_mars.jsp">赠送</a></td>
            </tr>
        </s:iterator>
    </table>
    <a href="./showBuddyAction?userId=${user.userId}">${user.account}的好友中心</a>
</div>
</body>
</html>
