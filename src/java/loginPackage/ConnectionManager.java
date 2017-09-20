/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginPackage;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Caja
 */
public class ConnectionManager {
    static Connection con;
    static String url;
            
    public static Connection getConnection()
    {
        
        // creates three different Connection objects
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
 
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/prendas";
            String user = "admin";
            String password = "admin{1981}";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test1");
            }
 
            // connect way #2
            String url2 = "jdbc:mysql://localhost:3306/prendas?user=admin&password=admin{1981}";
            conn2 = DriverManager.getConnection(url2);
            if (conn2 != null) {
                System.out.println("Connected to the database test2");
            }

            /*// connect way #3
            String url3 = "jdbc:mysql://localhost:3306/prendas";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "secret");
 
            conn3 = DriverManager.getConnection(url3, info);
            if (conn3 != null) {
                System.out.println("Connected to the database test3");
            }*/
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
        

    return con;
    } 
}
