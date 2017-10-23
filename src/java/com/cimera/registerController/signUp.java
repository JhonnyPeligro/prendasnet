/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cimera.registerController;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cimera.pojo.signUpPojo;

import com.cimera.signUpLogic.signUpServiceLogic;

/**
 *
 * @author Caja
 */
public class signUp extends HttpServlet {
        
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		try {
			String dni=req.getParameter("dni");
			String tel=req.getParameter("tel");
			String pass=req.getParameter("pass");
			//getting all the values from index.jsp
			
			signUpPojo pObject = new signUpPojo();
			pObject.setDni(dni);		//seteamos los valores recibidos de register.jsp
			pObject.setPass(pass);
		
			
			int checkFlag = signUpServiceLogic.save(pObject); //enviamos los valores de pojo
			if(checkFlag!=0){
				out.print("<h2 align='center'> SuccessFully Registered </h2>"); // if successfully executes save method
				out.print("<h2 align='center'> USER DNI : "+ dni+"</h2>");
				out.print("<h2 align='center'> USER TEL : "+ tel +"</h2>");
				out.print("<h2 align='center'> PASS  : "+ pass +"</h2>");

				
			}
                        else{
				out.print("<p align='center'>Invalid User Details</p>");
				req.getRequestDispatcher("register.jsp").include(req, resp);

			}
		} catch (Exception e) { // si no hay datos correctos me tira exception
			out.print("<p align='center'>Please enter Valid Details</p>");
			req.getRequestDispatcher("register.jsp").include(req, resp);
		}		
	}
    }
    
