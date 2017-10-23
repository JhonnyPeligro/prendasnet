/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cimera.pojo;

/**
 *
 * @author Caja
 */
public class signUpPojo {
    //seteamos los valores recibidos de register.jsp
    private String dni, tel, pass;
    
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public String getTel(){
        return tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    
    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
}
