<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 25, 2020, 9:55:32 AM
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
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            Input1: <input type="text" name="input1" value="${input1}"><br>
            Input2: <input type="text" name="input2" value="${input2}"><br>
            <input type="submit" name="op" value="+">
            <input type="submit" name="op" value="-">
            <input type="submit" name="op" value="*">
            <input type="submit" name="op" value="/">
        </form>
        <p>${output}</p>
        <a href="./age">Age Calculator</a>
    </body>
</html>