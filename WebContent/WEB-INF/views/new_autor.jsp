<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Unos novog autora</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<script>
	function goBack() {
		window.history.back();
	}
</script>

<body  style="background-color:#D3D3D3;">

	<div align="center">
	<h2>Unos novog autora</h2>
				<form:form action="save_autor" method="post" modelAttribute="autor">
					<c:if test="${not empty message}">
						<div>${message}</div>
					</c:if>


					<c:if test="${not empty invalid}">
						<div class="alert alert-warning ">Error message: ${invalid}</div>
					</c:if>

					<table border="0" cellpadding="5">

						<tr>
							<td>Ime:</td>
							<td><form:input path="ime" /></td>
						</tr>
						<tr>
							<td>Prezime:</td>
							<td><form:input path="prezime" /></td>
						</tr>
						<tr>
							<td>Zemlja porekla:</td>
							<td><form:input path="zemlja" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="Zapamti" class="btn btn-primary">&nbsp;&nbsp;
								<button onclick="goBack()" class="btn btn-primary">Odustani</button></td>

						</tr>
					</table>
				</form:form>
	</div>
</body>
</html>

