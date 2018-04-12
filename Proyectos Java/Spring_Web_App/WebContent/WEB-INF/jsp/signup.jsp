<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up Here</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/signup" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td><label>Nombre de Usuario:</label></td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td><label>Contraseña:</label></td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><label>Confirma Contraseña:</label></td>
				<td><input type="password" name="repassword"></td>
			</tr>
			<tr>
				<td><label>Género:</label></td>
				<td><input type="radio" name="sexo" value="Hombre"><input type="radio" name="sexo" value="Mujer"></td>
			</tr>
			<tr>
				<td><label>Vehículo:</label></td>
				<td><input type="checkbox" name="vehiculo" value="Coche"><input type="checkbox" name="vehiculo" value="Bici"></td>
			</tr>
			<tr>
				<td><label>País:</label></td>
				<td>
					<select name="pais">
						<option value="spain">SPAIN</option>
						<option value="portugal">PORTUGAL</option>
						<option value="usa" selected="selected">USA</option>				
					</select>
				</td></tr>
			<tr>
				<td><label>Selecciona una imagen:</label></td>
				<td><input type="file" name="image"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Registrarse"></td>
			</tr>
		</table>
	
	</form>
</body>
</html>