/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.principios.con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public boolean execute(String sql){
        boolean res=false;
        try{
            Statement st=conn.createStatement();
            st.execute(sql);
        } catch (SQLException ex){
            Logger.getLogger(conexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
