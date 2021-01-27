<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<body>
<h2> this is list </h2>
<a href="${pageContext.request.contextPath}/good/list">查询</a>
<a href="${pageContext.request.contextPath}/good/toAdd">添加</a>

<%@taglib prefix="myPage" tagdir="/WEB-INF/tags" %>
<table>
    <tr>
        <td>商品名称</td>
        <td>图片路径</td>
        <td>描述</td>
        <td>操作</td>
    </tr>
    <c:forEach var="good" items="${page.result}">
        <tr>


            <td>${good.name}</td>
            <td>${good.imgPath}</td>
            <td>${good.description}</td>
            <td>
                <a href="${pageContext.request.contextPath}/good/toUpdate?uuid=${good.uuid}">修改</a>
                <a href="${pageContext.request.contextPath}/good/delete?uuid=${good.uuid}">删除</a>
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
