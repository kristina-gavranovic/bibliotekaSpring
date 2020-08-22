<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Customer</title>
</head>
<script>
function goBack() {
  window.history.back();
}
</script>
<body>
	<div align="center">
		<h2>Prikaz Lica</h2>
		<form:form action="save" method="post" modelAttribute="lice">
			<table border="0" cellpadding="5">
				<tr>
					<td>ID Lica: </td>
					<td>${lice.liceID}
						<form:hidden path="liceID"/>
					</td>
				</tr>			
				<tr>
					<td>Ime: </td>
					<td><form:input path="ime" /></td>
				</tr>
				<tr>
					<td>Prezime: </td>
					<td><form:input path="prezime" /></td>
				</tr>
				<tr>
					<td>Pol: </td>
					<td><form:input path="pol" /></td>
				</tr>
				<tr>
					<td>Datum rođenja: </td>
					<td><form:input path="datumrodjenja" /></td>
				</tr>
				<tr>
					<td>Email: </td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>Adresa: </td>
					<td><form:input path="Adresa" /></td>
				</tr>	
				<tr>
					<td>Mesto: </td>
					<td><form:input path="Mesto" /></td>
				</tr>	
				
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Zapamti izmene">&nbsp;&nbsp;<button onclick="goBack()">Odustani</button></td>
				</tr>						
			</table>
		</form:form>
	</div>
</body>
</html>