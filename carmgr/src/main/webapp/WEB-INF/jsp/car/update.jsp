<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车修改修改</title>
</head>
<body>

<h4>购物车修改</h4>
<form action="${pageContext.request.contextPath}/car/update" method="post">
    <table>
        <tr>
            <td>
                客户主键
            </td>
            <td>
                <input type="hidden" name="uuid" value="${car.uuid}">
                <input type="text" name="customerUuid" value="${car.customerUuid}">
            </td>
        </tr>
        <tr>
            <td>
                商品主键
            </td>
            <td>
                <input type="text" name="goodsUuid" value="${car.goodsUuid}">
            </td>
        </tr>
        <tr>
            <td>
                购买数量
            </td>
            <td>
                <input type="text" name="buyNum" value="${car.buyNum}">
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
