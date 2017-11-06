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

import com.cimera.beans.*;
import com.cimera.dbConnection.mysqlConnection;
/**
 *
 * @author Caja
 */
public class Login extends HttpServlet {
    
    Connection con = null;
    
    @Override
    public void init() throws ServletException{
        super.init();
        connectDb();
    }
    
    void connectDb(){
        try{
            System.out.println("Tratando de conectar con la base de datos...");
            con = mysqlConnection.getCon();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        RequestDispatcher dispatcher= request.getRequestDispatcher("templates/login.jsp");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        System.out.print("in post");
        String dni = request.getParameter("dni");
        String pass = request.getParameter("pass");
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
        
        if(dni == null || pass == null || dni.isEmpty() || pass.isEmpty()){
            response.sendRedirect(request.getRequestURI());
        }
        
        Statement st;
        try{
            if(con == null)
                connectDb();
            st = con.createStatement();
            
            String sql;
            sql = "SELECT * FROM users WHERE dni='"+dni+"'";
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String dbPass = rs.getString("pass");
            if(dbPass.equals(pass)){
                User bean = new User();
                bean.setDni(dni);
                bean.setPass(pass);
                session.setAttribute("user", bean);
                response.sendRedirect("templates/home.jsp");
            }else{
                session.setAttribute("ERROR!", "las credenciales estan mal");
                dispatcher = request.getRequestDispatcher("templates/login.jsp");
            }
                
        }catch(Exception e){
          Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
        if (dispatcher != null) {
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
