<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>库存页面</title>
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
            <a href="${pageContext.request.contextPath}/store/list">转到查询</a>
            &nbsp;&nbsp;
            <a href="${pageContext.request.contextPath}/store/toAdd">转到新增</a>
        </td>
    </tr>
    <tr>
        <td colspan=${5+1} align="center" class="tableLineBg">库存列表</td>
    </tr>
    <tr>
        <td>商品主键</td>
        <td>库存数量</td>
        <td>操作</td>
    </tr>

    <c:forEach var="m" items="${page.result}">
        <tr>
            <td>${m.goodsUuid}</td>
            <td>${m.storeNum}</td>
            <td>
                <a href="${pageContext.request.contextPath}/store/toUpdate?uuid=${m.uuid}">修改 </a> |
                <a href="${pageContext.request.contextPath}/store/delete?uuid=${m.uuid}">删除</a>
            </td>

        </tr>
    </c:forEach>0
    <tr>
        <td colspan="6" align="center">
            <myTag:page page="${page}"></myTag:page>
        </td>
    </tr>
</table>

</body>
</html>
