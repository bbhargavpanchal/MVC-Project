<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
  <head>
  <meta charset="ISO-8859-1">
      <title>Spring MVC </title>
   </head>
<body>
<h2>Employees Registration</h2>
<form action ="details" method="post">
<table>

 <tr> 
       <td>Name: </td> 
       <td><input type="text" id="name" name="name"></td>
</tr>
 
 <tr> 
      <td> Email: </td> 
      <td><input type="text" id="email" name="email"></td>
</tr>
 
 <tr> 
       <td> Contact: </td> 
       <td><input type="text" id="contact" name="contact"></td>
    </tr>
 
 <tr> 
   <td><input type="submit" value="Register"></td>
  </tr>

</table>
</form>
</html>
