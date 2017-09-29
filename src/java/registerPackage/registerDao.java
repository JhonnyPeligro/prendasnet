/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerPackage;

import java.sql.*;
import databaseConnectionPackage.connectionProvider;


/**
 *
 * @author Caja
 */
public class registerDao {
    
    public static int register(String dni, String tel, String pass){
        int status = 0;
        
        try{
            Connection con = connectionProvider.getCon();
            
            PreparedStatement st = con.prepareStatement("insert into registeruser values(?, ?, ?)");
            st.setString(1, dni);
            st.setString(2, tel);
            st.setString(3, pass);
            
            status = st.executeUpdate();
        }
        catch(Exception e){
            System.out.println("ERRORASO");
        }
        
        return status;
    }
    
}
