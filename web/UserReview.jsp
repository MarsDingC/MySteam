<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: bear
  Date: 2018/1/3
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>UserLib</title>
</head>
<body>
<div align="center">
    <form action="userReviewAction" method="post">
        <table><!--添加表格，使对齐-->
            <%--<tr>--%>
                <%--<td><s:textfield name="review.game.userId" value=""/></td>--%>
            <%--</tr>--%>
            <tr>
                <td>打分<s:textfield name="review.score" /></td>
            </tr>
            <tr>
                <td>评论<s:textarea name="review.content" /></td>
            </tr>
            <tr>
                <td>
                    <s:submit name="sumbit" value="提交" />
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
