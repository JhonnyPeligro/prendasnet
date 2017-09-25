/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerPackage;

import java.io.PrintWriter; 
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Caja
 */
public class registerServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException { 
			/*try { 
				UserBean user = new UserBean(); 
				user.setUserName(request.getParameter("dni")); 
				user.setPassword(request.getParameter("pass")); 
				user = UserDao.login(user); 

				if (user.isValid()) { 
					HttpSession session = request.getSession(true); 
					
					response.sendRedirect("templates/userLogged.jsp"); 
					//logged-in page 
                                } 
				else response.sendRedirect("templates/invalidLogin.jsp"); 
				//error page 
			} 
                        catch (Throwable theException) 
                        { 
                            System.out.println(theException); 
			} */
                        
                        response.setContentType("text/html");
                        PrintWriter out = response.getWriter();
                        
                        String dni = request.getParameter("dni");
                        String tel = request.getParameter("tel");
                        String pass = request.getParameter("pass");
                        
                        if(registerDao.register(dni, tel, pass))
                        {
                            RequestDispatcher rd = request.getRequestDispatcher("templates/userLogged.jsp");
                            rd.include(request, response);
                        }
                        else{
                            out.println("¡No se ha podido registrar el nuevo usuario!");
                            RequestDispatcher rd = request.getRequestDispatcher("templates/login.jsp");
                            rd.forward(request, response);
                        }
                        
                        out.close();
		} 
    
}
