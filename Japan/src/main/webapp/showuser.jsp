<%@page import="com.icic.user" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Display Users</title>
</head>
<body>

   <%
        List<user> userList = (List<user>) request.getAttribute("user");
    %>
       
     <c:out value="vikas"></c:out>
   
  
   <table border="1" style="width:500px;text-align:center;">
        <tr>
            <th>Empno</th>
            <th>Name</th>
            <th>Salary</th>
        </tr>
        <c:forEach var="currentUser" items="${user}">
            <tr>
                <td>${currentUser.getEmpno()}</td>
                <td>${currentUser.getName()}</td>
                <td>${currentUser.getSal()}</td>
            </tr>
        </c:forEach>
       
    </table>
  
   <form action="/Japan/delete">
   <input type="text" placeholder="empno" name=empno>
   <button name="delete">delete</button>
   
   
   </form>
   
   <form action="/Japan/add">
   <input type="text" placeholder="empno" name=empno>
      <input type="text" placeholder="name" name=ename>
      <input type="text" placeholder="sal" name=sal>
   
   <button name="add">add</button>
   
   
   </form>
    

</body>
</html>
