<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rezultat pretrage</title>
</head>
<script>
function goBack() {
  window.history.back();
}
</script>
<body>
<div align="center">
	<h2>Rezultat pretrage</h2>
	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>Ime</th>
			<th>Prezime</th>
			<th>Pol</th>
			<th>Datum rođenja</th>
			<th>E-mail</th>
			<th>Adresa</th>
			<th>Mesto</th>
		</tr>
		<c:forEach items="${result}" var="lice">
		<tr>
			<td>${lice.liceID}</td>
			<td>${lice.ime}</td>
			<td>${lice.prezime}</td>
			<td>${lice.pol}</td>
			<td>${lice.datumrodjenja}</td>
			<td>${lice.email}</td>
			<td>${lice.adresa}</td>
			<td>${lice.mesto}</td>
		</tr>
		</c:forEach>
	</table>
	<h2></h2>
	<div>
			<button onclick="goBack()">Odustani</button>
	</div>
</div>	
</body>
</html>