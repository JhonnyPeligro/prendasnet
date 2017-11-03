/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cimera.userLogin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
import com.cimera.dbConnection.mysqlConnection;
import com.cimera.beans.*;

/** * Servlet implementation class LoginServlet */ 

public class loginServlet extends HttpServlet { 
    
    Connection con = mysqlConnection.getCon();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {                         
        //processRequest(request, response);
        //HttpSession session = request.getSession();
        //session.setAttribute("error", "");
        RequestDispatcher dispatcher = request.getRequestDispatcher("templates/login.jsp");
        dispatcher.forward(request, response);  
    }
     /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {                         
        //processRequest(request, response);
        System.out.print("In post");
        String dni = request.getParameter("dni");
        String pass = request.getParameter("pass");
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
        
        if(dni == null || pass == null || dni.isEmpty() || pass.isEmpty()){
            response.sendRedirect(request.getRequestURI());
        }
        Statement stmt;
        try{
            if(con == null){
                mysqlConnection.getCon();
            }
            
            stmt = con.createStatement();
            
            String sql;
            
            sql = "SELECT * FROM users WHERE dni='"+dni+"'";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            String dbPass = rs.getString("pass");
            if(dbPass.equals("pass")){
                User bean = new User();
                bean.setDni(rs.getString("dni"));
                bean.setPass(rs.getString("pass"));
            }else{
                session.setAttribute("error", "credenciales erroneas");
                dispatcher = request.getRequestDispatcher("templates/login.jsp");
            }
            
        }catch(Exception e){
            Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, e);
        }
        if(dispatcher != null){
            dispatcher.forward(request, response);
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}