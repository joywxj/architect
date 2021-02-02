<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<body>
<h2> this is list </h2>
<a href="${pageContext.request.contextPath}/car/list">查询</a>
<a href="${pageContext.request.contextPath}/car/toAdd">添加</a>

<%@taglib prefix="myPage" tagdir="/WEB-INF/tags" %>
<table>
    <tr>
        <td>客户主键</td>
        <td>商品主键</td>
        <td>购买数量</td>
        <td>操作</td>
    </tr>
    <c:forEach var="car" items="${page.result}">
        <tr>
            <td>${car.customerUuid}</td>
            <td>${car.goodsUuid}</td>
            <td>${car.buyNum}</td>
            <td>
                <a href="${pageContext.request.contextPath}/car/toUpdate?uuid=${car.uuid}">修改</a>
                <a href="${pageContext.request.contextPath}/car/delete?uuid=${car.uuid}">删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td>
            <myPage:page page="${page}"></myPage:page>
        </td>
    </tr>
</table>
</body>
</html>
