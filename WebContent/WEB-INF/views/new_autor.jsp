<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Unos novog autora</title>
</head>
<script>
	function goBack() {
		window.history.back();
	}
</script>
<body>
	<div align="center">
		<h2>
			Unos novog autora
			<h2>
				<form:form action="save_autor" method="post" modelAttribute="autor">
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
								value="Zapamti">&nbsp;&nbsp;
								<button onclick="goBack()">Odustani</button></td>

						</tr>
					</table>
				</form:form>
	</div>
</body>
</html>
l>
