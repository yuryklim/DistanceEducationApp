<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page contentType="text/html; charset=windows-1251" %>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>���������</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

</head>
<body>
<div class="container">

    <form method="post" action="DownloadInf" class="form-signin" enctype="multipart/form-data">
        <h2 class="form-heading">���������</h2>
        <div class="form-group">
            <p style="color: green">*����:</p>
            <input name="user" type="text" title="User" required="required" id="name" class="form-control"/>
            <p style="color: green">*������:</p>
            <input name="password" type="password" title="Password" required="required" class="form-control"/>
            <p style="color: green">*�������:</p>
             <input name="lastname" type="text" title="Lastname" required="required" class="form-control"/>
            <p style="color: green">*��'�:</p>
            <input name="firstname" type="text" title="Firstname" required="required" class="form-control"/>
            <p style="color: green">*��-�������:</p>
            <input name="surname" type="text" title="Surname" required="required" class="form-control"/>
            <p style="color: green">�������� ������:</p>
            <input name="academicTitle" type="text" title="Academic title" class="form-control"/>
            <p style="color: green">����� ������:</p>
            <input name="degree" type="text" title="Degree" class="form-control"/>
            <p style="color: green">*����������:</p>
            <input name="organization" type="text" title="Organization" required="required" class="form-control"/>
            <p style="color: green">*������:</p>
            <input name="post" type="text" title="Post" required="required" class="form-control"/>
            <p style="color: green">*����:</p>
            <input name="photo" type="file" size="50"/>
            <p style="color: green">����:</p>
            <select id="disabledSelect" title="Role" class="form-control">
            <option>��������</option>
            <option>������� </option>
        </select>
            ������ ������ (����� ��� ����������)
            <input name="teacherPassword" type="password" title="TeacherPassword"  class="form-control"/>
            <button class="btn btn-lg btn-primary btn-block" type="submit" name="save" id="save">��������������!</button>
        </div>
    </form>
    <form method="post" action="Cancel" class="form-signin">
        <button class="btn btn-lg btn-primary btn-block" type="submit" name="cancel">���������</button>
    </form>

</div>
<!-- /container -->
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
