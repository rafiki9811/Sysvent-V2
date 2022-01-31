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

/**
 *
 * @author chiflo02
 */
public class proveedor {

    private String nombre;
    private String apePa;
    private String apeMa;
    private int empresa;
    private String telefono;
    private String direccion;
    private static DBConnection  conn = new DBConnection();
      private static Connection con = conn.Conectar();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
     public static void createProveedor(String nombre,String apePa,String apeMa,int compain,String telefono,String direccion)
     throws ClassNotFoundException, SQLException, InstantiationException{
        con.setAutoCommit(false);
        CallableStatement cStm= con.prepareCall("{call insertarProveedor(?,?,?,?,?,?)}");
        cStm.setString(1,nombre);
        cStm.setString(2,apePa);
        cStm.setString(3,apeMa);
        cStm.setInt(4,compain);
        cStm.setString(5,telefono);
        cStm.setString(6,direccion);
        cStm.execute();
        con.commit();
        JOptionPane.showMessageDialog(null, "Proveedor agregado Correctamente");
    }
    public static void updateProv(int idup,String nombre,String apePa,String apeMa,String telefono,String address)
    throws ClassNotFoundException, SQLException, InstantiationException,MySQLIntegrityConstraintViolationException{
        con.setAutoCommit(false);
        CallableStatement cStm= con.prepareCall("{call actualizarProveedor(?,?,?,?,?,?)}");
        cStm.setInt(1,idup);
        cStm.setString(2,nombre);
        cStm.setString(3,apePa);
        cStm.setString(4,apeMa);
        cStm.setString(5,telefono);
        cStm.setString(6,address);
        cStm.execute();
        con.commit();
        JOptionPane.showMessageDialog(null, "Usuario Actualizado Correctamente");
    }
    public static void deleteProv(int idup)
    throws ClassNotFoundException, SQLException, InstantiationException,MySQLIntegrityConstraintViolationException,MySQLNonTransientConnectionException{
        con.setAutoCommit(false);
        CallableStatement cStm= con.prepareCall("{call eliminarProveedor(?)}");
        cStm.setInt(1,idup);
        cStm.execute();
        con.commit();
        JOptionPane.showMessageDialog(null, "Usuario Eliminado Correctamente");
    }
    public static String familia(int id) throws SQLException{
        String SQL = "select  nombre_fampro from familiaProducto where id_fampro = '" + id + "'";
        String familia = null;
        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery(SQL);
        while(rs.next()){
            familia = rs.getString(1);
        }
        return familia;
    }
  
     
}
