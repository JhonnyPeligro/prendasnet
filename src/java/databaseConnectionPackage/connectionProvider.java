/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseConnectionPackage;

import java.sql.*;

/**
 *
 * @author Caja
 */
public class connectionProvider {
    private static Connection con = null;
    
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prendas?user=admin&password=admin{1981}");
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
    
    public static Connection getCon(){
        return con;
    }
}
