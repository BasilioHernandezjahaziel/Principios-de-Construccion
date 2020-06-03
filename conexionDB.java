/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jahaziel, David, Gabriel
 */
public class conexionDB {
    
    private static conexionDB con=null;
    public static conexionDB getInstance(){
        if(con==null)
            con=new conexionDB();
        return con;
    }
    private Connection conn = null;
    private conexionDB(){
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
