/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author DELL
 */
public class connexionBase {
   
    public Connection co=null;
    public Statement st=null;
    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connexionBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
         co=   DriverManager.getConnection("jdbc:mysql://localhost/basemvc","root","");
        } catch (SQLException ex) {
            Logger.getLogger(connexionBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
           st=  co.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(connexionBase.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
   }
