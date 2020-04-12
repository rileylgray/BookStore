<%-- 
    Document   : Editing
    Created on : 27-Nov-2019, 3:04:31 PM
    Author     : Riley
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" type="text/css" href="Style/main.css">

        <title>JSP Page</title>
    </head>
    <body>
         <h1>Sheridan Books Store</h1>
   <a href="index.html" class="button">Home</a>
        <a href="AddBook.html" class="button">Add a Book</a>
        <a href="Dummy.html" class="button">Generate Dummy Records</a>
        <a href="ViewServlet" class="button">View Books</a>
        <a href="Delete.html" class="button">Delete Book</a>
        <a href="Edit.html" class="buttonS">Edit Book</a>
        <a href="Purchase.html" class="button">Purchase Book</a>
        <br>
      
        <div class="menu">
        <c:choose> 
        <c:when test="${bookE.id!=0}">
            <P>Change desired information</P>
            <form method="GET" action="EditDoneServlet">
        
                <input type="text" name="location" value=${location} hidden>
           
           <input type="text" name="id" value=${bookE.id} hidden>
         
            Title: <input type="text" name="title" value=${bookE.title}>
            </br>
            Author: <input type="text" name="author" value=${bookE.author}>  
            </br>
            Price: <input type="text" name="price" value=${bookE.price}>
            </br> 
            Quantity: <input type="text" name="quantity" value=${bookE.quantity}>
            </br>
            Related Courses: <input id="big" type="text" name="courses" value=${bookE.courses}>
            </br> 
            </br>
            <input type="Submit" value="Submit">
        </form>
        </c:when>
             <c:otherwise>
            <p>No entry found</p>
        </c:otherwise>
        </c:choose>
        </div>
                        <footer></footer>

    </body>
</html>
