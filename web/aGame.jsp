<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: bear
  Date: 2018/1/8
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GameName</title>
</head>
<body>
<div align="center">
    <table>
        <tr><s:property value="#request.game.gameName"/> </tr>
        <tr><s:property value="#request.game.gameId"/> </tr>
        <%--<a href="streamDownloadAction?gameId=${game.gameId}">下载</a><br>--%>
    </table>
    <s:include value="UserReview.jsp"/>
</div>
</body>
</html>
