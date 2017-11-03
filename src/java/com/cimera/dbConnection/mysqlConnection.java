/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cimera.dbConnection;

import java.sql.*;

/**
 *
 * @author Caja
 */
public class mysqlConnection {

    
    public static Connection getCon(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prendasnet?user=admin&password=admin{1981}");
        }
        catch(Exception e){
           System.out.println("No se pudo conectar con la base de datos mysql");
        }
        return con;
    }
    
 
}

