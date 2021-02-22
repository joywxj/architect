<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户修改页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/customer/update" method="post">
    <table>
        <tr>
            <th>
                <input type="hidden" name="uuid" value="${customer.uuid}">
                姓名:
            </th>
            <th>
                <input type="text" name="showName" value="${customer.showName}">
            </th>
        </tr>
        <tr>
            <th>
                真实姓名:
            </th>
            <th>
                <input type="text" name="trueName" value="${customer.trueName}">
            </th>
        </tr>
        <tr>
            <th>
                密码:
            </th>
            <th>
                <input type="text" name="pwd" value="${customer.pwd}">
            </th>
        </tr>
        <tr>
            <th>
                <button>提交</button>
            </th>
           
        </tr>
    </table>

</form>
</body>
</html>
