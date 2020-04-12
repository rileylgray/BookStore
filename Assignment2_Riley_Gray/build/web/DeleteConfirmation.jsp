<%-- 
    Document   : DeleteConfirmation
    Created on : 27-Nov-2019, 2:17:02 PM
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
        <a href="ViewServlet" class="button">View Books</a>
        <a href="Delete.html" class="buttonS">Delete Book</a>
        <a href="Edit.html" class="button">Edit Book</a>
        <a href="Purchase.html" class="button">Purchase Book</a>
        <br>


        <h2>Deleted Entry</h2>
    <c:choose> 
        <c:when test="${book.id!=0}">
            <table>  
                <tr>
                    <td>${book.id}</td>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>${book.price}</td>
                    <td>${book.quantity}</td>
                    <td>${book.courses}</td>
                </tr>
            </table>
        </c:when>
        <c:otherwise>
            <p>No entry found</p>
        </c:otherwise>
    </c:choose>
</body>
                <footer></footer>

</html>
