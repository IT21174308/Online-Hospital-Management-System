<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
		String id = request.getParameter("medicine_id");
		String name = request.getParameter("medicine_name");
		String description = request.getParameter("medicine_description");
		String quantity = request.getParameter("medicine_quantity");
		String SupplierId = request.getParameter("supplierId");

	%>
	
	
	<form action="update" method="post">
	<table border='1'>
		<tr>
			<td>Medicine ID</td>
			<td><input type="text" name="medicine_id" value="<%= id %>" ></td>
		</tr>
		<tr>
			<td>Medicine Name</td>
			<td><input type="text" name="medicine_name" value="<%= name %>"></td>
		</tr>
		<tr>
		<td>Medicine Description</td>
		<td><input type="text" name="medicine_description" value="<%= description %>"></td>
	</tr>
	<tr>
		<td>Medicine Quantity</td>
		<td><input type="text" name="medicine_quantity" value="<%= quantity %>"></td>
	</tr>
	<tr>
		<td>Supplier id</td>
		<td><input type="text" name="SupplierId" value="<%= SupplierId %>"readonly></td>
	</tr>
		
	</table>
	<br>
	<input type="submit" name="submit" value="Update Details">
	</form>

</body>
</html>