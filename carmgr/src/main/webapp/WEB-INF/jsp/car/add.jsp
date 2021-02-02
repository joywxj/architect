<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车添加页面</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/car/add" method="post">

    <table>
        <tr>
            <td>
                添加购物车
            </td>
        </tr>
        <tr>
            <td>
                客户主键
            </td>
            <td>
                <input type="text" name="customerUuid">
            </td>
        </tr>
        <tr>

            <td>
                商品主键
            </td>
            <td>
                <input type="text" name="goodsUuid">
            </td>
        </tr>
        <tr>
            <td>
                购买数量
            </td>
            <td>
                <input type="text" name="buyNum">
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
