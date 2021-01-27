<%--
  Created by IntelliJ IDEA.
  User: issuser
  Date: 2021/1/27
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品修改修改</title>
</head>
<body>

<h4>商品修改</h4>
<form action="${pageContext.request.contextPath}/good/update" method="post">
    <table>
        <tr>
            <td>
                商品名称
            </td>
            <td>
                <input type="hidden" name="uuid" value="${updateModel.uuid}">
                <input type="text" name="name" value="${updateModel.name}">
            </td>
        </tr>
        <tr>
            <td>
                商品图片
            </td>
            <td>
                <input type="text" name="imgPath" value="${updateModel.imgPath}">
            </td>
        </tr>
        <tr>
            <td>
                商品图描述
            </td>
            <td>
                <input type="text" name="description" value="${updateModel.description}">
            </td>
        </tr>
        <tr>
            <td>
                <button>提交</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
