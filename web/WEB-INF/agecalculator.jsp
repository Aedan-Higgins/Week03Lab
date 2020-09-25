<%-- 
    Document   : agecalculator
    Created on : Sep 24, 2020, 10:52:50 AM
    Author     : 789648
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 03 Lab</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Age: <input type="text" name="input" value="${input}"><br>
            <input type="submit" value="Calculate">
        </form>
        <p>${output}</p>
        <a href="./arithmetic">Arithmetic Calculator</a>
    </body>
</html>
