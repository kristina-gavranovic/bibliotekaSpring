<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lice</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body style="background-color:#D3D3D3;">
<div align="center" class="container">
	<h2>Evidencija lica</h2>
	<br/>
	<form method="get" action="search">
		<input type="text" name="keyword" class="form-control-sm"/> &nbsp;
		<input type="submit" value="Pretraži" class="btn btn-primary"/>
	</form>
	<br/>
	<table border="1" cellpadding="5" class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>Ime</th>
			<th>Prezime</th>
			<th>Pol</th>
			<th>Datum rođenja</th>
			<th>E-mail</th>
			<th>Adresa</th>
			<th>Mesto</th>
			<th>Akcija</th>
		</tr>
		<c:forEach items="${listLice}" var="lice">
		<tr>
			<td>${lice.liceID}</td>
			<td>${lice.ime}</td>
			<td>${lice.prezime}</td>
			<td>${lice.pol}</td>
			<td>${lice.datumrodjenja}</td>
			<td>${lice.email}</td>
			<td>${lice.adresa}</td>
			<td>${lice.mesto}</td>
			<td>
				<a href="edit?id=${lice.liceID}">Izmeni</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete?id=${lice.liceID}">Obriši</a>
			</td>
		</tr>
		</c:forEach>
	</table>


	<div><button onclick="location.href='new'" type="button" class="btn btn-primary">Unos novog lica</button></div>
</div>	
</body>
</html>