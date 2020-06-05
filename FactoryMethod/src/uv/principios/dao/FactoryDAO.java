/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.principios.dao;

/**
 *
 * @author jahaziel1999
 */
public class FactoryDAO {
    public enum TypeDAO {PERSONA,DEPARTAMENTO}
    public static IDAOGeneral create(TypeDAO t){
        IDAOGeneral dao=null;
        switch(t){
            case PERSONA:
                dao=new PersonaDAO();
                break;
            case DEPARTAMENTO:
                dao=new DepartamentoDAO();
                break;
        }
        return dao;
    }
}
