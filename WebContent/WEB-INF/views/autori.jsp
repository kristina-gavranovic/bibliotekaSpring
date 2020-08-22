<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Autori</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body style="background-color:#D3D3D3;">
<div align="center" class="container">
	<h2>Autori</h2>
	<br/>
	<form method="get" action="search_autor">
		<input type="text" name="keyword" class="form-control-sm"/> &nbsp;
		<input type="submit" value="Pretraži" class="btn btn-primary"/>
	</form>
	<br/>
	<table border="1" cellpadding="5" class="table table-bordered">
		<tr>
			<th>ID</th>
			<th>Ime</th>
			<th>Prezime</th>
			<th>Zemlja</th>
			<th>Akcija</th>
		</tr>
		<c:forEach items="${listAutori}" var="autor">
		<tr>
			<td>${autor.autorID}</td>
			<td>${autor.ime}</td>
			<td>${autor.prezime}</td>
			<td>${autor.zemlja}</td>
			<td>
				<a href="edit_autor?id=${autor.autorID}">Izmeni</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete_autor?id=${autor.autorID}">Obriši</a>
			</td>
		</tr>
		</c:forEach>
	</table>


	<div><button onclick="location.href='new_autor'" type="button" class="btn btn-primary">Unos novog autora</button></div>
</div>	
</body>
</html>