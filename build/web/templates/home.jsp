<%-- 
    Document   : home
    Created on : 18/09/2017, 15:56:47
    Author     : Caja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="..\css\indexStyle.css">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.css"/>
        <title>Response Page</title>
    </head>
    <body>
        
        <img class="topLeft logoImg rounded" src="../img/triskel.png"/>
        
        <!--
        <!-- dropdown 
        <ul id="dropdown" class="dropdown-content">
            <li><a href="#">ONE</a></li>
            <li><a href="#">TWO</a></li>
            <li><a href="#">THREE</a></li>
        </ul>
        <!-- end dropdown
        <nav>
            <div class="nav-wrapper">
                <a href="#!" class="brand-logo">Logo</a>
                <ul class="right hide-on-med-and-down">
                  <li><a href="sass.html">Prendas</a></li>
                  <li><a href="">Prendas</a></li>
                  <!-- Dropdown Trigger 
                  <li><a class="dropdown-button" href="#!" data-activates="dropdown">Dropdown<i class="material-icons right">arrow_drop_down</i></a></li>
                </ul>
            </div>
        </nav>-->
                  
        <div class="topnav" id="myTopnav">
            <a href="#home">Home</a>
            <a href="#news">News</a>
            <a href="#contact">Contact</a>
            <a href="#about">About</a>
        </div>
        
        <h1>Response</h1>

        <br/>
        
        <table>
            <thead>
                <tr>
                    <th>User ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${user.dni}</td>
                    <td>${user.tel}</td>
                </tr>

            </tbody>
        </table>
        <br/>
        
        <!-- materialize js -->
        <script src="js/materialize.min.js"></script>
    </body>
</html>
