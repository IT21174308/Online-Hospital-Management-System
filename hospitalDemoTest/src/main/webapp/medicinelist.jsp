<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Supplied Medicines</h1>
<table border='1'>

<tr>
		<th>Medicine ID</th>
		<th>Medicine Name</th>
		<th>Medicine Quantity</th>
		<th>Medicine Description</th>			
				
	</tr>
	<c:forEach var= "sup" items ="${supdetails}">
	
	<c:set var="medicine_id" value="${sup.medicine_id}"/>
	<c:set var="medicine_name" value="${sup.medicine_name}"/>
	<c:set var="medicine_description" value="${sup.medicine_description}"/>
	<c:set var="medicine_quantity" value="${sup.medicine_quantity}"/>
	
	<tr>
		<td>${sup.medicine_id}</td>
		<td>${sup.medicine_name}</td>
		<td>${sup.medicine_description}</td>
		<td>${sup.medicine_quantity}</td>
		
	</tr>
	
	</c:forEach>
	</table>
		<form action="insert.jsp" method="post">
		<input type="submit" name="submit" value="Insert new medicine">
	</form>
    
	<form action="delete" method="post">
		<h1>Delete Medicine</h1>
		Medicine ID <input type = "text" name = "mid"><br>
		<input type="submit" name="submit" value="Delete">
	</form>
	<br>
	
	<form action="update.jsp" method="post">
		<input type="submit" name="submit" value="Updte">	
	</form>
	

</body>
</html>