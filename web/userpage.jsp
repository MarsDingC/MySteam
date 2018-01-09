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
</head>
<body>
这里是${user.account}的主页，愿圣光保佑你，${session.loginUser.account}<br>
<table border=1>
    <s:iterator value="user.wishList" var="game">
        <tr>
            <td>
                <div style="width: 100px;height: 100px">

                </div>
            </td>
            <td><a href="./test.jsp">${game.gameName}</a></td>
            <td>${game.price}</td>
            <td><a href="./test.jsp">赠送</a></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
