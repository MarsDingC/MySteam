<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: bear
  Date: 2018/1/8
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserManage</title>
    <link rel="stylesheet" href="assets/css/dvlpr_main.css">
    <link rel="stylesheet" href="assets/css/form.css">
    <link rel="stylesheet" href="assets/css/button.css">
</head>
<body>
<%@include file="header_lib.jsp" %>

<div class="banner">
    <h1 align="center">个人中心</h1>
    <%--<hr style="height:1px;border:none;border-top:1px ridge #51ff08;"/>--%>
</div>
<br>
<br>
<div align="center">
    个人信息
    <div>
        <table>
            <tr>
                <td></td>
            </tr>

            <img src="1.jpg" width="100" height="100">
            ${user.account}<br>
            id:${user.userId}<br>
            余额：￥${user.balance}<br>


    </div>
    游戏库
    <div>
        <table>
            <s:iterator value="ownGameList" var="game">
                <tr>
                    <td><s:property value="gameName"/></td>
                    <td><s:property value="gameId"/></td>
                    <td>
                        <input type="button" value="详情"
                               onclick="window.location.href='selectGameAction?gameId=${game.gameId}'">
                        <input type="button" value="下载"
                               onclick="window.location.href='streamDownloadAction?gameId=${game.gameId}'">
                    </td>
                </tr>
            </s:iterator>
        </table>
    </div>
</div>
</body>
</html>
