/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cimera.signUpLogic;

import java.sql.*;

import com.cimera.pojo.signUpPojo;
import com.cimera.dbConnection.mysqlConnection;

/**
 *
 * @author Caja
 */
public class signUpServiceLogic {
    public static int save(signUpPojo pObject){
        int flag = 0;
        
        try{
           
           Connection con = mysqlConnection.getCon();//Consiguiendo coneccion de mysql
           PreparedStatement st = con.prepareStatement("insert into users(dni, tel, pass) values (?, ?, ?)");
           
           st.setString(1, pObject.getDni());//enviamos los datos a la base de datos
           st.setString(2, pObject.getTel());
           st.setString(3, pObject.getPass());
           
           flag = st.executeUpdate();//si todo sale bien el valor cambia
           con.close();
        }
        catch(Exception e){
            System.out.println("No se puede registrar");
        }
        
        return flag;
    }
}
