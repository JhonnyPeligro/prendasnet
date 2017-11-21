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

    <div class="topnav" id="myNavbar">
        <a href="#home" class="active">Home</a>
        <a href="#prendas">Prendas</a>
        <a href="#contact">Contacto</a>
        <a href="#about">About</a>
        <a href="javascript:void(0);" style="font-size:15px;" class="icon" onclick="dropdown()">&#9776;</a>
    </div>

    <h1>Prendasnet</h1>

    <script>
        function dropdown(){
            var x = document.getElementById("myNavbar");
            if(x.className === "myNavbar"){
                x.className += "responsive";
            }else{
                x.className = "topnav";
            }      
        }
    </script>
</body>
</html>
