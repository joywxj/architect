<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="myTag" tagdir="/WEB-INF/tags" %>
<html>
<head>
    <title>客户List页面</title>
</head>
<body>
this is 客户list页面
<table>
    <tr>
        <td>姓名</td>
        <td>密码</td>
        <td>真实姓名</td>
        <td>操作</td>
    </tr>
    <c:forEach var="customer" items="${page.result}">
        <tr>
            <td>${customer.showName}</td>
            <td>${customer.pwd}</td>
            <td>${customer.trueName}</td>
            <td>
                <a href="${pageContext.request.contextPath}/customer/toUpdate?uuid=+${customer.uuid}">修改</a>
                <a href="${pageContext.request.contextPath}/customer/delete?uuid=+${customer.uuid}">删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <myTag:page page="${page}"></myTag:page>
    </tr>
</table>
</body>
</html>
