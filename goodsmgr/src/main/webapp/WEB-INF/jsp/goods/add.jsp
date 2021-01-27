<%--
  Created by IntelliJ IDEA.
  User: issuser
  Date: 2021/1/27
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品添加页面</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/good/add" method="post">

    <table>
        <tr>
            <td>
                商品添加
            </td>
        </tr>
        <tr>
            <td>
                名称
            </td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>

            <td>
                图片路径
            </td>
            <td>
                <input type="text" name="imgPath">
            </td>
        </tr>
        <tr>
            <td>
                描述
            </td>
            <td>
                <input type="text" name="description">
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
