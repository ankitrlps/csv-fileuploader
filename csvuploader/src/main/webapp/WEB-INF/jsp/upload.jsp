<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- th:text = "${errorMsg}" || th:text = "${errorMsg}" --%>

<div id="mess"></div>
<h2>Please upload the csv file</h2>
<form method="post" action="/csvupload/uploadfile" enctype="multipart/form-data">
<input type="file" name="file"> <br><br>
<input type="submit">
</form>

<script type="text/javascript">
var jsonString = '${successMsg}';
document.getElementById("mess").innerHTML = jsonString;
</script>
</body>
</html>