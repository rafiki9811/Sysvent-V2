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
public class cliente {

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

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
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

    public static DBConnection getConn() {
        return conn;
    }

    public static void setConn(DBConnection conn) {
        cliente.conn = conn;
    }

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        cliente.con = con;
    }
    private String nombre;
    private String apePa;
    private String apeMa;
    private String rfc;
    private String telefono;
    private String direccion;
    private static DBConnection  conn = new DBConnection();
    private static Connection con = conn.Conectar();
    
     public static void createCliente(String nombre,String apePa,String apeMa,String rfc,String direccion,String telefono)
     throws ClassNotFoundException, SQLException, InstantiationException{
        con.setAutoCommit(false);
        CallableStatement cStm= con.prepareCall("{call insertarCliente(?,?,?,?,?,?)}");
        cStm.setString(1,nombre);
        cStm.setString(2,apePa);
        cStm.setString(3,apeMa);
        cStm.setString(4,rfc);
        cStm.setString(5,direccion);
        cStm.setString(6,telefono);
        cStm.execute();
        con.commit();
        JOptionPane.showMessageDialog(null, "Cliente agregado Correctamente");
    }
    public static void updateCliente(int idup,String nombre,String apePa,String apeMa,String address,String telefono)
    throws ClassNotFoundException, SQLException, InstantiationException,MySQLIntegrityConstraintViolationException{
        con.setAutoCommit(false);
        CallableStatement cStm= con.prepareCall("{call actualizarCliente(?,?,?,?,?,?)}");
        cStm.setInt(1,idup);
        cStm.setString(2,nombre);
        cStm.setString(3,apePa);
        cStm.setString(4,apeMa);
        cStm.setString(5,address);
        cStm.setString(6,telefono);
        cStm.execute();
        con.commit();
        JOptionPane.showMessageDialog(null, "Cliente Actualizado Correctamente");
    }
    public static void deleteCliente(int idup)
    throws ClassNotFoundException, SQLException, InstantiationException,MySQLIntegrityConstraintViolationException,MySQLNonTransientConnectionException{
        con.setAutoCommit(false);
        CallableStatement cStm= con.prepareCall("{call eliminarCliente(?)}");
        cStm.setInt(1,idup);
        cStm.execute();
        con.commit();
        JOptionPane.showMessageDialog(null, "Usuario Eliminado Correctamente");
    }
   
}
