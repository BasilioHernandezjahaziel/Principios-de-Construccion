
package proyectogui.db;

//import proyecto1.*;
//import uv.principios.utils.*;
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
public class ConexionDB {
    
    private static ConexionDB con=null;
    public static ConexionDB getInstance(){
        if(con==null)
            con=new ConexionDB();
        return con;
    }
    private Connection conn = null;
    ConexionDB(){
       String urlDatabase = "jdbc:postgresql://localhost:5432/prueba";
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase, "postgres","password");
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
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    
    public boolean execute(TransaccionDB t){
        boolean res=false;
        t.execute(conn);
        return res;
    }
    
    
}
