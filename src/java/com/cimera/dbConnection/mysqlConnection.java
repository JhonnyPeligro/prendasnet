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
    private static Connection con = null;
    
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prendasnet?user=admin&password=admin{1981}");
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
    
    public static Connection getCon(){
        return con;
    }
}

