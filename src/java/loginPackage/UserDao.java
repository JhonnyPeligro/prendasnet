/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginPackage;


import java.sql.*;
import com.cimera.dbConnection.mysqlConnection;

/**
 *
 * @author Caja
 */
public class UserDao {
    
    public static boolean login(String dni, String pass){
        boolean status = false;
        
        try{
            Connection con = mysqlConnection.getCon();
            
            PreparedStatement st = con.prepareStatement("select * from users where dni = ? and password = ?");
            st.setString(1, dni);
            st.setString(2, pass);
            
            ResultSet rs = st.executeQuery();
            status = rs.next();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        return status;
    }
}
