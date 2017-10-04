/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signUpPackage;

import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  

import databaseConnectionPackage.connectionProvider;

/**
 *
 * @author Caja
 */
public class signUpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String dni = request.getParameter("dni");
        String tel = request.getParameter("tel");
        String pass = request.getParameter("pass");
        
        try{
            Connection con = connectionProvider.getCon();
            
            PreparedStatement st = con.prepareStatement("insert into registeruser values(?,?,?)");
            st.setString(1, dni);
            st.setString(2, tel);
            st.setString(3, pass);
            
            ResultSet rs = st.executeQuery();
            
            int i = rs.toInt();
            if (){
                System.out.println("Ya estas registrado!");
            }
            else{
                System.out.println("no se pudo registrar el usuario");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        out.close();
    }
}