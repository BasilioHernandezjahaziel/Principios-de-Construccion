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
public class TransaccionDBPersona extends TransaccionDB<Persona>{

    private Persona persona;

    public TransaccionDBPersona(Persona pojo) {
        super(pojo);
    }

    @Override
    public boolean execute(Connection conn) {
        boolean res=false;
        try{
              String sql = "insert into persona (clave,nombre,direccion,telefono) values (?,?,?,?)";
              
              PreparedStatement ps=conn.prepareStatement(sql);
              ps.setString(1, persona.getClave());
              ps.setString(2, persona.getNombre());
              ps.setString(3, persona.getDireccion());
              ps.setString(4, persona.getTelefono());
              
              ps.execute();
              System.out.println("Se Guardo ");
              res = true;
        } catch (SQLException ex){
              Logger.getLogger(TransaccionDBPersona.class.getName()).log(Level.SEVERE, null,ex);
        }
        return res;
    }
}
