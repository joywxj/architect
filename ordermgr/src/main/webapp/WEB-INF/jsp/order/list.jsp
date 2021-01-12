<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单页面</title>
</head>
<link href="${pageContext.request.contextPath}/static/css/application.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/application.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery-1.11.0.js"></script>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="myTag" tagdir="/WEB-INF/tags" %>

<table width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine DoubleColorTable">
    <tr>
        <td colspan="6">
            <a href="${pageContext.request.contextPath}/order/list">转到查询</a>
            &nbsp;&nbsp;
            <a href="${pageContext.request.contextPath}/order/toAdd">转到新增</a>
        </td>
    </tr>
    <tr>
        <td colspan=${5+1} align="center" class="tableLineBg">主订单列表</td>
    </tr>
    <tr>
        <td>客户编号</td>
        <td>下订单时间</td>
        <td>总金额</td>
        <td>节省金额</td>
        <td>状态</td>

        <td>操作</td>
    </tr>
    ${page}

    <c:forEach var="m" items="${page.result}">
        <tr>
            <td>${m.customerUuid}</td>
            <td>${m.orderTime}</td>
            <td>${m.totalMoney}</td>
            <td>${m.saveMoney }</td>
            <td>${m.state}</td>
            <td>
                <a href="${pageContext.request.contextPath}/order/toUpate?uuid=${m.uuid}">修改 </a> |
                <a href="${pageContext.request.contextPath}/order/delete?uuid=${m.uuid}">删除</a>
            </td>

        </tr>
    </c:forEach>

    <tr>
        <td colspan=${5+1} align="center">
            <input type="hidden" id="queryJsonStr" value='${wm.queryJsonStr}'/>
            <myTag:page page="${page}"></myTag:page>
        </td>
    </tr>
</table>

</body>
</html>
