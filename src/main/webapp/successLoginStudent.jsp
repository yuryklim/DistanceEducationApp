<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page contentType="text/html; charset=windows-1251" %>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Login success</title>

</head>

<body>

<br>
<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">

<img src = "CheckUser" width="120" height="140" class = "img-circle">
<form action="CheckUser" method="post" class="form-group">
    <div class="container">

        Ви успішно зайшли в систему!
        Користувач студент: <%=request.getParameter("user")%>
        <div class="form-group row">
            <label for="lastname" class="col-xs-1 col-form-label">Прізвище:</label>
            <div class="col-xs-3">
                <input class="form-control" type="text" value="<%=request.getAttribute("lastName")%>" id="lastname">
            </div>
        </div>
        <div class="form-group row">
            <label for="firstname" class="col-xs-1 col-form-label">Ім'я:</label>
            <div class="col-xs-3">
                <input class="form-control" type="text" value="<%=request.getAttribute("firstName")%>" id="firstname">
            </div>
        </div>
        <div class="form-group row">
            <label for="surname" class="col-xs-1 col-form-label">По-батькові:</label>
            <div class="col-xs-3">
                <input class="form-control" type="text" value="<%=request.getAttribute("surname")%>" id="surname">
            </div>
        </div>
        <div class="form-group row">
            <label for="acTitle" class="col-xs-1 col-form-label">Науковий ступінь:</label>
            <div class="col-xs-3">
                <input class="form-control" type="text" value="<%=request.getAttribute("acTitle")%>" id="acTitle">
            </div>
        </div>
        <div class="form-group row">
            <label for="degree" class="col-xs-1 col-form-label">Вчене звання:</label>
            <div class="col-xs-3">
                <input class="form-control" type="text" value="<%=request.getAttribute("degree")%>" id="degree">
            </div>
        </div>
        <div class="form-group row">
            <label for="organization" class="col-xs-1 col-form-label">Організація:</label>
            <div class="col-xs-3">
                <input class="form-control" type="text" value="<%=request.getAttribute("organization")%>" id="organization">
            </div>
        </div>
        <div class="form-group row">
            <label for="post" class="col-xs-1 col-form-label">Посада:</label>
            <div class="col-xs-3">
                <input class="form-control" type="text" value="<%=request.getAttribute("post")%>" id="post">
            </div>
        </div>
    </div>
</form>

</body>

</html>
