
package uv.principios.dao;

/**
 *
 * @author gabrielhs
 */
public class FactoryDAO {
    public enum TypeDAO {PERSONA,DEPARTAMENTO};
    public static IDAOGeneral create (TypeDAO t){
        IDAOGeneral dao = null;
        switch (t){
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
