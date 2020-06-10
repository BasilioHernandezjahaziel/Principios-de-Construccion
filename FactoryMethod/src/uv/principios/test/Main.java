/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.principios.test;

import uv.principios.dao.Persona;
import uv.principios.dao.Departamento;
import uv.principios.dao.FactoryDAO;
import uv.principios.dao.IDAOGeneral;

/**
 *
 * @author jahaziel1999
 */
public class Main {
    public static void main(String [] args){
        IDAOGeneral  daop=FactoryDAO.create(FactoryDAO.TypeDAO.PERSONA);
        Persona p=new Persona();
        p.setClave("1");
        p.setNombre("Ricardo");
        p.setDireccion("Av .9");
        p.setTelefono("271");
        
        Departamento dep=new Departamento();
        dep.setClave("10");
        p.setDepartamento(dep);
        
        daop.guardar(p);
    }
}
