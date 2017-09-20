<%-- 
    Document   : userLogged
    Created on : 20/09/2017, 11:00:05
    Author     : Caja
--%>

<%@ page language="java" 
        contentType="text/html; charset=windows-1256"
        pageEncoding="windows-1256"
        import="loginPackage.UserBean"
%>

<html>

    <head>
        <meta http-equiv="Content-Type" 
            content="text/html; charset=windows-1256">
        <title>   User Logged Successfully   </title>
    </head>
	
    <body>

        <center>
           <% UserBean currentUser = (UserBean (session.getAttribute("currentSessionUser"));%>
			
           Welcome <%= currentUser.getFirstName() + " " + currentUser.getLastName() %>
        </center>

    </body>
	
</html>
