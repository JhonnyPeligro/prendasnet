/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerPackage;

import java.sql.*;
/**
 *
 * @author Caja
 */
public class registerDao {
    public static void register(String dni, String tel, String pass){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prendas?user=admin&password=admin{1981}");
            
            PreparedStatement st = con.prepareStatement("insert into registeruser(dni, telefono, password) values");
            st.setString(1, dni);
            st.setString(2, pass);
            
            ResultSet rs = st.executeQuery();

        }
        catch(Exception e){}
    
    }
}
