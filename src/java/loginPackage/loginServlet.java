/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginPackage;

import java.io.PrintWriter; 
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

/** * Servlet implementation class LoginServlet */ 

public class loginServlet extends HttpServlet { 
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {                         
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
                        
        String dni = request.getParameter("dni");
        String pass = request.getParameter("pass");
                        
        if(UserDao.login(dni, pass))
        {
            RequestDispatcher rd = request.getRequestDispatcher("templates/userLogged.jsp");
            rd.include(request, response);
        }
        else{
            out.println("¡Usuario o contraseña incorrectos!");
            RequestDispatcher rd = request.getRequestDispatcher("templates/login.jsp");
            rd.forward(request, response);
        }
                        
        out.close();
    } 
}