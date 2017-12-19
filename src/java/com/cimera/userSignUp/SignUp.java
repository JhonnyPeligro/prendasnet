/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cimera.userSignUp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

/**
 *
 * @author Caja
 */
public class SignUp extends HttpServlet {

    Connection con = mysqlConnection.getCon();
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
        dispatcher.forward(request, response);
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        String dni = request.getParameter("dni");
        String tel = request.getParameter("tel");
        String pass = request.getParameter("pass");
        
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
        
        /*
        Esti en caso de que querramos que tenga que confirmar su contraseña al registrarse
        if(!pass.equals(confirmPass)){
            session.setAttribute("error", "las contraseñas deben coincidir");
            dispatcher = request.getRequestDispatcher("register.jsp");
            dispatcher.forward(request, response);
            return;
        }*/
        
        //Statement stmt;
        try{
            if(con == null){
                mysqlConnection.getCon();
            }
            //stmt = con.createStatement();
            
            //string sql;
            //sql = "INSERT INTO users (dni, tel, pass) VALUES ('"+dni+"', '"+tel+"', '"+pass+"')";
            
            /*PreparedStatement stmt = con.prepareStatement("INSERT INTO users (dni, tel, pass) VALUES (?, ?, ?)");
            stmt.setString(1, dni);
            stmt.setString(2, tel);
            stmt.setString(3, pass);*/
            
            PreparedStatement stmt = con.prepareStatement("INSERT INTO users (dni, tel, pass) SELECT * FROM (SELECT '"+dni+"', '"+tel+"', '"+pass+"') AS tmp WHERE NOT EXISTS (SELECT dni FROM users WHERE dni='"+dni+"')");
            
            
            int row = stmt.executeUpdate();
            stmt.close();
            if(row > 0){
                System.out.println("Se ha registrado exitosamente");
                //response.sendRedirect("profile");
                dispatcher = request.getRequestDispatcher("index.jsp");
            }else{
                session.setAttribute("ERROR", "ERROR! SQL ERROR");
                dispatcher = request.getRequestDispatcher("templates/register.jsp");
            }
            
        }
        catch(Exception e){
            System.out.println(e);
            //Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, e);
            dispatcher = request.getRequestDispatcher("register.jsp");
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
