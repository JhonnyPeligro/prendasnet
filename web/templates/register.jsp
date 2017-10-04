<%-- 
    Document   : register
    Created on : 13/09/2017, 11:05:23
    Author     : matias cazas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="..\css\indexStyle.css">
        
    </head>
    <body>
        
        <img class="topLeft logoImg rounded" src="../img/logo.png"/>
        
        <div class="login-page">
            
            <div class="form">
                <form method="post" action="<%=request.getContextPath()%>/signUpServlet" class="register-form">
                    <input type="text" name="dni" placeholder="dni"/>
                    <input type="text" name="tel" placeholder="telefono"/>
                    <input type="password" name="pass" placeholder="contraseña"/>
                    <button class="p-button">Registrarse</button>
                    <p class="message">¿Ya estas registrado? <a href="login.jsp">Entrar</a></p>
                </form>
            </div>
        </div>
        
        
    </body>
</html>
