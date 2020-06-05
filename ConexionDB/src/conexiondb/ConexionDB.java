/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiondb;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jahaziel, David, Gabriel
 */
public class ConexionDB {
    
    private static ConexionDB con=null;
    public static ConexionDB getInstance(){
        if(con==null)
            con=new ConexionDB();
        return con;
    }
    
    private Connection conn = null;
    private ConexionDB(){
       String urlDatabase = "jdbc:postgresql://localhost:5432/CRUD";
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase, "postgres", "password");
        } catch (Exception e) {
            System.out.println("Ocurrio un error:" + e.getMessage());
        }
        System.out.println("La conexion se realizo sin problemas");
    }
}
