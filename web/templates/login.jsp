<%-- 
    Document   : login
    Created on : 11/09/2017, 16:59:44
    Author     : matias cazas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prendas</title>
        
        <link rel="stylesheet" href="..\css\indexStyle.css">
        
    </head>
    <body>
        
        <img class="topLeft logoImg rounded" src="../img/logo.png"/>
        
        <div class="login-page">
            <div class="form">
              
              <form method="post" action="../../SourcePackages/mysqlConnection/checkLogin.java" class="login-form">
                <input type="text" name="dni" placeholder="dni"/>
                <input type="password" name="pass" placeholder="contraseña"/>
                <button class="p-button">Ingresar</button>
                <p class="message">¿No estas registrado? <a href="register.jsp">Crea una cuenta</a></p>
              </form>
            </div>
      </div>
        
        
    </body>
</html>