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
        <title>Response Page</title>
    </head>
    <body>
        <h1>Response</h1>
        <br/><%= new Date()%><br/>
        <% 
            User user = (User) session.getAttribute("user");
        %>
        <b><%= user.getFirstName() + " " + user.getLastName() %></b>
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
                <%
                    LoginService loginService = new loginService();
                    List<User> list = loginService.getListUser();
                    for(User u : list){
                %>
                <tr>
                    <td><%=u.getUserId()%></td>
                    <td><%=u.getFirstName()%></td>
                    <td><%=u.getLastName()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>
        <br/>
    </body>
</html>
