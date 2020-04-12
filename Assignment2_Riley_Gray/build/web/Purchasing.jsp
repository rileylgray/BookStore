<%-- 
    Document   : Purchasing
    Created on : 27-Nov-2019, 5:47:56 PM
    Author     : Riley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="Style/main.css">

        <title>Purchase</title>
    </head>
    <body>
        <h1>Sheridan Books Store</h1>
        <a href="index.html" class="button">Home</a>
        <a href="AddBook.html" class="button">Add a Book</a>
        <a href="Dummy.html" class="button">Generate Dummy Records</a>
        <a href="ViewServlet" class="button">View Books</a>
        <a href="Delete.html" class="button">Delete Book</a>
        <a href="Edit.html" class="button">Edit Book</a>
        <a href="Purchase.html" class="buttonS">Purchase Book</a>
        
         <c:choose> 
                <c:when test="${bookP.id==0}">
                    <p>No Book Found</p>
                </c:when>
             <c:when test="${quantity<=bookP.quantity}">
             <table>
            <tr>
                <th>Location</th>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Courses</th>
                <th>Quantity Order</th>
                <th>Subtotal</th>
                <th>Tax</th>
                <th>Total</th>
            </tr>
            <tr>
                <td>${location}</td>
                <td>${bookP.id}</td>
                <td>${bookP.title}</td>
                <td>${bookP.author}</td>
                <td>${bookP.price}</td>
                <td>${bookP.quantity}</td>
                <td>${bookP.courses}</td>
                <td>${quantity}</td>
                <td>${subtotal}</td>
                <td>${tax}</td>
                <td>${total}</td>
            </tr> 
        </table>
             <div class="menu">
        <form method="GET" action="PurchaseFinalServlet">
            <input type="text" name="bookQ" value=${bookP.quantity} hidden>
            <input type="text" name="bookP" value=${quantity} hidden>
             <input type="text" name="location" value=${location} hidden>
            <input type="text" name="id" value=${bookP.id} hidden>
            <input type="Submit" value="Confirm">
        </form>
        </div>
             </c:when>
             <c:when test="${quantity>bookP.quantity}">
                 <p>Not enough inventory to Finish Request</p>
              <table>
            <tr>
                <th>Location</th>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
                <th>Courses</th>
                <th>Quantity</th>
                <th>Quantity Wanted</th>
            </tr>
            <tr>
                <td>${location}</td>
                <td>${bookP.id}</td>
                <td>${bookP.title}</td>
                <td>${bookP.author}</td>
                <td>${bookP.price}</td>
                <td>${bookP.courses}</td>
                <td>${bookP.quantity}</td>
                <td>${quantity}</td>
            </tr> 
        </table>
             </c:when>
         </c:choose>
    </body>
                    <footer></footer>
</html>
