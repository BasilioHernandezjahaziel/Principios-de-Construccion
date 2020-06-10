/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.principios.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

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
            Logger logger=Logger.getLogger(ConexionDB.class.getName());
            LogRecord r=new LogRecord(Level.INFO,"Ocurrio un error:");
            logger.log(r);
        }
        Logger logger=Logger.getLogger(ConexionDB.class.getName());
        LogRecord r=new LogRecord(Level.INFO,"La conexion se realizo sin problemas");
        logger.log(r);
    }
    
    public boolean execute(String sql){
        boolean res=false;
        Statement st = null;
        try{
            st = conn.createStatement();
            st.execute(sql);
        } catch (SQLException ex){
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try{
                    st.close();
                }catch(SQLException ex){
                   Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex); 
                }
            }
        }
        return res;
    }
}
