<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rezultat pretrage autora</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<script>
function goBack() {
  window.history.back();
}
</script>
<body style="background-color:#D3D3D3;">
<div align="center"  class="container">
	<h2>Rezultat pretrage autora</h2>
	<br>
	<table border="1" cellpadding="5" class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>Ime</th>
			<th>Prezime</th>
			<th>Mesto</th>
		</tr>
		<c:forEach items="${result}" var="autor">
		<tr>
			<td>${autor.autorID}</td>
			<td>${autor.ime}</td>
			<td>${autor.prezime}</td>
			<td>${autor.zemlja}</td>
		</tr>
		</c:forEach>
	</table>
	<h2></h2>
	<div>
			<button onclick="goBack()" class="btn btn-primary">Odustani</button>
	</div>
</div>	
</body>
</html>