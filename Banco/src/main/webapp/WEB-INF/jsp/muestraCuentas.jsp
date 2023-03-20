<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Cuentas page</title>
    </head>
    <body>
    <table>
        <thead>
            <tr>
            <th>ID</th>
            <th>NUMERO_CUENTA</th>
            <th>ID_CLIENTE</th>
            <tr>
            <th>BALANCE</th>
            <tr>
        </thead>
        <tbody>
            <c:forEach items="${listaCuentas}" var="cuenta">
            <tr>
            <td>${cuenta.id}</td>
            <td>${cuenta.numeroCuenta}</td>
            <td>${cuenta.idCliente}</td>
            <td>${cuenta.balance}</td>
             </tr>
             </c:forEach>
        </tbody>
    </table>
    </body>
</html>