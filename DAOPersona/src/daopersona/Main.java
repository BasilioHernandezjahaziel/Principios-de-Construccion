/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daopersona;

/**
 *
 * @author jahaziel1999
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        conexionDB con;
        con=conexionDB.getInstance();   
        Persona p=new Persona();
        p.setClave("01");
        p.setNombre("juan");
        p.setDireccion("Av 11");
        p.setTelefono("272-135-145-12");
    }
}
