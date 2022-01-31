/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabcs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class DBConnection {
    
   
       private final static String URL = "jdbc:mysql://localhost:3306/";
       private final static String USERNAME = "root";
       private final static String PASSWORD = "";
       private final static String DB = "SYSVENT";
       static Connection  con = null;
       
       public Connection Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL+DB, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex, "Error en la clase", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
        
    }
   

