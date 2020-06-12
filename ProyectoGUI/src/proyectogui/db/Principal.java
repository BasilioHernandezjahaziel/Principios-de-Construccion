/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogui.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabrielhs
 */
public class Principal {
    public static void main(String[] args) {
        ConexionDB con =ConexionDB.getInstance();
        Persona p=new Persona();
        p.setClave("02");
        p.setNombre("Luis");
        p.setDireccion("Av 11");
        p.setTelefono("272");
        
        TransaccionDB<Persona> t1=new TransaccionDB<Persona>(p){
            @Override
            public boolean execute(Connection conn) {
            boolean res=false;
                    try{
                          String sql = "insert into persona (clave,nombre,direccion,telefono) values (?,?,?,?)";

                          PreparedStatement ps=conn.prepareStatement(sql);
                          ps.setString(1, pojo.getClave());
                          ps.setString(2, pojo.getNombre());
                          ps.setString(3, pojo.getDireccion());
                          ps.setString(4, pojo.getTelefono());

                          ps.execute();
                          System.out.println("Se Guardo ");
                          res = true;
                    } catch (SQLException ex){
                          Logger.getLogger(TransaccionDBPersona.class.getName()).log(Level.SEVERE, null,ex);
                    }
                    return res;
            }
            
        };
        boolean r=con.execute(t1);
        
        if(r)
            System.out.println("OK");
        else
            System.out.println("Error");
            
    }
}
