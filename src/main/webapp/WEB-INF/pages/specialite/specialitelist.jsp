<%--
  Created by IntelliJ IDEA.
  User: Bazzman
  Date: 16/02/2023
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <title>Liste des specialites</title
    <link href="<%=request.getContextPath()%>/bootstrap/dist/css/bootstrap.css" />

</head>
<body>

<table class="table">

    <tr class="table-thead-tr">
        <th>ID</th>
        <th>Libelle</th>
        <th>Service</th>

        <th class="th-actions">Actions</th>
    </tr>

    <c:forEach items="${requestScope.specialites}" var="specialite">
        <tr class="table-tbody-tr">
            <td>${specialite.id}</td>
            <td>${specialite.libelle}</td>
            <td>${specialite.service.libelle}</td>
            <td class="text-center">
                <a href="${pageContext.request.contextPath}/specialite/update?id=${specialite.id}" class="btn btn-warning">modifier</a>
                <a href="${pageContext.request.contextPath}/specialite/remove?id=${specialite.id}" class="btn btn-danger">supprimer</a>
            </td>
        </tr>
    </c:forEach>


</table>

</body>
</html>
