/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabcs.model;
//package com.uabcs.db;
import com.uabcs.util.Helper;
import com.uabcs.db.DBConnection;
import java.security.NoSuchAlgorithmException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class User {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public String getPassLogin() {
        return passLogin;
    }

    public void setPassLogin(String passLogin) {
        this.passLogin = passLogin;
    }
    
    private int id;
    private String usuarioLogin;
    private String passLogin;
    public static final  String TABLE = "empleado";
    private static DBConnection  conn = new DBConnection();
   // private static PreparedStatement stm;
   private static Connection con = conn.Conectar();


    
  
   
    public static User findByUser(String email) throws ClassNotFoundException, SQLException{
        String query = "SELECT * FROM " +  User.TABLE + " WHERE usuario_login= ?";
                

         PreparedStatement pStatement = con.prepareStatement(query);
         pStatement.setString(1,email);
         ResultSet rs = pStatement.executeQuery();
         if(rs.next()){
             User u = new User();
             u.setUsuarioLogin(rs.getString("usuario_login"));
             u.setPassLogin(rs.getString("pass_login"));
             return u;
         }
         return null;
    }
   
    public static User login(String usuario, String password) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException{
        User user = User.findByUser(usuario);
        if(user != null){
           String sha1password = Helper.hash1(password);
            if(user.getPassLogin().equals(sha1password)){
                return user; 
            }
            return null;
        }
          return null;      
    }
    
    public static String autenticacion(String usuario) throws SQLException{
        String sql = "SELECT tipo_usuario FROM empleado WHERE usuario_login='" +usuario+"'";
        String user = null;
        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            user = rs.getString(1);
        }      
        return user;
         
    }

    
    
}
