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

	<h1>Insert New Medicine Details</h1>
	
	<form action="insert" method="post">
		Medicine Id <input type ="text" name ="medicine_id"><br>
		Medicine Name <input type ="text" name ="medicine_name"><br>
		Medicine Description <input type ="text" name ="medicine_description"><br>
		Medicine Quantity <input type ="text" name ="medicine_quantity"><br>
		Supplier ID <input type ="text" name ="SupplierId"><br>
		
		<input type ="Submit" name = "submit" value ="Add medicine">
	</form>
</body>
</html>