/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabcs.model;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.mysql.jdbc.exceptions.MySQLNonTransientConnectionException;
import com.uabcs.db.DBConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.sysvent.forms.Consultar_Empleados;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author chiflo02
 */
public class empleado {
      private int id;
    private String name;
    private String apePa;
    private String apeMa;
    private String address;
    private String phone;
    private String user;
    private String pass;
    private static DBConnection  conn = new DBConnection();
    private  static Connection con = conn.Conectar();
  private static int UNIQUE_CONSTRAINT_VIOLATED = 1062;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApePa() {
        return apePa;
    }

    public void setApePa(String apePa) {
        this.apePa = apePa;
    }

    public String getApeMa() {
        return apeMa;
    }

    public void setApeMa(String apeMa) {
        this.apeMa = apeMa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public static DBConnection getConn() {
        return conn;
    }

    public static void setConn(DBConnection conn) {
        empleado.conn = conn;
    }
  
    
    
    
      public static void createEmpleado(String nombre,String apePa,String apeMa,String address,String telefono,
              String usuario,String contrasenia,String tipoUsuario)
      throws ClassNotFoundException, SQLException, InstantiationException,MySQLNonTransientConnectionException{
            

  
     con.setAutoCommit(false);
     CallableStatement cStm= con.prepareCall("{call insertarEmpleado(?,?,?,?,?,?,?,?)}");
     cStm.setString(1,nombre);
     cStm.setString(2,apePa);
     cStm.setString(3,apeMa);
     cStm.setString(4,address);
     cStm.setString(5,telefono);
     cStm.setString(6,usuario);
     cStm.setString(7,contrasenia);
     cStm.setString(8, tipoUsuario);
     cStm.execute();

     con.commit();
     JOptionPane.showMessageDialog(null, "Usuario agregado Correctamente");
    
      } 
    
      public static void updateEmpleado(int idup,String nombre,String apePa,String apeMa,String address,String telefono)
      throws ClassNotFoundException, SQLException, InstantiationException,MySQLIntegrityConstraintViolationException
{
    
     con.setAutoCommit(false);
     CallableStatement cStm= con.prepareCall("{call actualizarEmpleado(?,?,?,?,?,?)}");
     cStm.setInt(1,idup);
     cStm.setString(2,nombre);
     cStm.setString(3,apePa);
     cStm.setString(4,apeMa);
     cStm.setString(5,address);
     cStm.setString(6,telefono);
     cStm.execute();
     con.commit();
     JOptionPane.showMessageDialog(null, "Usuario Actualizado Correctamente");
    }
    
     public static void deleteEmpleado(int idup)
     throws ClassNotFoundException, SQLException, InstantiationException,MySQLIntegrityConstraintViolationException,MySQLNonTransientConnectionException{
     
     con.setAutoCommit(false);
     CallableStatement cStm= con.prepareCall("{call eliminarEmpleado(?)}");
     cStm.setInt(1,idup);
     cStm.execute();
     con.commit();
     JOptionPane.showMessageDialog(null, "Usuario Eliminado Correctamente");
    }
    
     
   
     
       public static int ContarUsuarios() {

      String  SQL = "select count(*)AS cantidadUsuarios from empleado";
        try {
            int users= 0;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                users = rs.getInt("cantidadUsuarios");
            }
            return users;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }

    }
  

     
}
