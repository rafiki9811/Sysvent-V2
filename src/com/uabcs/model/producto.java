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
 *codigo
 * @author chiflo02
 */
public class producto {
     private String codigo;
     private String nombre;
     private double precioCompra;
     private double precioVenta;
     private int existencia;
     private String tipo_venta; 
     private int depfk;
     private int famfk;
    private static DBConnection  conn = new DBConnection();
      private static Connection con = conn.Conectar();
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getTipo_venta() {
        return tipo_venta;
    }

    public void setTipo_venta(String tipo_venta) {
        this.tipo_venta = tipo_venta;
    }

    public int getDepfk() {
        return depfk;
    }

    public void setDepfk(int depfk) {
        this.depfk = depfk;
    }

    public int getFamfk() {
        return famfk;
    }

    public void setFamfk(int famfk) {
        this.famfk = famfk;
    }
        public static void createProducto(String codigo,String nombre,int fampro,int dep,
                double precioCompra,double precioVenta,int stock, String tipoVenta)
      throws ClassNotFoundException, SQLException, InstantiationException,NumberFormatException{
   
     con.setAutoCommit(false);
     CallableStatement cStm= con.prepareCall("{call insertarProducto(?,?,?,?,?,?,?,?)}");
     cStm.setString(1,codigo);
     cStm.setString(2,nombre);
     cStm.setInt(3,fampro);
     cStm.setInt(4,dep);
     cStm.setDouble(5,precioCompra);
     cStm.setDouble(6,precioVenta);
     cStm.setInt(7,stock);
     cStm.setString(8,tipoVenta);
     cStm.execute();
     con.commit();
     JOptionPane.showMessageDialog(null, "Producto agregado Correctamente");
    }
    
          public static void updateProducto(int idup,String nombre,Double precioCompra,Double precioVenta,
                  int existencia)
      throws ClassNotFoundException, SQLException, InstantiationException,MySQLIntegrityConstraintViolationException
{
    
     con.setAutoCommit(false);
     CallableStatement cStm= con.prepareCall("{call actualizarProducto(?,?,?,?,?)}");
     cStm.setInt(1,idup);
     cStm.setString(2,nombre);
     cStm.setDouble(3,precioCompra);
     cStm.setDouble(4,precioVenta);
     cStm.setInt(5,existencia);
     cStm.execute();
     con.commit();
     JOptionPane.showMessageDialog(null, "Usuario Actualizado Correctamente");
    }
    
     public static void deleteProducto(int idup)
     throws ClassNotFoundException, SQLException, InstantiationException,MySQLIntegrityConstraintViolationException,
             MySQLNonTransientConnectionException,NumberFormatException{
     
     con.setAutoCommit(false);
     CallableStatement cStm= con.prepareCall("{call eliminarProducto(?)}");
     cStm.setInt(1,idup);
     cStm.execute();
     con.commit();
     JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente");
    }
    
    public static String familiaInner(int id) throws SQLException{
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
    
      public static String departamentoInner(int id) throws SQLException{
        String SQL = "select  nombre_dep from departamento where id_dep = '" + id + "'";
        
           String dep = null;    
       
        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery(SQL);
        while(rs.next()){
            dep = rs.getString(1);
        }
             
        return dep;
    }
        
         
    
}
