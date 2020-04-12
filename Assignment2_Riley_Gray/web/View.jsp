<%-- 
    Document   : View
    Created on : 6-Nov-2019, 8:26:45 PM
    Author     : Riley
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
        <a href="ViewServlet" class="buttonS">View Books</a>
        <a href="Delete.html" class="button">Delete Book</a>
        <a href="Edit.html" class="button">Edit Book</a>
        <a href="Purchase.html" class="button">Purchase Book</a>
        <h2>Brampton</h2> 
        <table>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Courses</th>
            </tr>
       <c:forEach var="booksB" items="${booksB}">
            <tr>
                <td>${booksB.id}</td>
                <td>${booksB.title}</td>
                <td>${booksB.author}</td>
                <td>${booksB.price}</td>
                <td>${booksB.quantity}</td>
                <td>${booksB.courses}</td>
            </tr>
        </c:forEach>
 
        </table>
        
        <h2>Oakville</h2> 
        <table>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Courses</th>
            </tr>
          
       <c:forEach var="booksO" items="${booksO}">
            <tr>
                <td>${booksO.id}</td>
                <td>${booksO.title}</td>
                <td>${booksO.author}</td>
                <td>${booksO.price}</td>
                <td>${booksO.quantity}</td>
                <td>${booksO.courses}</td>
            </tr>
        </c:forEach>

        </table>
        
        <h2>Mississagua</h2> 
        <table>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Courses</th>
            </tr>
          
                <c:forEach var="booksM" items="${booksM}">
            <tr>
                <td>${booksM.id}</td>
                <td>${booksM.title}</td>
                <td>${booksM.author}</td>
                <td>${booksM.price}</td>
                <td>${booksM.quantity}</td>
                <td>${booksM.courses}</td>
            </tr>
        </c:forEach>

        </table>
                <footer></footer>

    </body>
</html>
