/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.jorge.ccallo.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Armando Morales
 */
public class Conexion {
    Connection conexion;
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/db_producto?useSSL=false&allowPublicKeyRetrieval=true";
    String usuario = "root";
    String clave = "Mysql2004";
    
    public Connection mysql() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexion;
    } 
}
